#!/usr/bin/perl
# 
# ***** BEGIN LICENSE BLOCK *****
# Zimbra Collaboration Suite Server
# Copyright (C) 2008, 2009, 2010, 2013, 2014, 2016 Synacor, Inc.
#
# This program is free software: you can redistribute it and/or modify it under
# the terms of the GNU General Public License as published by the Free Software Foundation,
# version 2 of the License.
#
# This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
# without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
# See the GNU General Public License for more details.
# You should have received a copy of the GNU General Public License along with this program.
# If not, see <https://www.gnu.org/licenses/>.
# ***** END LICENSE BLOCK *****
# 


use strict;
use Migrate;

Migrate::verifySchemaVersion(53);
recreateMucTables();
Migrate::updateSchemaVersion(53, 60);
exit(0);

#####################

sub recreateMucTables() {
  Migrate::logSql("Recreating IM MUC tables.");
  
  my $sql = <<SQL_EOF;
use zimbra;
DROP TABLE IF EXISTS zimbra.jiveVersion;
DROP TABLE IF EXISTS zimbra.mucRoom;
DROP TABLE IF EXISTS zimbra.mucRoomProp;
DROP TABLE IF EXISTS zimbra.mucAffiliation;
DROP TABLE IF EXISTS zimbra.mucMember;
DROP TABLE IF EXISTS zimbra.mucConversationLog;

CREATE TABLE mucRoom (
  service             VARCHAR(255)  NOT NULL,
  roomID              BIGINT        NOT NULL,
  creationDate        CHAR(15)      NOT NULL,
  modificationDate    CHAR(15)      NOT NULL,
  name                VARCHAR(50)   NOT NULL,
  naturalName         VARCHAR(255)  NOT NULL,
  description         VARCHAR(255),
  lockedDate          CHAR(15)      NOT NULL,
  emptyDate           CHAR(15)      NULL,
  canChangeSubject    TINYINT       NOT NULL,
  maxUsers            INTEGER       NOT NULL,
  publicRoom          TINYINT       NOT NULL,
  moderated           TINYINT       NOT NULL,
  membersOnly         TINYINT       NOT NULL,
  canInvite           TINYINT       NOT NULL,
  password            VARCHAR(50)   NULL,
  canDiscoverJID      TINYINT       NOT NULL,
  logEnabled          TINYINT       NOT NULL,
  subject             VARCHAR(100)  NULL,
  rolesToBroadcast    TINYINT       NOT NULL,
  useReservedNick     TINYINT       NOT NULL,
  canChangeNick       TINYINT       NOT NULL,
  canRegister         TINYINT       NOT NULL,
  PRIMARY KEY (service,name),
  INDEX mucRoom_roomid_idx (service,roomID)
);

CREATE TABLE mucRoomProp (
  service               VARCHAR(255)    NOT NULL,
  roomID                BIGINT          NOT NULL,
  name                  VARCHAR(100)    NOT NULL,
  propValue             TEXT            NOT NULL,
  PRIMARY KEY (service(200),roomID, name)
);

CREATE TABLE mucAffiliation (
  service             VARCHAR(255)  NOT NULL,
  roomID              BIGINT        NOT NULL,
  jid                 TEXT          NOT NULL,
  affiliation         TINYINT       NOT NULL,
  PRIMARY KEY (service,roomID,jid(70))
);

CREATE TABLE mucMember (
  service             VARCHAR(255)  NOT NULL,
  roomID              BIGINT        NOT NULL,
  jid                 TEXT          NOT NULL,
  nickname            VARCHAR(255)  NULL,
  firstName           VARCHAR(100)  NULL,
  lastName            VARCHAR(100)  NULL,
  url                 VARCHAR(100)  NULL,
  email               VARCHAR(100)  NULL,
  faqentry            VARCHAR(100)  NULL,
  PRIMARY KEY (service,roomID,jid(70))
);

CREATE TABLE mucConversationLog (
  service             VARCHAR(255)  NOT NULL,
  roomID              BIGINT        NOT NULL,
  sender              TEXT          NOT NULL,
  nickname            VARCHAR(255)  NULL,
  time                CHAR(15)      NOT NULL,
  subject             VARCHAR(255)  NULL,
  body                TEXT          NULL,
  INDEX mucLog_time_idx (time)
);

SQL_EOF

  Migrate::runSql($sql);
}



sudo rm /var/lib/dpkg/lock

#Would you like to delete /opt/zimbra before installing? [N] y



zimbra-core zimbra-ldap zimbra-logger zimbra-mta zimbra-dnscache zimbra-snmp zimbra-store zimbra-apache zimbra-spell zimbra-memcached zimbra-proxy



REMOTE packages:

zimbra-core-components  zimbra-ldap-components zimbra-mta-components zimbra-dnscache-components zimbra-snmp-components zimbra-store-components zimbra-apache-components zimbra-spell-components zimbra-memcached zimbra-proxy-components

#PACKAGEDOWNLOAD=apt-get --download-only install -y --force-yes



install log



zimbra-base zimbra-apache-base zimbra-apr-lib zimbra-openssl-lib
zimbra-apr-util-lib zimbra-spell-base
zimbra-aspell-lib zimbra-bdb-lib zimbra-libxml2-lib
zimbra-mta-base zimbra-clamav-lib
zimbra-heimdal-lib zimbra-curl-lib
zimbra-cyrus-sasl-lib zimbra-freetype-lib
zimbra-libart-lib zimbra-libbsd-lib
zimbra-memcached-base zimbra-libevent-lib
zimbra-ldap-base zimbra-libltdl-lib
zimbra-libpng-lib zimbra-libsodium-lib
zimbra-lmdb-lib zimbra-mariadb-lib
zimbra-snmp-base zimbra-net-snmp-lib
zimbra-opendkim-lib zimbra-openldap-lib zimbra-rrdtool-lib
zimbra-tcmalloc-lib zimbra-dnscache-base zimbra-unbound-lib
zimbra-zeromq-lib
sqlite3
zimbra-altermime zimbra-amavis-logwatch
zimbra-amavisd zimbra-httpd
zimbra-php zimbra-apache-components
zimbra-aspell
zimbra-aspell-ar zimbra-aspell-da
zimbra-aspell-de zimbra-aspell-en
zimbra-aspell-es zimbra-aspell-fr
zimbra-aspell-hi zimbra-aspell-hu
zimbra-aspell-it zimbra-aspell-nl
zimbra-aspell-pl zimbra-aspell-pt-br
zimbra-aspell-ru zimbra-aspell-sv

zimbra-aspell-zimbra
zimbra-clamav
zimbra-clamav-db
zimbra-perl-base
zimbra-perl-cache-fastmmap
zimbra-perl-exporter-tiny
zimbra-perl-list-moreutils
zimbra-perl-config-inifiles
zimbra-perl-dbi
zimbra-perl-dbd-sqlite
zimbra-perl-error
zimbra-perl-netaddr-ip
zimbra-perl-digest-sha1
zimbra-perl-digest-hmac
zimbra-perl-socket
zimbra-perl-io-socket-inet6
zimbra-perl-net-dns
zimbra-perl-net-dns-resolver-programmable
zimbra-perl-mail-spf
zimbra-perl-net-cidr
zimbra-perl-net-server
zimbra-perl-timedate
zimbra-cluebringer
zimbra-os-requirements
zimbra-perl-compress-raw-zlib
zimbra-perl-archive-zip
zimbra-perl-berkeleydb
zimbra-perl-carp-clan
zimbra-perl-bit-vector
zimbra-perl-canary-stability
zimbra-perl-class-inspector
zimbra-perl-compress-raw-bzip2
zimbra-perl-math-bigint
zimbra-perl-convert-asn1
zimbra-perl-convert-binhex
zimbra-perl-mailtools
zimbra-perl-mime-tools
zimbra-perl-io-stringy
zimbra-perl-convert-tnef
zimbra-perl-convert-uulib
zimbra-perl-crypt-openssl-random
zimbra-perl-crypt-openssl-rsa
zimbra-perl-crypt-saltedhash
zimbra-perl-data-uuid
zimbra-perl-date-calc
zimbra-perl-date-manip
zimbra-perl-dbd-mysql
zimbra-perl-db-file
zimbra-perl-email-date-format
zimbra-perl-encode-detect
zimbra-perl-encode-locale
zimbra-perl-zmq-constants
zimbra-perl-zmq-libzmq3
zimbra-perl-file-grep
zimbra-perl-file-libmagic
zimbra-perl-http-date
zimbra-perl-file-listing
zimbra-perl-filesys-df
zimbra-perl-file-tail
zimbra-perl-geography-countries
zimbra-perl-html-parser
zimbra-perl-io-compress
zimbra-perl-parent
zimbra-perl-uri
zimbra-perl-io-html
zimbra-perl-lwp-mediatypes
zimbra-perl-http-message
zimbra-perl-http-cookies
zimbra-perl-http-daemon
zimbra-perl-http-negotiate
zimbra-perl-term-readkey
zimbra-perl-innotop
zimbra-perl-io-sessiondata
zimbra-perl-io-socket-ip
zimbra-perl-mozilla-ca
zimbra-perl-net-ssleay
zimbra-perl-io-socket-ssl
zimbra-perl-ip-country
zimbra-perl-json-pp
zimbra-perl-net-http
zimbra-perl-www-robotrules
zimbra-perl-libwww
zimbra-perl-lwp-protocol-https
zimbra-perl-mail-dkim
zimbra-perl-mime-types
zimbra-perl-mime-lite
zimbra-perl-net-cidr-lite
zimbra-perl-socket-linux
zimbra-perl-net-ldap
zimbra-perl-net-ldapapi
zimbra-perl-net-libidn
zimbra-perl-proc-processtable
zimbra-perl-task-weaken
zimbra-perl-xml-parser
zimbra-perl-soap-lite
zimbra-perl-swatchdog
zimbra-perl-unix-getrusage
zimbra-perl-unix-syslog
zimbra-perl-xml-namespacesupport
zimbra-perl-xml-parser-lite
zimbra-perl-xml-sax-base
zimbra-perl-xml-sax
zimbra-perl-xml-sax-expat
zimbra-perl-xml-simple
zimbra-perl

zimbra-pflogsumm
zimbra-openssl
zimbra-curl
zimbra-cyrus-sasl
zimbra-rsync

zimbra-openldap-client
zimbra-prepflog

zimbra-openjdk
zimbra-openjdk-cacerts

zimbra-osl
zimbra-postfix-logwatch
zimbra-rrdtool
zimbra-core-components
zimbra-unbound

zimbra-dnscache-components
zimbra-lmdb
zimbra-openldap-server
zimbra-ldap-components
zimbra-store-base
zimbra-mariadb
zimbra-memcached
zimbra-opendkim
zimbra-perl-mail-spamassassin
zimbra-postfix
zimbra-spamassassin-rules
zimbra-mta-components
zimbra-net-snmp

zimbra-proxy-base
zimbra-nginx

zimbra-proxy-components
zimbra-snmp-components
zimbra-spell-components
zimbra-store-components


## zimbra-spell-components

<pre>
vagrant@vagrant:/var/cache/apt/archives$ sudo dpkg -I zimbra-spell-components_1.0.0-1zimbra8.7b1.16.04_all.deb
 new debian package, version 2.0.
 size 1546 bytes: control archive=526 bytes.
     655 bytes,    11 lines      control
     174 bytes,     2 lines      md5sums
 Package: zimbra-spell-components
 Version: 1.0.0-1zimbra8.7b1.16.04
 Architecture: all
 Maintainer: Zimbra Packaging Services <packaging-devel@zimbra.com>
 Installed-Size: 8
 Depends: zimbra-spell-base, zimbra-aspell-ar, zimbra-aspell-da, zimbra-aspell-de, zimbra-aspell-en, zimbra-aspell-es, zimbra-aspell-fr, zimbra-aspell-hi, zimbra-aspell-hu, zimbra-aspell-it, zimbra-aspell-nl, zimbra-aspell-pl, zimbra-aspell-pt-br, zimbra-aspell-ru, zimbra-aspell-sv, zimbra-httpd, zimbra-php, zimbra-aspell-zimbra
 Section: mail
 Priority: optional
 Description: Zimbra components for spell package
  Zimbra spell components pulls in all the packages used by
  zimbra-spell
</pre>

## install main zimbra

Setting up zimbra-ldap (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-logger (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-mta (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-dnscache (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-snmp (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-store (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-apache (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-spell (8.7.1.GA.1671.UBUNTU16.64) ...
Setting up zimbra-proxy (8.7.1.GA.1671.UBUNTU16.64) ...

# Notes


## apt-get install

- silversearcher-ag  
- libnet-ldap-perl


## App banner


./ZimbraWebClient/WebRoot/skins/_base/logos/AppBanner_white.png


## zimbra deb repositories

<pre>
vagrant@vagrant:/etc/apt/sources.list.d$ cat zimbra.list 
deb     [arch=amd64] https://repo.zimbra.com/apt/87 xenial zimbra
deb-src [arch=amd64] https://repo.zimbra.com/apt/87 xenial zimbra
</pre>


## deb-s

Large debs:

<pre>
-rw-r--r-- 1 vagrant vagrant  174M Jun 10  2016 zimbra-openjdk_1.8.0u92b14-1zimbra8.7b3.16.04_amd64.deb
-rw-r--r-- 1 vagrant vagrant  110M Jun 10  2016 zimbra-clamav-db_1.0.0-1zimbra8.7b1.16.04_all.deb
</pre>


## my-patch.sh


- OUT License not exist - OUT https://www.zimbra.com/license/zimbra-public-eula-2-6.html

- OUT: Notify Zimbra of your installation



## build core components from source:


     sudo apt-get install debhelper fakeroot


     sudo add-apt-repository ppa:openjdk-r/ppa
     sudo apt-get update



     #sudo apt-get install zimbra-core-components zimbra-base zimbra-os-requirements zimbra-perl zimbra-pflogsumm zimbra-openssl zimbra-curl zimbra-cyrus-sasl zimbra-rsync zimbra-mariadb-lib zimbra-openldap-client zimbra-prepflog zimbra-tcmalloc-lib zimbra-perl-innotop zimbra-openjdk zimbra-openjdk-cacerts zimbra-osl zimbra-amavis-logwatch zimbra-postfix-logwatch zimbra-rrdtool


### build zimbra-openjdk

     sudo apt-get install m4 libx11-dev libxext-dev libxrender-dev libxtst-dev libxt-dev openjdk-7-jdk libcups2-dev libfreetype6-dev libasound2-dev ccache zip



zimbra debs
--------------------



vagrant@vagrant:~$ du -sh  /var/cache/apt/archives/zimbra*.deb


<pre>
56K	/var/cache/apt/archives/zimbra-amavis-logwatch_1.51.03-1zimbra8.7b1.16.04_amd64.deb
4.0K	/var/cache/apt/archives/zimbra-base_1.0.2-1zimbra8.7b1.16.04_all.deb
640K	/var/cache/apt/archives/zimbra-bdb-lib_5.2.42-1zimbra8.7b1.16.04_amd64.deb
4.0K	/var/cache/apt/archives/zimbra-core-components_1.0.0-1zimbra8.7b1.16.04_all.deb
400K	/var/cache/apt/archives/zimbra-curl_7.49.1-1zimbra8.7b1.16.04_amd64.deb
176K	/var/cache/apt/archives/zimbra-curl-lib_7.49.1-1zimbra8.7b1.16.04_amd64.deb
56K	/var/cache/apt/archives/zimbra-cyrus-sasl_2.1.26-1zimbra8.7b1.16.04_amd64.deb
120K	/var/cache/apt/archives/zimbra-cyrus-sasl-lib_2.1.26-1zimbra8.7b1.16.04_amd64.deb
264K	/var/cache/apt/archives/zimbra-freetype-lib_2.6.3-1zimbra8.7b1.16.04_amd64.deb
964K	/var/cache/apt/archives/zimbra-heimdal-lib_1.5.3-1zimbra8.7b1.16.04_amd64.deb
4.0K	/var/cache/apt/archives/zimbra-ldap-base_1.0.0-1zimbra8.7b1.16.04_all.deb
4.0K	/var/cache/apt/archives/zimbra-ldap-components_1.0.0-1zimbra8.7b1.16.04_all.deb
48K	/var/cache/apt/archives/zimbra-libart-lib_2.3.21-1zimbra8.7b1.16.04_amd64.deb
20K	/var/cache/apt/archives/zimbra-libltdl-lib_2.2.6b-1zimbra8.7b1.16.04_amd64.deb
92K	/var/cache/apt/archives/zimbra-libpng-lib_1.6.23-1zimbra8.7b1.16.04_amd64.deb
96K	/var/cache/apt/archives/zimbra-libsodium-lib_1.0.6-1zimbra8.7b1.16.04_amd64.deb
516K	/var/cache/apt/archives/zimbra-libxml2-lib_2.9.4-1zimbra8.7b1.16.04_amd64.deb
60K	/var/cache/apt/archives/zimbra-lmdb_2.4.44-1zimbra8.7b8.16.04_amd64.deb
1.7M	/var/cache/apt/archives/zimbra-mariadb-lib_10.1.14-1zimbra8.7b1.16.04_amd64.deb
174M	/var/cache/apt/archives/zimbra-openjdk_1.8.0u92b14-1zimbra8.7b3.16.04_amd64.deb
140K	/var/cache/apt/archives/zimbra-openjdk-cacerts_1.0.5-1zimbra8.7b1.16.04_all.deb
100K	/var/cache/apt/archives/zimbra-openldap-client_2.4.44-1zimbra8.7b8.16.04_amd64.deb
152K	/var/cache/apt/archives/zimbra-openldap-lib_2.4.44-1zimbra8.7b8.16.04_amd64.deb
904K	/var/cache/apt/archives/zimbra-openldap-server_2.4.44-1zimbra8.7b8.16.04_amd64.deb
536K	/var/cache/apt/archives/zimbra-openssl_1.0.2h-1zimbra8.7b1.16.04_amd64.deb
1.1M	/var/cache/apt/archives/zimbra-openssl-lib_1.0.2h-1zimbra8.7b1.16.04_amd64.deb
148K	/var/cache/apt/archives/zimbra-osl_1.0.9-1zimbra8.7b1.16.04_all.deb
4.0K	/var/cache/apt/archives/zimbra-os-requirements_1.0.1-1zimbra8.7b1.16.04_all.deb
4.0K	/var/cache/apt/archives/zimbra-perl_1.0.2-1zimbra8.7b1.16.04_all.deb
52K	/var/cache/apt/archives/zimbra-perl-archive-zip_1.53-1zimbra8.7b1.16.04_all.deb
4.0K	/var/cache/apt/archives/zimbra-perl-base_1.0.0-1zimbra8.7b1.16.04_all.deb
240K	/var/cache/apt/archives/zimbra-perl-berkeleydb_0.55-1zimbra8.7b1.16.04_all.deb
192K	/var/cache/apt/archives/zimbra-perl-bit-vector_7.4-1zimbra8.7b1.16.04_all.deb
72K	/var/cache/apt/archives/zimbra-perl-cache-fastmmap_1.43-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-canary-stability_2006-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-carp-clan_6.04-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-class-inspector_1.28-1zimbra8.7b1.16.04_all.deb
96K	/var/cache/apt/archives/zimbra-perl-compress-raw-bzip2_2.069-1zimbra8.7b1.16.04_all.deb
140K	/var/cache/apt/archives/zimbra-perl-compress-raw-zlib_2.069-1zimbra8.7b1.16.04_all.deb
28K	/var/cache/apt/archives/zimbra-perl-config-inifiles_2.86-1zimbra8.7b1.16.04_all.deb
28K	/var/cache/apt/archives/zimbra-perl-convert-asn1_0.27-1zimbra8.7b1.16.04_all.deb
20K	/var/cache/apt/archives/zimbra-perl-convert-binhex_1.124-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-convert-tnef_0.18-1zimbra8.7b1.16.04_all.deb
184K	/var/cache/apt/archives/zimbra-perl-convert-uulib_1.5-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-crypt-openssl-random_0.11-1zimbra8.7b1.16.04_amd64.deb
20K	/var/cache/apt/archives/zimbra-perl-crypt-openssl-rsa_0.28-1zimbra8.7b1.16.04_amd64.deb
12K	/var/cache/apt/archives/zimbra-perl-crypt-saltedhash_0.09-1zimbra8.7b1.16.04_all.deb
44K	/var/cache/apt/archives/zimbra-perl-data-uuid_1.221-1zimbra8.7b1.16.04_all.deb
116K	/var/cache/apt/archives/zimbra-perl-date-calc_6.4-1zimbra8.7b1.16.04_all.deb
672K	/var/cache/apt/archives/zimbra-perl-date-manip_6.51-1zimbra8.7b1.16.04_all.deb
168K	/var/cache/apt/archives/zimbra-perl-dbd-mysql_4.033-1zimbra8.7b1.16.04_all.deb
2.4M	/var/cache/apt/archives/zimbra-perl-dbd-sqlite_1.48-1zimbra8.7b1.16.04_all.deb
104K	/var/cache/apt/archives/zimbra-perl-db-file_1.835-1zimbra8.7b1.16.04_all.deb
584K	/var/cache/apt/archives/zimbra-perl-dbi_1.634-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-digest-hmac_1.03-1zimbra8.7b1.16.04_all.deb
40K	/var/cache/apt/archives/zimbra-perl-digest-sha1_2.13-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-email-date-format_1.005-1zimbra8.7b1.16.04_all.deb
120K	/var/cache/apt/archives/zimbra-perl-encode-detect_1.01-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-encode-locale_1.05-1zimbra8.7b1.16.04_all.deb
16K	/var/cache/apt/archives/zimbra-perl-error_0.17024-1zimbra8.7b1.16.04_all.deb
16K	/var/cache/apt/archives/zimbra-perl-exporter-tiny_0.042-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-file-grep_0.02-1zimbra8.7b1.16.04_all.deb
40K	/var/cache/apt/archives/zimbra-perl-file-libmagic_1.15-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-file-listing_6.04-1zimbra8.7b1.16.04_all.deb
28K	/var/cache/apt/archives/zimbra-perl-filesys-df_0.92-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-file-tail_1.3-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-geography-countries_2009041301-1zimbra8.7b1.16.04_all.deb
100K	/var/cache/apt/archives/zimbra-perl-html-parser_3.71-1zimbra8.7b1.16.04_all.deb
16K	/var/cache/apt/archives/zimbra-perl-http-cookies_6.01-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-http-daemon_6.01-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-http-date_6.02-1zimbra8.7b1.16.04_all.deb
44K	/var/cache/apt/archives/zimbra-perl-http-message_6.11-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-http-negotiate_6.01-1zimbra8.7b1.16.04_all.deb
104K	/var/cache/apt/archives/zimbra-perl-innotop_1.9.1-1zimbra8.7b1.16.04_all.deb
92K	/var/cache/apt/archives/zimbra-perl-io-compress_2.069-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-io-html_1.001-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-io-sessiondata_1.03-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-io-socket-inet6_2.72-1zimbra8.7b1.16.04_all.deb
20K	/var/cache/apt/archives/zimbra-perl-io-socket-ip_0.37-1zimbra8.7b1.16.04_all.deb
108K	/var/cache/apt/archives/zimbra-perl-io-socket-ssl_2.020-1zimbra8.7b1.16.04_all.deb
32K	/var/cache/apt/archives/zimbra-perl-io-stringy_2.111-1zimbra8.7b1.16.04_all.deb
252K	/var/cache/apt/archives/zimbra-perl-ip-country_2.28-1zimbra8.7b1.16.04_all.deb
32K	/var/cache/apt/archives/zimbra-perl-json-pp_2.27300-1zimbra8.7b1.16.04_all.deb
76K	/var/cache/apt/archives/zimbra-perl-libwww_6.13-1zimbra8.7b1.16.04_all.deb
120K	/var/cache/apt/archives/zimbra-perl-list-moreutils_0.413-1zimbra8.7b1.16.04_all.deb
20K	/var/cache/apt/archives/zimbra-perl-lwp-mediatypes_6.02-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-lwp-protocol-https_6.06-1zimbra8.7b1.16.04_all.deb
52K	/var/cache/apt/archives/zimbra-perl-mail-dkim_0.40-1zimbra8.7b1.16.04_all.deb
48K	/var/cache/apt/archives/zimbra-perl-mail-spf_2.9.0-1zimbra8.7b1.16.04_all.deb
40K	/var/cache/apt/archives/zimbra-perl-mailtools_2.14-1zimbra8.7b1.16.04_all.deb
100K	/var/cache/apt/archives/zimbra-perl-math-bigint_1.999708-1zimbra8.7b1.16.04_all.deb
48K	/var/cache/apt/archives/zimbra-perl-mime-lite_3.030-1zimbra8.7b1.16.04_all.deb
108K	/var/cache/apt/archives/zimbra-perl-mime-tools_5.507-1zimbra8.7b1.16.04_all.deb
44K	/var/cache/apt/archives/zimbra-perl-mime-types_2.11-1zimbra8.7b1.16.04_all.deb
148K	/var/cache/apt/archives/zimbra-perl-mozilla-ca_20150826-1zimbra8.7b1.16.04_all.deb
80K	/var/cache/apt/archives/zimbra-perl-netaddr-ip_4.078-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-net-cidr_0.18-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-net-cidr-lite_0.21-1zimbra8.7b1.16.04_all.deb
120K	/var/cache/apt/archives/zimbra-perl-net-dns_1.04-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-net-dns-resolver-programmable_0.003-1zimbra8.7b1.16.04_all.deb
16K	/var/cache/apt/archives/zimbra-perl-net-http_6.09-1zimbra8.7b1.16.04_all.deb
156K	/var/cache/apt/archives/zimbra-perl-net-ldap_0.65-1zimbra8.7b1.16.04_all.deb
112K	/var/cache/apt/archives/zimbra-perl-net-ldapapi_3.0.3-1zimbra8.7b1.16.04_all.deb
44K	/var/cache/apt/archives/zimbra-perl-net-libidn_0.12-1zimbra8.7b1.16.04_all.deb
88K	/var/cache/apt/archives/zimbra-perl-net-server_2.008-1zimbra8.7b1.16.04_all.deb
196K	/var/cache/apt/archives/zimbra-perl-net-ssleay_1.72-1zimbra8.7b1.16.04_amd64.deb
8.0K	/var/cache/apt/archives/zimbra-perl-parent_0.234-1zimbra8.7b1.16.04_all.deb
56K	/var/cache/apt/archives/zimbra-perl-proc-processtable_0.53-1zimbra8.7b1.16.04_all.deb
108K	/var/cache/apt/archives/zimbra-perl-soap-lite_1.19-1zimbra8.7b1.16.04_all.deb
60K	/var/cache/apt/archives/zimbra-perl-socket_2.020-1zimbra8.7b1.16.04_all.deb
24K	/var/cache/apt/archives/zimbra-perl-socket-linux_0.01-1zimbra8.7b1.16.04_all.deb
24K	/var/cache/apt/archives/zimbra-perl-swatchdog_3.2.4-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-task-weaken_1.04-1zimbra8.7b1.16.04_all.deb
48K	/var/cache/apt/archives/zimbra-perl-term-readkey_2.33-1zimbra8.7b1.16.04_all.deb
24K	/var/cache/apt/archives/zimbra-perl-timedate_2.30-1zimbra8.7b1.16.04_all.deb
28K	/var/cache/apt/archives/zimbra-perl-unix-getrusage_0.03-1zimbra8.7b1.16.04_all.deb
36K	/var/cache/apt/archives/zimbra-perl-unix-syslog_1.1-1zimbra8.7b1.16.04_all.deb
48K	/var/cache/apt/archives/zimbra-perl-uri_1.69-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-www-robotrules_6.02-1zimbra8.7b1.16.04_all.deb
12K	/var/cache/apt/archives/zimbra-perl-xml-namespacesupport_1.11-1zimbra8.7b1.16.04_all.deb
176K	/var/cache/apt/archives/zimbra-perl-xml-parser_2.44-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-xml-parser-lite_0.721-1zimbra8.7b1.16.04_all.deb
32K	/var/cache/apt/archives/zimbra-perl-xml-sax_0.99-1zimbra8.7b1.16.04_all.deb
16K	/var/cache/apt/archives/zimbra-perl-xml-sax-base_1.08-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-xml-sax-expat_0.51-1zimbra8.7b1.16.04_all.deb
44K	/var/cache/apt/archives/zimbra-perl-xml-simple_2.20-1zimbra8.7b1.16.04_all.deb
8.0K	/var/cache/apt/archives/zimbra-perl-zmq-constants_1.04-1zimbra8.7b1.16.04_all.deb
36K	/var/cache/apt/archives/zimbra-perl-zmq-libzmq3_1.19-1zimbra8.7b1.16.04_amd64.deb
24K	/var/cache/apt/archives/zimbra-pflogsumm_1.1.5-1zimbra8.7b1.16.04_amd64.deb
68K	/var/cache/apt/archives/zimbra-postfix-logwatch_1.40.01-1zimbra8.7b1.16.04_amd64.deb
8.0K	/var/cache/apt/archives/zimbra-prepflog_0.4.1-1zimbra8.7b1.16.04_amd64.deb
232K	/var/cache/apt/archives/zimbra-rrdtool_1.2.30-1zimbra8.7b1.16.04_amd64.deb
136K	/var/cache/apt/archives/zimbra-rrdtool-lib_1.2.30-1zimbra8.7b1.16.04_amd64.deb
256K	/var/cache/apt/archives/zimbra-rsync_3.1.2-1zimbra8.7b1.16.04_amd64.deb
88K	/var/cache/apt/archives/zimbra-tcmalloc-lib_2.4-1zimbra8.7b1.16.04_amd64.deb
132K	/var/cache/apt/archives/zimbra-zeromq-lib_4.1.4-1zimbra8.7b1.16.04_amd64.deb
</pre>


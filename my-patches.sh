#!/bin/bash

echo "exclude notify from install procedure"

sed -i -e 's/postinstall::notifyZimbra\(\).*$/print "no zimbra notify\\\n";/' ZimbraBuild/corebuild/opt/zimbra/libexec/zmsetup.pl 

echo "no license question"

sed -i -e 's/displayLicense$/echo "no license question"/'  ZimbraBuild/corebuild/opt/zimbra/libexec/installer/install.sh
sed -i -e 's/displayThirdPartyLicenses$/echo "no third party licenses question"/'  ZimbraBuild/corebuild/opt/zimbra/libexec/installer/install.sh
sed -i -e 's/configurePackageServer$/echo "no configurePackageServer - no setup zimbra deb repository"/'  ZimbraBuild/corebuild/opt/zimbra/libexec/installer/install.sh


FILE=ZimbraBuild/corebuild/opt/zimbra/libexec/installer/util/utilfunc.sh
sed -i -e 's/askYN.*Do you wish to upgrade.*Y.*$/response="yes"/' $FILE
sed -i -e 'verifyUpgrade$/echo "no verifyUpgrade"/' $FILE



FILE="ZimbraBuild/corebuild/opt/zimbra/libexec/installer/util/modules/packages.sh
# $PACKAGEDOWNLOAD $repocomp >> $LOGFILE 2>&1
sed -i -e 's/.*$PACKAGEDOWNLOAD $repocomp.*$/echo "no remote package download"/' $FILE

# "$REPOINST $repocomp >>$LOGFILE 2>&1"
sed -i -e 's/.*$REPOINST $repocomp.*$/echo "no remote package install"/' $FILE


splashScreenCompanyURL = https://www.zimbra.com

MY_COMPANY_URL='https:\/\/github.com\/hernad\/my-zimbra'

for f in ZimbraWebClient/WebRoot/messages/ZmMsg*.properties
do
   echo $f
   sed -i -e "s/splashScreenCompanyURL.*$/splashScreenCompanyURL = $MY_COMPANY_URL/" $f
done


#!/bin/bash

echo "exclude notify from install procedure"


FILE=ZimbraBuild/rpmconf/Install/zmsetup.pl
sed -i -e 's/postinstall::notifyZimbra\(\).*$/print "no zimbra notify\\\n";/' $FILE

echo "no license question"

FILE=ZimbraBuild/rpmconf/Install/install.sh
sed -i -e 's/displayLicense$/echo "no license question"/' $FILE
sed -i -e 's/displayThirdPartyLicenses$/echo "no third party licenses question"/'  $FILE
sed -i -e 's/configurePackageServer$/echo "no configurePackageServer - no setup zimbra deb repository"/' $FILE


FILE=ZimbraBuild/rpmconf/Install/Util/utilfunc.sh
sed -i -e 's/askYN.*Do you wish to upgrade.*Y.*$/response="yes"/' $FILE
sed -i -e 's/verifyUpgrade$/echo "no verifyUpgrade"/' $FILE


FILE=ZimbraBuild/rpmconf/Install/Util/modules/ ZimbraBuild/packages.sh
# $PACKAGEDOWNLOAD $repocomp ...
sed -i -e 's/.*\$PACKAGEDOWNLOAD \$repocomp.*$/echo "no remote package download"/' $FILE

# "$REPOINST $repocomp ...
sed -i -e 's/.*\$REPOINST \$repocomp.*$/echo "no remote package install"/' $FILE


#splashScreenCompanyURL = https://www.zimbra.com

MY_COMPANY_URL='https:\/\/github.com\/hernad\/my-zimbra'

for f in ZimbraWebClient/WebRoot/messages/ZmMsg*.properties
do
   echo $f
   sed -i -e "s/splashScreenCompanyURL.*$/splashScreenCompanyURL = $MY_COMPANY_URL/" $f
   sed -i -e "s/logoURL.*$/logoURL = $MY_COMPANY_URL/" $f
done



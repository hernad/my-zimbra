#!/bin/bash

JETTY_VERSION=9.3.16.v20170120

echo "exclude notify from install procedure"


FILE=ZimbraBuild/rpmconf/Install/install.sh
sed -i -e 's/displayLicense$/echo "no license question"/' $FILE
sed -i -e 's/displayThirdPartyLicenses$/echo "no third party licenses question"/'  $FILE
sed -i -e 's/configurePackageServer$/echo "no configurePackageServer - no setup zimbra deb repository"/' $FILE


FILE=ZimbraBuild/rpmconf/Install/Util/utilfunc.sh
sed -i -e 's/askYN.*Do you wish to upgrade.*Y.*$/response="yes"/' $FILE
sed -i -e 's/verifyUpgrade$/echo "no verifyUpgrade"/' $FILE


FILE=ZimbraBuild/rpmconf/Install/Util/modules/packages.sh
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

for lang in ar en_AU en_GB es eu fr hi hu in it iw ja ko lo ms nl pl pt pt_BR ro su sv th tr uk zh_CN zh_HK zh_TW
do
    echo "erasing localication for: $lang"
    find . -name "*_zh_CN.properties" -exec rm {} \;
done


mkdir -p ThirdParty/jetty
cd ThirdParty/jetty

curl -LO http://central.maven.org/maven2/org/eclipse/jetty/jetty-distribution/9.3.16.v20170120/jetty-distribution-${JETTY_VERSION}.tar.gz

cd ../..
ls -l ThirdParty/jetty/jetty-distribution-${JETTY_VERSION}.tar.gz

WEBROOT=ZimbraWebClient/WebRoot
PICT=AppBanner.png
cp -av $WEBROOT/skins/_base/logos/$PICT $WEBROOT/admin_skins/_base/logos/$PICT
cp -av $WEBROOT/skins/_base/logos/ZimbraInside/$PICT $WEBROOT/admin_skins/_base/logos/ZimbraInside/$PICT

PICT=LoginBanner.png
cp -av $WEBROOT/skins/_base/logos/$PICT $WEBROOT/admin_skins/_base/logos/$PICT
cp -av $WEBROOT/skins/_base/logos/ZimbraInside/$PICT $WEBROOT/admin_skins/_base/logos/ZimbraInside/$PICT

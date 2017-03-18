#!/bin/bash

echo "exclude notify from install procedure"

sed -i -e 's/postinstall::notifyZimbra\(\).*$/print "no zimbra notify\\\n";/' ZimbraBuild/corebuild/opt/zimbra/libexec/zmsetup.pl 

echo "no license question"
sed -i -e 's/displayLicense/print "no license question\\\n";/'  ZimbraBuild/corebuild/opt/zimbra/libexec/installer/install.sh


splashScreenCompanyURL = https://www.zimbra.com

MY_COMPANY_URL='https:\/\/github.com\/hernad\/my-zimbra'

for f in ZimbraWebClient/WebRoot/messages/ZmMsg*.properties
do
   echo $f
   sed -i -e "s/splashScreenCompanyURL.*$/splashScreenCompanyURL = $MY_COMPANY_URL/" $f
done


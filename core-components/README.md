## core components nots



## zimbra-spell-components hernad patch



    sudo dpkg -i zimbra-spell-components*hernad*.deb

Sa ovim patchem neophodni su samo zimbra-aspell-en i -de


<pre>
vagrant@vagrant:~$ sudo apt-get remove zimbra-aspell-sv
Reading package lists... Done
Building dependency tree       
Reading state information... Done
The following packages were automatically installed and are no longer required:
  zimbra-aspell-ar zimbra-aspell-da zimbra-aspell-es zimbra-aspell-fr zimbra-aspell-hi zimbra-aspell-hu zimbra-aspell-it
  zimbra-aspell-nl zimbra-aspell-pl zimbra-aspell-pt-br zimbra-aspell-ru
Use 'sudo apt autoremove' to remove them.
The following packages will be REMOVED:
  zimbra-aspell-sv
0 upgraded, 0 newly installed, 1 to remove and 0 not upgraded.
After this operation, 3,541 kB disk space will be freed.
Do you want to continue? [Y/n] y
(Reading database ... 65232 files and directories currently installed.)
Removing zimbra-aspell-sv (0.51.0-1zimbra8.7b1.16.04) ...
</pre>



    sudo rm zimbra-aspell-{ar,da,es,fr,hi,hu,it,lib,nl,pt-br,ru,sv,pl}*


## build


dpkg-buildpackage -rfakeroot




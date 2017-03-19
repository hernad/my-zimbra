

native2ascii test.java

for f in ZimbraWebClient/WebRoot/messages/*bs*.properties
do
   echo $f
   native2ascii $f $f.utf8
   mv $f.utf8 $f
done



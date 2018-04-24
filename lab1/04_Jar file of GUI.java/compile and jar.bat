path=C:\Program Files\Java\jdk1.8.0_121\bin

prompt $$

cls


javac GUI.java	

echo Main-Class: GUI>manifest.txt

jar cmf manifest.txt myGUI.jar *.class

java -jar myGUI.jar

pause
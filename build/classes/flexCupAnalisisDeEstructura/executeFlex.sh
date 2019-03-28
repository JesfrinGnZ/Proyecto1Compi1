#! /bin/bash 
echo "STARTING JFLEX COMPILING"
java -jar /home/jesfrin/Documentos/LibreriasJava/jflex-1.7.0/lib/jflex-full-1.7.0.jar -d /home/jesfrin/NetBeansProjects/Proyecto1Compi1/src/backend/analizadorParaTextoDeCliente flexEstructura.flex

echo "STARTING CUP COMPILING"
java -jar /home/jesfrin/Documentos/LibreriasJava/cup/java-cup-11b.jar parserEstructura.cup 
mv parser.java /home/jesfrin/NetBeansProjects/Proyecto1Compi1/src/backend/analizadorParaTextoDeCliente/parser.java
mv sym.java /home/jesfrin/NetBeansProjects/Proyecto1Compi1/src/backend/analizadorParaTextoDeCliente/sym.java


For out of IDE/Gradle lexer/parser generation please ensure env is prepared as below

MBP-Przemysaw:test bumblebee$ alias
alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'

antlr4 ABCLexer.g4
antlr4 -no-listener -visitor ABCParser.g4

javac ABC*.java

grun ABC text -gui input/singleChardata.xml
grun ABC text -gui input/singleElement.xml
grun ABC text -gui input/mixedChardataAndElement.xml

TODO: remove those and create full test rig after gradle plugin problem sorted out.

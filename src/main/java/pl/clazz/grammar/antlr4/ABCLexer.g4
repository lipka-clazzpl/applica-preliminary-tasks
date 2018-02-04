lexer grammar ABCLexer;

OPEN_PAREN : '<' -> pushMode(INSIDE) ;

WS : [\t\r\n]+ -> skip ;

TEXT : ~[<]+ ;

mode INSIDE;
SLASH : '/' ;
CLOSE_PAREN :  '>' -> popMode;
Name  : ABC;

fragment
ABC  : [aA] [bB] [cC] 
     ;


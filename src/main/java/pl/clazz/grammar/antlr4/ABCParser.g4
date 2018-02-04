@header {
package pl.clazz.grammar;
}

parser grammar ABCParser;
options { tokenVocab=ABCLexer; }

text 
  : lvl0_elem_chardata { System.out.println("lvl0_elem_chardata"); }
  | lvl0_elem { System.out.println("lvl0_elem"); }
  | lvl0_chardata { System.out.println("lvl0_chardata"); }
  ;

lvl0_chardata
  : chardata* 
  ;

lvl0_elem
  : element*
  ;

lvl0_elem_chardata
  : cpre=chardata? ( (element) cpost=chardata? )+  
  ;


content
  : chardata?
   ( (element) chardata? )*
  ;

element 
  : OPEN_PAREN Name CLOSE_PAREN content OPEN_PAREN SLASH Name CLOSE_PAREN 
  | chardata 
  ;

chardata
  : TEXT | WS
  ;


package convertidor;
import static convertidor.Token.*;
import java_cup.runtime.Symbol;

%%
%class Analizador
%public 
%cup
%char
%line
%column

SaltoLinea = \r|\n|\r\n|\n\r
espacios = {SaltoLinea} | [ \t\f]

%%

"clase"         {return new Symbol(sym.clase, yychar, yyline, yytext());}
"metodo"        {return new Symbol(sym.metodo, yychar, yyline, yytext());}
"variable"      {return new Symbol(sym.variable, yychar, yyline, yytext());}
"herencia"      {return new Symbol(sym.herencia, yychar, yyline, yytext());}
"java"          {return new Symbol(sym.java, yychar, yyline, yytext());}
"programacion"   {return new Symbol(sym.programacion, yychar, yyline, yytext());}
"atributo"       {return new Symbol(sym.atributo, yychar, yyline, yytext());}
"lenguaje"       {return new Symbol(sym.lenguaje, yychar, yyline, yytext());}
"simbolo"        {return new Symbol(sym.simbolo, yychar, yyline, yytext());}
"codigo"         {return new Symbol(sym.codigo, yychar, yyline, yytext());}
"CONVERTIR"      {return new Symbol(sym.CONVERTIR, yychar, yyline, yytext());}
{espacios} {/* ignorar */}
.     {System.out.println("Caracter no valido: " + yytext()); }


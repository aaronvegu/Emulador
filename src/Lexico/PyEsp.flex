/*
Traductores de lenguajes 2023B
CUTonala - INGC

Analizador lexico para el lenguaje PyEsp
Integrantes:
- Velazquez Gurrola Jesus Joseph Aaron
- Ortiz Nava Eliseo 
*/
import java_cup.runtime.*;

%%
%class Lexer
%cup
%line
%column
%unicode

%{
      StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
%}

// Define token types
//%type TOKEN
//%type <TOK_IDENTIFICADOR> TOKEN_IDENTIFICADOR
//%type <TOK_ENTERO> TOKEN_ENTERO
//%type <TOK_REAL> TOKEN_REAL
//%type <TOK_CADENA> TOKEN_CADENA
//%type <TOK_CARACTER> TOKEN_CARACTER
//%type <TOK_BOOL> TOKEN_BOOL
//%type <TOK_SI> TOKEN_SI
//%type <TOK_SINO> TOKEN_SINO
//%type <TOK_MIENTRAS> TOKEN_MIENTRAS
//%type <TOK_PARA> TOKEN_PARA
//%type <TOK_HASTA> TOKEN_HASTA
//%type <TOK_FUNCION> TOKEN_FUNCION
//%type <TOK_RETORNO> TOKEN_RETORNO
//%type <TOK_VERDADERO> TOKEN_VERDADERO
//%type <TOK_FALSO> TOKEN_FALSO
//%type <TOK_IMPRIMIR> TOKEN_IMPRIMIR
//%type <TOK_LEER> TOKEN_LEER
//%type <TOK_DESDE> TOKEN_DESDE

//// General Rules
//LETRA = [a-zA-z]
//DIGITO = [0-9]
//PUNTUACION = [!\"#\$%&\'()\*\+\,\-\.\/:;<=>\?@\[\]\\\^_`{}\~�]
//
//// Regular Expressions
//CARACTER = '{LETRA}' | '{PUNTUACION}' | '{DIGITO}'
//ENTERO = 0|[1-9]{DIGITO}*
//FLOTANTE = {ENTERO}(\.{DIGITO}*)?
//RACIONAL = {ENTERO}"/"{DIGITO}{DIGITO}* | ({ENTERO}_){DIGITO}"/"{DIGITO}{DIGITO}*
//NUMERO = {ENTERO} | {RACIONAL} | {FLOTANTE}
////BOOLEANO = "Verdadero" | "Falso"
////COMENTARIO = "#" [^\r\n]*
////COMENTARIO_MULTIL = \"\"\"
//ESPACIO = [ \t]+

//CARACTER_IDENT = {LETRA} | {DIGITO} | "_"
//IDENTIFICADOR = {LETRA}{CARACTER_IDENT}
//
//TERMINADOR_LINEA = \r|\n|\r\n
//ESPACIO_VACIO = {TERMINADOR_LINEA} | [  \t\f]

// States
%state YYINITIAL, STRING, CHAR, COMENTARIO_LINEA, COMENTARIO_MULTILINEA

// Regular expressions
COMENTARIO_LINEA = "#" [^\r\n]*
COMENTARIO_MULTILINEA = \"\"\"
ESPACIO = [ \t]+
NUMERO = [0-9]+
REAL = [0-9]+"."[0-9]+
IDENTIFICADOR = [_a-zA-Z][_a-zA-Z0-9]*

// Keywords
SI = "si"
SINO = "sino"
MIENTRAS = "mientras"
PARA = "para"
HASTA = "hasta"
FUNCION = "funcion"
RETORNO = "retorno"
VERDADERO = "Verdadero"
FALSO = "Falso"
IMPRIMIR = "imprimir"
LEER = "leer"
DESDE = "desde"
NULO = "Nulo"
COMO = "como"
PAUSA = "pausa"
CLASE = "clase"
CONTINUA = "continua"
DEFINE = "define"
PASAR = "pasar"

// Arithmetic operators
SUMA = "\\+"
RESTA = "-"
MULTIPLICACION = "\\*"
DIVISION = "/"
MODULO = "%"

// Assignment operators
ASIGNACION = "="
MAS_IGUAL = "+="
MENOS_IGUAL = "-="
POR_IGUAL = "*="
ENTRE_IGUAL = "/="

// Comparison operators
IGUAL = "=="
DIFERENTE = "!="
MAYOR_IGUAL = ">="
MENOR_IGUAL = "<="
MAYOR = ">"
MENOR = "<"

// Separators
COMA = ","
PUNTO_Y_COMA = ";"
DOS_PUNTOS = ":"

// Grouping signs
PARENTESIS_IZQ = "\\("
PARENTESIS_DER = "\\)"
CORCHETE_IZQ = "\\["
CORCHETE_DER = "\\]"
LLAVE_IZQ = "\\{"
LLAVE_DER = "\\}"

// Logic Operators
OPERADOR_Y = "y"
OPERADOR_O = "o"
OPERADOR_NO = "no"

// Pertenency Operators
OPERADOR_EN = "en"
OPERADOR_NOEN = "no en"

// Identity Operators
OPERADOR_ES = "es"
OPERADOR_NOES = "no es"

// Rules
%%
<YYINITIAL>#"[\u0000-\uFFFF]"*     { /* Ignore the # character for comments */ }
<YYINITIAL>"\"\"\""  { yybegin(COMENTARIO_MULTILINEA); /* Enter multiline comment mode */ }
<YYINITIAL>"#"     { yybegin(COMENTARIO_LINEA); /* Enter single-line comment mode */ }
<YYINITIAL>"\""    { yybegin(STRING); } // Enter string mode
<YYINITIAL>"'"     { yybegin(CHAR); } // Enter character mode
<YYINITIAL>[ \t]+  { /* Ignore spaces and tabs */ }
<YYINITIAL>\n      { /* Ignore newlines in the initial state */ }
<YYINITIAL>.       { /* Ignore other characters */ }

<COMENTARIO_MULTILINEA>"\"\"\""   { System.out.println("COMENTARIO MULTILINEA"); yybegin(YYINITIAL); /* Exit multiline comment mode */ }
<COMENTARIO_MULTILINEA>.          { /* Continue scanning comment content */ }

<COMENTARIO_LINEA>\n              { System.out.println("COMENTARIO"); yybegin(YYINITIAL); /* Exit single-line comment mode */ }
<COMENTARIO_LINEA>[^\n]*          { /* Continue scanning single-line comment content */ }

<STRING>\"       { yybegin(YYINITIAL); System.out.println("CADENA"); return new Symbol(sym.TOKEN_CADENA, yytext()); } // Exit string mode and return the string token
<STRING>\\n      { /* Ignore escaped newline in string */ }
<STRING>.        { /* Continue scanning string content */ }

<CHAR>'          { yybegin(YYINITIAL);System.out.println("CARACTER"); return new Symbol(sym.TOKEN_CARACTER, yytext()); } // Exit character mode and return the character token
<CHAR>.          { /* Continue scanning character content */ }

{IGUAL}           { System.out.println("IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }
{DIFERENTE}       { System.out.println("DIFERENTE"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }
{MAYOR_IGUAL}     { System.out.println("MAYOR_IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }
{MENOR_IGUAL}     { System.out.println("MENOR_IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }
{MAYOR}           { System.out.println("MAYOR"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }
{MENOR}           { System.out.println("MENOR"); return new Symbol(sym.TOKEN_COMPARACION, yytext()); }

{MAS_IGUAL}       { System.out.println("MAS_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext()); }
{MENOS_IGUAL}     { System.out.println("MENOS_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext()); }
{POR_IGUAL}       { System.out.println("POR_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext()); }
{ENTRE_IGUAL}     { System.out.println("ENTRE_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext()); }
{ASIGNACION}      { System.out.println("ASIGNACION"); return new Symbol(sym.TOKEN_ASIGNACION, yytext()); }

{COMA}            { System.out.println("COMA"); return new Symbol(sym.TOKEN_SEPARADOR, yytext()); }
{PUNTO_Y_COMA}    { System.out.println("PUNTO_Y_COMA"); return new Symbol(sym.TOKEN_SEPARADOR, yytext()); }
{DOS_PUNTOS}      { System.out.println("DOS_PUNTOS"); return new Symbol(sym.TOKEN_SEPARADOR, yytext()); }

{PARENTESIS_IZQ}  { System.out.println("PARENTESIS_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }
{PARENTESIS_DER}  { System.out.println("PARENTESIS_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }
{CORCHETE_IZQ}    { System.out.println("CORCHETE_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }
{CORCHETE_DER}    { System.out.println("CORCHETE_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }
{LLAVE_IZQ}       { System.out.println("LLAVE_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }
{LLAVE_DER}       { System.out.println("LLAVE_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext()); }

{PARENTESIS_IZQ}  { System.out.println("PARENTESIS_IZQ"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }
{PARENTESIS_DER}  { System.out.println("PARENTESIS_DER"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }
{CORCHETE_IZQ}    { System.out.println("CORCHETE_IZQ"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }
{CORCHETE_DER}    { System.out.println("CORCHETE_DER"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }
{LLAVE_IZQ}       { System.out.println("LLAVE_IZQ"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }
{LLAVE_DER}       { System.out.println("LLAVE_DER"); return new Symbol(sym.TOKEN_GRUPO, yytext()); }

{OPERADOR_Y}      { System.out.println("OPERADOR_Y"); return new Symbol(sym.TOKEN_LOGICO, yytext()); }
{OPERADOR_O}      { System.out.println("OPERADOR_O"); return new Symbol(sym.TOKEN_LOGICO, yytext()); }
{OPERADOR_NO}     { System.out.println("OPERADOR_NO"); return new Symbol(sym.TOKEN_LOGICO, yytext()); }

{OPERADOR_NOEN}   { System.out.println("OPERADOR_NOEN"); return new Symbol(sym.TOKEN_PERTENENCIA, yytext()); }
{OPERADOR_EN}     { System.out.println("OPERADOR_EN"); return new Symbol(sym.TOKEN_PERTENENCIA, yytext()); }

{OPERADOR_NOES}   { System.out.println("OPERADOR_NOES"); return new Symbol(sym.TOKEN_IDENTIDAD, yytext()); }
{OPERADOR_ES}     { System.out.println("OPERADOR_ES"); return new Symbol(sym.TOKEN_IDENTIDAD, yytext()); }

{SUMA}            { System.out.println("SUMA"); return new Symbol(sym.TOKEN_ARITMETICO, yytext()); }
{RESTA}           { System.out.println("RESTA"); return new Symbol(sym.TOKEN_ARITMETICO, yytext()); }
{MULTIPLICACION}  { System.out.println("MULTIPLICACION"); return new Symbol(sym.TOKEN_ARITMETICO, yytext()); }
{DIVISION}        { System.out.println("DIVISION"); return new Symbol(sym.TOKEN_ARITMETICO, yytext()); }
{MODULO}          { System.out.println("MODULO"); return new Symbol(sym.TOKEN_ARITMETICO, yytext()); }

{SINO}            { System.out.println("SINO"); return new Symbol(sym.TOKEN_SINO, yytext()); }
{SI}              { System.out.println("SI"); return new Symbol(sym.TOKEN_SI, yytext()); }
{MIENTRAS}        { System.out.println("MIENTRAS"); return new Symbol(sym.TOKEN_MIENTRAS, yytext()); }
{PARA}            { System.out.println("PARA"); return new Symbol(sym.TOKEN_PARA, yytext()); }
{HASTA}           { System.out.println("HASTA"); return new Symbol(sym.TOKEN_HASTA, yytext()); }
{FUNCION}         { System.out.println("FUNCION"); return new Symbol(sym.TOKEN_FUNCION, yytext()); }
{RETORNO}         { System.out.println("RETORNO"); return new Symbol(sym.TOKEN_RETORNO, yytext()); }
{VERDADERO}       { System.out.println("VERDADERO"); return new Symbol(sym.TOKEN_VERDADERO, yytext()); }
{FALSO}           { System.out.println("FALSO"); return new Symbol(sym.TOKEN_FALSO, yytext()); }
{IMPRIMIR}        { System.out.println("IMPRIMIR"); return new Symbol(sym.TOKEN_IMPRIMIR, yytext()); }
{LEER}            { System.out.println("LEER"); return new Symbol(sym.TOKEN_LEER, yytext()); }
{DESDE}           { System.out.println("DESDE"); return new Symbol(sym.TOKEN_DESDE, yytext()); }
{NULO}            { System.out.println("NULO"); return new Symbol(sym.TOKEN_NULO, yytext()); }
{COMO}            { System.out.println("COMO"); return new Symbol(sym.TOKEN_COMO, yytext()); }
{PAUSA}           { System.out.println("PAUSA"); return new Symbol(sym.TOKEN_PAUSA, yytext()); }
{CLASE}           { System.out.println("CLASE"); return new Symbol(sym.TOKEN_CLASE, yytext()); }
{CONTINUA}        { System.out.println("CONTINUA"); return new Symbol(sym.TOKEN_CONTINUA, yytext()); }
{DEFINE}          { System.out.println("DEFINE"); return new Symbol(sym.TOKEN_DEFINE, yytext()); }
{PASAR}           { System.out.println("PASAR"); return new Symbol(sym.TOKEN_PASAR, yytext()); }
{NUMERO}          { System.out.println("NUMERO"); return new Symbol(sym.TOKEN_ENTERO, yytext()); }
{REAL}            { System.out.println("REAL"); return new Symbol(sym.TOKEN_REAL, yytext()); }
{IDENTIFICADOR}   { System.out.println("IDENTIFICADOR"); return new Symbol(sym.TOKEN_IDENTIFICADOR, yytext()); }

<YYINITIAL>"\n"   { /* Ignore newlines in the initial state */ }
<YYINITIAL>.      { /* Ignore other characters */ }

[^]               { throw new Error("Illegal character <"+yytext()+">"); }

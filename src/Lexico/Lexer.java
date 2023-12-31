/* The following code was generated by JFlex 1.6.1 */

/*
Traductores de lenguajes 2023B
CUTonala - INGC

Analizador lexico para el lenguaje PyEsp
Integrantes:
- Velazquez Gurrola Jesus Joseph Aaron
- Ortiz Nava Eliseo 
*/
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/Users/aaronvegu/IdeaProjects/Emulador/src/Lexico/PyEsp.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHAR = 4;
  public static final int COMENTARIO_LINEA = 6;
  public static final int COMENTARIO_MULTILINEA = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\53\10\0\1\4\1\56\1\2\1\2\1\2\22\0\1\52\1\41"+
    "\1\3\1\1\1\0\1\0\1\0\1\55\1\44\1\45\1\36\1\34"+
    "\1\0\1\35\1\6\1\37\12\5\1\0\1\0\1\43\1\40\1\42"+
    "\2\0\5\7\1\30\7\7\1\32\7\7\1\26\4\7\1\46\1\33"+
    "\1\47\1\0\1\7\1\0\1\20\1\7\1\25\1\27\1\15\1\23"+
    "\1\7\1\22\1\11\2\7\1\31\1\14\1\12\1\13\1\21\1\7"+
    "\1\17\1\10\1\16\1\24\3\7\1\7\1\7\1\50\1\0\1\51"+
    "\7\0\1\2\u1fa2\0\1\2\1\2\udfd5\0\1\54\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\20\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6"+
    "\32\2\1\7\1\10\1\11\1\12\32\11\33\13\1\14"+
    "\1\1\1\15\34\16\2\0\1\17\1\0\1\20\1\21"+
    "\1\20\1\22\1\20\1\23\1\24\13\20\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\2\0"+
    "\1\46\1\47\2\20\1\0\20\20\1\50\1\0\1\51"+
    "\1\20\1\0\3\20\1\52\4\20\1\53\5\20\1\54"+
    "\1\55\1\0\1\20\1\56\1\57\2\20\1\60\1\61"+
    "\1\62\2\20\1\63\1\20\1\64\1\20\1\65\6\20"+
    "\1\66\2\20\1\67\1\70\2\20\1\71\1\72\1\73"+
    "\1\20\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[241];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\353"+
    "\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a"+
    "\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582"+
    "\0\u05b1\0\u05e0\0\u060f\0\u063e\0\353\0\353\0\353\0\353"+
    "\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0"+
    "\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468"+
    "\0\u0497\0\u066d\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0"+
    "\0\u060f\0\u063e\0\353\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553"+
    "\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\353\0\u069c\0\353"+
    "\0\353\0\u06cb\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a"+
    "\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582"+
    "\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u06fa\0\u0729\0\u01a7\0\u0758"+
    "\0\u01d6\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u01d6\0\u01d6\0\u0843"+
    "\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb"+
    "\0\u09ea\0\u0a19\0\353\0\353\0\353\0\353\0\353\0\353"+
    "\0\353\0\353\0\353\0\353\0\353\0\353\0\353\0\353"+
    "\0\353\0\353\0\353\0\u0a48\0\u0a77\0\353\0\u0758\0\u0aa6"+
    "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\353\0\u0e23\0\u01d6\0\u0e52\0\u0e81\0\u0eb0"+
    "\0\u0edf\0\u0f0e\0\u01d6\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u01d6"+
    "\0\u0ff9\0\u1028\0\u1057\0\u1086\0\u10b5\0\u01d6\0\u01d6\0\u10e4"+
    "\0\u1113\0\353\0\353\0\u1142\0\u1171\0\u01d6\0\u01d6\0\u01d6"+
    "\0\u11a0\0\u11cf\0\u01d6\0\u11fe\0\u01d6\0\u122d\0\u01d6\0\u125c"+
    "\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u01d6\0\u1376\0\u13a5"+
    "\0\u01d6\0\u01d6\0\u13d4\0\u1403\0\u01d6\0\u01d6\0\u01d6\0\u1432"+
    "\0\u01d6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[241];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\6\1\14"+
    "\1\15\1\16\1\17\1\14\1\20\1\21\1\14\1\22"+
    "\1\14\1\23\1\24\1\25\1\14\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\6\6\1\12\2\6\1\45"+
    "\1\46\2\47\1\10\1\50\1\47\1\51\1\47\1\52"+
    "\1\53\1\54\1\55\1\52\1\56\1\57\1\52\1\60"+
    "\1\52\1\61\1\62\1\63\1\52\1\64\1\65\1\66"+
    "\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
    "\1\77\1\100\1\101\1\102\12\47\1\10\2\103\1\10"+
    "\2\103\1\104\1\103\1\105\1\106\1\107\1\110\1\105"+
    "\1\111\1\112\1\105\1\113\1\105\1\114\1\115\1\116"+
    "\1\105\1\117\1\120\1\121\1\122\1\123\1\124\1\125"+
    "\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135"+
    "\11\103\1\136\1\10\56\137\1\140\2\141\1\10\1\142"+
    "\1\141\1\143\1\141\1\144\1\145\1\146\1\147\1\144"+
    "\1\150\1\151\1\144\1\152\1\144\1\153\1\154\1\155"+
    "\1\144\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
    "\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174"+
    "\12\141\1\10\125\0\1\175\13\0\1\176\57\0\1\12"+
    "\45\0\1\12\11\0\1\177\1\200\55\0\1\201\1\0"+
    "\24\201\31\0\1\201\1\0\2\201\1\202\21\201\31\0"+
    "\1\201\1\0\5\201\1\203\16\201\31\0\1\201\1\0"+
    "\4\201\1\204\17\201\31\0\1\201\1\0\2\201\1\205"+
    "\21\201\31\0\1\201\1\0\1\201\1\206\1\201\1\207"+
    "\20\201\31\0\1\201\1\0\6\201\1\210\15\201\31\0"+
    "\1\201\1\0\11\201\1\211\12\201\31\0\1\201\1\0"+
    "\11\201\1\212\12\201\31\0\1\201\1\0\15\201\1\213"+
    "\6\201\31\0\1\201\1\0\4\201\1\214\15\201\1\215"+
    "\1\201\31\0\1\201\1\0\6\201\1\216\15\201\31\0"+
    "\1\201\1\0\6\201\1\217\15\201\31\0\1\201\1\0"+
    "\11\201\1\220\12\201\31\0\1\201\1\0\6\201\1\221"+
    "\15\201\31\0\1\201\1\0\15\201\1\222\6\201\60\0"+
    "\1\223\1\0\1\224\5\0\1\225\1\226\1\227\1\230"+
    "\1\231\1\232\45\0\1\233\56\0\1\234\56\0\1\235"+
    "\56\0\1\236\56\0\1\237\56\0\1\240\56\0\1\241"+
    "\56\0\1\242\30\0\1\243\21\0\1\223\1\0\1\224"+
    "\5\0\1\225\1\226\1\227\1\230\1\231\1\232\5\0"+
    "\56\137\4\0\1\244\126\0\1\245\6\0\1\246\60\0"+
    "\1\247\56\0\1\201\1\0\3\201\1\250\20\201\31\0"+
    "\1\201\1\0\12\201\1\251\11\201\31\0\1\201\1\0"+
    "\24\201\17\0\1\252\11\0\1\201\1\0\6\201\1\253"+
    "\15\201\31\0\1\201\1\0\7\201\1\254\14\201\31\0"+
    "\1\201\1\0\1\201\1\255\6\201\1\256\4\201\1\257"+
    "\6\201\31\0\1\201\1\0\1\201\1\260\22\201\31\0"+
    "\1\201\1\0\3\201\1\261\20\201\31\0\1\201\1\0"+
    "\3\201\1\262\1\201\1\263\16\201\31\0\1\201\1\0"+
    "\11\201\1\264\12\201\31\0\1\201\1\0\10\201\1\265"+
    "\13\201\31\0\1\201\1\0\1\201\1\266\12\201\1\267"+
    "\7\201\31\0\1\201\1\0\22\201\1\270\1\201\31\0"+
    "\1\201\1\0\6\201\1\271\15\201\31\0\1\201\1\0"+
    "\22\201\1\272\1\201\27\0\1\273\110\0\1\274\26\0"+
    "\1\201\1\0\4\201\1\275\17\201\31\0\1\201\1\0"+
    "\10\201\1\276\13\201\41\0\1\277\46\0\1\201\1\0"+
    "\3\201\1\300\20\201\31\0\1\201\1\0\4\201\1\301"+
    "\17\201\31\0\1\201\1\0\11\201\1\302\12\201\31\0"+
    "\1\201\1\0\11\201\1\303\12\201\31\0\1\201\1\0"+
    "\1\201\1\304\22\201\31\0\1\201\1\0\7\201\1\305"+
    "\14\201\31\0\1\201\1\0\16\201\1\306\5\201\31\0"+
    "\1\201\1\0\7\201\1\307\14\201\31\0\1\201\1\0"+
    "\4\201\1\310\17\201\31\0\1\201\1\0\1\201\1\311"+
    "\22\201\31\0\1\201\1\0\20\201\1\312\3\201\31\0"+
    "\1\201\1\0\20\201\1\313\3\201\31\0\1\201\1\0"+
    "\2\201\1\314\21\201\31\0\1\201\1\0\1\201\1\315"+
    "\22\201\31\0\1\201\1\0\10\201\1\316\13\201\31\0"+
    "\1\201\1\0\4\201\1\317\17\201\100\0\1\320\7\0"+
    "\1\201\1\0\2\201\1\321\21\201\34\0\1\322\1\0"+
    "\1\323\51\0\1\201\1\0\7\201\1\324\14\201\31\0"+
    "\1\201\1\0\10\201\1\325\13\201\31\0\1\201\1\0"+
    "\10\201\1\326\13\201\31\0\1\201\1\0\11\201\1\327"+
    "\12\201\31\0\1\201\1\0\11\201\1\330\12\201\31\0"+
    "\1\201\1\0\2\201\1\331\21\201\31\0\1\201\1\0"+
    "\2\201\1\332\21\201\31\0\1\201\1\0\6\201\1\333"+
    "\15\201\31\0\1\201\1\0\11\201\1\334\12\201\31\0"+
    "\1\201\1\0\6\201\1\335\15\201\31\0\1\201\1\0"+
    "\3\201\1\336\20\201\31\0\1\201\1\0\4\201\1\337"+
    "\17\201\73\0\1\7\14\0\1\201\1\0\5\201\1\340"+
    "\16\201\31\0\1\201\1\0\10\201\1\341\13\201\31\0"+
    "\1\201\1\0\3\201\1\342\20\201\31\0\1\201\1\0"+
    "\4\201\1\343\17\201\31\0\1\201\1\0\3\201\1\344"+
    "\20\201\31\0\1\201\1\0\20\201\1\345\3\201\31\0"+
    "\1\201\1\0\6\201\1\346\15\201\31\0\1\201\1\0"+
    "\2\201\1\347\21\201\31\0\1\201\1\0\11\201\1\350"+
    "\12\201\31\0\1\201\1\0\4\201\1\351\17\201\31\0"+
    "\1\201\1\0\3\201\1\352\20\201\31\0\1\201\1\0"+
    "\15\201\1\353\6\201\31\0\1\201\1\0\6\201\1\354"+
    "\15\201\31\0\1\201\1\0\10\201\1\355\13\201\31\0"+
    "\1\201\1\0\1\201\1\356\22\201\31\0\1\201\1\0"+
    "\11\201\1\357\12\201\31\0\1\201\1\0\10\201\1\360"+
    "\13\201\31\0\1\201\1\0\4\201\1\361\17\201\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5217];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\0\1\11\1\1\1\11\34\1\4\11"+
    "\32\1\1\11\32\1\1\11\1\1\2\11\33\1\2\0"+
    "\1\1\1\0\22\1\21\11\2\0\1\11\3\1\1\0"+
    "\20\1\1\11\1\0\2\1\1\0\20\1\1\0\1\1"+
    "\2\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[241];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
      StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* Continue scanning single-line comment content */
            }
          case 61: break;
          case 2: 
            { /* Ignore other characters */
            }
          case 62: break;
          case 3: 
            { /* Ignore the # character for comments */
            }
          case 63: break;
          case 4: 
            { throw new Error("Illegal character <"+yytext()+">");
            }
          case 64: break;
          case 5: 
            { yybegin(STRING);
            }
          case 65: break;
          case 6: 
            { /* Ignore spaces and tabs */
            }
          case 66: break;
          case 7: 
            { yybegin(CHAR);
            }
          case 67: break;
          case 8: 
            { /* Ignore newlines in the initial state */
            }
          case 68: break;
          case 9: 
            { /* Continue scanning string content */
            }
          case 69: break;
          case 10: 
            { yybegin(YYINITIAL); System.out.println("CADENA"); return new Symbol(sym.TOKEN_CADENA, yytext());
            }
          case 70: break;
          case 11: 
            { /* Continue scanning character content */
            }
          case 71: break;
          case 12: 
            { yybegin(YYINITIAL);System.out.println("CARACTER"); return new Symbol(sym.TOKEN_CARACTER, yytext());
            }
          case 72: break;
          case 13: 
            { System.out.println("COMENTARIO"); yybegin(YYINITIAL); /* Exit single-line comment mode */
            }
          case 73: break;
          case 14: 
            { /* Continue scanning comment content */
            }
          case 74: break;
          case 15: 
            { System.out.println("NUMERO"); return new Symbol(sym.TOKEN_ENTERO, yytext());
            }
          case 75: break;
          case 16: 
            { System.out.println("IDENTIFICADOR"); return new Symbol(sym.TOKEN_IDENTIFICADOR, yytext());
            }
          case 76: break;
          case 17: 
            { System.out.println("SI"); return new Symbol(sym.TOKEN_SI, yytext());
            }
          case 77: break;
          case 18: 
            { System.out.println("OPERADOR_NO"); return new Symbol(sym.TOKEN_LOGICO, yytext());
            }
          case 78: break;
          case 19: 
            { System.out.println("OPERADOR_ES"); return new Symbol(sym.TOKEN_IDENTIDAD, yytext());
            }
          case 79: break;
          case 20: 
            { System.out.println("OPERADOR_EN"); return new Symbol(sym.TOKEN_PERTENENCIA, yytext());
            }
          case 80: break;
          case 21: 
            { System.out.println("SUMA"); return new Symbol(sym.TOKEN_ARITMETICO, yytext());
            }
          case 81: break;
          case 22: 
            { System.out.println("MULTIPLICACION"); return new Symbol(sym.TOKEN_ARITMETICO, yytext());
            }
          case 82: break;
          case 23: 
            { System.out.println("PARENTESIS_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 83: break;
          case 24: 
            { System.out.println("PARENTESIS_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 84: break;
          case 25: 
            { System.out.println("CORCHETE_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 85: break;
          case 26: 
            { System.out.println("CORCHETE_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 86: break;
          case 27: 
            { System.out.println("LLAVE_IZQ"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 87: break;
          case 28: 
            { System.out.println("LLAVE_DER"); return new Symbol(sym.TOKEN_AGRUPACION, yytext());
            }
          case 88: break;
          case 29: 
            { System.out.println("MAS_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext());
            }
          case 89: break;
          case 30: 
            { System.out.println("MENOS_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext());
            }
          case 90: break;
          case 31: 
            { System.out.println("POR_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext());
            }
          case 91: break;
          case 32: 
            { System.out.println("ENTRE_IGUAL"); return new Symbol(sym.TOKEN_ASIGNACION, yytext());
            }
          case 92: break;
          case 33: 
            { System.out.println("IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext());
            }
          case 93: break;
          case 34: 
            { System.out.println("DIFERENTE"); return new Symbol(sym.TOKEN_COMPARACION, yytext());
            }
          case 94: break;
          case 35: 
            { System.out.println("MAYOR_IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext());
            }
          case 95: break;
          case 36: 
            { System.out.println("MENOR_IGUAL"); return new Symbol(sym.TOKEN_COMPARACION, yytext());
            }
          case 96: break;
          case 37: 
            { /* Ignore escaped newline in string */
            }
          case 97: break;
          case 38: 
            { yybegin(COMENTARIO_MULTILINEA); /* Enter multiline comment mode */
            }
          case 98: break;
          case 39: 
            { System.out.println("REAL"); return new Symbol(sym.TOKEN_REAL, yytext());
            }
          case 99: break;
          case 40: 
            { System.out.println("COMENTARIO MULTILINEA"); yybegin(YYINITIAL); /* Exit multiline comment mode */
            }
          case 100: break;
          case 41: 
            { System.out.println("SINO"); return new Symbol(sym.TOKEN_SINO, yytext());
            }
          case 101: break;
          case 42: 
            { System.out.println("PARA"); return new Symbol(sym.TOKEN_PARA, yytext());
            }
          case 102: break;
          case 43: 
            { System.out.println("COMO"); return new Symbol(sym.TOKEN_COMO, yytext());
            }
          case 103: break;
          case 44: 
            { System.out.println("LEER"); return new Symbol(sym.TOKEN_LEER, yytext());
            }
          case 104: break;
          case 45: 
            { System.out.println("NULO"); return new Symbol(sym.TOKEN_NULO, yytext());
            }
          case 105: break;
          case 46: 
            { System.out.println("OPERADOR_NOES"); return new Symbol(sym.TOKEN_IDENTIDAD, yytext());
            }
          case 106: break;
          case 47: 
            { System.out.println("OPERADOR_NOEN"); return new Symbol(sym.TOKEN_PERTENENCIA, yytext());
            }
          case 107: break;
          case 48: 
            { System.out.println("PASAR"); return new Symbol(sym.TOKEN_PASAR, yytext());
            }
          case 108: break;
          case 49: 
            { System.out.println("PAUSA"); return new Symbol(sym.TOKEN_PAUSA, yytext());
            }
          case 109: break;
          case 50: 
            { System.out.println("HASTA"); return new Symbol(sym.TOKEN_HASTA, yytext());
            }
          case 110: break;
          case 51: 
            { System.out.println("CLASE"); return new Symbol(sym.TOKEN_CLASE, yytext());
            }
          case 111: break;
          case 52: 
            { System.out.println("DESDE"); return new Symbol(sym.TOKEN_DESDE, yytext());
            }
          case 112: break;
          case 53: 
            { System.out.println("FALSO"); return new Symbol(sym.TOKEN_FALSO, yytext());
            }
          case 113: break;
          case 54: 
            { System.out.println("DEFINE"); return new Symbol(sym.TOKEN_DEFINE, yytext());
            }
          case 114: break;
          case 55: 
            { System.out.println("RETORNO"); return new Symbol(sym.TOKEN_RETORNO, yytext());
            }
          case 115: break;
          case 56: 
            { System.out.println("FUNCION"); return new Symbol(sym.TOKEN_FUNCION, yytext());
            }
          case 116: break;
          case 57: 
            { System.out.println("IMPRIMIR"); return new Symbol(sym.TOKEN_IMPRIMIR, yytext());
            }
          case 117: break;
          case 58: 
            { System.out.println("MIENTRAS"); return new Symbol(sym.TOKEN_MIENTRAS, yytext());
            }
          case 118: break;
          case 59: 
            { System.out.println("CONTINUA"); return new Symbol(sym.TOKEN_CONTINUA, yytext());
            }
          case 119: break;
          case 60: 
            { System.out.println("VERDADERO"); return new Symbol(sym.TOKEN_VERDADERO, yytext());
            }
          case 120: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

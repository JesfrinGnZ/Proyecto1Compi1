/* The following code was generated by JFlex 1.7.0 */

//------------------>1era area<--------------------------    

package backend.analizadorParaLogin;
import java_cup.runtime.*;
import static backend.analizadorParaLogin.sym.*;
import backend.elementos.Usuario;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>flexUsuarios.flex</tt>
 */
public class AnalizadorLexicoUsuarios implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\3\1\2\1\0\1\3\1\1\16\5\4\0\1\3\3\0"+
    "\1\4\10\0\1\4\1\0\1\24\12\5\2\0\1\25\1\0\1\26"+
    "\2\0\15\5\1\15\1\5\1\21\4\5\1\6\5\5\1\27\1\0"+
    "\1\30\1\0\1\4\1\0\1\11\1\17\1\5\1\23\1\20\3\5"+
    "\1\13\3\5\1\16\1\5\1\14\2\5\1\12\1\7\1\5\1\10"+
    "\1\5\1\22\3\5\4\0\41\5\2\0\4\5\4\0\1\5\2\0"+
    "\1\5\7\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5\1\0"+
    "\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5\21\0"+
    "\165\5\1\0\2\5\2\0\4\5\1\0\1\5\6\0\1\5\1\0"+
    "\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0\213\5\1\0"+
    "\5\5\2\0\246\5\1\0\46\5\2\0\1\5\7\0\47\5\7\0"+
    "\1\5\1\0\55\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0"+
    "\1\5\10\0\33\5\5\0\3\5\15\0\6\5\5\0\1\5\4\0"+
    "\13\5\1\0\1\5\3\0\112\5\4\0\146\5\1\0\11\5\1\0"+
    "\12\5\1\0\23\5\2\0\1\5\17\0\74\5\2\0\145\5\16\0"+
    "\66\5\4\0\1\5\5\0\56\5\22\0\34\5\104\0\25\5\56\0"+
    "\201\5\2\0\12\5\1\0\23\5\1\0\10\5\2\0\2\5\2\0"+
    "\26\5\1\0\7\5\1\0\1\5\3\0\4\5\2\0\11\5\2\0"+
    "\2\5\2\0\4\5\10\0\1\5\4\0\2\5\1\0\5\5\2\0"+
    "\16\5\7\0\1\5\5\0\3\5\1\0\6\5\4\0\2\5\2\0"+
    "\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0\2\5\2\0"+
    "\1\5\1\0\5\5\4\0\2\5\2\0\3\5\3\0\1\5\7\0"+
    "\4\5\1\0\1\5\7\0\20\5\13\0\3\5\1\0\11\5\1\0"+
    "\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"+
    "\12\5\1\0\3\5\1\0\3\5\2\0\1\5\17\0\4\5\2\0"+
    "\12\5\1\0\1\5\7\0\1\5\7\0\3\5\1\0\10\5\2\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"+
    "\11\5\2\0\2\5\2\0\3\5\10\0\2\5\4\0\2\5\1\0"+
    "\5\5\2\0\12\5\1\0\1\5\20\0\2\5\1\0\6\5\3\0"+
    "\3\5\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0"+
    "\2\5\3\0\3\5\3\0\14\5\4\0\5\5\3\0\3\5\1\0"+
    "\4\5\2\0\1\5\6\0\1\5\16\0\12\5\11\0\1\5\6\0"+
    "\4\5\1\0\10\5\1\0\3\5\1\0\27\5\1\0\20\5\3\0"+
    "\10\5\1\0\3\5\1\0\4\5\7\0\2\5\1\0\3\5\5\0"+
    "\4\5\2\0\12\5\21\0\3\5\1\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\2\0\11\5\1\0\3\5\1\0"+
    "\4\5\7\0\2\5\7\0\1\5\1\0\4\5\2\0\12\5\1\0"+
    "\2\5\16\0\3\5\1\0\10\5\1\0\3\5\1\0\51\5\2\0"+
    "\10\5\1\0\3\5\1\0\5\5\10\0\1\5\7\0\5\5\2\0"+
    "\12\5\12\0\6\5\2\0\2\5\1\0\22\5\3\0\30\5\1\0"+
    "\11\5\1\0\1\5\2\0\7\5\3\0\1\5\4\0\6\5\1\0"+
    "\1\5\1\0\10\5\6\0\12\5\2\0\2\5\15\0\72\5\4\0"+
    "\20\5\1\0\12\5\47\0\2\5\1\0\1\5\2\0\2\5\1\0"+
    "\1\5\2\0\1\5\6\0\4\5\1\0\7\5\1\0\3\5\1\0"+
    "\1\5\1\0\1\5\2\0\2\5\1\0\15\5\1\0\3\5\2\0"+
    "\5\5\1\0\1\5\1\0\6\5\2\0\12\5\2\0\4\5\40\0"+
    "\1\5\27\0\2\5\6\0\12\5\13\0\1\5\1\0\1\5\1\0"+
    "\1\5\4\0\12\5\1\0\44\5\4\0\24\5\1\0\22\5\1\0"+
    "\44\5\11\0\1\5\71\0\112\5\6\0\116\5\2\0\46\5\1\0"+
    "\1\5\5\0\1\5\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0"+
    "\7\5\1\0\1\5\1\0\4\5\2\0\51\5\1\0\4\5\2\0"+
    "\41\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0"+
    "\17\5\1\0\71\5\1\0\4\5\2\0\103\5\2\0\3\5\40\0"+
    "\20\5\20\0\126\5\2\0\6\5\3\0\u026c\5\2\0\21\5\1\0"+
    "\32\5\5\0\113\5\3\0\13\5\7\0\15\5\1\0\7\5\13\0"+
    "\25\5\13\0\24\5\14\0\15\5\1\0\3\5\1\0\2\5\14\0"+
    "\124\5\3\0\1\5\3\0\3\5\2\0\12\5\41\0\4\5\1\0"+
    "\12\5\6\0\130\5\10\0\53\5\5\0\106\5\12\0\37\5\1\0"+
    "\14\5\4\0\14\5\12\0\50\5\2\0\5\5\13\0\54\5\4\0"+
    "\32\5\6\0\12\5\46\0\34\5\4\0\77\5\1\0\35\5\2\0"+
    "\13\5\6\0\12\5\15\0\1\5\10\0\16\5\102\0\114\5\4\0"+
    "\12\5\21\0\11\5\14\0\164\5\14\0\70\5\10\0\12\5\3\0"+
    "\61\5\122\0\3\5\1\0\43\5\1\0\2\5\6\0\366\5\6\0"+
    "\u011a\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0"+
    "\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\16\0\5\5\32\0"+
    "\5\5\20\0\2\5\23\0\1\5\13\0\5\5\1\0\12\5\1\0"+
    "\1\5\15\0\1\5\20\0\15\5\3\0\37\5\21\0\15\5\4\0"+
    "\1\5\3\0\14\5\21\0\1\5\4\0\1\5\2\0\12\5\1\0"+
    "\1\5\3\0\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\4\5\1\0\13\5\2\0\4\5\5\0\5\5\4\0\1\5\21\0"+
    "\51\5\u0a77\0\57\5\1\0\57\5\1\0\205\5\6\0\11\5\14\0"+
    "\46\5\1\0\1\5\5\0\1\5\2\0\70\5\7\0\1\5\17\0"+
    "\30\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\40\5\57\0"+
    "\1\5\u01d5\0\3\5\31\0\17\5\1\0\5\5\2\0\5\5\4\0"+
    "\126\5\2\0\2\5\2\0\3\5\1\0\132\5\1\0\4\5\5\0"+
    "\51\5\3\0\136\5\21\0\33\5\65\0\20\5\u0200\0\u19b6\5\112\0"+
    "\u51d6\5\52\0\u048d\5\103\0\56\5\2\0\u010d\5\3\0\34\5\24\0"+
    "\60\5\4\0\12\5\1\0\163\5\45\0\11\5\2\0\147\5\2\0"+
    "\43\5\2\0\10\5\77\0\61\5\20\0\1\5\7\0\64\5\14\0"+
    "\105\5\13\0\12\5\6\0\30\5\3\0\1\5\1\0\1\5\2\0"+
    "\56\5\2\0\44\5\14\0\35\5\3\0\101\5\16\0\13\5\6\0"+
    "\37\5\1\0\67\5\11\0\16\5\2\0\12\5\6\0\27\5\3\0"+
    "\111\5\30\0\3\5\2\0\20\5\2\0\5\5\12\0\6\5\2\0"+
    "\6\5\2\0\6\5\11\0\7\5\1\0\7\5\1\0\53\5\1\0"+
    "\12\5\12\0\173\5\1\0\2\5\2\0\12\5\6\0\u2ba4\5\14\0"+
    "\27\5\4\0\61\5\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0"+
    "\5\5\5\0\14\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0"+
    "\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0"+
    "\66\5\50\0\15\5\3\0\20\5\20\0\20\5\3\0\2\5\30\0"+
    "\3\5\31\0\1\5\6\0\5\5\1\0\207\5\2\0\1\5\4\0"+
    "\1\5\13\0\12\5\7\0\32\5\4\0\1\5\1\0\32\5\13\0"+
    "\131\5\3\0\6\5\2\0\6\5\2\0\6\5\2\0\3\5\3\0"+
    "\2\5\3\0\2\5\22\0\3\5\4\0\14\5\1\0\32\5\1\0"+
    "\23\5\1\0\2\5\1\0\17\5\2\0\16\5\42\0\173\5\105\0"+
    "\65\5\210\0\1\5\202\0\35\5\3\0\61\5\17\0\1\5\37\0"+
    "\40\5\20\0\33\5\5\0\53\5\5\0\36\5\2\0\44\5\4\0"+
    "\10\5\1\0\5\5\52\0\236\5\2\0\12\5\126\0\50\5\10\0"+
    "\64\5\234\0\u0137\5\11\0\26\5\12\0\10\5\230\0\6\5\2\0"+
    "\1\5\1\0\54\5\1\0\2\5\3\0\1\5\2\0\27\5\12\0"+
    "\27\5\11\0\37\5\101\0\23\5\1\0\2\5\12\0\26\5\12\0"+
    "\32\5\106\0\70\5\6\0\2\5\100\0\4\5\1\0\2\5\5\0"+
    "\10\5\1\0\3\5\1\0\33\5\4\0\3\5\4\0\1\5\40\0"+
    "\35\5\3\0\35\5\43\0\10\5\1\0\36\5\31\0\66\5\12\0"+
    "\26\5\12\0\23\5\15\0\22\5\156\0\111\5\67\0\63\5\15\0"+
    "\63\5\u030d\0\107\5\37\0\12\5\17\0\74\5\2\0\1\5\22\0"+
    "\31\5\7\0\12\5\6\0\65\5\1\0\12\5\20\0\44\5\2\0"+
    "\1\5\11\0\105\5\5\0\3\5\3\0\13\5\1\0\1\5\43\0"+
    "\22\5\1\0\45\5\110\0\7\5\1\0\1\5\1\0\4\5\1\0"+
    "\17\5\1\0\12\5\7\0\73\5\5\0\12\5\6\0\4\5\1\0"+
    "\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\5\5\2\0\11\5\2\0\2\5\2\0\3\5\2\0\1\5\6\0"+
    "\1\5\5\0\7\5\2\0\7\5\3\0\5\5\u010b\0\106\5\1\0"+
    "\1\5\10\0\12\5\246\0\66\5\2\0\11\5\27\0\6\5\42\0"+
    "\101\5\3\0\1\5\13\0\12\5\46\0\70\5\10\0\12\5\66\0"+
    "\32\5\3\0\17\5\4\0\12\5\u0166\0\112\5\25\0\1\5\u01c0\0"+
    "\71\5\u0507\0\u039a\5\146\0\157\5\21\0\304\5\u0abc\0\u042f\5\u0fd1\0"+
    "\u0247\5\u21b9\0\u0239\5\7\0\37\5\1\0\12\5\146\0\36\5\2\0"+
    "\5\5\13\0\67\5\11\0\4\5\14\0\12\5\11\0\25\5\5\0"+
    "\23\5\u0370\0\105\5\13\0\57\5\20\0\21\5\u4060\0\2\5\u0bfe\0"+
    "\153\5\5\0\15\5\3\0\11\5\7\0\12\5\3\0\2\5\1\0"+
    "\4\5\u14c1\0\5\5\3\0\26\5\2\0\7\5\36\0\4\5\224\0"+
    "\3\5\u01bb\0\125\5\1\0\107\5\1\0\2\5\2\0\1\5\2\0"+
    "\2\5\2\0\4\5\1\0\14\5\1\0\1\5\1\0\7\5\1\0"+
    "\101\5\1\0\4\5\2\0\10\5\1\0\7\5\1\0\34\5\1\0"+
    "\4\5\1\0\5\5\1\0\1\5\3\0\7\5\1\0\u0154\5\2\0"+
    "\31\5\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0"+
    "\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0\31\5\1\0"+
    "\10\5\2\0\62\5\u0200\0\67\5\4\0\62\5\10\0\1\5\16\0"+
    "\1\5\26\0\5\5\1\0\17\5\u0d50\0\305\5\13\0\7\5\u0529\0"+
    "\4\5\1\0\33\5\1\0\2\5\1\0\1\5\2\0\1\5\1\0"+
    "\12\5\1\0\4\5\1\0\1\5\1\0\1\5\6\0\1\5\4\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\3\5\1\0\2\5\1\0"+
    "\1\5\2\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\2\5\1\0\1\5\2\0\4\5\1\0\7\5\1\0"+
    "\4\5\1\0\4\5\1\0\1\5\1\0\12\5\1\0\21\5\5\0"+
    "\3\5\1\0\5\5\1\0\21\5\u1144\0\ua6d7\5\51\0\u1035\5\13\0"+
    "\336\5\2\0\u1682\5\u295e\0\u021e\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\5\36\0\140\5\200\0\360\5\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\4\1\1\3\1\4\1\5\1\1"+
    "\1\6\4\0\1\7\12\0\1\10\1\0\1\11\1\0"+
    "\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[33];
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
    "\0\0\0\31\0\62\0\31\0\113\0\144\0\175\0\226"+
    "\0\31\0\31\0\31\0\257\0\113\0\310\0\341\0\372"+
    "\0\257\0\31\0\u0113\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190"+
    "\0\u01a9\0\u01c2\0\u01db\0\u01f4\0\31\0\u020d\0\31\0\u0226"+
    "\0\31";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[33];
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
    "\1\2\1\3\2\4\1\5\1\2\1\6\6\2\1\7"+
    "\3\2\1\10\2\2\1\11\1\12\1\13\1\14\1\2"+
    "\33\0\1\4\32\0\20\15\14\0\1\16\35\0\1\17"+
    "\25\0\1\20\17\0\30\21\1\22\10\0\1\23\36\0"+
    "\1\24\21\0\1\25\32\0\1\26\36\0\1\27\20\0"+
    "\1\30\33\0\1\31\30\0\1\32\40\0\1\33\21\0"+
    "\1\34\35\0\1\35\24\0\1\36\30\0\1\37\26\0"+
    "\1\40\41\0\1\41\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[575];
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
    "\1\0\1\11\1\1\1\11\4\1\3\11\2\1\4\0"+
    "\1\11\12\0\1\11\1\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[33];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
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
  Usuario usuario;
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoUsuarios(java.io.Reader in) {
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
    while (i < 2830) {
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
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
            { /*Ignoramos*/System.out.println("Error:"+yytext());
            } 
            // fall through
          case 11: break;
          case 2: 
            { /*IGNORAMOS*/
            } 
            // fall through
          case 12: break;
          case 3: 
            { return symbol(DIAGONAL,yytext());
            } 
            // fall through
          case 13: break;
          case 4: 
            { return symbol(MENOR_QUE,yytext());
            } 
            // fall through
          case 14: break;
          case 5: 
            { return symbol(MAYOR_QUE,yytext());
            } 
            // fall through
          case 15: break;
          case 6: 
            { return symbol(ID,yytext());
            } 
            // fall through
          case 16: break;
          case 7: 
            { return symbol(FORMATO_PASSWORD,yytext());
            } 
            // fall through
          case 17: break;
          case 8: 
            { return symbol(NOMBRE,yytext());
            } 
            // fall through
          case 18: break;
          case 9: 
            { return symbol(USUARIO,yytext());
            } 
            // fall through
          case 19: break;
          case 10: 
            { return symbol(PASSWORD,yytext());
            } 
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalizadorLexicoUsuarios [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalizadorLexicoUsuarios scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalizadorLexicoUsuarios(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}

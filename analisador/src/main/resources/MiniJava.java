/* The following code was generated by JFlex 1.6.1 */

package br.ufpe.cin.if688.jflex;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/main/resources/aasj2.jflex</tt>
 */
public class MiniJava {

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
			"\11\0\1\1\1\3\1\35\1\36\1\5\22\0\1\1\1\43\4\0"+
					"\1\41\1\0\1\37\1\37\1\4\1\42\1\37\1\42\1\37\1\2"+
					"\1\50\11\46\1\0\1\37\1\42\1\40\3\0\22\44\1\26\7\44"+
					"\1\37\1\0\1\37\1\0\1\44\1\0\1\12\1\6\1\14\1\23"+
					"\1\11\1\33\1\30\1\32\1\20\2\44\1\10\1\25\1\13\1\7"+
					"\1\16\1\44\1\27\1\15\1\22\1\17\1\24\1\31\1\21\1\34"+
					"\1\44\1\37\1\0\1\37\7\0\1\35\44\0\1\45\12\0\1\45"+
					"\4\0\1\45\5\0\27\45\1\0\37\45\1\0\u01ca\45\4\0\14\45"+
					"\16\0\5\45\7\0\1\45\1\0\1\45\21\0\165\45\1\0\2\45"+
					"\2\0\4\45\1\0\1\45\6\0\1\45\1\0\3\45\1\0\1\45"+
					"\1\0\24\45\1\0\123\45\1\0\213\45\1\0\255\45\1\0\46\45"+
					"\2\0\1\45\7\0\47\45\11\0\55\45\1\0\1\45\1\0\2\45"+
					"\1\0\2\45\1\0\1\45\10\0\33\45\5\0\3\45\35\0\13\45"+
					"\5\0\100\45\12\47\4\0\146\45\1\0\10\45\2\0\12\45\1\0"+
					"\6\45\12\47\3\45\2\0\1\45\20\0\73\45\2\0\145\45\16\0"+
					"\12\47\54\45\4\0\1\45\5\0\56\45\22\0\34\45\104\0\23\45"+
					"\61\0\200\45\2\0\12\47\1\0\23\45\1\0\10\45\2\0\2\45"+
					"\2\0\26\45\1\0\7\45\1\0\1\45\3\0\4\45\2\0\11\45"+
					"\2\0\2\45\2\0\4\45\10\0\1\45\4\0\2\45\1\0\5\45"+
					"\2\0\12\47\2\45\17\0\3\45\1\0\6\45\4\0\2\45\2\0"+
					"\26\45\1\0\7\45\1\0\2\45\1\0\2\45\1\0\2\45\2\0"+
					"\1\45\1\0\5\45\4\0\2\45\2\0\3\45\3\0\1\45\7\0"+
					"\4\45\1\0\1\45\7\0\12\47\6\45\13\0\3\45\1\0\11\45"+
					"\1\0\3\45\1\0\26\45\1\0\7\45\1\0\2\45\1\0\5\45"+
					"\2\0\12\45\1\0\3\45\1\0\3\45\2\0\1\45\17\0\4\45"+
					"\2\0\12\47\21\0\3\45\1\0\10\45\2\0\2\45\2\0\26\45"+
					"\1\0\7\45\1\0\2\45\1\0\5\45\2\0\11\45\2\0\2\45"+
					"\2\0\3\45\10\0\2\45\4\0\2\45\1\0\5\45\2\0\12\47"+
					"\1\0\1\45\20\0\2\45\1\0\6\45\3\0\3\45\1\0\4\45"+
					"\3\0\2\45\1\0\1\45\1\0\2\45\3\0\2\45\3\0\3\45"+
					"\3\0\14\45\4\0\5\45\3\0\3\45\1\0\4\45\2\0\1\45"+
					"\6\0\1\45\16\0\12\47\20\0\4\45\1\0\10\45\1\0\3\45"+
					"\1\0\27\45\1\0\20\45\3\0\10\45\1\0\3\45\1\0\4\45"+
					"\7\0\2\45\1\0\2\45\6\0\4\45\2\0\12\47\21\0\3\45"+
					"\1\0\10\45\1\0\3\45\1\0\27\45\1\0\12\45\1\0\5\45"+
					"\2\0\11\45\1\0\3\45\1\0\4\45\7\0\2\45\7\0\1\45"+
					"\1\0\4\45\2\0\12\47\1\0\2\45\16\0\3\45\1\0\10\45"+
					"\1\0\3\45\1\0\51\45\2\0\10\45\1\0\3\45\1\0\5\45"+
					"\10\0\1\45\10\0\4\45\2\0\12\47\12\0\6\45\2\0\2\45"+
					"\1\0\22\45\3\0\30\45\1\0\11\45\1\0\1\45\2\0\7\45"+
					"\3\0\1\45\4\0\6\45\1\0\1\45\1\0\10\45\6\0\12\47"+
					"\2\0\2\45\15\0\72\45\5\0\17\45\1\0\12\47\47\0\2\45"+
					"\1\0\1\45\2\0\2\45\1\0\1\45\2\0\1\45\6\0\4\45"+
					"\1\0\7\45\1\0\3\45\1\0\1\45\1\0\1\45\2\0\2\45"+
					"\1\0\15\45\1\0\3\45\2\0\5\45\1\0\1\45\1\0\6\45"+
					"\2\0\12\47\2\0\4\45\40\0\1\45\27\0\2\45\6\0\12\47"+
					"\13\0\1\45\1\0\1\45\1\0\1\45\4\0\12\45\1\0\44\45"+
					"\4\0\24\45\1\0\22\45\1\0\44\45\11\0\1\45\71\0\100\45"+
					"\12\47\6\0\100\45\12\47\4\45\2\0\46\45\1\0\1\45\5\0"+
					"\1\45\2\0\53\45\1\0\u014d\45\1\0\4\45\2\0\7\45\1\0"+
					"\1\45\1\0\4\45\2\0\51\45\1\0\4\45\2\0\41\45\1\0"+
					"\4\45\2\0\7\45\1\0\1\45\1\0\4\45\2\0\17\45\1\0"+
					"\71\45\1\0\4\45\2\0\103\45\2\0\3\45\40\0\20\45\20\0"+
					"\125\45\14\0\u026c\45\2\0\21\45\1\0\32\45\5\0\113\45\3\0"+
					"\13\45\7\0\15\45\1\0\7\45\13\0\25\45\13\0\24\45\14\0"+
					"\15\45\1\0\3\45\1\0\2\45\14\0\124\45\3\0\1\45\4\0"+
					"\2\45\2\0\12\47\41\0\3\45\2\0\12\47\6\0\130\45\10\0"+
					"\53\45\5\0\106\45\12\0\37\45\1\0\14\45\4\0\14\45\12\0"+
					"\12\47\36\45\2\0\5\45\13\0\54\45\4\0\32\45\6\0\12\47"+
					"\46\0\34\45\4\0\77\45\1\0\35\45\2\0\1\45\12\47\6\0"+
					"\12\47\15\0\1\45\10\0\17\45\101\0\114\45\4\0\12\47\21\0"+
					"\11\45\14\0\60\45\12\47\72\45\14\0\70\45\10\0\12\47\3\0"+
					"\3\45\12\47\44\45\122\0\3\45\1\0\43\45\1\0\2\45\6\0"+
					"\366\45\6\0\u011a\45\2\0\6\45\2\0\46\45\2\0\6\45\2\0"+
					"\10\45\1\0\1\45\1\0\1\45\1\0\1\45\1\0\37\45\2\0"+
					"\65\45\1\0\7\45\1\0\1\45\3\0\3\45\1\0\7\45\3\0"+
					"\4\45\2\0\6\45\4\0\15\45\5\0\3\45\1\0\7\45\53\0"+
					"\1\35\1\35\25\0\2\45\23\0\1\45\34\0\1\45\15\0\1\45"+
					"\20\0\15\45\63\0\41\45\21\0\1\45\4\0\1\45\2\0\12\45"+
					"\1\0\1\45\3\0\5\45\6\0\1\45\1\0\1\45\1\0\1\45"+
					"\1\0\4\45\1\0\13\45\2\0\4\45\5\0\5\45\4\0\1\45"+
					"\21\0\51\45\u032d\0\64\45\u0716\0\57\45\1\0\57\45\1\0\205\45"+
					"\6\0\11\45\14\0\46\45\1\0\1\45\5\0\1\45\2\0\70\45"+
					"\7\0\1\45\17\0\30\45\11\0\7\45\1\0\7\45\1\0\7\45"+
					"\1\0\7\45\1\0\7\45\1\0\7\45\1\0\7\45\1\0\7\45"+
					"\1\0\40\45\57\0\1\45\u01d5\0\3\45\31\0\17\45\1\0\5\45"+
					"\2\0\5\45\4\0\126\45\2\0\2\45\2\0\3\45\1\0\132\45"+
					"\1\0\4\45\5\0\51\45\3\0\136\45\21\0\33\45\65\0\20\45"+
					"\u0200\0\u19b6\45\112\0\u51cd\45\63\0\u048d\45\103\0\56\45\2\0\u010d\45"+
					"\3\0\20\45\12\47\2\45\24\0\63\45\1\0\12\45\1\0\37\45"+
					"\1\0\123\45\45\0\11\45\2\0\147\45\2\0\4\45\1\0\36\45"+
					"\2\0\2\45\105\0\61\45\30\0\64\45\14\0\105\45\13\0\12\47"+
					"\6\0\30\45\3\0\1\45\4\0\12\47\44\45\2\0\44\45\14\0"+
					"\35\45\3\0\101\45\16\0\1\45\12\47\6\0\20\45\12\47\5\45"+
					"\1\0\67\45\11\0\16\45\2\0\12\47\6\0\27\45\3\0\111\45"+
					"\30\0\3\45\2\0\20\45\2\0\5\45\12\0\6\45\2\0\6\45"+
					"\2\0\6\45\11\0\7\45\1\0\7\45\1\0\53\45\1\0\4\45"+
					"\4\0\2\45\132\0\53\45\1\0\2\45\2\0\12\47\6\0\u2ba4\45"+
					"\14\0\27\45\4\0\61\45\u2104\0\u016e\45\2\0\152\45\46\0\7\45"+
					"\14\0\5\45\5\0\14\45\1\0\15\45\1\0\5\45\1\0\1\45"+
					"\1\0\2\45\1\0\2\45\1\0\154\45\41\0\u016b\45\22\0\100\45"+
					"\2\0\66\45\50\0\14\45\4\0\20\45\20\0\16\45\5\0\2\45"+
					"\30\0\3\45\40\0\5\45\1\0\207\45\23\0\12\47\7\0\32\45"+
					"\4\0\1\45\1\0\32\45\13\0\131\45\3\0\6\45\2\0\6\45"+
					"\2\0\6\45\2\0\3\45\43\0\14\45\1\0\32\45\1\0\23\45"+
					"\1\0\2\45\1\0\17\45\2\0\16\45\42\0\173\45\105\0\65\45"+
					"\210\0\1\45\202\0\35\45\3\0\61\45\17\0\1\45\37\0\40\45"+
					"\20\0\33\45\5\0\53\45\5\0\36\45\2\0\44\45\4\0\10\45"+
					"\1\0\5\45\52\0\236\45\2\0\12\47\126\0\50\45\10\0\64\45"+
					"\234\0\u0137\45\11\0\26\45\12\0\10\45\230\0\6\45\2\0\1\45"+
					"\1\0\54\45\1\0\2\45\3\0\1\45\2\0\27\45\12\0\27\45"+
					"\11\0\37\45\141\0\26\45\12\0\32\45\106\0\70\45\6\0\2\45"+
					"\100\0\4\45\1\0\2\45\5\0\10\45\1\0\3\45\1\0\33\45"+
					"\4\0\3\45\4\0\1\45\40\0\35\45\3\0\35\45\43\0\10\45"+
					"\1\0\36\45\31\0\66\45\12\0\26\45\12\0\23\45\15\0\22\45"+
					"\156\0\111\45\u03b7\0\107\45\37\0\12\47\17\0\74\45\25\0\31\45"+
					"\7\0\12\47\6\0\65\45\1\0\12\47\20\0\44\45\2\0\1\45"+
					"\11\0\105\45\13\0\12\47\1\45\45\0\22\45\1\0\45\45\170\0"+
					"\73\45\5\0\12\47\7\0\3\45\1\0\10\45\2\0\2\45\2\0"+
					"\26\45\1\0\7\45\1\0\2\45\1\0\5\45\2\0\11\45\2\0"+
					"\2\45\2\0\3\45\11\0\1\45\5\0\7\45\2\0\7\45\3\0"+
					"\5\45\u010b\0\106\45\1\0\1\45\10\0\12\47\246\0\66\45\2\0"+
					"\11\45\77\0\101\45\3\0\1\45\13\0\12\47\46\0\70\45\10\0"+
					"\12\47\u01d6\0\100\45\12\47\25\0\1\45\u01c0\0\71\45\u0507\0\u0399\45"+
					"\147\0\157\45\u0b91\0\u042f\45\u33d1\0\u0239\45\7\0\37\45\1\0\12\47"+
					"\146\0\36\45\2\0\5\45\13\0\67\45\11\0\4\45\14\0\12\47"+
					"\11\0\25\45\5\0\23\45\u0370\0\105\45\13\0\57\45\20\0\21\45"+
					"\u4060\0\2\45\u0bfe\0\153\45\5\0\15\45\3\0\11\45\7\0\12\45"+
					"\3\0\2\45\u14c6\0\5\45\3\0\6\45\10\0\10\45\2\0\7\45"+
					"\36\0\4\45\224\0\3\45\u01bb\0\125\45\1\0\107\45\1\0\2\45"+
					"\2\0\1\45\2\0\2\45\2\0\4\45\1\0\14\45\1\0\1\45"+
					"\1\0\7\45\1\0\101\45\1\0\4\45\2\0\10\45\1\0\7\45"+
					"\1\0\34\45\1\0\4\45\1\0\5\45\1\0\1\45\3\0\7\45"+
					"\1\0\u0154\45\2\0\31\45\1\0\31\45\1\0\37\45\1\0\31\45"+
					"\1\0\37\45\1\0\31\45\1\0\37\45\1\0\31\45\1\0\37\45"+
					"\1\0\31\45\1\0\10\45\2\0\62\47\u1000\0\305\45\13\0\7\45"+
					"\u0529\0\4\45\1\0\33\45\1\0\2\45\1\0\1\45\2\0\1\45"+
					"\1\0\12\45\1\0\4\45\1\0\1\45\1\0\1\45\6\0\1\45"+
					"\4\0\1\45\1\0\1\45\1\0\1\45\1\0\3\45\1\0\2\45"+
					"\1\0\1\45\2\0\1\45\1\0\1\45\1\0\1\45\1\0\1\45"+
					"\1\0\1\45\1\0\2\45\1\0\1\45\2\0\4\45\1\0\7\45"+
					"\1\0\4\45\1\0\4\45\1\0\1\45\1\0\12\45\1\0\21\45"+
					"\5\0\3\45\1\0\5\45\1\0\21\45\u0274\0\32\45\6\0\32\45"+
					"\6\0\32\45\u0e76\0\ua6d7\45\51\0\u1035\45\13\0\336\45\u3fe2\0\u021e\45"+
					"\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
					"\360\45\uffff\0\uffff\0\ufe12\0";

	/** 
	 * Translates characters to character classes
	 */
	private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/** 
	 * Translates DFA states to action switch labels.
	 */
	private static final int [] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 =
			"\1\0\1\1\1\2\1\1\1\3\20\4\1\5\2\6"+
					"\1\1\1\3\2\7\2\0\11\4\1\10\11\4\1\2"+
					"\1\0\16\4\1\0\16\4\1\0\1\4\1\0\1\4"+
					"\1\0\1\4\1\0\1\4\1\0\1\4\1\0\1\4"+
					"\1\0\1\4\1\0\1\4\1\0\1\4\1\0\1\4"+
					"\1\0\1\10";

	private static int [] zzUnpackAction() {
		int [] result = new int[102];
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
			"\0\0\0\51\0\51\0\122\0\51\0\173\0\244\0\315"+
					"\0\366\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
					"\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\51\0\51\0\u030b"+
					"\0\u0334\0\u030b\0\u035d\0\51\0\u0386\0\u03af\0\u03d8\0\u0401"+
					"\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\244"+
					"\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f\0\u0668"+
					"\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787\0\u07b0"+
					"\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf\0\u08f8"+
					"\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40"+
					"\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88"+
					"\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0"+
					"\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74\0\u0d9d\0\u0dc6\0\u0def\0\u0e18"+
					"\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc\0\u0ee5\0\51";

	private static int [] zzUnpackRowMap() {
		int [] result = new int[102];
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
			"\1\2\1\3\1\4\1\3\1\5\1\3\1\6\1\7"+
					"\1\10\1\11\1\7\1\12\1\13\1\14\1\15\1\7"+
					"\1\16\1\7\1\17\1\7\1\20\1\21\1\22\1\23"+
					"\1\7\1\24\1\7\1\25\1\7\1\26\1\3\1\27"+
					"\1\30\1\31\1\5\1\32\1\7\1\2\1\33\1\2"+
					"\1\34\53\0\1\35\1\0\1\36\52\0\1\7\1\37"+
					"\25\7\7\0\5\7\6\0\27\7\7\0\5\7\6\0"+
					"\3\7\1\40\23\7\7\0\5\7\6\0\2\7\1\41"+
					"\10\7\1\42\13\7\7\0\5\7\6\0\3\7\1\43"+
					"\23\7\7\0\5\7\6\0\2\7\1\44\24\7\7\0"+
					"\5\7\6\0\14\7\1\45\12\7\7\0\5\7\6\0"+
					"\11\7\1\46\15\7\7\0\5\7\6\0\5\7\1\47"+
					"\17\7\1\50\1\7\7\0\5\7\6\0\21\7\1\51"+
					"\2\7\1\52\2\7\7\0\5\7\6\0\1\7\1\53"+
					"\25\7\7\0\5\7\6\0\4\7\1\54\22\7\7\0"+
					"\5\7\6\0\14\7\1\55\11\7\1\56\7\0\5\7"+
					"\6\0\3\7\1\57\23\7\7\0\5\7\6\0\24\7"+
					"\1\60\2\7\7\0\5\7\6\0\4\7\1\61\22\7"+
					"\7\0\5\7\40\0\1\5\51\0\1\5\55\0\3\33"+
					"\3\35\1\3\1\35\1\62\43\35\4\36\1\63\44\36"+
					"\6\0\1\7\1\64\25\7\7\0\5\7\6\0\5\7"+
					"\1\65\21\7\7\0\5\7\6\0\7\7\1\66\17\7"+
					"\7\0\5\7\6\0\14\7\1\67\12\7\7\0\5\7"+
					"\6\0\23\7\1\50\3\7\7\0\5\7\6\0\4\7"+
					"\1\70\22\7\7\0\5\7\6\0\4\7\1\71\22\7"+
					"\7\0\5\7\6\0\1\72\26\7\7\0\5\7\6\0"+
					"\14\7\1\50\12\7\7\0\5\7\6\0\11\7\1\66"+
					"\15\7\7\0\5\7\6\0\12\7\1\73\14\7\7\0"+
					"\5\7\6\0\12\7\1\74\14\7\7\0\5\7\6\0"+
					"\12\7\1\75\14\7\7\0\5\7\6\0\21\7\1\76"+
					"\5\7\7\0\5\7\6\0\7\7\1\77\17\7\7\0"+
					"\5\7\6\0\14\7\1\100\12\7\7\0\5\7\6\0"+
					"\12\7\1\101\14\7\7\0\5\7\6\0\2\7\1\41"+
					"\24\7\7\0\5\7\3\0\1\3\45\0\2\36\1\102"+
					"\1\36\1\63\44\36\6\0\2\7\1\103\24\7\7\0"+
					"\5\7\6\0\22\7\1\104\4\7\7\0\5\7\6\0"+
					"\3\7\1\50\23\7\7\0\5\7\6\0\3\7\1\105"+
					"\23\7\7\0\5\7\6\0\7\7\1\73\17\7\7\0"+
					"\5\7\6\0\14\7\1\106\12\7\7\0\5\7\6\0"+
					"\2\7\1\106\24\7\7\0\5\7\6\0\7\7\1\50"+
					"\17\7\7\0\5\7\6\0\15\7\1\50\11\7\7\0"+
					"\5\7\6\0\5\7\1\50\21\7\7\0\5\7\6\0"+
					"\12\7\1\107\14\7\7\0\5\7\6\0\14\7\1\110"+
					"\12\7\7\0\5\7\6\0\11\7\1\111\15\7\7\0"+
					"\5\7\6\0\2\7\1\66\24\7\7\0\5\7\3\0"+
					"\1\3\1\0\1\62\51\0\3\7\1\112\23\7\7\0"+
					"\5\7\6\0\14\7\1\113\12\7\7\0\5\7\6\0"+
					"\5\7\1\114\21\7\7\0\5\7\6\0\12\7\1\115"+
					"\14\7\7\0\5\7\6\0\5\7\1\116\21\7\7\0"+
					"\5\7\6\0\3\7\1\117\23\7\7\0\5\7\6\0"+
					"\21\7\1\75\5\7\7\0\5\7\6\0\4\7\1\75"+
					"\22\7\7\0\5\7\6\0\24\7\1\50\2\7\7\0"+
					"\5\7\6\0\15\7\1\73\11\7\7\0\5\7\6\0"+
					"\6\7\1\50\20\7\7\0\5\7\6\0\22\7\1\50"+
					"\4\7\7\0\5\7\6\0\17\7\1\120\7\7\7\0"+
					"\5\7\3\121\1\0\1\121\1\0\27\122\2\0\5\121"+
					"\5\122\7\0\1\123\47\0\1\7\1\124\25\7\7\0"+
					"\5\7\17\0\1\125\37\0\11\7\1\126\15\7\7\0"+
					"\5\7\22\0\1\127\34\0\14\7\1\130\12\7\7\0"+
					"\5\7\3\131\1\0\1\131\1\0\27\131\2\0\15\131"+
					"\1\0\1\131\1\0\27\132\2\0\5\131\5\132\16\0"+
					"\1\133\40\0\10\7\1\134\16\7\7\0\5\7\27\0"+
					"\1\135\27\0\21\7\1\136\5\7\7\0\5\7\20\0"+
					"\1\137\36\0\12\7\1\140\14\7\7\0\5\7\13\0"+
					"\1\141\43\0\5\7\1\142\21\7\7\0\5\7\22\0"+
					"\1\143\34\0\14\7\1\144\12\7\7\0\5\7\10\0"+
					"\1\145\46\0\2\7\1\75\24\7\7\0\5\7\13\0"+
					"\1\146\35\0";

	private static int [] zzUnpackTrans() {
		int [] result = new int[3854];
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
			"\1\0\2\11\1\1\1\11\20\1\2\11\4\1\1\11"+
					"\2\0\24\1\1\0\16\1\1\0\16\1\1\0\1\1"+
					"\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
					"\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
					"\1\0\1\1\1\0\1\11";

	private static int [] zzUnpackAttribute() {
		int [] result = new int[102];
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


	/**
	 * Creates a new scanner
	 *
	 * @param   in  the java.io.Reader to read input from.
	 */
	public MiniJava(java.io.Reader in) {
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
		while (i < 2712) {
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
	public int yylex() throws java.io.IOException {
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
				return YYEOF;
			}
			else {
				switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
				case 1: 
				{ throw new RuntimeException("Caractere ilegal! '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 9: break;
				case 2: 
				{ /**/
				}
				case 10: break;
				case 3: 
				{ System.out.println("token gerado foi um operador: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 11: break;
				case 4: 
				{ System.out.println("token gerado foi um id: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 12: break;
				case 5: 
				{ System.out.print(yytext());
				}
				case 13: break;
				case 6: 
				{ System.out.println("token gerado foi um delimitador: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 14: break;
				case 7: 
				{ System.out.println("token gerado foi um integer: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 15: break;
				case 8: 
				{ System.out.println("token gerado foi um reservado: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
				}
				case 16: break;
				default:
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

	/**
	 * Runs the scanner on input files.
	 *
	 * This is a standalone scanner, it will print any unmatched
	 * text to System.out unchanged.
	 *
	 * @param argv   the command line, contains the filenames to run
	 *               the scanner on.
	 */
	public static void main(String argv[]) {
		if (argv.length == 0) {
			System.out.println("Usage : java MiniJava [ --encoding <name> ] <inputfile(s)>");
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
				MiniJava scanner = null;
				try {
					java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
					java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
					scanner = new MiniJava(reader);
					while ( !scanner.zzAtEOF ) scanner.yylex();
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

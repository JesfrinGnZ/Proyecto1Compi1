
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package backend.analizadorParaTextoDeCliente;

import java_cup.runtime.*;
import backend.elementos.*;
import backend.excepciones.*;
import frontend.gui.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\004\000\002\003" +
    "\011\000\002\003\012\000\002\004\004\000\002\004\003" +
    "\000\002\006\013\000\002\005\013\000\002\005\013\000" +
    "\002\005\006\000\002\005\006\000\002\005\006\000\002" +
    "\005\006\000\002\005\006\000\002\005\006\000\002\007" +
    "\006\000\002\010\004\000\002\010\003\000\002\011\013" +
    "\000\002\011\003\000\002\012\011\000\002\012\011\000" +
    "\002\012\011\000\002\012\011\000\002\012\011\000\002" +
    "\013\013\000\002\013\003\000\002\014\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\004\017\004\001\002\000\006\004\007\005" +
    "\011\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\004\012\177\001\002\000\004\002\000\001" +
    "\002\000\004\020\012\001\002\000\004\017\015\001\002" +
    "\000\004\017\173\001\002\000\004\017\ufffc\001\002\000" +
    "\004\004\016\001\002\000\004\012\017\001\002\000\004" +
    "\023\020\001\002\000\004\024\022\001\002\000\004\017" +
    "\166\001\002\000\022\026\030\034\027\035\026\041\032" +
    "\042\023\043\031\046\024\047\025\001\002\000\004\024" +
    "\164\001\002\000\004\024\162\001\002\000\004\024\160" +
    "\001\002\000\004\024\156\001\002\000\004\024\125\001" +
    "\002\000\004\024\037\001\002\000\004\024\035\001\002" +
    "\000\004\024\033\001\002\000\004\020\034\001\002\000" +
    "\004\017\ufff7\001\002\000\004\020\036\001\002\000\004" +
    "\017\ufff5\001\002\000\004\020\040\001\002\000\004\017" +
    "\041\001\002\000\004\006\042\001\002\000\004\020\043" +
    "\001\002\000\006\003\045\017\044\001\002\000\004\007" +
    "\054\001\002\000\006\003\uffee\017\uffee\001\002\000\006" +
    "\003\ufff0\017\ufff0\001\002\000\006\003\045\017\051\001" +
    "\002\000\004\017\ufffa\001\002\000\006\007\054\016\053" +
    "\001\002\000\006\003\ufff1\017\ufff1\001\002\000\004\006" +
    "\123\001\002\000\004\012\055\001\002\000\004\023\056" +
    "\001\002\000\004\024\060\001\002\000\004\017\117\001" +
    "\002\000\014\027\062\030\065\031\064\032\063\033\061" +
    "\001\002\000\004\024\112\001\002\000\004\024\105\001" +
    "\002\000\004\024\100\001\002\000\004\024\073\001\002" +
    "\000\004\024\066\001\002\000\004\020\067\001\002\000" +
    "\004\021\070\001\002\000\004\071\071\001\002\000\004" +
    "\022\072\001\002\000\004\017\uffec\001\002\000\004\020" +
    "\074\001\002\000\004\021\075\001\002\000\004\070\076" +
    "\001\002\000\004\022\077\001\002\000\004\017\uffea\001" +
    "\002\000\004\020\101\001\002\000\004\021\102\001\002" +
    "\000\004\070\103\001\002\000\004\022\104\001\002\000" +
    "\004\017\uffe9\001\002\000\004\020\106\001\002\000\004" +
    "\021\107\001\002\000\004\071\110\001\002\000\004\022" +
    "\111\001\002\000\004\017\uffed\001\002\000\004\020\113" +
    "\001\002\000\004\021\114\001\002\000\004\071\115\001" +
    "\002\000\004\022\116\001\002\000\004\017\uffeb\001\002" +
    "\000\004\016\120\001\002\000\004\007\121\001\002\000" +
    "\004\020\122\001\002\000\006\003\uffef\017\uffef\001\002" +
    "\000\004\020\124\001\002\000\004\017\ufff2\001\002\000" +
    "\004\020\126\001\002\000\004\017\127\001\002\000\004" +
    "\006\130\001\002\000\004\020\131\001\002\000\006\003" +
    "\134\017\133\001\002\000\004\017\155\001\002\000\004" +
    "\007\135\001\002\000\004\017\uffe7\001\002\000\004\012" +
    "\136\001\002\000\004\023\137\001\002\000\004\024\141" +
    "\001\002\000\004\017\150\001\002\000\004\027\142\001" +
    "\002\000\004\024\143\001\002\000\004\020\144\001\002" +
    "\000\004\021\145\001\002\000\004\071\146\001\002\000" +
    "\004\022\147\001\002\000\004\017\uffe6\001\002\000\004" +
    "\016\151\001\002\000\004\007\152\001\002\000\004\020" +
    "\153\001\002\000\004\017\uffe8\001\002\000\004\017\ufff9" +
    "\001\002\000\004\016\053\001\002\000\004\020\157\001" +
    "\002\000\004\017\ufff8\001\002\000\004\020\161\001\002" +
    "\000\004\017\ufff3\001\002\000\004\020\163\001\002\000" +
    "\004\017\ufff4\001\002\000\004\020\165\001\002\000\004" +
    "\017\ufff6\001\002\000\004\016\167\001\002\000\004\004" +
    "\170\001\002\000\004\020\171\001\002\000\004\017\ufffb" +
    "\001\002\000\004\017\ufffd\001\002\000\006\004\016\016" +
    "\174\001\002\000\004\005\175\001\002\000\004\020\176" +
    "\001\002\000\004\002\uffff\001\002\000\004\023\200\001" +
    "\002\000\004\024\022\001\002\000\004\017\202\001\002" +
    "\000\004\016\203\001\002\000\004\004\204\001\002\000" +
    "\004\020\205\001\002\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\004\002\004\001\001\000\004\003\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\012\006" +
    "\013\001\001\000\004\006\171\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\020\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\010\046\011\045\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\047\011\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\056\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\131\001\001\000\004\007" +
    "\153\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\014\137\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\200\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}





    int fila,columna;
    String lexema;
    //  VARIABLES
    private String valor;
    private SitioWeb sitioWeb;
    private Usuario usuario;
    private ClienteFrame clienteFrame;

    // Connect this parser to a scanner!
    public parser(AnalizadorLexicoTextoCliente lex,Usuario usuario,ClienteFrame clienteFrame) {
	super(lex);
        this.usuario=usuario;
        this.clienteFrame=clienteFrame;
    }

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        try {
        this.lexema =s.value.toString();
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna); 
        } catch (Exception e) {
            System.out.println("Error Recuperable se esperaba mas simbolos en ultima fila");
        } 
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
    try {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);  
        } catch (Exception e) {
            System.out.println("Error norecuperable se esperaba mas simbolos en ultima fila");
        }
        
    }

    private void iniciarSitioWeb(Object i,String tipo){
        if(sitioWeb==null){
            System.out.println("el sitio ES NULO se iniciara uno nuevo");
            sitioWeb=new SitioWeb();
        }else{
            System.out.println("el sitio NO ES NULO se seguira almacenando");
        }   

        if(i!=null){
            String valor=i.toString();
        System.out.println("VALOR:"+valor+"TIPO:"+tipo);
        if(sitioWeb.darValores(valor,tipo)){
            System.out.println("Se asigno");
        }else{
            System.out.println("No asigno");
        }
        }else{
            System.out.println("I es nulo");
        }   
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= MENOR_QUE primeraEtiquetaXml 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // primeraEtiquetaXml ::= ACCIONES MAYOR_QUE m MENOR_QUE DIAGONAL ACCIONES MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primeraEtiquetaXml",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // primeraEtiquetaXml ::= ACCION NOMBRE IGUAL m1 MENOR_QUE DIAGONAL ACCION MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primeraEtiquetaXml",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // m ::= m m2 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("m",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // m ::= m2 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("m",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // m2 ::= MENOR_QUE ACCION NOMBRE IGUAL m1 MENOR_QUE DIAGONAL ACCION MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("m2",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // m1 ::= COMILLA NUEVO_SITIO_WEB COMILLA MAYOR_QUE MENOR_QUE PARAMETROS MAYOR_QUE s m3 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		if(sitioWeb!=null){sitioWeb.escribirDatos();try{sitioWeb.verificarDatosObligatorios();}catch(FaltaDeAtributoObligatorioException e){System.out.println("******FALTO EL ATRIBUTO OBLIGATORIO ID*****");};}sitioWeb=null;System.out.println("----->NUEVO SITIO WEB VALOR::::::"+i);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // m1 ::= COMILLA BORRAR_SITIO_WEB COMILLA MAYOR_QUE MENOR_QUE PARAMETROS MAYOR_QUE s3 m3 
            {
              Object RESULT =null;
		System.out.println("------------------------>BORRAR SITIO WEB");if(sitioWeb!=null){sitioWeb.escribirDatos();try{sitioWeb.verificarDatosObligatorios();}catch(FaltaDeAtributoObligatorioException e){System.out.println("******FALTO EL ATRIBUTO OBLIGATORIO ID*****");}}sitioWeb=null;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // m1 ::= COMILLA NUEVA_PAGINA COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>NUEVA PAGINA");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // m1 ::= COMILLA BORRAR_PAGINA COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>BORRAR PAGINA");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // m1 ::= COMILLA MODIFICAR_PAGINA COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>MODIFICAR PAGINA");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // m1 ::= COMILLA AGREGAR_COMPONENTE COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>AGREGAR COMPONENTE");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // m1 ::= COMILLA BORRAR_COMPONENTE COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>BORRAR COMPONENTE");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // m1 ::= COMILLA MODIFICAR_COMPONENTE COMILLA MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("------------------------>MODIFICAR COMPONENTE");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // m3 ::= MENOR_QUE DIAGONAL PARAMETROS MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("m3",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // s ::= s s1 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		iniciarSitioWeb(i,valor);System.out.println("----------->   ValoresPS"+i);RESULT =i;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // s ::= s1 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		iniciarSitioWeb(i,valor);System.out.println("----------->   ValoresPS"+i);RESULT =i;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // s1 ::= MENOR_QUE PARAMETRO NOMBRE IGUAL s2 MENOR_QUE DIAGONAL PARAMETRO MAYOR_QUE 
            {
              Object RESULT =null;
		int i1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object i1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		System.out.println("----------->   Valores"+i1);RESULT =i1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s1",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // s1 ::= error 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("ERRRROROROROROR"+i);fila=ileft;columna=iright;System.out.println("FILA:"+fila+" "+"COLUMNA:"+columna);clienteFrame.mostrarError("sintactico",fila,columna,lexema);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s1",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // s2 ::= COMILLA ID COMILLA MAYOR_QUE CORCHETE_ABIERTO IDENTIFICADOR CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT =i;valor="id";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // s2 ::= COMILLA USUARIO_CREACION COMILLA MAYOR_QUE CORCHETE_ABIERTO IDENTIFICADOR CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT =i;valor="usuarioCreacion";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // s2 ::= COMILLA USUARIO_MODIFICACION COMILLA MAYOR_QUE CORCHETE_ABIERTO IDENTIFICADOR CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT =i;valor="usuarioModificacion";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // s2 ::= COMILLA FECHA_CREACION COMILLA MAYOR_QUE CORCHETE_ABIERTO FORMATO_FECHA CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT =i;valor="fechaCreacion";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // s2 ::= COMILLA FECHA_MODIFICACION COMILLA MAYOR_QUE CORCHETE_ABIERTO FORMATO_FECHA CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT =i;valor="fechaModificacion";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // s3 ::= MENOR_QUE PARAMETRO NOMBRE IGUAL s4 MENOR_QUE DIAGONAL PARAMETRO MAYOR_QUE 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		iniciarSitioWeb(i,valor);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s3",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // s3 ::= error 
            {
              Object RESULT =null;
		System.out.println("ERRRROROROROROR");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s3",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // s4 ::= COMILLA ID COMILLA MAYOR_QUE CORCHETE_ABIERTO IDENTIFICADOR CORCHETE_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println("IDENTIFICADOR:"+i);RESULT=i;valor="id";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s4",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}

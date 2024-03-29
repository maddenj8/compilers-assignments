/* Generated By:JavaCC: Do not edit this line. SLPParser.java */
public class SLPParser implements SLPParserConstants {
    public static void main(String args[]) {
        SLPParser parser;
        if (args.length == 0) {
            System.out.println("SLP Parser: Reading from standard input . . .");
            parser = new SLPParser(System.in);
        } else if (args.length == 1) {
            System.out.println("SLP Parser: Reading from file " + args[0] + " . . .");
            try {
                parser = new SLPParser(new java.io.FileInputStream(args[0]));
            } catch (java.io.FileNotFoundException e) {
                System.out.println("SLP Parser: File " + args[0] + " not found.");
                return;
            }
        } else {
            System.out.println("SLP Parser: Usage is one of:");
            System.out.println(" java SLPParser < inputfile");
            System.out.println("OR");
            System.out.println(" java SLPParser inputfile");
            return;
        }
        try {
            parser.Prog(); // start point of the program
            System.out.println("SLP Parser: SLP program parsed successfully.");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("SLP Parser: Encountered errors during parse.");
        }
    }

/***********************************
***** SECTION 4 - THE GRAMMAR *****
***********************************/
  static final public void Prog() throws ParseException {
    code();
    jj_consume_token(0);
  }

  static final public void code() throws ParseException {
    block();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAIN:
    case VARIABLE:
    case CONSTANT:
    case TYPE:
      code();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
  }

  static final public void block() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VARIABLE:
    case CONSTANT:
      decl_list();
      break;
    case TYPE:
      func_list();
      break;
    case MAIN:
      main_statement();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void decl_list() throws ParseException {
    decl();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SEMIC:
      jj_consume_token(SEMIC);
      decl_list();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
  }

  static final public void decl() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VARIABLE:
      var_decl();
      break;
    case CONSTANT:
      const_decl();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void var_decl() throws ParseException {
    jj_consume_token(VARIABLE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      jj_consume_token(COLON);
      jj_consume_token(TYPE);
      jj_consume_token(SEMIC);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
  }

  static final public void const_decl() throws ParseException {
    jj_consume_token(CONSTANT);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      jj_consume_token(COLON);
      jj_consume_token(TYPE);
      jj_consume_token(ASSIGN);
      expr();
      jj_consume_token(SEMIC);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
  }

  static final public void func_list() throws ParseException {
    func();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TYPE:
      func_list();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
  }

  static final public void func() throws ParseException {
    jj_consume_token(TYPE);
    jj_consume_token(ID);
    jj_consume_token(LBR);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_1;
      }
      param_list();
    }
    jj_consume_token(RBR);
    jj_consume_token(IS);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VARIABLE:
      case CONSTANT:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_2;
      }
      decl_list();
    }
    statement_block();
  }

  static final public void statement_block() throws ParseException {
    statement();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BEGIN:
    case IF:
    case ELSE:
    case WHILE:
    case SKIP_WORD:
    case ID:
      statement_block();
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
  }

  static final public void statement() throws ParseException {
    if (jj_2_1(2)) {
      jj_consume_token(ID);
      jj_consume_token(ASSIGN);
      expr();
      jj_consume_token(SEMIC);
    } else if (jj_2_2(2)) {
      jj_consume_token(ID);
      jj_consume_token(LBR);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LBR:
        case MINUS_SIGN:
        case BOOL:
        case NUM:
        case ID:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_3;
        }
        expr();
      }
      jj_consume_token(RBR);
      jj_consume_token(SEMIC);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BEGIN:
        jj_consume_token(BEGIN);
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case BEGIN:
          case IF:
          case ELSE:
          case WHILE:
          case SKIP_WORD:
          case ID:
            ;
            break;
          default:
            jj_la1[11] = jj_gen;
            break label_4;
          }
          statement_block();
        }
        return_statement();
        jj_consume_token(END);
        break;
      case IF:
        jj_consume_token(IF);
        condition();
        jj_consume_token(BEGIN);
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case BEGIN:
          case IF:
          case ELSE:
          case WHILE:
          case SKIP_WORD:
          case ID:
            ;
            break;
          default:
            jj_la1[12] = jj_gen;
            break label_5;
          }
          statement_block();
        }
        jj_consume_token(END);
        break;
      case ELSE:
        jj_consume_token(ELSE);
        jj_consume_token(BEGIN);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case BEGIN:
          case IF:
          case ELSE:
          case WHILE:
          case SKIP_WORD:
          case ID:
            ;
            break;
          default:
            jj_la1[13] = jj_gen;
            break label_6;
          }
          statement_block();
        }
        jj_consume_token(END);
        break;
      case WHILE:
        jj_consume_token(WHILE);
        condition();
        jj_consume_token(BEGIN);
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case BEGIN:
          case IF:
          case ELSE:
          case WHILE:
          case SKIP_WORD:
          case ID:
            ;
            break;
          default:
            jj_la1[14] = jj_gen;
            break label_7;
          }
          statement_block();
        }
        jj_consume_token(END);
        break;
      case SKIP_WORD:
        jj_consume_token(SKIP_WORD);
        jj_consume_token(SEMIC);
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void condition() throws ParseException {
    simple_condition();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LOG_DIS:
      case LOG_AND:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_8;
      }
      log_ops();
      simple_condition();
    }
  }

  static final public void simple_condition() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LOG_NEG:
      jj_consume_token(LOG_NEG);
      condition();
      break;
    case LBR:
      jj_consume_token(LBR);
      condition();
      jj_consume_token(RBR);
      break;
    case MINUS_SIGN:
    case BOOL:
    case NUM:
    case ID:
      expr();
      comp_ops();
      expr();
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void comp_ops() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQUALS:
      jj_consume_token(EQUALS);
      break;
    case NOT_EQUALS:
      jj_consume_token(NOT_EQUALS);
      break;
    case LESS_THAN:
      jj_consume_token(LESS_THAN);
      break;
    case LESS_EQUALS:
      jj_consume_token(LESS_EQUALS);
      break;
    case GREATER_THAN:
      jj_consume_token(GREATER_THAN);
      break;
    case GREATER_EQUALS:
      jj_consume_token(GREATER_EQUALS);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void log_ops() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LOG_DIS:
      jj_consume_token(LOG_DIS);
      break;
    case LOG_AND:
      jj_consume_token(LOG_AND);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void expr() throws ParseException {
    if (jj_2_3(3)) {
      fragment();
      bin_op();
      fragment();
    } else if (jj_2_4(2)) {
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          ;
          break;
        default:
          jj_la1[20] = jj_gen;
          break label_9;
        }
        jj_consume_token(ID);
      }
      jj_consume_token(LBR);
      expr();
      jj_consume_token(RBR);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        arg_list();
        break;
      case MINUS_SIGN:
      case BOOL:
      case NUM:
        fragment();
        break;
      default:
        jj_la1[21] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void arg_list() throws ParseException {
    nemp_arg_list();
  }

  static final public void nemp_arg_list() throws ParseException {
    jj_consume_token(ID);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[22] = jj_gen;
        break label_10;
      }
      jj_consume_token(COMMA);
      nemp_arg_list();
    }
  }

  static final public void fragment() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case MINUS_SIGN:
      jj_consume_token(MINUS_SIGN);
      jj_consume_token(ID);
      break;
    case NUM:
      jj_consume_token(NUM);
      break;
    case BOOL:
      jj_consume_token(BOOL);
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void bin_op() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PLUS_SIGN:
      jj_consume_token(PLUS_SIGN);
      break;
    case MINUS_SIGN:
      jj_consume_token(MINUS_SIGN);
      break;
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void param_list() throws ParseException {
    nemp_param_list();
  }

  static final public void nemp_param_list() throws ParseException {
    param();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      jj_consume_token(COMMA);
      nemp_param_list();
      break;
    default:
      jj_la1[25] = jj_gen;
      ;
    }
  }

  static final public void param() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(COLON);
    jj_consume_token(TYPE);
  }

  static final public void return_statement() throws ParseException {
    jj_consume_token(RETURN);
    jj_consume_token(LBR);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LBR:
      case MINUS_SIGN:
      case BOOL:
      case NUM:
      case ID:
        ;
        break;
      default:
        jj_la1[26] = jj_gen;
        break label_11;
      }
      expr();
    }
    jj_consume_token(RBR);
    jj_consume_token(SEMIC);
  }

  static final public void main_statement() throws ParseException {
    jj_consume_token(MAIN);
    jj_consume_token(BEGIN);
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VARIABLE:
      case CONSTANT:
        ;
        break;
      default:
        jj_la1[27] = jj_gen;
        break label_12;
      }
      decl_list();
    }
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BEGIN:
      case IF:
      case ELSE:
      case WHILE:
      case SKIP_WORD:
      case ID:
        ;
        break;
      default:
        jj_la1[28] = jj_gen;
        break label_13;
      }
      statement_block();
    }
    jj_consume_token(END);
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_3_3() {
    if (jj_3R_14()) return true;
    if (jj_3R_15()) return true;
    if (jj_3R_14()) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_scan_token(MINUS_SIGN)) return true;
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(45)) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(29)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(LBR)) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_3R_21()) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_3R_14()) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(18)) {
    jj_scanpos = xsp;
    if (jj_scan_token(19)) return true;
    }
    return false;
  }

  static private boolean jj_3_4() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_scan_token(45)) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(LBR)) return true;
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SLPParserTokenManager token_source;
  static JavaCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[29];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xe400000,0xe400000,0x800,0x6000000,0x0,0x0,0x8000000,0x0,0x6000000,0xc0800000,0x20088000,0xc0800000,0xc0800000,0xc0800000,0xc0800000,0xc0800000,0x0,0x20088000,0x0,0x0,0x0,0x20080000,0x20000,0x20080000,0xc0000,0x20000,0x20088000,0x6000000,0xc0800000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x2000,0x2000,0x0,0x2000,0x0,0x2003,0x2800,0x2003,0x2003,0x2003,0x2003,0x3,0x18,0x2804,0x7e0,0x18,0x2000,0x2800,0x0,0x2800,0x0,0x0,0x2800,0x0,0x2003,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[4];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public SLPParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SLPParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SLPParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public SLPParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new SLPParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public SLPParser(SLPParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SLPParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        exists = true;
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[48];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 29; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 48; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}

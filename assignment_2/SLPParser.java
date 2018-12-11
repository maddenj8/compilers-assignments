/* Generated By:JJTree&JavaCC: Do not edit this line. SLPParser.java */
import java.util.*;
import java.io.*;

public class SLPParser/*@bgen(jjtree)*/implements SLPParserTreeConstants, SLPParserConstants {/*@bgen(jjtree)*/
  protected static JJTSLPParserState jjtree = new JJTSLPParserState();public static SymbolTable ST = new SymbolTable();
    public static void main(String args[]) throws ParseException, FileNotFoundException {
        if (args.length < 1) {
            System.out.println("Please supply a source file to compile");
            return;
        }
        SLPParser parser = new SLPParser(new FileInputStream(args[0]));
        SimpleNode root = parser.Prog();
        root.dump("");
        TypeCheckVisitor tc = new TypeCheckVisitor();
        root.jjtAccept(tc, ST);
        // System.out.println(ST.check("x"));
        // System.out.println(ST.get("y")); 
    }

/***********************************
***** SECTION 4 - THE GRAMMAR *****
***********************************/
  static final public SimpleNode Prog() throws ParseException {
                              /*@bgen(jjtree) PROGRAM */
  ASTPROGRAM jjtn000 = new ASTPROGRAM(JJTPROGRAM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      code();
      jj_consume_token(0);
                   jjtree.closeNodeScope(jjtn000, true);
                   jjtc000 = false;
                  {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void code() throws ParseException {
                     /*@bgen(jjtree) code */
  ASTcode jjtn000 = new ASTcode(JJTCODE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
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
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
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
    jj_consume_token(SEMIC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VARIABLE:
    case CONSTANT:
                       ASTdecl_list jjtn001 = new ASTdecl_list(JJTDECL_LIST);
                       boolean jjtc001 = true;
                       jjtree.openNodeScope(jjtn001);
      try {
        decl_list();
      } catch (Throwable jjte001) {
                       if (jjtc001) {
                         jjtree.clearNodeScope(jjtn001);
                         jjtc001 = false;
                       } else {
                         jjtree.popNode();
                       }
                       if (jjte001 instanceof RuntimeException) {
                         {if (true) throw (RuntimeException)jjte001;}
                       }
                       if (jjte001 instanceof ParseException) {
                         {if (true) throw (ParseException)jjte001;}
                       }
                       {if (true) throw (Error)jjte001;}
      } finally {
                       if (jjtc001) {
                         jjtree.closeNodeScope(jjtn001,  2);
                       }
      }
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
  }

  static final public void decl() throws ParseException {
               /*@bgen(jjtree) decl */
  ASTdecl jjtn000 = new ASTdecl(JJTDECL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
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
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

/** DECLARATION **/
  static final public void var_decl() throws ParseException {
                          Token t; String name;
    jj_consume_token(VARIABLE);
    name = id();
    jj_consume_token(COLON);
    t = jj_consume_token(TYPE);
          ASTVAR jjtn001 = new ASTVAR(JJTVAR);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
          jjtree.closeNodeScope(jjtn001,  1);
          jjtc001 = false;
            jjtn001.value = t.image;
            ST.insert(t.image, name);
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  1);
          }
    }
  }

  static final public void const_decl() throws ParseException {
                            Token t; String name;
    jj_consume_token(CONSTANT);
    name = id();
    jj_consume_token(COLON);
    t = jj_consume_token(TYPE);
          ASTCONST jjtn001 = new ASTCONST(JJTCONST);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
          jjtree.closeNodeScope(jjtn001,  1);
          jjtc001 = false;
            jjtn001.value = t.image;
            ST.insert(t.image, name);
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  1);
          }
    }
  }

/** FUNCTION **/
  static final public void func_list() throws ParseException {
    func();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TYPE:
      func_list();
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
  }

  static final public void func() throws ParseException {
               /*@bgen(jjtree) func */
  ASTfunc jjtn000 = new ASTfunc(JJTFUNC);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ST.newScope();
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
          jj_la1[5] = jj_gen;
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
          jj_la1[6] = jj_gen;
          break label_2;
        }
        decl_list();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_3;
        }
        statement_block();
      }
      jjtree.closeNodeScope(jjtn000, true);
      jjtc000 = false;
      ST.endScope();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void param_list() throws ParseException {
                     /*@bgen(jjtree) param_list */
  ASTparam_list jjtn000 = new ASTparam_list(JJTPARAM_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      nemp_param_list();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void nemp_param_list() throws ParseException {
                          /*@bgen(jjtree) nemp_param_list */
  ASTnemp_param_list jjtn000 = new ASTnemp_param_list(JJTNEMP_PARAM_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      param();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        nemp_param_list();
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void param() throws ParseException {
                /*@bgen(jjtree) param */
                ASTparam jjtn000 = new ASTparam(JJTPARAM);
                boolean jjtc000 = true;
                jjtree.openNodeScope(jjtn000);Token t; String name;
    try {
      name = id();
      jj_consume_token(COLON);
      t = jj_consume_token(TYPE);
          ASTVAR jjtn001 = new ASTVAR(JJTVAR);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
      try {
          jjtree.closeNodeScope(jjtn001,  1);
          jjtc001 = false;
            jjtn001.value = t.image;
            ST.insert(t.image, name);
      } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  1);
          }
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

/** CONDITION **/
  static final public void condition() throws ParseException {
                    /*@bgen(jjtree) condition */
  ASTcondition jjtn000 = new ASTcondition(JJTCONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      simple_condition();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LOG_DIS:
        case LOG_AND:
          ;
          break;
        default:
          jj_la1[9] = jj_gen;
          break label_4;
        }
        log_ops();
        simple_condition();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void simple_condition() throws ParseException {
                           /*@bgen(jjtree) simple_condition */
  ASTsimple_condition jjtn000 = new ASTsimple_condition(JJTSIMPLE_CONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
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
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void comp_ops() throws ParseException {
                   /*@bgen(jjtree) comp_ops */
  ASTcomp_ops jjtn000 = new ASTcomp_ops(JJTCOMP_OPS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
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
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void log_ops() throws ParseException {
                  /*@bgen(jjtree) log_ops */
  ASTlog_ops jjtn000 = new ASTlog_ops(JJTLOG_OPS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LOG_DIS:
        jj_consume_token(LOG_DIS);
        break;
      case LOG_AND:
        jj_consume_token(LOG_AND);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

/** MAIN STATEMENT **/
  static final public void main_statement() throws ParseException {
                         /*@bgen(jjtree) main_statement */
  ASTmain_statement jjtn000 = new ASTmain_statement(JJTMAIN_STATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(MAIN);
      jj_consume_token(BEGIN);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VARIABLE:
        case CONSTANT:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_5;
        }
        decl_list();
      }
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_6;
        }
        statement_block();
      }
      jj_consume_token(END);
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void statement_block() throws ParseException {
                          /*@bgen(jjtree) statement_block */
  ASTstatement_block jjtn000 = new ASTstatement_block(JJTSTATEMENT_BLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      statement();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        statement_block();
        break;
      default:
        jj_la1[15] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void statement() throws ParseException {
                    /*@bgen(jjtree) statement */
  ASTstatement jjtn000 = new ASTstatement(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_1(2)) {
        id();
        jj_consume_token(ASSIGN);
        expr();
        jj_consume_token(SEMIC);
      } else if (jj_2_2(2)) {
        id();
        jj_consume_token(LBR);
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case MINUS_SIGN:
          case BOOL:
          case NUM:
          case ID:
            ;
            break;
          default:
            jj_la1[16] = jj_gen;
            break label_7;
          }
          expr();
        }
        jj_consume_token(RBR);
        jj_consume_token(SEMIC);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void expr() throws ParseException {
               /*@bgen(jjtree) expr */
  ASTexpr jjtn000 = new ASTexpr(JJTEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      if (jj_2_3(3)) {
        fragment();
        bin_op();
        fragment();
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
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void arg_list() throws ParseException {
                   /*@bgen(jjtree) arg_list */
  ASTarg_list jjtn000 = new ASTarg_list(JJTARG_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      nemp_arg_list();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void nemp_arg_list() throws ParseException {
                        /*@bgen(jjtree) nemp_arg_list */
  ASTnemp_arg_list jjtn000 = new ASTnemp_arg_list(JJTNEMP_ARG_LIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      id();
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[18] = jj_gen;
          break label_8;
        }
        jj_consume_token(COMMA);
        nemp_arg_list();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void bin_op() throws ParseException {
                 /*@bgen(jjtree) bin_op */
  ASTbin_op jjtn000 = new ASTbin_op(JJTBIN_OP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS_SIGN:
        jj_consume_token(PLUS_SIGN);
        break;
      case MINUS_SIGN:
        jj_consume_token(MINUS_SIGN);
        break;
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void fragment() throws ParseException {
                   /*@bgen(jjtree) fragment */
  ASTfragment jjtn000 = new ASTfragment(JJTFRAGMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        id();
        break;
      case MINUS_SIGN:
        jj_consume_token(MINUS_SIGN);
        id();
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      case BOOL:
        jj_consume_token(BOOL);
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

/** SIMPLE TOKENS **/
  static final public String id() throws ParseException {
                /*@bgen(jjtree) id */
                 ASTid jjtn000 = new ASTid(JJTID);
                 boolean jjtc000 = true;
                 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ID);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.value = t.image; {if (true) return t.image;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
    throw new Error("Missing return statement in function");
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

  static private boolean jj_3R_13() {
    if (jj_scan_token(MINUS_SIGN)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_3R_9()) return true;
    if (jj_scan_token(LBR)) return true;
    return false;
  }

  static private boolean jj_3R_12() {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3R_10() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(29)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_9() {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_10()) return true;
    if (jj_3R_11()) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_9()) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  static private boolean jj_3R_11() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(18)) {
    jj_scanpos = xsp;
    if (jj_scan_token(19)) return true;
    }
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
  static final private int[] jj_la1 = new int[21];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xe400000,0xe400000,0x6000000,0x6000000,0x8000000,0x0,0x6000000,0x0,0x20000,0x0,0x8000,0x0,0x0,0x6000000,0x0,0x0,0x20080000,0x20080000,0x20000,0xc0000,0x20080000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x2000,0x0,0x2000,0x0,0x18,0x4,0x7e0,0x18,0x0,0x2000,0x2000,0x2800,0x2800,0x0,0x0,0x2800,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[3];
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
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
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
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SLPParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 21; i++) {
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
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
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

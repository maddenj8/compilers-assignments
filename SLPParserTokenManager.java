/* Generated By:JavaCC: Do not edit this line. SLPParserTokenManager.java */

/** Token Manager. */
public class SLPParserTokenManager implements SLPParserConstants
{
    static int commentNesting = 0;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(6, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(6, 0);
      case 12:
         jjmatchedKind = 5;
         return jjMoveNfa_0(6, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(6, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(6, 0);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 38:
         jjmatchedKind = 33;
         return jjMoveNfa_0(6, 0);
      case 40:
         jjmatchedKind = 15;
         return jjMoveNfa_0(6, 0);
      case 41:
         jjmatchedKind = 16;
         return jjMoveNfa_0(6, 0);
      case 42:
         jjmatchedKind = 20;
         return jjMoveNfa_0(6, 0);
      case 43:
         jjmatchedKind = 18;
         return jjMoveNfa_0(6, 0);
      case 44:
         jjmatchedKind = 17;
         return jjMoveNfa_0(6, 0);
      case 45:
         jjmatchedKind = 19;
         return jjMoveNfa_0(6, 0);
      case 47:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0xc0L);
      case 58:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 59:
         jjmatchedKind = 11;
         return jjMoveNfa_0(6, 0);
      case 60:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 61:
         jjmatchedKind = 34;
         return jjMoveNfa_0(6, 0);
      case 62:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 124:
         jjmatchedKind = 32;
         return jjMoveNfa_0(6, 0);
      case 126:
         jjmatchedKind = 31;
         return jjMoveNfa_0(6, 0);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 0);
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 1;
         }
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1400000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 83:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1400000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 115:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 1);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
         }
         break;
      case 71:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 100:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
         }
         break;
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x804000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 2);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x5000000L);
      case 78:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x5000000L);
      case 110:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 78:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 116:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 4);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 66:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 78:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 5;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 110:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 5);
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjMoveNfa_0(6, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(6, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(6, 6);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 7;
         }
         break;
      case 84:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 7;
         }
         break;
      case 101:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 7;
         }
         break;
      case 116:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(6, 7);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAdd(23);
                  }
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(22, 23);
                  break;
               case 22:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(22, 23);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 40;
                  jjCheckNAdd(23);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     jjCheckNAdd(24);
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 0:
                  if ((0x4000000040000L & l) != 0L && kind > 28)
                     kind = 28;
                  break;
               case 1:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if ((0x400000004000L & l) != 0L && kind > 28)
                     kind = 28;
                  break;
               case 8:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x2000000020L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 15:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(14);
                  break;
               case 16:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(14);
                  break;
               case 19:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 24:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAdd(24);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x200L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 47:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\73", "\72", 
"\72\75", "\160\162\151\156\164", "\50", "\51", "\54", "\53", "\55", "\52", "\57", null, 
null, null, null, null, null, null, null, null, "\176", "\174", "\46", "\75", 
"\41\75", "\74", "\74\75", "\76", "\76\75", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x15fffffff801L, 
};
static final long[] jjtoSkip = {
   0x7feL, 
};
static protected JavaCharStream input_stream;
static private final int[] jjrounds = new int[25];
static private final int[] jjstateSet = new int[50];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public SLPParserTokenManager(JavaCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public SLPParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       if (jjmatchedPos == 0 && jjmatchedKind > 44)
       {
          jjmatchedKind = 44;
       }
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 10)
       {
          jjmatchedKind = 10;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
           commentNesting++;
         break;
      case 8 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
           commentNesting++;
         break;
      case 9 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
             commentNesting--;
        if (commentNesting == 0)
        SwitchTo(DEFAULT);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}

// This is a generated file. Not intended for manual editing.
package parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static psi.ModelTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ModelParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return modelFile(b, l + 1);
  }

  /* ********************************************************** */
  // (OPERATOR SYMBOL LBRACKET args1 OPterm)|(OPERATOR SYMBOL OPterm )
  //                                                   |(OPERATOR SYMBOL LBRACKET args1)
  //                                                   |(OPERATOR SYMBOL )
  public static boolean OPterm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPterm_0(b, l + 1);
    if (!r) r = OPterm_1(b, l + 1);
    if (!r) r = OPterm_2(b, l + 1);
    if (!r) r = OPterm_3(b, l + 1);
    exit_section_(b, m, O_PTERM, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1 OPterm
  private static boolean OPterm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL OPterm
  private static boolean OPterm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1
  private static boolean OPterm_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL
  private static boolean OPterm_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OPERATOR SYMBOL LBRACKET args1 OPterm RBRACKET)|(OPERATOR SYMBOL OPterm RBRACKET)
  //                                                             |(OPERATOR SYMBOL LBRACKET args1 RBRACKET)
  //                                                             |(OPERATOR SYMBOL RBRACKET)
  public static boolean OPterm2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm2")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPterm2_0(b, l + 1);
    if (!r) r = OPterm2_1(b, l + 1);
    if (!r) r = OPterm2_2(b, l + 1);
    if (!r) r = OPterm2_3(b, l + 1);
    exit_section_(b, m, O_PTERM_2, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1 OPterm RBRACKET
  private static boolean OPterm2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL OPterm RBRACKET
  private static boolean OPterm2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1 RBRACKET
  private static boolean OPterm2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL RBRACKET
  private static boolean OPterm2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPterm2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // term1
  public static boolean arg1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_1, "<arg 1>");
    r = term1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // term2
  public static boolean arg2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_2, "<arg 2>");
    r = term2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // arg1 | (arg2 args1)
  public static boolean args1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGS_1, "<args 1>");
    r = arg1(b, l + 1);
    if (!r) r = args1_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // arg2 args1
  private static boolean args1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg2(b, l + 1);
    r = r && args1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (channel1 CRLF*)|COMMENT|CRLF
  static boolean channel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "channel")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = channel_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  // channel1 CRLF*
  private static boolean channel_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "channel_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = channel1(b, l + 1);
    r = r && channel_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF*
  private static boolean channel_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "channel_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "channel_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CHANNEL CHANNEL_NAME LBRACE equation*  RBRACE
  public static boolean channel1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "channel1")) return false;
    if (!nextTokenIs(b, CHANNEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CHANNEL, CHANNEL_NAME, LBRACE);
    r = r && channel1_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CHANNEL_1, r);
    return r;
  }

  // equation*
  private static boolean channel1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "channel1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "channel1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ((REF state_transition)|((IN|OUT)lhs EQUALS rhs)) CRLF
  public static boolean equation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUATION, "<equation>");
    r = equation_0(b, l + 1);
    r = r && consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (REF state_transition)|((IN|OUT)lhs EQUALS rhs)
  private static boolean equation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equation_0_0(b, l + 1);
    if (!r) r = equation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // REF state_transition
  private static boolean equation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equation_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REF);
    r = r && state_transition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IN|OUT)lhs EQUALS rhs
  private static boolean equation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equation_0_1_0(b, l + 1);
    r = r && lhs(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN|OUT
  private static boolean equation_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equation_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    return r;
  }

  /* ********************************************************** */
  // state_transition
  public static boolean lhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = state_transition(b, l + 1);
    exit_section_(b, m, LHS, r);
    return r;
  }

  /* ********************************************************** */
  // channel*
  static boolean modelFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modelFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!channel(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modelFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // term
  public static boolean rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL  LBRACKET args1
  public static boolean state_transition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "state_transition")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    exit_section_(b, m, STATE_TRANSITION, r);
    return r;
  }

  /* ********************************************************** */
  // (SYMBOL LBRACKET args1 OPterm)|(SYMBOL OPterm)
  //                                        |(LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm)
  //                                        |(LBRACKET SYMBOL LBRACKET args1 OPterm2)
  //                                        |(LBRACKET SYMBOL OPterm2 OPterm)
  //                                        |(LBRACKET SYMBOL OPterm2)
  //                                        |(SYMBOL LBRACKET args1 )
  //                                        |(OPERATOR SYMBOL LBRACKET args1)
  //                                        |(OPERATOR SYMBOL)
  //                                        |(SYMBOL)
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = term_0(b, l + 1);
    if (!r) r = term_1(b, l + 1);
    if (!r) r = term_2(b, l + 1);
    if (!r) r = term_3(b, l + 1);
    if (!r) r = term_4(b, l + 1);
    if (!r) r = term_5(b, l + 1);
    if (!r) r = term_6(b, l + 1);
    if (!r) r = term_7(b, l + 1);
    if (!r) r = term_8(b, l + 1);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMBOL LBRACKET args1 OPterm
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL OPterm
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2
  private static boolean term_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2 OPterm
  private static boolean term_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2
  private static boolean term_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL LBRACKET args1
  private static boolean term_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1
  private static boolean term_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL
  private static boolean term_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (SYMBOL RBRACKET)|(SYMBOL LBRACKET args1 RBRACKET )
  //                            |(SYMBOL OPterm RBRACKET)
  //                            |(SYMBOL LBRACKET args1 OPterm RBRACKET)
  //                            |(LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm RBRACKET)
  //                            |(LBRACKET SYMBOL LBRACKET args1 OPterm2 RBRACKET)
  //                            |(LBRACKET SYMBOL OPterm2 OPterm RBRACKET)
  //                            |(LBRACKET SYMBOL OPterm2 RBRACKET)
  //                            |(OPERATOR SYMBOL RBRACKET)
  //                            |(OPERATOR SYMBOL LBRACKET args1 RBRACKET)
  public static boolean term1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_1, "<term 1>");
    r = term1_0(b, l + 1);
    if (!r) r = term1_1(b, l + 1);
    if (!r) r = term1_2(b, l + 1);
    if (!r) r = term1_3(b, l + 1);
    if (!r) r = term1_4(b, l + 1);
    if (!r) r = term1_5(b, l + 1);
    if (!r) r = term1_6(b, l + 1);
    if (!r) r = term1_7(b, l + 1);
    if (!r) r = term1_8(b, l + 1);
    if (!r) r = term1_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMBOL RBRACKET
  private static boolean term1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL LBRACKET args1 RBRACKET
  private static boolean term1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL OPterm RBRACKET
  private static boolean term1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL LBRACKET args1 OPterm RBRACKET
  private static boolean term1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm RBRACKET
  private static boolean term1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2 RBRACKET
  private static boolean term1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2 OPterm RBRACKET
  private static boolean term1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2 RBRACKET
  private static boolean term1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL RBRACKET
  private static boolean term1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1 RBRACKET
  private static boolean term1_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term1_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (SYMBOL COMMA CRLF?)|(SYMBOL LBRACKET args1 COMMA CRLF?)
  //                               |(SYMBOL OPterm COMMA)
  //                               |(SYMBOL LBRACKET args1 OPterm COMMA)
  //                               |(LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm COMMA)
  //                               |(LBRACKET SYMBOL LBRACKET args1 OPterm2 COMMA)
  //                               |(LBRACKET SYMBOL OPterm2 OPterm COMMA)
  //                               |(LBRACKET SYMBOL OPterm2 COMMA)
  //                               |(OPERATOR SYMBOL COMMA)
  //                               |(OPERATOR SYMBOL LBRACKET args1 COMMA)
  public static boolean term2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_2, "<term 2>");
    r = term2_0(b, l + 1);
    if (!r) r = term2_1(b, l + 1);
    if (!r) r = term2_2(b, l + 1);
    if (!r) r = term2_3(b, l + 1);
    if (!r) r = term2_4(b, l + 1);
    if (!r) r = term2_5(b, l + 1);
    if (!r) r = term2_6(b, l + 1);
    if (!r) r = term2_7(b, l + 1);
    if (!r) r = term2_8(b, l + 1);
    if (!r) r = term2_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMBOL COMMA CRLF?
  private static boolean term2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, COMMA);
    r = r && term2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF?
  private static boolean term2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_0_2")) return false;
    consumeToken(b, CRLF);
    return true;
  }

  // SYMBOL LBRACKET args1 COMMA CRLF?
  private static boolean term2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && term2_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF?
  private static boolean term2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_1_4")) return false;
    consumeToken(b, CRLF);
    return true;
  }

  // SYMBOL OPterm COMMA
  private static boolean term2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL LBRACKET args1 OPterm COMMA
  private static boolean term2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2 OPterm COMMA
  private static boolean term2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL LBRACKET args1 OPterm2 COMMA
  private static boolean term2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && OPterm2(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2 OPterm COMMA
  private static boolean term2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    r = r && OPterm(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET SYMBOL OPterm2 COMMA
  private static boolean term2_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, SYMBOL);
    r = r && OPterm2(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL COMMA
  private static boolean term2_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR SYMBOL LBRACKET args1 COMMA
  private static boolean term2_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term2_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR, SYMBOL, LBRACKET);
    r = r && args1(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

}

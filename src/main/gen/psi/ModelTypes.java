// This is a generated file. Not intended for manual editing.
package psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import psi.impl.*;

public interface ModelTypes {

  IElementType ARGS_1 = new ModelElementType("ARGS_1");
  IElementType ARG_1 = new ModelElementType("ARG_1");
  IElementType ARG_2 = new ModelElementType("ARG_2");
  IElementType CHANNEL_1 = new ModelElementType("CHANNEL_1");
  IElementType EQUATION = new ModelElementType("EQUATION");
  IElementType LHS = new ModelElementType("LHS");
  IElementType O_PTERM = new ModelElementType("O_PTERM");
  IElementType O_PTERM_2 = new ModelElementType("O_PTERM_2");
  IElementType RHS = new ModelElementType("RHS");
  IElementType STATE_TRANSITION = new ModelElementType("STATE_TRANSITION");
  IElementType TERM = new ModelElementType("TERM");
  IElementType TERM_1 = new ModelElementType("TERM_1");
  IElementType TERM_2 = new ModelElementType("TERM_2");

  IElementType CHANNEL = new ModelTokenType("CHANNEL");
  IElementType CHANNEL_NAME = new ModelTokenType("CHANNEL_NAME");
  IElementType COMMA = new ModelTokenType("COMMA");
  IElementType COMMENT = new ModelTokenType("COMMENT");
  IElementType CRLF = new ModelTokenType("CRLF");
  IElementType EQUALS = new ModelTokenType("EQUALS");
  IElementType IN = new ModelTokenType("IN");
  IElementType LBRACE = new ModelTokenType("LBRACE");
  IElementType LBRACKET = new ModelTokenType("LBRACKET");
  IElementType OPERATOR = new ModelTokenType("OPERATOR");
  IElementType OUT = new ModelTokenType("OUT");
  IElementType RBRACE = new ModelTokenType("RBRACE");
  IElementType RBRACKET = new ModelTokenType("RBRACKET");
  IElementType REF = new ModelTokenType("REF");
  IElementType SYMBOL = new ModelTokenType("SYMBOL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS_1) {
        return new ModelArgs1Impl(node);
      }
      else if (type == ARG_1) {
        return new ModelArg1Impl(node);
      }
      else if (type == ARG_2) {
        return new ModelArg2Impl(node);
      }
      else if (type == CHANNEL_1) {
        return new ModelChannel1Impl(node);
      }
      else if (type == EQUATION) {
        return new ModelEquationImpl(node);
      }
      else if (type == LHS) {
        return new ModelLhsImpl(node);
      }
      else if (type == O_PTERM) {
        return new ModelOPtermImpl(node);
      }
      else if (type == O_PTERM_2) {
        return new ModelOPterm2Impl(node);
      }
      else if (type == RHS) {
        return new ModelRhsImpl(node);
      }
      else if (type == STATE_TRANSITION) {
        return new ModelStateTransitionImpl(node);
      }
      else if (type == TERM) {
        return new ModelTermImpl(node);
      }
      else if (type == TERM_1) {
        return new ModelTerm1Impl(node);
      }
      else if (type == TERM_2) {
        return new ModelTerm2Impl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

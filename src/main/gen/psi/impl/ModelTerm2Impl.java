// This is a generated file. Not intended for manual editing.
package psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static psi.ModelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import language.psi.*;

public class ModelTerm2Impl extends ASTWrapperPsiElement implements ModelTerm2 {

  public ModelTerm2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModelVisitor visitor) {
    visitor.visitTerm2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModelVisitor) accept((ModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModelOPterm getOPterm() {
    return findChildByClass(ModelOPterm.class);
  }

  @Override
  @Nullable
  public ModelOPterm2 getOPterm2() {
    return findChildByClass(ModelOPterm2.class);
  }

  @Override
  @Nullable
  public ModelArgs1 getArgs1() {
    return findChildByClass(ModelArgs1.class);
  }

}

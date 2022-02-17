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

public class ModelArg1Impl extends ASTWrapperPsiElement implements ModelArg1 {

  public ModelArg1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModelVisitor visitor) {
    visitor.visitArg1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModelVisitor) accept((ModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModelTerm1 getTerm1() {
    return findNotNullChildByClass(ModelTerm1.class);
  }

}

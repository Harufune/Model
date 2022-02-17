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

public class ModelArg2Impl extends ASTWrapperPsiElement implements ModelArg2 {

  public ModelArg2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModelVisitor visitor) {
    visitor.visitArg2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModelVisitor) accept((ModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModelTerm2 getTerm2() {
    return findNotNullChildByClass(ModelTerm2.class);
  }

}

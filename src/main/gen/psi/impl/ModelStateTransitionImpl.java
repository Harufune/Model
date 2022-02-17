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

public class ModelStateTransitionImpl extends ASTWrapperPsiElement implements ModelStateTransition {

  public ModelStateTransitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModelVisitor visitor) {
    visitor.visitStateTransition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModelVisitor) accept((ModelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModelArgs1 getArgs1() {
    return findNotNullChildByClass(ModelArgs1.class);
  }

}

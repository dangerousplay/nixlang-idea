// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.*;

import static org.nixos.idea.psi.NixTypes.SEMI;

public class NixBindingImpl extends ASTWrapperPsiElement implements NixBinding {

  public NixBindingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitBinding(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixAttrAssign getAttrAssign() {
    return findChildByClass(NixAttrAssign.class);
  }

  @Override
  @Nullable
  public NixInheritAttrs getInheritAttrs() {
    return findChildByClass(NixInheritAttrs.class);
  }

  @Override
  @Nullable
  public NixRequireExpr getRequireExpr() {
    return findChildByClass(NixRequireExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getSemi() {
    return findNotNullChildByType(SEMI);
  }

}

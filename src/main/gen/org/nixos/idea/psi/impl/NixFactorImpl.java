// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixFactor;
import org.nixos.idea.psi.NixMulExpr;
import org.nixos.idea.psi.NixPrimary;
import org.nixos.idea.psi.NixVisitor;

public class NixFactorImpl extends ASTWrapperPsiElement implements NixFactor {

  public NixFactorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitFactor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixMulExpr getMulExpr() {
    return findChildByClass(NixMulExpr.class);
  }

  @Override
  @Nullable
  public NixPrimary getPrimary() {
    return findChildByClass(NixPrimary.class);
  }

}

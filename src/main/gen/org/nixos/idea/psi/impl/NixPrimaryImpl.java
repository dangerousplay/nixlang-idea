// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixExprApp;
import org.nixos.idea.psi.NixPrimary;
import org.nixos.idea.psi.NixVisitor;

public class NixPrimaryImpl extends ASTWrapperPsiElement implements NixPrimary {

  public NixPrimaryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixExprApp getExprApp() {
    return findNotNullChildByClass(NixExprApp.class);
  }

}

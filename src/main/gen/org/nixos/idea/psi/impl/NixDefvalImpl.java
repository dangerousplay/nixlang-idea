// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixDefval;
import org.nixos.idea.psi.NixExpr;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.ID;
import static org.nixos.idea.psi.NixTypes.IS;

public class NixDefvalImpl extends ASTWrapperPsiElement implements NixDefval {

  public NixDefvalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitDefval(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixExpr getExpr() {
    return findNotNullChildByClass(NixExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  @Override
  @NotNull
  public PsiElement getIs() {
    return findNotNullChildByType(IS);
  }

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixExprList;
import org.nixos.idea.psi.NixList;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.LBRAC;
import static org.nixos.idea.psi.NixTypes.RBRAC;

public class NixListImpl extends ASTWrapperPsiElement implements NixList {

  public NixListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixExprList getExprList() {
    return findNotNullChildByClass(NixExprList.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrac() {
    return findNotNullChildByType(LBRAC);
  }

  @Override
  @NotNull
  public PsiElement getRbrac() {
    return findNotNullChildByType(RBRAC);
  }

}

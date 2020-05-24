// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixAttrAssign;
import org.nixos.idea.psi.NixAttrPath;
import org.nixos.idea.psi.NixExpr;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.ASSIGN;

public class NixAttrAssignImpl extends ASTWrapperPsiElement implements NixAttrAssign {

  public NixAttrAssignImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitAttrAssign(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixAttrPath getAttrPath() {
    return findNotNullChildByClass(NixAttrPath.class);
  }

  @Override
  @NotNull
  public NixExpr getExpr() {
    return findNotNullChildByClass(NixExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getAssign() {
    return findNotNullChildByType(ASSIGN);
  }

}

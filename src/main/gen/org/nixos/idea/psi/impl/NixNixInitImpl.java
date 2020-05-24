// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixExpr;
import org.nixos.idea.psi.NixNixInit;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.DOLLAR_CURLY;
import static org.nixos.idea.psi.NixTypes.RCURLY;

public class NixNixInitImpl extends ASTWrapperPsiElement implements NixNixInit {

  public NixNixInitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitNixInit(this);
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
  public PsiElement getDollarCurly() {
    return findNotNullChildByType(DOLLAR_CURLY);
  }

  @Override
  @NotNull
  public PsiElement getRcurly() {
    return findNotNullChildByType(RCURLY);
  }

}

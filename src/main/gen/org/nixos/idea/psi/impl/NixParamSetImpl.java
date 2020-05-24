// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixParamSet;
import org.nixos.idea.psi.NixParams;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.LCURLY;
import static org.nixos.idea.psi.NixTypes.RCURLY;

public class NixParamSetImpl extends ASTWrapperPsiElement implements NixParamSet {

  public NixParamSetImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitParamSet(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixParams getParams() {
    return findNotNullChildByClass(NixParams.class);
  }

  @Override
  @NotNull
  public PsiElement getLcurly() {
    return findNotNullChildByType(LCURLY);
  }

  @Override
  @NotNull
  public PsiElement getRcurly() {
    return findNotNullChildByType(RCURLY);
  }

}

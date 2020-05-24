// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixFnLambda;
import org.nixos.idea.psi.NixParamSet;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.ID;
import static org.nixos.idea.psi.NixTypes.NAMED;

public class NixFnLambdaImpl extends ASTWrapperPsiElement implements NixFnLambda {

  public NixFnLambdaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitFnLambda(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixParamSet getParamSet() {
    return findNotNullChildByClass(NixParamSet.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  @Override
  @NotNull
  public PsiElement getNamed() {
    return findNotNullChildByType(NAMED);
  }

}

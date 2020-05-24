// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.*;

import static org.nixos.idea.psi.NixTypes.COLON;
import static org.nixos.idea.psi.NixTypes.ID;

public class NixLambdaImpl extends ASTWrapperPsiElement implements NixLambda {

  public NixLambdaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitLambda(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixBnLambda getBnLambda() {
    return findChildByClass(NixBnLambda.class);
  }

  @Override
  @NotNull
  public NixExpr getExpr() {
    return findNotNullChildByClass(NixExpr.class);
  }

  @Override
  @Nullable
  public NixFnLambda getFnLambda() {
    return findChildByClass(NixFnLambda.class);
  }

  @Override
  @Nullable
  public NixParamSet getParamSet() {
    return findChildByClass(NixParamSet.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}

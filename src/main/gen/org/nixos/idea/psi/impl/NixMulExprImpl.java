// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixMulExpr;
import org.nixos.idea.psi.NixPrimary;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

import static org.nixos.idea.psi.NixTypes.DIVIDE;
import static org.nixos.idea.psi.NixTypes.TIMES;

public class NixMulExprImpl extends ASTWrapperPsiElement implements NixMulExpr {

  public NixMulExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitMulExpr(this);
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
  @NotNull
  public List<NixPrimary> getPrimaryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixPrimary.class);
  }

  @Override
  @Nullable
  public PsiElement getDivide() {
    return findChildByType(DIVIDE);
  }

  @Override
  @Nullable
  public PsiElement getTimes() {
    return findChildByType(TIMES);
  }

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixRelExpr;
import org.nixos.idea.psi.NixRelative;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

import static org.nixos.idea.psi.NixTypes.*;

public class NixRelExprImpl extends ASTWrapperPsiElement implements NixRelExpr {

  public NixRelExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitRelExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixRelExpr getRelExpr() {
    return findChildByClass(NixRelExpr.class);
  }

  @Override
  @NotNull
  public List<NixRelative> getRelativeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixRelative.class);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getGeq() {
    return findChildByType(GEQ);
  }

  @Override
  @Nullable
  public PsiElement getGt() {
    return findChildByType(GT);
  }

  @Override
  @Nullable
  public PsiElement getLeq() {
    return findChildByType(LEQ);
  }

  @Override
  @Nullable
  public PsiElement getLt() {
    return findChildByType(LT);
  }

  @Override
  @Nullable
  public PsiElement getNeq() {
    return findChildByType(NEQ);
  }

}

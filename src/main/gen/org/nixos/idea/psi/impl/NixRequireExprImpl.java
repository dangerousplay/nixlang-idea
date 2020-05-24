// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixPathExpr;
import org.nixos.idea.psi.NixRequireExpr;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

import static org.nixos.idea.psi.NixTypes.*;

public class NixRequireExprImpl extends ASTWrapperPsiElement implements NixRequireExpr {

  public NixRequireExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitRequireExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NixPathExpr> getPathExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixPathExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getAssign() {
    return findNotNullChildByType(ASSIGN);
  }

  @Override
  @Nullable
  public PsiElement getImports() {
    return findChildByType(IMPORTS);
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

  @Override
  @Nullable
  public PsiElement getRequire() {
    return findChildByType(REQUIRE);
  }

  @Override
  @Nullable
  public PsiElement getRequires() {
    return findChildByType(REQUIRES);
  }

}

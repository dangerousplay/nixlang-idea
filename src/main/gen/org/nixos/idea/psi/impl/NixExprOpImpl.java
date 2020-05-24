// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.*;

public class NixExprOpImpl extends ASTWrapperPsiElement implements NixExprOp {

  public NixExprOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitExprOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixBoolExpr getBoolExpr() {
    return findChildByClass(NixBoolExpr.class);
  }

  @Override
  @Nullable
  public NixExprOp getExprOp() {
    return findChildByClass(NixExprOp.class);
  }

  @Override
  @Nullable
  public NixLogical getLogical() {
    return findChildByClass(NixLogical.class);
  }

  @Override
  @Nullable
  public NixUnaryOp getUnaryOp() {
    return findChildByClass(NixUnaryOp.class);
  }

}

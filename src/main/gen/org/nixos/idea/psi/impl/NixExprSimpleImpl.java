// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.*;

import static org.nixos.idea.psi.NixTypes.REC;

public class NixExprSimpleImpl extends ASTWrapperPsiElement implements NixExprSimple {

  public NixExprSimpleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitExprSimple(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixAttrPath getAttrPath() {
    return findChildByClass(NixAttrPath.class);
  }

  @Override
  @Nullable
  public NixBindOrSelect getBindOrSelect() {
    return findChildByClass(NixBindOrSelect.class);
  }

  @Override
  @Nullable
  public NixBindSet getBindSet() {
    return findChildByClass(NixBindSet.class);
  }

  @Override
  @Nullable
  public NixDefval getDefval() {
    return findChildByClass(NixDefval.class);
  }

  @Override
  @Nullable
  public NixDocString getDocString() {
    return findChildByClass(NixDocString.class);
  }

  @Override
  @Nullable
  public NixEvalOrSelect getEvalOrSelect() {
    return findChildByClass(NixEvalOrSelect.class);
  }

  @Override
  @Nullable
  public NixExprOp getExprOp() {
    return findChildByClass(NixExprOp.class);
  }

  @Override
  @Nullable
  public NixImportStmt getImportStmt() {
    return findChildByClass(NixImportStmt.class);
  }

  @Override
  @Nullable
  public NixList getList() {
    return findChildByClass(NixList.class);
  }

  @Override
  @Nullable
  public NixLiteral getLiteral() {
    return findChildByClass(NixLiteral.class);
  }

  @Override
  @Nullable
  public NixLiteralSimpleString getLiteralSimpleString() {
    return findChildByClass(NixLiteralSimpleString.class);
  }

  @Override
  @Nullable
  public NixUnaryOp getUnaryOp() {
    return findChildByClass(NixUnaryOp.class);
  }

  @Override
  @Nullable
  public PsiElement getRec() {
    return findChildByType(REC);
  }

}

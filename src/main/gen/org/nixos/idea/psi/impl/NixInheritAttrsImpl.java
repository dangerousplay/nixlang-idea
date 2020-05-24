// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixAttrs;
import org.nixos.idea.psi.NixExpr;
import org.nixos.idea.psi.NixInheritAttrs;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.*;

public class NixInheritAttrsImpl extends ASTWrapperPsiElement implements NixInheritAttrs {

  public NixInheritAttrsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitInheritAttrs(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixAttrs getAttrs() {
    return findNotNullChildByClass(NixAttrs.class);
  }

  @Override
  @Nullable
  public NixExpr getExpr() {
    return findChildByClass(NixExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getInherit() {
    return findNotNullChildByType(INHERIT);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}

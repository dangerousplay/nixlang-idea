// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixBindSet;
import org.nixos.idea.psi.NixBinds;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.LCURLY;
import static org.nixos.idea.psi.NixTypes.RCURLY;

public class NixBindSetImpl extends ASTWrapperPsiElement implements NixBindSet {

  public NixBindSetImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitBindSet(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixBinds getBinds() {
    return findChildByClass(NixBinds.class);
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

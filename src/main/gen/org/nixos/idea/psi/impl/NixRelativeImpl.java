// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixAddExpr;
import org.nixos.idea.psi.NixFactor;
import org.nixos.idea.psi.NixRelative;
import org.nixos.idea.psi.NixVisitor;

public class NixRelativeImpl extends ASTWrapperPsiElement implements NixRelative {

  public NixRelativeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitRelative(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixAddExpr getAddExpr() {
    return findChildByClass(NixAddExpr.class);
  }

  @Override
  @Nullable
  public NixFactor getFactor() {
    return findChildByClass(NixFactor.class);
  }

}

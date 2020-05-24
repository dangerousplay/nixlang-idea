// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixLogical;
import org.nixos.idea.psi.NixRelExpr;
import org.nixos.idea.psi.NixRelative;
import org.nixos.idea.psi.NixVisitor;

public class NixLogicalImpl extends ASTWrapperPsiElement implements NixLogical {

  public NixLogicalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitLogical(this);
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
  @Nullable
  public NixRelative getRelative() {
    return findChildByClass(NixRelative.class);
  }

}

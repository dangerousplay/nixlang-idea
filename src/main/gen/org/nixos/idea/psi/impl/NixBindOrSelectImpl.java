// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixBindOrSelect;
import org.nixos.idea.psi.NixBindSet;
import org.nixos.idea.psi.NixContPath;
import org.nixos.idea.psi.NixVisitor;

public class NixBindOrSelectImpl extends ASTWrapperPsiElement implements NixBindOrSelect {

  public NixBindOrSelectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitBindOrSelect(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixBindSet getBindSet() {
    return findNotNullChildByClass(NixBindSet.class);
  }

  @Override
  @Nullable
  public NixContPath getContPath() {
    return findChildByClass(NixContPath.class);
  }

}

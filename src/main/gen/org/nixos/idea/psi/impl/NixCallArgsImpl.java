// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixBinds;
import org.nixos.idea.psi.NixCallArgs;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.LCURLY;
import static org.nixos.idea.psi.NixTypes.RCURLY;

public class NixCallArgsImpl extends ASTWrapperPsiElement implements NixCallArgs {

  public NixCallArgsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitCallArgs(this);
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

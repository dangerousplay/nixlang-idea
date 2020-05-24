// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixDocString;
import org.nixos.idea.psi.NixIndStringParts;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.IND_STRING_CLOSE;
import static org.nixos.idea.psi.NixTypes.IND_STRING_OPEN;

public class NixDocStringImpl extends ASTWrapperPsiElement implements NixDocString {

  public NixDocStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitDocString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixIndStringParts getIndStringParts() {
    return findNotNullChildByClass(NixIndStringParts.class);
  }

  @Override
  @NotNull
  public PsiElement getIndStringClose() {
    return findNotNullChildByType(IND_STRING_CLOSE);
  }

  @Override
  @NotNull
  public PsiElement getIndStringOpen() {
    return findNotNullChildByType(IND_STRING_OPEN);
  }

}

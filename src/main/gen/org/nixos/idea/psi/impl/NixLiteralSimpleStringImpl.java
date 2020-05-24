// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixLiteralSimpleString;
import org.nixos.idea.psi.NixStringParts;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.FNUTT_CLOSE;
import static org.nixos.idea.psi.NixTypes.FNUTT_OPEN;

public class NixLiteralSimpleStringImpl extends ASTWrapperPsiElement implements NixLiteralSimpleString {

  public NixLiteralSimpleStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitLiteralSimpleString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixStringParts getStringParts() {
    return findNotNullChildByClass(NixStringParts.class);
  }

  @Override
  @NotNull
  public PsiElement getFnuttClose() {
    return findNotNullChildByType(FNUTT_CLOSE);
  }

  @Override
  @NotNull
  public PsiElement getFnuttOpen() {
    return findNotNullChildByType(FNUTT_OPEN);
  }

}

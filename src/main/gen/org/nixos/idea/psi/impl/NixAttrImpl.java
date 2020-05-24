// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixAttr;
import org.nixos.idea.psi.NixStringAttr;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.*;

public class NixAttrImpl extends ASTWrapperPsiElement implements NixAttr {

  public NixAttrImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitAttr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixStringAttr getStringAttr() {
    return findChildByClass(NixStringAttr.class);
  }

  @Override
  @Nullable
  public PsiElement getFnuttClose() {
    return findChildByType(FNUTT_CLOSE);
  }

  @Override
  @Nullable
  public PsiElement getFnuttOpen() {
    return findChildByType(FNUTT_OPEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixAttrPath;
import org.nixos.idea.psi.NixContPath;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.DOT;

public class NixContPathImpl extends ASTWrapperPsiElement implements NixContPath {

  public NixContPathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitContPath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NixAttrPath getAttrPath() {
    return findNotNullChildByClass(NixAttrPath.class);
  }

  @Override
  @NotNull
  public PsiElement getDot() {
    return findNotNullChildByType(DOT);
  }

}

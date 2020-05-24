// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixNixInit;
import org.nixos.idea.psi.NixStringParts;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

public class NixStringPartsImpl extends ASTWrapperPsiElement implements NixStringParts {

  public NixStringPartsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitStringParts(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NixNixInit> getNixInitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixNixInit.class);
  }

}

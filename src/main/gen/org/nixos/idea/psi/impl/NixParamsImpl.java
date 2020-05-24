// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixParam;
import org.nixos.idea.psi.NixParams;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

public class NixParamsImpl extends ASTWrapperPsiElement implements NixParams {

  public NixParamsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitParams(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NixParam> getParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixParam.class);
  }

}

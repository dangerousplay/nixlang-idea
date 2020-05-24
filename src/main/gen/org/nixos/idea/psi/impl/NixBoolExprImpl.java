// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixBoolExpr;
import org.nixos.idea.psi.NixLogical;
import org.nixos.idea.psi.NixVisitor;

import java.util.List;

import static org.nixos.idea.psi.NixTypes.*;

public class NixBoolExprImpl extends ASTWrapperPsiElement implements NixBoolExpr {

  public NixBoolExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitBoolExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixBoolExpr getBoolExpr() {
    return findChildByClass(NixBoolExpr.class);
  }

  @Override
  @NotNull
  public List<NixLogical> getLogicalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NixLogical.class);
  }

  @Override
  @Nullable
  public PsiElement getAnd() {
    return findChildByType(AND);
  }

  @Override
  @Nullable
  public PsiElement getImpl() {
    return findChildByType(IMPL);
  }

  @Override
  @Nullable
  public PsiElement getOr() {
    return findChildByType(OR);
  }

  @Override
  @Nullable
  public PsiElement getOrKw() {
    return findChildByType(OR_KW);
  }

}

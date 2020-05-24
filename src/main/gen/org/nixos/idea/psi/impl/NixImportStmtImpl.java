// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixCallArgs;
import org.nixos.idea.psi.NixImportStmt;
import org.nixos.idea.psi.NixPathExpr;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.IMPORT;

public class NixImportStmtImpl extends ASTWrapperPsiElement implements NixImportStmt {

  public NixImportStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitImportStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixCallArgs getCallArgs() {
    return findChildByClass(NixCallArgs.class);
  }

  @Override
  @NotNull
  public NixPathExpr getPathExpr() {
    return findNotNullChildByClass(NixPathExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getImport() {
    return findNotNullChildByType(IMPORT);
  }

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NixRequireExpr extends PsiElement {

  @NotNull
  List<NixPathExpr> getPathExprList();

  @NotNull
  PsiElement getAssign();

  @Nullable
  PsiElement getImports();

  @NotNull
  PsiElement getLbrac();

  @NotNull
  PsiElement getRbrac();

  @Nullable
  PsiElement getRequire();

  @Nullable
  PsiElement getRequires();

}

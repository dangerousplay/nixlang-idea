// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NixImportStmt extends PsiElement {

  @Nullable
  NixCallArgs getCallArgs();

  @NotNull
  NixPathExpr getPathExpr();

  @NotNull
  PsiElement getImport();

}

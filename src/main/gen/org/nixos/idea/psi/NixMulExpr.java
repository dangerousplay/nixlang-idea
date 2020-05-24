// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NixMulExpr extends PsiElement {

  @Nullable
  NixMulExpr getMulExpr();

  @NotNull
  List<NixPrimary> getPrimaryList();

  @Nullable
  PsiElement getDivide();

  @Nullable
  PsiElement getTimes();

}

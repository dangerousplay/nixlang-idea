// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NixBoolExpr extends PsiElement {

  @Nullable
  NixBoolExpr getBoolExpr();

  @NotNull
  List<NixLogical> getLogicalList();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getImpl();

  @Nullable
  PsiElement getOr();

  @Nullable
  PsiElement getOrKw();

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NixRelExpr extends PsiElement {

  @Nullable
  NixRelExpr getRelExpr();

  @NotNull
  List<NixRelative> getRelativeList();

  @Nullable
  PsiElement getEq();

  @Nullable
  PsiElement getGeq();

  @Nullable
  PsiElement getGt();

  @Nullable
  PsiElement getLeq();

  @Nullable
  PsiElement getLt();

  @Nullable
  PsiElement getNeq();

}

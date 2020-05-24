// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NixAddExpr extends PsiElement {

  @Nullable
  NixAddExpr getAddExpr();

  @NotNull
  List<NixFactor> getFactorList();

  @Nullable
  PsiElement getConcat();

  @Nullable
  PsiElement getMinus();

  @Nullable
  PsiElement getPlus();

  @Nullable
  PsiElement getUpdate();

}

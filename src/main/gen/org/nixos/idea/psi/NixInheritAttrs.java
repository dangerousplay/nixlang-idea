// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NixInheritAttrs extends PsiElement {

  @NotNull
  NixAttrs getAttrs();

  @Nullable
  NixExpr getExpr();

  @NotNull
  PsiElement getInherit();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}

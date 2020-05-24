// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NixList extends PsiElement {

  @NotNull
  NixExprList getExprList();

  @NotNull
  PsiElement getLbrac();

  @NotNull
  PsiElement getRbrac();

}

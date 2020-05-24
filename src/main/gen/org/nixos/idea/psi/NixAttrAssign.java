// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NixAttrAssign extends PsiElement {

  @NotNull
  NixAttrPath getAttrPath();

  @NotNull
  NixExpr getExpr();

  @NotNull
  PsiElement getAssign();

}

// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NixPathExpr extends PsiElement {

  @Nullable
  NixListExpr getListExpr();

  @Nullable
  PsiElement getHpath();

  @Nullable
  PsiElement getPath();

  @Nullable
  PsiElement getSpath();

}

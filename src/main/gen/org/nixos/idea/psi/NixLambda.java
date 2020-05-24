// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NixLambda extends PsiElement {

  @Nullable
  NixBnLambda getBnLambda();

  @NotNull
  NixExpr getExpr();

  @Nullable
  NixFnLambda getFnLambda();

  @Nullable
  NixParamSet getParamSet();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getId();

}

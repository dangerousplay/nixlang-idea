// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NixExprOp extends PsiElement {

  @Nullable
  NixBoolExpr getBoolExpr();

  @Nullable
  NixExprOp getExprOp();

  @Nullable
  NixLogical getLogical();

  @Nullable
  NixUnaryOp getUnaryOp();

}

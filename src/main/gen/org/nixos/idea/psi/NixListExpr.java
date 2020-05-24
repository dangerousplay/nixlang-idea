// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NixListExpr extends PsiElement {

  @Nullable
  NixAttrPath getAttrPath();

  @Nullable
  NixBindOrSelect getBindOrSelect();

  @Nullable
  NixEvalOrSelect getEvalOrSelect();

  @Nullable
  NixLiteral getLiteral();

  @Nullable
  NixLiteralSimpleString getLiteralSimpleString();

}

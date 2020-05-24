// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface NixExprSimple extends PsiElement {

  @Nullable
  NixAttrPath getAttrPath();

  @Nullable
  NixBindOrSelect getBindOrSelect();

  @Nullable
  NixBindSet getBindSet();

  @Nullable
  NixDefval getDefval();

  @Nullable
  NixDocString getDocString();

  @Nullable
  NixEvalOrSelect getEvalOrSelect();

  @Nullable
  NixExprOp getExprOp();

  @Nullable
  NixImportStmt getImportStmt();

  @Nullable
  NixList getList();

  @Nullable
  NixLiteral getLiteral();

  @Nullable
  NixLiteralSimpleString getLiteralSimpleString();

  @Nullable
  NixUnaryOp getUnaryOp();

  @Nullable
  PsiElement getRec();

}

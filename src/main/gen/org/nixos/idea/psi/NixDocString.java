// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NixDocString extends PsiElement {

  @NotNull
  NixIndStringParts getIndStringParts();

  @NotNull
  PsiElement getIndStringClose();

  @NotNull
  PsiElement getIndStringOpen();

}

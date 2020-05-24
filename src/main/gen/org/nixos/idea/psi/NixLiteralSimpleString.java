// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NixLiteralSimpleString extends PsiElement {

  @NotNull
  NixStringParts getStringParts();

  @NotNull
  PsiElement getFnuttClose();

  @NotNull
  PsiElement getFnuttOpen();

}

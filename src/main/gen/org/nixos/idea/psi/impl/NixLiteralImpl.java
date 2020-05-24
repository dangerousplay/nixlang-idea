// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.nixos.idea.psi.NixLiteral;
import org.nixos.idea.psi.NixVisitor;

import static org.nixos.idea.psi.NixTypes.*;

public class NixLiteralImpl extends ASTWrapperPsiElement implements NixLiteral {

  public NixLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBool() {
    return findChildByType(BOOL);
  }

  @Override
  @Nullable
  public PsiElement getHpath() {
    return findChildByType(HPATH);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

  @Override
  @Nullable
  public PsiElement getPath() {
    return findChildByType(PATH);
  }

  @Override
  @Nullable
  public PsiElement getSpath() {
    return findChildByType(SPATH);
  }

  @Override
  @Nullable
  public PsiElement getStr() {
    return findChildByType(STR);
  }

  @Override
  @Nullable
  public PsiElement getUri() {
    return findChildByType(URI);
  }

}

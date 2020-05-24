package org.nixos.idea.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.lang.NixLanguage;

public class NixTokenType extends IElementType {

    public NixTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NixLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NixTokenType." + super.toString();
    }
}

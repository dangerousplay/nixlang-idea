package org.nixos.idea.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.lang.NixLanguage;

public class NixElementType extends IElementType {

    public NixElementType(@NotNull @NonNls String debugName) {
        super(debugName, NixLanguage.INSTANCE);
    }

}

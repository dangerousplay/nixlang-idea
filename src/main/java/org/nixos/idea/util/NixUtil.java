package org.nixos.idea.util;

import com.intellij.openapi.project.Project;
import org.nixos.idea.psi.NixAttr;

import java.util.Collections;
import java.util.List;

public class NixUtil {

    public static final List<NixAttr> findAttrs(Project proj, String key) {
       return Collections.<NixAttr>emptyList();
    }
}

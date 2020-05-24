/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.nixos.idea.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType

class NixCompletionContributor : CompletionContributor() {

    init {
        extend(CompletionType.BASIC, NixCommonCompletionProvider)
    }

    fun extend(type: CompletionType?, provider: NixCompletionProvider) {
        extend(type, provider.elementPattern, provider)
    }
}

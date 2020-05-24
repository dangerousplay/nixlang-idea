/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.nixos.idea.completion

import com.intellij.codeInsight.completion.*
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import org.nixos.idea.psi.NixExpr

object NixCommonCompletionProvider : NixCompletionProvider() {

    override val elementPattern: ElementPattern<out PsiElement>
        get() = psiElement().withParent(psiElement())

    override fun addCompletions(
        parameters: CompletionParameters,
        processingContext: ProcessingContext,
        result: CompletionResultSet
    ) {
        // Use original position if possible to re-use caches of the real file
        val position = parameters.position.safeGetOriginalOrSelf()
        val parent = position.parent as? NixExpr ?: return

        val b = 123

    }

}

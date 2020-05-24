package org.nixos.idea.lang;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.nixos.idea.psi.NixTypes;

public class SimpleCompletionContributor extends CompletionContributor {
  public SimpleCompletionContributor() {
    extend( CompletionType.BASIC,
            PlatformPatterns.psiElement(NixTypes.STR).withLanguage(NixLanguage.INSTANCE),
            new CompletionProvider<CompletionParameters>() {
                  public void addCompletions(@NotNull CompletionParameters parameters,
                                             @NotNull ProcessingContext context,
                                             @NotNull CompletionResultSet resultSet) {
                    resultSet.addElement(LookupElementBuilder.create("Hello"));
                  }
            }
    );
  }
}

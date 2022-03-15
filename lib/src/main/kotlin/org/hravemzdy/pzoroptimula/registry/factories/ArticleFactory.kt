package org.hravemzdy.pzoroptimula.registry.factories

import org.hravemzdy.procezor.registry.factories.*
import org.hravemzdy.procezor.registry.providers.IArticleSpecProvider

class OptimulaArticleFactory() : ArticleSpecFactory() {
    private val ARTICLE_DEFAULT_SEQUENS: Int = 0

    private val providersConfig = arrayOf<ProviderRecord>(
    )

    override val providers: Map<CODE, IArticleSpecProvider> =
        ArticleSpecFactory.buildProvidersFromRecords(providersConfig.toList())
}


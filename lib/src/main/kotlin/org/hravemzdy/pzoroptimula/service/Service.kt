package org.hravemzdy.pzoroptimula.service

import org.hravemzdy.procezor.service.ServiceProcezor
import org.hravemzdy.procezor.service.types.ArticleCode
import org.hravemzdy.procezor.service.types.VersionCode
import org.hravemzdy.pzoroptimula.registry.constants.OptimulaArticleConst
import org.hravemzdy.pzoroptimula.registry.factories.OptimulaArticleFactory
import org.hravemzdy.pzoroptimula.registry.factories.OptimulaConceptFactory

class ServiceOptimula : ServiceProcezor {
    companion object {
        private val OPTIMULA_VERSION_SCM: VersionCode = VersionCode.get(100)
        private val OPTIMULA_VERSION_EPS: VersionCode = VersionCode.get(200)
        private val OPTIMULA_VERSION_PUZZLE: VersionCode = VersionCode.get(300)

        private val ARTICLE_DEFAULT_SEQUENS: Int = 0

        private val TEST_CALCS_ARTICLE: Iterable<ArticleCode> = listOf(
            ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_TARGETS.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_RESULTS.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_ALLOWCE.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_AGRWORK.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXFREE.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXBASE.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXWINS.code),
            ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_SUMMARY.code),
        )
    }
    constructor() : super(OPTIMULA_VERSION_SCM, TEST_CALCS_ARTICLE) {
        val buildSuccess = buildFactories()
        if (!buildSuccess) {
            println("Version: ${version}, build factories failed")
        }
    }

    override fun buildArticleFactory(): Boolean {
        this.articleFactory = OptimulaArticleFactory()

        return true
    }

    override fun buildConceptFactory(): Boolean {
        this.conceptFactory = OptimulaConceptFactory()

        return true
    }
}
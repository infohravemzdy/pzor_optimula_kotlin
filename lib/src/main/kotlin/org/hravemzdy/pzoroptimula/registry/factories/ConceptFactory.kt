package org.hravemzdy.pzoroptimula.registry.factories

import org.hravemzdy.procezor.registry.factories.*
import org.hravemzdy.procezor.registry.providers.IConceptSpecProvider

class OptimulaConceptFactory() : ConceptSpecFactory() {
    override val providers: Map<CODE, IConceptSpecProvider> =
        SpecFactory.buildProvidersFromAssembly("org.hravemzdy.procezor.example")
}
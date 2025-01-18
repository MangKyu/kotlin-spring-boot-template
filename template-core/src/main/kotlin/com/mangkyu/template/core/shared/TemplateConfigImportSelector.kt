package com.mangkyu.template.core.shared

import org.springframework.context.annotation.DeferredImportSelector
import org.springframework.core.type.AnnotationMetadata

internal class TemplateConfigImportSelector : DeferredImportSelector {

    override fun selectImports(metadata: AnnotationMetadata): Array<String> {
        return getValues(metadata)
            .map { v -> v.configClass.getName() }
            .toTypedArray()
    }

    private fun getValues(metadata: AnnotationMetadata): Array<TemplateConfigGroup> {
        val attributes = metadata.getAnnotationAttributes(EnableTemplateConfig::class.java.name)
            ?: return arrayOf()

        return attributes["value"] as? Array<TemplateConfigGroup>
            ?: arrayOf()
    }
}
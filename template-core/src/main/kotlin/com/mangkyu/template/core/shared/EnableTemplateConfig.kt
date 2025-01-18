package com.mangkyu.template.core.shared

import org.springframework.context.annotation.Import


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(TemplateConfigImportSelector::class)
annotation class EnableTemplateConfig(
    vararg val value: TemplateConfigGroup
)
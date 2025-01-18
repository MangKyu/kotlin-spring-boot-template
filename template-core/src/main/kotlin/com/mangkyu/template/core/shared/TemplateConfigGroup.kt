package com.mangkyu.template.core.shared

import com.mangkyu.template.core.infra.jpa.JpaConfig

enum class TemplateConfigGroup(
    val configClass: Class<out TemplateCoreConfig>
) {
    JPA(JpaConfig::class.java),

}
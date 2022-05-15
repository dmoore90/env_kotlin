package io.mattmoore.kotlin.compiler.plugins.testgenerator

import arrow.meta.CliPlugin
import arrow.meta.Meta
import arrow.meta.invoke

val Meta.sourceScanner: CliPlugin
    get() =
        "Source scanner" {
            meta(
            )
        }

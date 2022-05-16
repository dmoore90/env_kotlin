package com.main

import org.http4k.core.*
import org.http4k.core.Status.Companion.I_M_A_TEAPOT
import org.http4k.core.Status.Companion.OK
import org.http4k.filter.DebuggingFilters
import org.http4k.lens.BiDiLens
import org.http4k.lens.Query
import org.http4k.lens.nonEmptyString
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.Jetty
import org.http4k.server.asServer


fun main(args: Array<String>) {

    val filters: Filter = DebuggingFilters.PrintRequestAndResponse().then(catchAllFilter())

    val httpHandler: HttpHandler = filters.then(backendApp())

    httpHandler.asServer(Jetty(9000)).start()

}

fun catchAllFilter(): Filter {
    return Filter { nextHandler ->
        val wrapperHandler: HttpHandler = { request ->
            try {
                nextHandler(request)
            } catch ( e: Exception){
                Response(I_M_A_TEAPOT)
            }
        }
        wrapperHandler
    }
}

fun backendApp(): HttpHandler {
    val nameLens: BiDiLens<Request, String> = Query.nonEmptyString().required("name")

    return routes(
        "/" bind Method.GET to {_ ->
            Response(OK).body("hello World")
        },
        "/greetings/" bind Method.GET to {request: Request ->
            val name: String? = nameLens.extract(request)
            Response(OK).body("hello $name")
        }
    )
}
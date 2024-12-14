package org.example

import kotlinx.coroutines.delay
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger: Logger = LoggerFactory.getLogger("CoroutinesPlayground")

suspend fun bathTime() {
    logger.info("Going to the bathroom")
    delay(456456456L)
    logger.info("Bath done, exiting")
}

suspend fun main() {
    bathTime()
}

package org.openapitools.api

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class QuestsApiController() {

    @Operation(
        summary = "Retrieve a list of ongoing Quests",
        operationId = "questsActiveGet",
        description = """""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "List of ongoing Quests retrieved successfully"
            )]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/quests/active"]
    )
    fun questsActiveGet(): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieve a history of completed Quests for a courier",
        operationId = "questsHistoryGet",
        description = """""",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "List of completed Quests retrieved successfully"
            )]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/quests/history"]
    )
    fun questsHistoryGet(): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieve details of a specific Quest",
        operationId = "questsQuestIdDetailsGet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Quest details retrieved successfully"),
            ApiResponse(responseCode = "404", description = "Quest not found")]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/quests/{questId}/details"]
    )
    fun questsQuestIdDetailsGet(
        @Parameter(
            description = "ID of the Quest to retrieve details for",
            required = true
        ) @PathVariable("questId") questId: kotlin.Int
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Join a specific Quest",
        operationId = "questsQuestIdJoinPost",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Quest is joined successfully"),
            ApiResponse(responseCode = "404", description = "Quest not found"),
            ApiResponse(responseCode = "500", description = "Quest not found")]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/quests/{questId}/join"]
    )
    fun questsQuestIdJoinPost(
        @Parameter(
            description = "ID of the Quest to join",
            required = true
        ) @PathVariable("questId") questId: kotlin.Int
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}

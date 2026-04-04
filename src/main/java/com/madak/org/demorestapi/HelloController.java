package com.madak.org.demorestapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello API", description = "API for greeting messages")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Get welcome message", description = "Returns a welcome message for the API")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved welcome message"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public String hello() {
        return "🚀 Welcome to the API! Ready to explore amazing things?";
    }
}

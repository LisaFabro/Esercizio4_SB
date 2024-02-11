package com.example.demo4;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

//http://localhost:8080/swagger-ui/index.html

public class NameController {
    
    @GetMapping("/name")
    @Operation(summary = "Restituisce stringa inserita")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    public String name(@RequestParam String name){
        return name.toString();
    }
    @PostMapping("/name-change")
    @Operation(summary = "Restituisce stringa inserita al contrario")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    
    public String nameChange(@RequestParam String name){
        return new StringBuilder(name).reverse().toString();
    }
}

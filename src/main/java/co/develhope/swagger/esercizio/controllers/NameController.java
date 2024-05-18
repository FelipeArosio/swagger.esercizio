package co.develhope.swagger.esercizio.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController{

    @GetMapping("/name")
    @ApiOperation(value = "User Name", notes = "Show the user name")
    public String get() {
        return "Gabriel";
        }

    @PostMapping ("/name/reverse")
    @ApiOperation(value = "User name", notes = "Show the inverse user name")
    public String reverseName(@ApiParam(value = "User name", example = "Gabriel") @RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return reversedName.toString();
    }


}

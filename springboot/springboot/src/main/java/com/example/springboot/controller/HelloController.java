package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

//    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("log-test")
    public void logTest(){
        LOGGER.trace("Trace Log");
        LOGGER.info("info Log");
        LOGGER.debug("debug Log");
        LOGGER.warn("warn Log");
        LOGGER.error("error Log");
    }

    @PostMapping("/exception")
    public void exceptionTest() throws Exception{
        throw new Exception();
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Map<String, String>> ExceptionHandler(Exception e) {
        HttpHeaders responseHeaders
    }
}

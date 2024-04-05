package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/main")
public class mainController {

    private static final Logger logger = LoggerFactory.getLogger(mainController.class);

    @GetMapping()
    public ResponseEntity<?> identification() {
        Cat cat = new Cat();
//        cat.setName("name");
//        cat.setAge("12");

        logger.debug("======>>>>>> hello");
        logger.trace("doStuff needed more information - {}", cat);
        logger.debug("doStuff needed to debug - {}", cat);
        logger.info("doStuff took input - {}", cat);
        logger.warn("doStuff needed to warn - {}", cat);
        logger.error("doStuff encountered an error with value - {}", cat);
        System.out.println("hehe");
        return ResponseEntity.ok("Hello word");
    }
}

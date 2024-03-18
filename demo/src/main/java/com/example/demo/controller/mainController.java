package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/main")
public class mainController {
    @GetMapping()
    public ResponseEntity<?> identification() {
        return ResponseEntity.ok("Hello word");
    }
}

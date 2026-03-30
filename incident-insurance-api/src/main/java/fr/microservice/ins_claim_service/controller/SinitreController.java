package fr.microservice.ins_claim_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/sinistres")
public class SinitreController {
    @GetMapping
    public String hello() { return "Hello from Sinistre service !"; }
}

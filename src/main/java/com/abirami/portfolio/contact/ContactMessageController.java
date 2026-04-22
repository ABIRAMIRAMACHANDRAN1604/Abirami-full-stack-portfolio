package com.abirami.portfolio.contact;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactMessageController {

    private final ContactMessageService service;

    public ContactMessageController(ContactMessageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@Valid @RequestBody ContactMessageRequest request) {
        service.save(request);
        return ResponseEntity.ok("Message sent successfully. Thank you for reaching out.");
    }
}

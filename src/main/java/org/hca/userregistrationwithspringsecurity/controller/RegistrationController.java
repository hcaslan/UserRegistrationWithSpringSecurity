package org.hca.userregistrationwithspringsecurity.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.hca.userregistrationwithspringsecurity.dto.request.RegistrationRequest;
import org.hca.userregistrationwithspringsecurity.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping( "/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;
    @PostMapping
    public ResponseEntity<String> register(@RequestBody @Valid RegistrationRequest request){
        return ResponseEntity.ok(registrationService.register(request));
    }
    @GetMapping("/confirmation")
    public ResponseEntity<String> confirm(@RequestParam("token") String token) {
        return ResponseEntity.ok(registrationService.confirmToken(token));
    }
}

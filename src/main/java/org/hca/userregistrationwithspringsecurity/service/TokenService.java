package org.hca.userregistrationwithspringsecurity.service;

import lombok.AllArgsConstructor;
import org.hca.userregistrationwithspringsecurity.entity.Token;
import org.hca.userregistrationwithspringsecurity.repository.TokenRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TokenService {
    private final TokenRepository tokenRepository;
    public void saveConfirmationToken(Token token) {
        tokenRepository.save(token);
    }
    public Optional<Token> getToken(String token) {
        return tokenRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return tokenRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}

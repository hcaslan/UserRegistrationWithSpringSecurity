package org.hca.userregistrationwithspringsecurity.util.Email;

public interface EmailSender {
    void send(String to, String email);
}
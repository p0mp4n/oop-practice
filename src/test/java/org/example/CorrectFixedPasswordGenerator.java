package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGeneratorPolicy {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}

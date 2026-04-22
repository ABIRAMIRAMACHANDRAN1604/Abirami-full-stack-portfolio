package com.abirami.portfolio.contact;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContactMessageRequest(
        @NotBlank @Size(min = 3, max = 80) String name,
        @NotBlank @Email @Size(max = 120) String email,
        @NotBlank @Size(min = 4, max = 150) String subject,
        @NotBlank @Size(min = 10, max = 2000) String message
) {
}

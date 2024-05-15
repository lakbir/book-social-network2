package com.lakbir.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotNull(message = "Firstname is mandatory")
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;

    @NotNull(message = "Lastname is mandatory")
    @NotBlank(message = "Lastname is mandatory")
    private String lastname;

    @NotNull(message = "Email is mandatory")
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is not formatted")
    private String email;

    @NotNull(message = "Password is mandatory")
    @NotBlank(message = "Password is mandatory")
    @Size(min = 8, message = "Password should be 8 characters long min")
    private String password;
}

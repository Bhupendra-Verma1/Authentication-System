package com.bhupendra.authify.io;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPasswordRequest {

    @NotNull(message = "New Password is required")
    @Size(min = 6, message = "Password must be atleast 6 characters")
    private String newPassword;
    @NotNull(message = "OTP is required")
    private String otp;
    @NotNull(message = "Email is required")
    private String email;
}

package com.yasinsolak.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavePersonelRequestDto {
    String token;
    @NotBlank(message = "Ad Alanı boş olamaz.")
    @Size(min = 3, max = 50)
    String ad;
    @NotNull
    String adres;
    @NotNull
    @Email
    String email;
    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$",
            message = "password must be min 8 length containing atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
    @Size(min = 8, max = 64)
    String password;
    String telefon;
    String acildurumtelefonu;
    String acildurumkisisi;
    Long memberdate;
}

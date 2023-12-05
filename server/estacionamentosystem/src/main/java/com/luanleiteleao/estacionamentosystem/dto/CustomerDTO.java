package com.luanleiteleao.estacionamentosystem.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.Date;

@Getter
public class CustomerDTO {
    private long id;

    @NotNull(message = "Primeiro nome não deve ser nulo")
    @Max(value = 100, message = "Primeiro nome não deve ter mais de 100 cracteres")
    private String firstName;

    @NotNull(message = "Último nome não deve ser nulo")
    @Max(value = 100, message = "Último nome não deve ter mais de 100 cracteres")
    private String lastName;

    @NotNull(message = "Data de aniversário não deve ser nulo")
    private Date dateBirth;

    @NotNull(message = "Número de telefone principal de telefone não deve ser nulo")
    @Pattern(regexp = "/^\\(?\\d{2}\\)?[\\s-]?[\\s9]?\\d{4}-?\\d{4}$/gm",
            message = "Número de telefone principal inválido")
    private String mainPhoneNumber;

    @NotNull(message = "Número de telefone secundário não deve ser nulo")
    @Pattern(regexp = "/^\\(?\\d{2}\\)?[\\s-]?[\\s9]?\\d{4}-?\\d{4}$/gm",
            message = "Número de telefone secundário inválido")
    private String secondaryPhoneNumber;

    @NotNull(message = "CPF não deve ser nulo")
    @Pattern(regexp = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/", message = "CPF inválido")
    private String cpf;

    @NotNull(message = "RG não deve ser nulo")
    @Pattern(regexp = "(^\\d{1,2}).?(\\d{3}).?(\\d{3})-?(\\d{1}|X|x$)",message = "RG inválido")
    private String rg;

    @NotNull(message = "Endereço não deve ser nulo")
    @Max(value = 100, message = "Endereço não deve ter mais de 100 cracteres")
    private String address;

    public boolean isDateBirthValid() {
        Date toDay = new Date();
        return this.dateBirth.after(toDay);
    }
}

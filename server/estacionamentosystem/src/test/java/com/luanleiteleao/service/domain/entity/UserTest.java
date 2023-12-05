package com.luanleiteleao.service.domain.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public static final String FIRST_NAME = "Luan";
    public static final String SECOND_NAME = "Leite Leão";
    public static final Date DATE_BIRTH = new Date(1998, 10, 19);
    public static final String CELL_NUMBER_1 = "(61) 9 9909 - 3773";
    public static final String CPF = "860.782.775-88";
    public static final String RG = "213.132.123";
    public static final String ADDRESS = "Rua Domingo costas, centro, Anápolis, numero 213";

    @Test
//contendo informações como nome, sobrenome, data de nascimento, 2 telefones, CPF, RG e endereço.
    public void must_create_user_whit_all_arguments(){
        User user = new User(
                FIRST_NAME,
                SECOND_NAME,
                DATE_BIRTH,
                CELL_NUMBER_1,
                null,
                CPF,
                RG,
                ADDRESS
                );
    }

}
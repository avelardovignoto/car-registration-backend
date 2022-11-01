package com.api.carregistration.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Messages {

    MESSAGE_1("Carro criado com sucesso"),
    MESSAGE_2("Carro removido com sucesso");

    private final String description;

}

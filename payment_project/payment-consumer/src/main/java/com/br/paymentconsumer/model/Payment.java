package com.br.paymentconsumer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private Long cardNumber;

}

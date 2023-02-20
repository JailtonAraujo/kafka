package com.br.paymentservice.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class Payment implements Serializable {

    private long id;
    private long idUser;
    private long idProduct;
    private String cardNumber;

}

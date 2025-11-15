package com.example.banque_service.web;

import com.example.banque_service.entities.TypeTransaction;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private LocalDate date;
    private TypeTransaction type;
}

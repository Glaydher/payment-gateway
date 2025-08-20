package org.example.domain.model;

import java.util.Objects;

public class Payer {

    private final String name;
    private final String documentNumber; // CPF or CNPJ
    private final String email;

    public Payer(String name, String documentNumber, String email) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getDocumentNumber() {
        return documentNumber;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payer payer = (Payer) o;
        return Objects.equals(name, payer.name) && Objects.equals(documentNumber, payer.documentNumber) && Objects.equals(email, payer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, documentNumber, email);
    }
}

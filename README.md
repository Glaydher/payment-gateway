# Payment Gateway

Gateway de pagamentos que orquestra PIX, BOLETO e CARTÃO seguindo DDD + Hexagonal Architecture + SOLID.

## Features

- Processar pagamentos (PIX, BOLETO, CARTÃO)
- Estornar pagamentos
- Idempotência por orderId
- Anti-fraude para cartão
- Retry automático com backoff exponencial

## Arquitetura

- **Domain**: Lógica de negócio pura
- **Application**: Casos de uso
- **Infrastructure**: Adaptadores (providers, repository, etc)
- **Web**: Controllers REST

## Como usar

```bash
# Compilar
mvn clean compile

# Testes
mvn test

# Executar
mvn spring-boot:run
```

## API

**Processar pagamento:**
```bash
POST /payments
{
  "orderId": "ORDER123",
  "amount": "100.00",
  "currency": "BRL",
  "method": "PIX",
  "payer": {
    "name": "João Silva",
    "document": "12345678901",
    "email": "joao@email.com"
  }
}
```

**Estornar pagamento:**
```bash
POST /payments/ORDER123/refunds
```

## Tecnologias

- Java 21
- Spring Boot 3.5
- Maven
- JUnit 5

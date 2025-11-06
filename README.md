# Programação 3 - Laboratórios


## 🧩 Estrutura do Repositório
```bash
P3-Laboratorios/
│
├── docs/
│   ├── listas/
│   │   ├── lista1.pdf
│   │   ├── lista2.pdf
│   └── slides/
│       ├── 1. Introdução POO.pdf
│       ├── 2. Encapsulamento.pdf
│       ├── 3. Herança e Sobreposição.pdf
│       ├── 4. Polimorfismo.pdf
│       ├── 5. Exceptions.pdf
│       ├── 6. Classes Abstractas e Interfaces.pdf
│       ├── 7. Generics.pdf
│       ├── 8. Diagrama de Classes.pdf
│       └── 9. Collections.pdf
│
├── exemplos/
│   ├── Exemplo01-Override/
│   └── Exemplo02-Heranca/
│
├── exercicios/
│   ├── Lista1/
│   │   ├── 1. exercicio1
│   │   └── 2. exercicio2
│   └── Lista2/
│
└── README.md
```

## 📚 Estrutura de Projectos
Ao criar um novo projeto em Java, recomenda-se seguir uma convenção de organização que facilite a leitura, manutenção e testes dos exercícios. A estrutura sugerida é a seguinte:
## Projeto
- Nome do projeto: `Lista[n]`
    - Cada projeto representa uma lista de exercícios, e `n` indica a sequência da lista.
## Pacotes
- Nome do pacote: `exercicio[n]`
    - `n` indica o número do exercício correspondente.
    - Cada classe do exercício deve estar neste pacote.
- Nome do pacote: `main`
    - Contém o menu interativo para testar todos os exercícios da lista.
- Nome do pacote: `testes`
    - Contém classes de teste para cada exercicio
### Exemplo

```bash
Lista1/
│
├── exercicio1/
│   └── Aluno.java
├── exercicio2/
│   └──  Televisor.java
├── main/
│   └──  Main.java
└── testes
    ├── Exercicio1.java
    └── Exercicio2.java
```

## Nomenclatura
| Tipo           | Padrão             | Exemplo                             |
| -------------- | ------------------ | ----------------------------------- |
| **Pacotes**    | `lowercase`        | `main`, `entidades`                 |
| **Classes**    | `PascalCase`       | `Aluno`, `ContaBancaria`            |
| **Métodos**    | `camelCase`        | `calcularSalario()`, `getSaldo()`   |
| **Atributos**  | `camelCase`        | `nomeCompleto`, `saldo`             |
| **Constantes** | `UPPER_SNAKE_CASE` | `TAXA_JUROS`, `LIMITE_SALARIO`      |

## 🧠 Tecnologias
- Java 21
- NetBeans 27
- Java with Ant

## 👨🏽‍💻 Autor
**Emanuel dos Santos**
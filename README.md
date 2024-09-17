# Simulando um Bootcamp 

Este projeto foi desenvolvido como parte do Bootcamp da DIO para Backend com Java. O objetivo é criar uma aplicação que simula um sistema de gerenciamento de Bootcamps, onde desenvolvedores podem se inscrever, progredir em cursos e mentorias, e calcular seu total de XP.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Main**: Classe principal que contém o método [`main`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A11%2C%22character%22%3A23%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A11%2C%22character%22%3A23%7D%7D%5D%2C%22f3b11eae-3994-4e1a-9bb9-a86bcbfb0a5e%22%5D "Go to definition") para execução do programa.
- **Curso**: Representa um curso com título, descrição e carga horária.
- **Mentoria**: Representa uma mentoria com título, descrição e data.
- **Dev**: Representa um desenvolvedor que pode se inscrever em Bootcamps, progredir em cursos e mentorias, e calcular seu total de XP.
- **Bootcamp**: Representa um Bootcamp com nome, descrição, data de início e fim, e conjuntos de desenvolvedores inscritos e conteúdos.
- **Conteudo**: Classe abstrata que serve como base para [`Curso`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A34%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2Fbr%2Fcom%2Fdio%2Fdesafio%2Fdominio%2FCurso.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A2%2C%22character%22%3A13%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A34%7D%7D%5D%2C%22f3b11eae-3994-4e1a-9bb9-a86bcbfb0a5e%22%5D "Go to definition") e [`Mentoria`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A1%2C%22character%22%3A34%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2Fbr%2Fcom%2Fdio%2Fdesafio%2Fdominio%2FMentoria.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A4%2C%22character%22%3A13%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2FCynthia%2FOneDrive%2FDocumentos%2FGitHub%2FSimulacao-Bootcamp%2Fprojeto%2Fsrc%2FMain.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A1%2C%22character%22%3A34%7D%7D%5D%2C%22f3b11eae-3994-4e1a-9bb9-a86bcbfb0a5e%22%5D "Go to definition"), contendo título, descrição e método abstrato para calcular XP.

## Funcionalidades

- **Inscrição em Bootcamp**: Desenvolvedores podem se inscrever em um Bootcamp e automaticamente se inscrever em todos os conteúdos do Bootcamp.
- **Progresso**: Desenvolvedores podem progredir em cursos e mentorias, movendo-os dos conteúdos inscritos para os conteúdos concluídos.
- **Cálculo de XP**: Desenvolvedores podem calcular o total de XP acumulado com base nos conteúdos concluídos.

## Como Executar

1. Clone o repositório:
    ```sh
    git clone https://github.com/jm-236/Simulacao-Bootcamp.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd <DIRETORIO_DO_PROJETO>
    ```
3. Compile o projeto:
    ```sh
    javac -d bin src/**/*.java
    ```
4. Execute o projeto:
    ```sh
    java -cp bin Main
    ```

## Exemplo de Saída

Ao executar o projeto, a saída será similar a:

```
Total XP Dev 1: 0.0
Total XP Dev 2: 0.0
Total XP Dev 1 após progredir: 10.0
Total XP Dev 2 após progredir: 10.0
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.

---

Desenvolvido durante o Bootcamp da DIO para Backend com Java.

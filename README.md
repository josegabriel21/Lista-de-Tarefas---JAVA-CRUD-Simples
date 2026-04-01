Gerenciador de Tarefas em Java: Desenvolvimento de um CRUD em Console
Este projeto foi desenvolvido como parte dos meus estudos no curso de Análise e Desenvolvimento de Sistemas (ADS). O objetivo principal foi colocar em prática conceitos fundamentais de lógica de programação e manipulação de dados em memória utilizando a linguagem Java.

Sobre o Projeto
O sistema consiste em um gerenciador de tarefas que opera via terminal. Ele permite ao usuário realizar as quatro operações básicas de manipulação de dados, conhecidas na área de desenvolvimento como CRUD:

C (Create): Adição de novas tarefas à lista.

R (Read): Listagem de todas as tarefas cadastradas com seus respectivos índices.

U (Update): Edição de uma tarefa existente através do seu número de identificação.

D (Delete): Remoção de tarefas específicas.

Evolução Técnica e Aprendizados
Durante a construção deste código, enfrentei e resolvi desafios que são comuns no dia a dia de um desenvolvedor back-end:

Manipulação de Estruturas de Dados: Utilizei a classe ArrayList para gerenciar as tarefas, compreendendo como os métodos add, remove, get e set operam sobre os índices da lista.

Gerenciamento de Fluxo e Escopo: Um dos maiores aprendizados foi entender a hierarquia das chaves no Java. Corrigir bugs de aninhamento de condicionais (if/else) foi essencial para garantir que cada opção do menu funcionasse de forma independente.

Tratamento de Entrada de Dados: Implementei a limpeza do buffer do Scanner para evitar erros de leitura entre dados numéricos e textuais, além de padronizar as entradas para facilitar as buscas e remoções.

Validação de Limites: Desenvolvi lógicas de segurança para garantir que o sistema não tente acessar ou editar posições inexistentes na memória, evitando interrupções inesperadas no programa.

Tecnologias Utilizadas
Linguagem: Java.

Ferramentas: Java Standard Library (Scanner e ArrayList).

Ambiente: Console/Terminal.

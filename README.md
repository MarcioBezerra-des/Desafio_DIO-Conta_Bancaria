# **Projeto `ContaTerminal` - Desafio de Projeto DIO**
### **📖 Sobre**
Este projeto é a resolução do desafio "Simulando uma Conta Bancária Através do Terminal/Console", proposto por Gleyson Sampaio como parte do bootcamp de Java da **`Formação Java Developer`** na plataforma Digital Innovation One (DIO).

O objetivo era criar um programa simples em Java que simulasse a criação de uma conta bancária, recebendo dados do usuário via terminal e, ao final, exibindo uma mensagem com as informações da conta recém-criada. O projeto visa reforçar os conhecimentos fundamentais da sintaxe Java, como declaração de variáveis, tipos de dados, e a interação com o usuário através da classe **`Scanner`**.
#
### **🚀 Funcionalidades**
* **Entrada de Dados Interativa**: O programa solicita ao usuário que insira o número da conta, agência, nome do cliente e saldo inicial.
* **Criação de Objeto**: Os dados fornecidos são utilizados para instanciar um objeto do tipo **`ContaTerminal`**.
* **Validação de Dados**: O construtor da classe **`ContaTerminal`** valida as entradas para garantir que os dados sejam coerentes (ex: número da conta positivo, campos de texto não vazios).
* **Tratamento de Erros**: O sistema está preparado para lidar com entradas inválidas (ex: digitar texto em um campo numérico) e exibe mensagens de erro amigáveis, sem quebrar a execução.
* **Exibição Formatada**: Ao final, uma mensagem de boas-vindas é exibida, contendo todos os dados da conta de forma clara e organizada.
#
### **🛠️ Tecnologias Utilizadas**
* **Linguagem**: Java 17 (ou superior)
* **IDE**: O desenvolvimento pode ser feito em qualquer IDE que suporte Java, como Eclipse, IntelliJ IDEA ou VS Code.
* **Ferramenta de Execução**: Linha de comando padrão (javac, java)
#
### **📁 Estrutura do Projeto**
O projeto é composto por dois arquivos principais:
* **`ContaTerminal.java`**: A classe que representa a entidade "Conta Bancária". Ela contém os atributos (numero, agencia, nomeCliente, saldo), o construtor para inicializar o objeto com validações, e os métodos getters/setters.
* **`Main.java`**: A classe que contém o método `main`, responsável por ser o ponto de entrada do programa. É aqui que a interação com o usuário acontece, os dados são coletados e o objeto ContaTerminal é criado e exibido.
# 
### 🎓 Conceitos Praticados no Projeto
Este desafio permitiu a prática e a solidificação de vários conceitos essenciais em Java:
* **Programação Orientada a Objetos (POO)**: A criação da classe **`ContaTerminal`** para modelar um objeto do mundo real.
* **Encapsulamento**: Uso de atributos **`private`** e métodos **`public`** (getters) para proteger e controlar o acesso aos dados do objeto.
* **Construtores**: Implementação de um construtor para garantir que um objeto **`ContaTerminal`** seja criado em um estado válido e consistente.
* **Validação de Dados e Lançamento de Exceções**: Uso de **`if`** para verificar os argumentos no construtor e **`throw new IllegalArgumentException`** para sinalizar dados inválidos.
* **Tratamento de Exceções**: Utilização do bloco **`try-catch-finally`** na classe **`Main`** para capturar possíveis erros (como dados de entrada em formato incorreto) e garantir que o programa termine de forma elegante.
* **Classe `Scanner`**: Utilização da classe **`java.util.Scanner`** para capturar a entrada de dados do usuário no console.
* **Sobrescrita de Métodos (`@Override`)**: A implementação do método **`toString()`** na classe **`ContaTerminal`** para fornecer uma representação textual e legível do objeto.
#
### 👨‍🏫 Agradecimentos
Agradeço ao professor Gleyson Sampaio e à Digital Innovation One pela oportunidade de desenvolver este projeto e fortalecer minhas habilidades em Java.

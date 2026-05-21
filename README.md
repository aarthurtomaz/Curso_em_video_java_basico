# Curso de Java Básico — Curso em Vídeo

Este repositório reúne o conjunto de soluções algorítmicas, exercícios práticos e projetos construídos ao longo do treinamento de **Java Básico** ministrado pelo professor Gustavo Guanabara no portal Curso em Vídeo. O conteúdo abrange desde os fundamentos mais elementares de lógica de programação até a manipulação de estruturas de dados lineares e o desenvolvimento de interfaces gráficas interativas utilizando a tecnologia Java Swing.

---

## 🧭 Organização do Repositório

O repositório está subdividido em pastas autônomas, cada uma correspondente a um projeto prático desenvolvido ao longo do curso. Cada diretório contém seu próprio arquivo de código-fonte e documentação técnica detalhada explicativa.

1. **(./01_ola_mundo/)**
   - Introdução à compilação Java, arquitetura da JVM e criação de uma interface gráfica inicial para exibição de texto em resposta a eventos de botões.
2. **[Calculadora de Idade](./02_calculadora_idade/)**
   - Entrada e manipulação de variáveis, coerção de tipos de dados (casting) e utilização da API de data e hora do Java para o cálculo de idade relativo ao ano corrente.
3. **(./03_super_calculadora/)**
   - Aplicação de operadores matemáticos complexos e uso da classe `Math` para calcular raízes cúbicas, potências, valores absolutos e restos de divisão.
4. **[Jogo da Adivinhação](./04_jogo_adivinhacao/)**
   - Uso de desvios condicionais encadeados aliado à geração de números pseudoaleatórios para criar um leitor de pensamento virtual.
5. **(./05_equacao_segundo_grau/)**
   - Resolução matemática de equações quadráticas calculando o discriminante (Delta) e determinando raízes reais por meio da fórmula de Bhaskara.
6. **(./06_projeto_triangulo/)**
   - Implementação de regras matemáticas de existência de triângulos combinando operadores de comparação de intervalos lógicos e interface visual avançada de sliders.
7. **(./07_vetor_swing/)**
   - Manipulação de estruturas de dados homogêneas (arrays) de forma dinâmica, incluindo adição, remoção e ordenação por meio de controle de estado em listas visuais.
8. **[Função Fatorial](./08_funcao_fatorial/)**
   - Implementação de métodos estáticos com passagem de parâmetros e escopo isolado para o cálculo e rastreamento recursivo ou iterativo de fatoriais.

---

## 💻 Requisitos do Sistema

Para compilar e executar qualquer um dos projetos presentes neste repositório, certifique-se de cumprir os seguintes requisitos mínimos de software:

- **Java Development Kit (JDK):** Versão 11 ou superior (recomenda-se a versão LTS mais recente, como o Java 17 ou 21).
- **IDE Recomendada:** Apache NetBeans (para edição visual das interfaces Swing), IntelliJ IDEA ou Visual Studio Code (com o pacote de extensões para Java).
- **Git:** Para clonar e gerenciar o repositório localmente.

---

## 🚀 Como Executar os Projetos

### Método via Linha de Comando (Terminal)

1. Clone este repositório para o seu ambiente local:
   ```bash
   git clone [https://github.com/aarthurtomaz/Curso_em_video_java_basico.git](https://github.com/aarthurtomaz/Curso_em_video_java_basico.git)
   ```

2. Navegue até o diretório do projeto desejado:
   ```bash
   cd Curso_em_video_java_basico/01_ola_mundo
   ```

3. Compile todas as classes Java presentes no projeto:
   ```bash
   javac src/*.java -d bin/
   ```

4. Execute o arquivo compilado gerado (supondo que a classe principal com o método `main` seja `Principal`):
   ```bash
   java -cp bin Principal
   ```

### Método via IDE (NetBeans / IntelliJ / VS Code)

1. Abra a sua IDE de preferência.
2. Importe a pasta raiz do repositório ou o projeto específico.
3. Certifique-se de que a IDE identificou a estrutura de diretórios `src/` como pastas de código-fonte.
4. Localize a classe principal que possui a assinatura `public static void main(String args)`.
5. Clique com o botão direito sobre ela e selecione **Run File** ou clique no botão de reprodução verde (*Run*).

---

## 🎓 Sobre o Curso em Vídeo

O **Curso em Vídeo** é uma plataforma educacional brasileira dedicada a oferecer cursos gratuitos de alta qualidade nas áreas de tecnologia e desenvolvimento de software. Criado pelo professor Gustavo Guanabara, o projeto já contribuiu para a formação de milhares de programadores no Brasil, destacando-se pela excelente didática, rigor técnico e material de apoio acessível.

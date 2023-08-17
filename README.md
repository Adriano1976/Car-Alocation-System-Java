# Sistema de Controle de Locação de Carro

Uma grande rede de aluguéis de veículos contratou a fábrica de software em que você trabalha para criar um software em Java orientado à objetos que faça a gestão de seus veículos para os clientes.

O processo de desenvolvimento já se iniciou e o analista de sistema já modelou parte do processo de locação, criando o diagrama de classe abaixo:

<p align="center">
  <img src="https://github.com/Adriano1976/Car-Alocation-System-Java/assets/17755195/4c7da08c-d8e4-435c-a3a6-e09a678a30c9" alt="Imagem">
</p>

## Além do diagrama de classe, o analista ainda mandou o documento de requisitos contendo as seguinte regras
- O método de cadastrar usuário deve ler as informações através do JOptionPane
- O método mostrar dados do usuário deve preprar uma string e retornar como saída do método
- O mesmo comportamento dos métodos de usuário devem ser contemplados em Carro
- O método iniciar aluguel deve chamar o método cadastrarUsuario e cadastrarCarro do objeto relacionado a aluguel
- O método iniciar aluguel deve pedir também o kmInicial do veiculo 
- O método fechar locacao deve ler a informação de kmFinal.
    - Para calcular a locação deve-se calcular a quantidad de dias locados * valor por km. Além disso se o carro ficou alugado por mais de 10 dias, deve-se dar desconto de 10% e se ficou mais de 20 dias deve-se dar um desconto de 20%. O valor final deve ser armazenado no atributo valorTotalAluguel
- O método mostrarResumoLocacao deve mostrar as informacoes de cliente, carro, e do aluguel através do JOptionPane, no final ficará assim:

Resumo Aluguel<br/>
Cliente<br/>
Nome: Rogério<br/>
CPF: 123.123.123-11<br/>
Telefone: (11)1111-11111<br/>
Carro<br/>
Modelo: HB20<br/>
Marca: Hyundai<br/>
Valor por Km: 5.0<br/>
Aluguel<br/>
Quantidade de dias: 1<br/>
Km Inicial: 100<br/>
Km Final: 200<br/>
Valor Total: R$500,00<br/>

## Explicação da Classe Cliente

Esse código Java cria uma classe chamada "Cliente" que é usada para representar informações sobre um cliente em um sistema de alocação. Aqui está uma explicação simples sobre o código:

1. **Declaração de Pacote e Importação:**
   - O código começa com a declaração do pacote "alocationsystem", que é usado para organizar as classes em grupos relacionados.
   - Em seguida, importa-se a classe "JOptionPane" do pacote "javax.swing", que é utilizada para exibir caixas de diálogo simples de entrada e saída.

2. **Declaração da Classe Cliente:**
   - A classe "Cliente" é declarada com quatro atributos privados: id, nome, cpf e telefone.
   - Esses atributos representam as informações do cliente, como identificação, nome, CPF e telefone.
   
3. **Construtor Padrão:**
   - É definido um construtor vazio (sem parâmetros) para a classe Cliente.

4. **Métodos Getters e Setters:**
   - São criados métodos "getter" para acessar os valores dos atributos (getId, getNome, getCpf, getTelefone).
   - Também são criados métodos "setter" para modificar os valores dos atributos (setId, setNome, setCpf, setTelefone).
   - Esses métodos permitem o acesso controlado aos atributos da classe.

5. **Método cadastrarUsuario:**
   - O método "cadastrarUsuario" utiliza a classe JOptionPane para exibir caixas de diálogo onde o usuário pode inserir o nome, CPF e telefone.
   - Os valores inseridos pelo usuário são armazenados nos atributos da classe.

6. **Método mostrarDadosUsuario:**
   - O método "mostrarDadosUsuario" constrói uma string contendo os dados do cliente (nome, CPF e telefone) formatados.
   - Essa string é retornada pelo método.

O código cria uma estrutura para representar informações de clientes e permite que os usuários cadastrem e visualizem os dados dos clientes usando as funções de entrada e saída do JOptionPane. É uma maneira básica de interagir com os dados dos clientes em um sistema de alocação.

## Explicação da Classe Carro

Esse código Java define uma classe chamada "Carro" que representa um carro com algumas propriedades, métodos e interações com o usuário. Vou explicar de forma simples como o código funciona:

1. **Definição da Classe Carro**: O código começa com a declaração da classe `Carro`.

2. **Atributos**: Dentro da classe, são declarados quatro atributos privados:
   - `id`: um número inteiro que identifica o carro.
   - `modelo`: uma string que guarda o modelo do carro.
   - `marca`: uma string que guarda a marca do carro.
   - `valorPorKm`: um número decimal que guarda o valor por quilômetro do carro.

3. **Construtor**: É definido um construtor vazio `Carro()`, que não recebe argumentos e não faz nada.

4. **Métodos Getters e Setters**: São criados métodos para acessar e modificar os valores dos atributos (`getId()`, `setId()`, `getModelo()`, `setModelo()`, `getMarca()`, `setMarca()`, `getValorPorKm()`, `setValorPorKm()`). Esses métodos permitem a leitura e alteração controlada dos atributos da classe.

5. **Método cadastrarCarro()**: Este método solicita ao usuário informações sobre o carro usando caixas de diálogo (`JOptionPane`) e atribui esses valores aos atributos do carro. Ele pede o modelo, marca e valor por quilômetro, convertendo a entrada para o formato adequado (números decimais).

6. **Método mostrarDadosCarro()**: Esse método cria uma string que contém os detalhes do carro (modelo, marca e valor por quilômetro) e a retorna.

O motivo pelo qual esse código foi criado é para representar um carro com suas informações relevantes (modelo, marca e valor por quilômetro) de forma organizada e permitir interações com o usuário para cadastrar e exibir os detalhes do carro.

Ele utiliza a classe `JOptionPane` para exibir caixas de diálogo de entrada para o usuário e retornar as informações inseridas. Esse padrão é comum em programas de interface gráfica (GUI) onde o usuário interage com o programa por meio de janelas e caixas de diálogo.

## Explicação da Classe Aluguel

Esse código em Java cria uma classe chamada "Aluguel" que representa um sistema de aluguel de carros. Aqui está uma explicação simples de como o código funciona:

1. **Declaração das Variáveis:**
   - A classe "Aluguel" possui várias variáveis de instância (ou propriedades) como `id`, `usuario`, `carro`, `quantidadeDias`, `kmInicial`, `kmFinal` e `valorTotalAluguel`.
   - Essas variáveis são usadas para armazenar informações relacionadas a um aluguel específico, como o cliente, o carro alugado, a duração do aluguel, os quilômetros percorridos, etc.

2. **Construtor:**
   - O construtor vazio (`public Aluguel()`) não faz nada além de inicializar a classe.

3. **Métodos de Configuração (Setters) e Acesso (Getters):**
   - Há métodos para configurar (setter) e acessar (getter) cada uma das variáveis de instância. Por exemplo, `setUsuario`, `getQuantidadeDias`, etc.
   - Esses métodos permitem que outras partes do programa atribuam valores às variáveis e obtenham esses valores posteriormente.

4. **Método `iniciarAluguel`:**
   - Esse método é responsável por iniciar o processo de aluguel.
   - Ele cria um novo objeto `Cliente` e chama o método `cadastrarUsuario` desse objeto para coletar informações sobre o cliente.
   - Também cria um novo objeto `Carro` e chama o método `cadastrarCarro` para coletar informações sobre o carro.

5. **Método `fecharLocacao`:**
   - Esse método é usado para finalizar o processo de aluguel, onde são coletadas informações sobre o término do aluguel.
   - Solicita ao usuário que insira o quilômetro final do carro alugado.
   - Calcula o valor total do aluguel com base na duração do aluguel, nos quilômetros percorridos e no valor por quilômetro do carro.
   - Aplica descontos percentuais dependendo da duração do aluguel (20% para mais de 20 dias, 10% para mais de 10 dias).

6. **Método `mostrarResumoLocacao`:**
   - Esse método exibe um resumo das informações do aluguel usando a caixa de diálogo do `JOptionPane`.
   - Inclui detalhes do cliente, do carro e das informações de aluguel, como duração, quilômetros percorridos, etc.

Esse código cria uma estrutura básica para gerenciar o processo de aluguel de carros, armazenando informações relevantes e calculando o valor total do aluguel com base nos critérios definidos.

## Explicação da Classe Principal Main

O código Java está organizado em uma classe chamada `Main`. Vou explicar o que ele faz de forma simples:

1. Primeiro, o programa importa um pacote chamado `alocationsystem`. Isso significa que ele está usando classes de um lugar específico no código.
2. A seguir, ele define uma classe chamada `Main`, que é o ponto de entrada do programa.
3. Dentro da classe `Main`, há um método chamado `main`. Esse é o método que é executado quando o programa é iniciado.
4. Dentro do método `main`, três ações são realizadas:

   a) Uma instância (cópia) da classe `Aluguel` é criada e armazenada na variável `aluguel`. Isso é feito com o comando `new Aluguel();`. Isso permite que o programa use os métodos e propriedades definidos na classe `Aluguel`.
   
   b) O método `iniciarAluguel()` é chamado na instância de `Aluguel` criada anteriormente. Isso provavelmente inicia algum tipo de processo de aluguel.
   
   c) O método `fecharLocacao()` é chamado na mesma instância de `Aluguel`. Isso provavelmente encerra o processo de aluguel.
   
   d) O método `mostrarResumoLocacao()` é chamado na mesma instância de `Aluguel`. Isso provavelmente exibe um resumo das informações da locação.

O código realiza essas ações na ordem em que elas estão escritas. Ele cria uma instância de `Aluguel`, inicia a locação, fecha a locação e, por fim, mostra um resumo da locação.

A razão pela qual isso é feito em um programa pode variar dependendo do contexto. Pode ser um sistema de gerenciamento de locações onde essas ações são etapas comuns do processo de aluguel. O uso de classes e métodos permite que o código seja organizado, reutilizável e fácil de entender, pois separa as diferentes ações em partes distintas do programa.




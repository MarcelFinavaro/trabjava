CALCULADORA DE DESCONTO

Explicação do Código:
Importação da Classe Scanner: A classe Scanner é importada para permitir a leitura de dados do usuário.

Método main: Este é o ponto de entrada do programa.

Leitura dos Dados:

O programa solicita que o usuário insira o valor do produto e a porcentagem de desconto.
Os valores são lidos utilizando scanner.nextDouble().
Cálculos:

O valor do desconto é calculado multiplicando o valor do produto pela porcentagem de desconto (dividida por 100).
O preço final é obtido subtraindo o valor do desconto do valor original do produto.
Exibição dos Resultados: Os resultados (valor do desconto e preço final) são exibidos formatados para duas casas decimais.

Fechamento do Scanner: O scanner é fechado para evitar vazamentos de recursos.

****************************************

CALCULADORA ITBI

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Leitura dos Dados:

O programa utiliza JOptionPane.showInputDialog para solicitar ao usuário que insira o valor de transação do imóvel, o valor venal e a porcentagem do imposto ITBI.
Os valores inseridos são convertidos de String para double usando Double.parseDouble().
Cálculo do Maior Valor: A função Math.max() é utilizada para determinar o maior valor entre o valor de transação e o valor venal.

Cálculo do Imposto ITBI: O imposto é calculado multiplicando a porcentagem do ITBI (dividida por 100) pelo maior valor.

Exibição do Resultado: O resultado é exibido em uma caixa de diálogo usando JOptionPane.showMessageDialog, formatando o valor para duas casas decimais.

*****************************************

SISTEMA AVALIATIVO

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Leitura das Notas:

O programa utiliza JOptionPane.showInputDialog para solicitar ao usuário que insira as notas da primeira prova, da segunda prova e do trabalho.
As notas inseridas são convertidas de String para double usando Double.parseDouble().
Cálculo da Média: A média é calculada somando as notas e dividindo por 3.

Verificação do Resultado: Um if é usado para verificar se a média é maior ou igual a 6. Se sim, o aluno é considerado "Aprovado"; caso contrário, "Reprovado".

Exibição do Resultado: O resultado é exibido em uma caixa de diálogo usando JOptionPane.showMessageDialog, formatando a média para duas casas decimais.

*****************************************

CALCULADORA APOSENTADORIA

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Leitura dos Dados:

O programa solicita a idade, o sexo e os anos de contribuição do usuário usando JOptionPane.showInputDialog.
Os valores são convertidos de String para int usando Integer.parseInt() e o sexo é convertido para maiúsculas para facilitar a comparação.
Regras de Aposentadoria: As variáveis que armazenam as regras de aposentadoria são definidas.

Verificação da Aposentadoria:

O código verifica se a pessoa pode se aposentar com base na idade e nos anos de contribuição.
Se não puder se aposentar, calcula quantos anos faltam para a aposentadoria, considerando tanto a idade quanto os anos de contribuição.
Exibição do Resultado: O resultado é exibido em uma caixa de diálogo usando JOptionPane.showMessageDialog.

****************************************

CIRCUITO RESISTENCIA

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Leitura dos Valores das Resistências:

O programa solicita ao usuário que insira os valores de quatro resistências (R1, R2, R3 e R4) usando JOptionPane.showInputDialog.
Os valores inseridos são convertidos de String para double usando Double.parseDouble().
Cálculo da Resistência Equivalente: A resistência equivalente em série é calculada somando todos os valores das resistências.

Encontrar a Maior e a Menor Resistência:

A maior resistência é encontrada usando Math.max() em uma série de comparações.
A menor resistência é encontrada usando Math.min() em uma série de comparações.
Exibição dos Resultados: Os resultados são formatados e exibidos em uma caixa de diálogo usando JOptionPane.showMessageDialog, mostrando a resistência equivalente, a maior resistência e a menor resistência, com duas casas decimais.

*****************************************

SISTEMA LOGIN

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Credenciais Corretas: As credenciais corretas (login e senha) são definidas como "java8".

Contador de Tentativas: Uma variável tentativas é inicializada com o valor 3 para contar quantas tentativas o usuário ainda tem.

Loop de Tentativas: Um loop while é usado para permitir até 3 tentativas:

O programa solicita ao usuário que insira o login e a senha.
As credenciais inseridas são comparadas com as credenciais corretas.
Se as credenciais estiverem corretas, uma mensagem de sucesso é exibida e o programa termina.
Se as credenciais estiverem incorretas, o contador de tentativas é decrementado e uma mensagem informativa é exibida. Se o usuário não tiver mais tentativas, uma mensagem de acesso negado é exibida.

*****************************************

GERADOR TABUADA

Explicação do Código:
Importação do JOptionPane: A classe JOptionPane é importada para permitir a entrada e saída de dados em janelas pop-up.

Método main: Este é o ponto de entrada do programa.

Solicitação do Número:

O programa solicita ao usuário que digite um número usando JOptionPane.showInputDialog.
O número digitado é convertido de String para int usando Integer.parseInt().
Geração da Tabuada:

Um StringBuilder é utilizado para construir a string que conterá a tabuada.
Um loop for é utilizado para multiplicar o número pelo contador i, que varia de 1 a 10.
O resultado de cada multiplicação é adicionado ao StringBuilder.
Exibição da Tabuada:

Após o loop, a tabuada é exibida em uma caixa de diálogo usando JOptionPane.showMessageDialog.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Aula 1: Estrutura Condicional If, else e else If:
         * 
         * System.out.println("Hello, World!");
         * var scanner = new Scanner(System.in);
         * System.out.println("Informe seu nome: ");
         * var name = scanner.next();
         * System.out.println("Informe sua idade: ");
         * var age = scanner.nextInt();
         * System.out.println("Você é emancipado? (s/n)");
         * var isEmancipated = scanner.next().equalsIgnoreCase("s");
         * 
         * if (age >=18) {
         * System.out.printf("%s tem %s anos, você pode dirigir \n", name, age);
         * } else if (age >=16 && isEmancipated ){
         * System.out.
         * printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir. \n"
         * , name, age);
         * }else {
         * System.out.printf("%s, você não pode dirigir. \n", name);
         * }
         * 
         * Cenários diferentes possiveis
         * 
         * Cenario 1:
         * var canDrive = (age >= 18) || (age >= 16 && is Emancipated);
         * var messagge = "";
         * if (canDrive){
         * message = name + ", você pode dirigir \n";
         * } else {
         * message = name + ", você não pode dirigir \n";
         * }
         * 
         * System.out.println(message);
         * 
         * Ao invés da mensagem variar de acordo com as condicionais, a verificação está
         * na variável canDrive e a mensagem na variavel message. Dai a condicional
         * verifica se a variável canDrive eh verdadeira ou falsa para determinar qual
         * mensagem enviar.
         * 
         * 
         * Cenario 2 (Elvis Operator):
         * var canDrive = (age >= 18) || (age >= 16 && is Emancipated);
         * var messagge = canDrive ?
         * name + ", você pode dirigir \n" :
         * name + ", você não pode dirigir \n";
         * }
         * 
         * System.out.println(message);
         */

        /*
         * Aula 2: Estrutura Condicional switch Case
         * 
         * Caso 1:
         * var scanner = new Scanner(System.in);
         * System.out.println("Informe um número de 1 até 7");
         * var option = scanner.nextInt();
         * switch (option){
         * case 1:
         * System.out.println("Domingo");
         * break;
         * case 2:
         * System.out.println("Segunda-Feira");
         * break;
         * case 3:
         * System.out.println("Terça-Feira");
         * break;
         * case 4:
         * System.out.println("Quarta-Feira");
         * break;
         * case 5:
         * System.out.println("Quinta-Feira");
         * break;
         * case 6:
         * System.out.println("Sexta-feira");
         * break;
         * case 7:
         * System.out.println("Sábado");
         * break;
         * default:
         * System.out.println("Opção inválida.");
         * break;
         * 
         * Caso 2:
         * var scanner = new Scanner(System.in);
         * System.out.println("Informe um número de 1 até 7");
         * var option = scanner.nextInt();
         * switch (option){
         * case 1,7 -> System.out.println("Final de Semana");
         * case 2 -> System.out.println("Segunda-Feira");
         * case 3 -> System.out.println("Terça-Feira");
         * case 4 -> System.out.println("Quarta-Feira");
         * case 5 -> System.out.println("Quinta-Feira");
         * case 6 -> System.out.println("Sexta-Feira");
         * default -> System.out.println("Opção Inválida.");
         * }
         * Caso 3:
         * var scanner = new Scanner(System.in);
         * System.out.println("Informe um número de 1 até 7");
         * var option = scanner.nextInt();
         * var message = switch (option){
         * case 1, 7 -> {
         * var day = option == 1 ? "Domingo" : "Sábado";
         * yield String.format("Hoje é %s, fim de semana.", day);
         * }
         * case 2 -> "Segunda-Feira";
         * case 3 -> "Terça-Feira";
         * case 4 -> "Quarta-Feira";
         * case 5 -> "Quinta-Feira";
         * case 6 -> "Sexta-Feira";
         * default -> "Opção Inválida.";
         * };
         * System.out.println(message);
         * 
         * Aula 3: Estrutura de Repetição FOR
         * 
         * 
         * Caso 1(Apresentação da estrutura sem determinar condicionais):
         * var scanner = new Scanner(System.in);
         * for(;;){
         * System.out.println("Digite um nome:");
         * var name = scanner.next();
         * 
         * if (name.equalsIgnoreCase("exit")) break;
         * 
         * System.out.println(name);
         * }
         * 
         * Caso 2 (1 a 99 com condicional de break e output):
         * var scanner = new Scanner(System.in);
         * for(var i = 1; i <= 100;i ++){
         * if (i == 12) {
         * System.out.println("Fim da execução");
         * break;
         * }
         * System.out.println(i);
         * }
         * 
         * Caso 3 (Só pares):
         * var scanner = new Scanner(System.in);
         * for(var i = 0; i <= 100;i +=2){
         * System.out.println(i);
         * }
         * 
         * Caso 3 (Só pares):
         * var scanner = new Scanner(System.in);
         * for(var i = 200; i = 0;i +=2){
         * System.out.println(i);
         * }
         * 
         * Caso 4 (Regredindo [-=2 para regredir de 2 em 2])
         * var scanner = new Scanner(System.in);
         * for(var i = 200; i >= 0;i --){
         * System.out.println(i);
         * }
         * 
         * Caso 5 (Imprimindo todos os numeros utilizando operador de módulo)
         * var scanner = new Scanner(System.in);
         * for(var i = 0; i <= 100;i ++){
         * if (i % 2 ==0){
         * continue;
         * }
         * System.out.println(i);
         * }
         * 
         * Caso 6 (Trabalha com os elementos listado em args):
         * var scanner = new Scanner(System.in);
         * for(var i = 0; i < args.length;i ++){
         * System.out.println(args[i]);
         * }
         * 
         * Caso 7 (Trabalha com os elementos listado em args com indíces):
         * var scanner = new Scanner(System.in);
         * for(var i = 0; i < args.length;i ++){
         * System.out.println((i + 1) + " - " + args[i]);
         * }
         * 
         * Estrutura de repetição While e do While
         * 
         * Caso 1 (Printar os nomes informados até que o nome "exit" seja escrito.)
         * 
         * var scanner = new Scanner(System.in);
         * var name = "";
         * while(!name.equals("exit")){
         * System.out.println("Informe um nome");
         * name = scanner.next();
         * System.out.println(name);
         * }
         * 
         * 
         * Caso 2 (Utilizando booleana para continuar a repetição)
         * 
         * var scanner = new Scanner(System.in);
         * var name = "";
         * while(true){
         * System.out.println("Informe um nome");
         * name = scanner.next();
         * System.out.println(name);
         * 
         * if (name.equalsIgnoreCase("exit")) break;
         * }
         * 
         * Caso 3 (Do/While)
         * Diferneça com o while: ele executa primeiro o código antes de verificar se a
         * condição é atendida. Dá a garantia que o código
         * rodará ao menos uma vez.
         * 
         * var scanner = new Scanner(System.in);
         * var name = "";
         * do {
         * System.out.println("Informe um nome");
         * name = scanner.next();
         * System.out.println(name);
         * 
         * if (name.equalsIgnoreCase("exit")) break;
         * } while (true);
         * 
         * (Ele roda o codigo no do primeiro e no fim verifica se a condição IgnoreCase
         * está adentedida)
         * 
         * Caso 3.1
         * 
         * var scanner = new Scanner(System.in);
         * var name = "exit";
         * while (!name.equalsIgnoreCase("exit")) {
         * System.out.println("Informe um nome");
         * name = scanner.next();
         * System.out.println(name);
         * }
         * 
         * (Nessa circunstância o while nao vai nem rodar porque o nome já é exit.)
         * 
         * Caso 4 (While com interações em cima do ARGS):
         * 
         * var i = 0;
         * while (args.length > i) {
         * System.out.println(args[i]);
         * i++;
         * }
         * 
         * Caso 4.1 (DO/WHILE com interações em cima do ARGS):
         * 
         * var i = 0;
         * do {
         * System.out.println(args[i]);
         * i++;
         * } while(args.length > i);
         * 
         * 
         * Exercícios
         * 
         * Exercício 1:
         * Escreva um código onde o usuário entra com um número e seja gerada a tabuada
         * de 1 até 10 desse número;
         * 
         * var scanner = new Scanner(System.in);
         * System.out.println("Tábuada do 10! \n"+"Digite um número:");
         * var numero = scanner.nextInt();
         * System.out.printf("A tabuada do %s é:\n", numero);
         * 
         * for (var i = 1; i <= 10; i++ ){
         * var resultado = numero*i;
         * System.out.printf("%s x %s = %s\n", numero, i, resultado);
         * }
         * 
         * Exercício 2:
         * Escreva um código onde o usuário entra com sua altura e peso, seja feito o
         * calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de
         * acordo com o resultado:
         * 
         * Se for menor ou igual a 18,5 "Abaixo do peso";
         * Se for entre 18,6 e 24,9 "Peso ideal";
         * Se for entre 25,0 e 29,9 "Levemente acima do peso";
         * Se for entre 30,0 e 34,9 "Obesidade Grau I";
         * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
         * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
         * 
         * 
         * var scanner = new Scanner(System.in);
         * System.out.println("Calculador de IMC\n"+"Digite sua altura:");
         * var altura = scanner.nextFloat();
         * System.out.println("Digite seu peso:");
         * var peso = scanner.nextFloat();
         * 
         * var imc = (peso/(altura*altura));
         * //System.out.printf("Seu IMC é %.1f ", imc);
         * 
         * if (imc <= 18.5){
         * System.out.printf("Seu IMC é %.1f \nVocê está abaixo do peso!", imc);
         * } else if (imc <= 24.9){
         * System.out.printf("Seu IMC é %.1f \nSeu peso está ideal!", imc);
         * } else if (imc <= 29.9){
         * System.out.printf("Seu IMC é %.1f \nVocê está levemente acima do peso!",
         * imc);
         * } else if (imc <= 34.9) {
         * System.out.printf("Seu IMC é %.1f \nVocê está com Obesidade Grau I!", imc);
         * } else if (imc <= 39.9) {
         * System.out.
         * printf("Seu IMC é %.1f \nVocê está com Obesidade Grau II! (Severa)", imc);
         * } else {
         * System.out.
         * printf("Seu IMC é %.1f \nVocê está com Obesidade Grau III! (Mórbida)", imc);
         * }
         * 
         * Exercício 3:
         * Escreva um código que o usuário entre com um primeiro número, um segundo
         * número maior que o primeiro e escolhe entre a opção par e impar, com isso o
         * código deve informar todos os números pares ou ímpares (de acordo com a
         * seleção inicial) no intervalo de números informados, incluindo os números
         * informados e em ordem decrescente;
         * 
         * 
         * var scanner = new Scanner(System.in);
         * System.out.println(
         * "Listagem de numeros Pares ou Impares durante um intervalo determinado\nDigite o primeiro número do intervalo:"
         * );
         * var inicio = scanner.nextInt();
         * System.out.
         * println("Digite o último número do intervalo (Maior que o anterior):");
         * var fim = scanner.nextInt();
         * if (fim < inicio) {
         * System.out.
         * println("O último número do invervalo não pode ser menhor que o primeiro.");
         * 
         * } else {
         * System.out.println("Deseja listar os numeros Pares ou Impares?");
         * var imparoupar = scanner.next();
         * var escolhaPadronizada = imparoupar;
         * if(escolhaPadronizada.startsWith("p")){
         * escolhaPadronizada = "pares";
         * } else if(escolhaPadronizada.startsWith("i")){
         * escolhaPadronizada = "impares";
         * } else{
         * System.out.println("Opção incorreta.");
         * return;
         * }
         * 
         * 
         * System.out.printf(
         * "Abaixo estão os numeros %s contidos no intervalo entre %s e %s, representados em ordem descrescente:\n"
         * ,
         * escolhaPadronizada, inicio, fim);
         * 
         * for (var i = fim; i >= inicio; i--) {
         * if (escolhaPadronizada.equals("pares") && i % 2 == 0) {
         * System.out.println(i);
         * } else if (escolhaPadronizada.equals("impares") && i % 2 != 0) {
         * System.out.println(i);
         * }
         * }
         * }
         * 
         * Exercício 4:
         * Escreva um código onde o usuário informa um número inicial, posteriormente
         * irá informar outros N números, a execução do código irá continuar até que o
         * número informado dividido pelo primeiro número tenha resto diferente de 0 na
         * divisão, números menores que o primeiro número devem ser ignorados
         * 
         * 
         * System.out.println(
         * "Bem vindo ao jogo da divisão. Insira um numero incial, após isso insira outros numeros.\nSe não for uma divisão exata o programa encerrará.\n"
         * );
         * var scanner = new Scanner(System.in);
         * System.out.println("Insira o número inicial:");
         * var numeroInicial = scanner.nextInt();
         * 
         * while (true) {
         * System.out.println("Escolha o outro número a ser divido:");
         * var numero = scanner.nextInt();
         * 
         * if (numero < numeroInicial) {
         * System.out.printf("Menor que o %s. ", numeroInicial);
         * continue;
         * 
         * } else if (numero % numeroInicial != 0) {
         * System.out.println("Divisão inexata. Houveram sobras. Fim do jogo!");
         * break;
         * 
         * } else {
         * System.out.println("Divisão exata! ");
         * 
         * }
         * }
         */

    }
}
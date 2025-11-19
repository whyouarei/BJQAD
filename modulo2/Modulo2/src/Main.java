import java.util.Scanner;

public class Main {

   private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args) {

       //Criação de variáveis e declaração de constantes no escopo global

    /*        
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.printf("Olá " + name + " Sua idade é " + age + " anos\n");

        //trabalhando com tipos primitivos
        var number = 1L;
        var berunu = 1f;
        
    

        //Trabalhadndo com operadores logicos.
        var scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var ehemancipado = scanner.nextBoolean();
        var tacertoisso = idade >= 18 || (ehemancipado && idade >= 16);
        System.out.printf("Vai a pé lascado. (%s)", tacertoisso);
     

        //Trabalhando com Operadores Aritiméticos
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.printf("A potencia de %s é %s\n", value1,  Math.pow(value1, 3));
        //System.out.println("Informe o segundo número: ");
        //var value2 = scanner.nextInt();
        //System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        //System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("A potencia de %s é %s\n", value1,  Math.pow(value1, 3));

    
        //Trabalhando com Operadores Bitwise
        var v1 = 2;
        var b1 = Integer.toBinaryString(v1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", v1, b1);
        var v2 = 5;
        var b2 = Integer.toBinaryString(v2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", v2, b2);
        var result = v1 >>> v2;
        var bires = Integer.toBinaryString(result);
        System.out.printf(" %s >>> %s = %s (representação binária %s)\n", v1, v2, result , bires);
    
        //Exercício 1 OK
        var nome = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        var meunome = nome.next();
        System.out.println("Qual o seu ano de nascimento");
        var ano = nome.nextInt();
        System.out.printf("Ola %s, você possuí %s anos!\n", meunome, 2025 - ano);
    
    
        //Exercício 2 OK
        var l = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado:");
        var area = l.nextInt();
        System.out.printf("Um quadrado cujo lado mede %scm possuí área de %scm²\n", area, Math.pow(area,2));
    
        //Exercício 3 OK
        var scanner = new Scanner(System.in);
        System.out.println("Insira a base do retângulo:");
        var base = scanner.nextInt();
        System.out.println("Insira a altura do retângulo:");
        var altura = scanner.nextInt();
        System.out.printf("Um retângulo de base %scm e altura %scm possuí uma área de %scm²\n", base, altura, base * altura);

     */
        //Exercício 4 OK
        var scanner = new Scanner(System.in);
        System.out.println("Qual o nome da primeira pessoa?");
        var p1n = scanner.next();
        System.out.println("Sua a idade da primeira pessoa?");
        var p1i = scanner.nextInt();
        System.out.println("Qual o nome da segunda pessoa?");
        var p2n = scanner.next();
        System.out.println("Sua a idade da segunda pessoa?");
        var p2i = scanner.nextInt();
        var diferenca = (int) Math.sqrt(Math.pow(p1i - p2i, 2));
        System.out.printf("%s e %s possuem %s anos de diferença\n", p1n, p2n, diferenca);
       
    }

   
}

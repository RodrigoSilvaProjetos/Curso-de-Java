import java.util.Scanner;
public class operadores_atribuicao_logico {
    public static void main(String[] args){
//        var scanner = new Scanner(System.in);
//        System.out.println("Quanto é 2 + 2");
//        var result = scanner.nextInt();
//        System.out.printf("O resultado é 4, você acertou (%s)", result == 4);// operador de igualdade result == true
//        var num = result == 4;//comparando
//        var isWrong = result != 4; //logica inversa
//        System.out.printf("\nO resultado é 4, você acertou? (%s)", isWrong);//!isWrong assim IVERTE A LÓGICA DE TRUE PARA FALSE
//        System.out.printf("\nO resultado é 4, você acertou? (%s)", !isWrong);

        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        //var canDrive = age > 17;//operador maior que( 18>=17 - 17<=18 )

        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        //vefrica se é maior de 18, se é emancipado e se tem 16 anos
        var canDrive = age >= 18 || (isEmancipated && age >= 16);//maior ou igual OU (Se um for verdade ja funciona)

        System.out.printf("Vodê pode dirigir? (%s) \n",canDrive);
        if (age == 18){
            System.out.println("OK");
        }
        System.out.println("");
        System.out.printf("true  && false = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true  && false %s \n", true && false);
        System.out.printf("false && true &s \n ", false && true);
        System.out.printf("====================================");
        System.out.printf("true  || false = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true  || false %s \n", true || false);
        System.out.printf("false || true &s \n ", false || true);
        System.out.println("====================================");
        System.out.printf("!true = false = %s \n", !true);
        System.out.printf("!false = false = %s \n", !false);

    }
}

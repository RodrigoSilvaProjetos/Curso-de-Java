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
        var canDrive = age > 17;//operador maior que( 18>=17 - 17<=18 )

        System.out.printf("Vodê pode dirigir? (%s) \n",canDrive);
    }
}

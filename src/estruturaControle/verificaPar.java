package estruturaControle;

import javax.swing.*;
import java.util.Scanner;

public class verificaPar {
    public static void main(String[] args) {

        double resultado;
        String entrada = JOptionPane.showInputDialog("Digite o valor de entrada");
        Scanner ler = new Scanner(System.in);
        Double entradaConvertida = Double.parseDouble(entrada);

        resultado = entradaConvertida % 2;

        if(entradaConvertida < 10){
            System.out.println("Numero menor que 10");
        }
        else{
            System.out.println("Numero maior que 10");
        }

        if ((entradaConvertida %2) == 0){
            System.out.println("par");
        }
        else
            System.out.println("impar");
    }
}

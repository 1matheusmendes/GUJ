package conceitosBasicos;

import javax.swing.*;
import java.util.Scanner;

public class fahrenheitToCelsius {

    public static void main(String[] args) {

        double resultado;
        String valorFahrenheit = JOptionPane.showInputDialog("Digite o valor em Fanhenheit: ");
        Scanner ler = new Scanner(System.in);
        double valorFahrenheitConvertido = Double.parseDouble(valorFahrenheit);

        resultado = (valorFahrenheitConvertido - 32)*5/9;

        System.out.println("O resultado em celsius é: "+resultado);
    }

}

package conceitosBasicos;

import javax.swing.*;
import java.util.Scanner;

public class celsiusToFahrenheit {

    public static void main(String[] args) {

        double resultado;
        String valorCelsius = JOptionPane.showInputDialog("Digite o valor em celsius");
        Scanner valor = new Scanner (System.in);
        double valorConvertido = Double.parseDouble(valorCelsius);

        resultado = (valorConvertido * 9/5)+32;

        System.out.println("O resultado em Fahrenheit é: "+resultado);

    }
}

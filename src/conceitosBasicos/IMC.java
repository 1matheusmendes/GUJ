package conceitosBasicos;

import javax.swing.*;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        double imc;

        String peso = JOptionPane.showInputDialog("Digite seu peso");
        String altura = JOptionPane.showInputDialog("Digite sua altura");

        Scanner ler = new Scanner(System.in);

        Double pesoConvertido = Double.parseDouble(peso);
        Double alturaConvertido = Double.parseDouble(altura);

        imc = pesoConvertido / (alturaConvertido * alturaConvertido);

        System.out.println("Seu imc é: "+imc);
    }
}

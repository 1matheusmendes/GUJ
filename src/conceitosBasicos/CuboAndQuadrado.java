package conceitosBasicos;

import javax.swing.*;
import java.util.Scanner;

public class CuboAndQuadrado {
    public static void main(String[] args) {

        double resultado;
        String entrada = JOptionPane.showInputDialog("Digite 1 para saber o cubo ou 2 para saber o quadrado");
        Scanner ler = new Scanner (System.in);
        int entradaConvertida = Integer.parseInt(entrada);
        String valor = JOptionPane.showInputDialog("Digite um valor");
        double valorConvertido = Double.parseDouble(valor);
        if (entradaConvertida == 1){
            resultado = valorConvertido*2;
        }
        else{
            resultado = valorConvertido*3;
        }
        System.out.println("O valor é: "+resultado);
    }
}

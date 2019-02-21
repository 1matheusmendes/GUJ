package conceitosBasicos;

import javax.swing.*;
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        double area;

        String base = JOptionPane.showInputDialog("Digite a base ");
        String altura = JOptionPane.showInputDialog("Digite a altura ");

        Scanner ler = new Scanner(System.in);

        double baseConvertida = Double.parseDouble(base);
        double alturaConvertida = Double.parseDouble(altura);

        area = alturaConvertida*baseConvertida / 2;

        System.out.println("A area do triangulo é: "+area);
    }
}

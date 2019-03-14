package estruturaControle;

import javax.swing.*;

public class anoBissexto {
    public static void main(String[] args) {

        int resultado;
        String ano = JOptionPane.showInputDialog("Digite um ano");
        int anoConvertido = Integer.parseInt(ano);

        resultado = anoConvertido % 4;

        if (resultado == 0){
            System.out.println("Ano " +anoConvertido+" é bissexto");
        }
        else{
            System.out.println("Ano " +anoConvertido+" não é bissexto");
        }

    }
}

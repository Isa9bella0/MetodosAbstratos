package aplicacao;

import entidades.Circulo;
import entidades.Forma;
import entidades.enums.Color;
import entidades.Retangulo;
import entidades.Circulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        List<Forma> list = new ArrayList<>();

        System.out.println("digite o número da forma");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Forma #" + i + " dta:");
            System.out.println("Retangulo ou circulo r/c?");
            char ch = sc.next().charAt(0);
            System.out.println("QUAL COR? ( BLACK-BLUE-RED");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.println("Altura:");
                double altura = sc.nextDouble();
                System.out.println("Largura");
                double largura = sc.nextDouble();
                list.add(new Retangulo(color, altura, largura));
            }
            else {
                System.out.println("Raio:");
                double raio = sc.nextDouble();
                list.add(new Circulo(color,raio));
            }
        }

        System.out.println();
        System.out.println("FORMAS E AREAS");
        for (Forma forma : list){
            System.out.println(String.format("%.2f", forma.area()));

        }


    sc.close();
    }
}

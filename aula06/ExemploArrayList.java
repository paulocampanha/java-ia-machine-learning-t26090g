/*
Nesse programa vamos estudar a biblioteca ArrayList
para substituir o uso de array
*/

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<Double> salarios = new ArrayList<Double>();
        ArrayList<String> comprou = new ArrayList<String>();
        
        idades.add(50);
        idades.add(30);
        idades.add(20);
        idades.add(18);

        salarios.add(7000.00);
        salarios.add(5000.00);
        salarios.add(2000.00);
        salarios.add(1500.00);

        comprou.add("sim");
        comprou.add("sim");
        comprou.add("não");
        comprou.add("não");

        System.out.println("Idade\tSalário\t\tComprou");
        
        for (int i = 0; i < idades.size(); i++) {
          System.out.println(idades.get(i) + "\t" +
                salarios.get(i) + "\t\t" +
                comprou.get(i));  
        }

    }
}


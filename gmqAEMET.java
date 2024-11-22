package Examen;

import java.util.Scanner;

public class gmqAEMET {
    public static Scanner entrada = new Scanner(System.in);
    private static final int NCiudades = 8;
    public final int NDias = 7;
    static String[] gmqNombres = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla" };
    static String[] gmqDiasSemana = { "Lunes", "Martes", "Meircoles", "Jueves", "Viernes", "Sabado", "Domingo" };
    private double[] Vmax = new double[NCiudades];
    private double[] Vmin = new double[NCiudades];

    public static void main(String[] args) {
        gmqAEMET registro = new gmqAEMET();
        registro.GenerarRegistroTemp();
        registro.ListarRegistroTemp();
    }

    public void GenerarRegistroTemp() {
        for (int i = 0; i < NCiudades; i++) {
            System.out.print("Temperatura máxima para " + gmqNombres[i] + ": ");
            Vmax[i] = entrada.nextDouble();
            System.out.print("Temperatura mínima para " + gmqNombres[i] + ": ");
            Vmin[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        System.out.println("-----------Registro de temperaturas----------");
        for (int i = 0; i < NCiudades; i++) {
            System.out.println("Ciudad: " + gmqNombres[i] + "\n" +
                    "      -Vmax: " + Vmax[i] + "\n" +
                    "      -Vmin: " + Vmin[i]);
        }
    }

    public void ListarRegistroTemp() {
        System.out.println("-----------Temperaturas----------");
        for (String dia : gmqDiasSemana) {
            System.out.printf("%-10s", dia);
        }
        System.out.println();

        for (int i = 0; i < NCiudades; i++) {
            System.out.printf("%-10s", gmqNombres[i]);
            for (int j = 0; j < NDias; j++) {
                int temp1 = (int) (Vmin[i] + Math.random() * (Vmax[i] - Vmin[i]));
                int temp2 = (int) (Vmin[i] + Math.random() * (Vmax[i] - Vmin[i]));
                int media = (temp1 + temp2) / 2;
                System.out.printf("%-10s", String.format("%d, %d, %d", temp1, temp2, media));
            }
            System.out.println();
        }
    }
}

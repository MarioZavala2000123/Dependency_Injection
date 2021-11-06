package ImprimirDoc;

import java.util.Scanner;

public class ServicioEnvio {

    public void enviar() {

        System.out.println("\tENVIO DOCUMENTO");
        Scanner sc = new Scanner(System.in);
        String NombreDoc;

        System.out.println("Por favor ingrese el nombre del documento a imprimir:");
        System.out.print("- ");
        NombreDoc = sc.next();
        System.out.println(" ");
        System.out.println("Documento: " + "*" + NombreDoc + "*" + " enviado con exito, por favor espere mientras imprime");
        System.out.println(" ");
    }
}

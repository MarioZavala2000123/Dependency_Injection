package ImprimirDoc;

import java.util.Scanner;

public class ServicioEnvioAspecto extends ServicioEnvio {

    @Override
    public void enviar() {
        Scanner sc = new Scanner(System.in);
        String User;
        
        System.out.println("\tCARGANDO");
        System.out.println("Ingrese su usuario por favor");
        System.out.print("-");
        User = sc.next();
        System.out.println("\tUsuario registrado, bienvenido");
        System.out.println(" ");

        super.enviar();
    }

}

package ImprimirDoc;

public class ServicioEnvioAspecto extends ServicioEnvio {

    @Override
    public void enviar() {

        System.out.println("haciendo log del correo que vamos a enviar");

        super.enviar();
    }

}

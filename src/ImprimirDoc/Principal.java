package ImprimirDoc;

public class Principal {

    public static void main(String[] args) {

        ServicioImpresion miServicio = new ServicioImpresion(new ServicioEnvioAspecto(), new Documento());

        miServicio.imprimir();

    }
}

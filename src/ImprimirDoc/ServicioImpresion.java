package ImprimirDoc;

public class ServicioImpresion {

    ServicioEnvio servicioA;
    Impresora servicioB;

    public ServicioImpresion(ServicioEnvio servicioA, Impresora servicioB) {

        this.servicioA = servicioA;
        this.servicioB = servicioB;
    }

    public void imprimir() {

        servicioA.enviar();
        servicioB.pdf();
    }
}

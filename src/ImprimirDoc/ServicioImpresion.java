package ImprimirDoc;

public class ServicioImpresion {

    ServicioEnvio servicioA;
    Documento servicioB;

    public ServicioImpresion(ServicioEnvio servicioA, Documento servicioB) {

        this.servicioA = servicioA;
        this.servicioB = servicioB;
    }

    public void imprimir() {

        servicioA.enviar();
        servicioB.pdf();
    }
}

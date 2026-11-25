public class MembresiaGimnasio {
    private String dniSocio;
    private String nombreCompleto;
    private boolean cuotaAlDia;

    public MembresiaGimnasio(String dniSocio, String nombreCompleto) {
        this.dniSocio = dniSocio;
        this.nombreCompleto = nombreCompleto;
        this.cuotaAlDia = false;
    }

    public void pagarCuota() {
        this.cuotaAlDia = true;
    }

    public void registrarVencimiento() {
        this.cuotaAlDia = false;
    }

    public void mostrarInformacion() {
        System.out.println("DNI del socio: " + dniSocio);
        System.out.println("Nombre: " + nombreCompleto);

        if (cuotaAlDia) {
            System.out.println("Estado de la cuota: al dia.");
        } else {
            System.out.println("Estado de la cuota: pendiente.");
        }
    }
}

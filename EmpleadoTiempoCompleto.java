public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, Double bonoExtra) {
        super(nombre, salarioBase, TipoContrato.PLANTA, bonoExtra);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + getBono();
    }
}

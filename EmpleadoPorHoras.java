public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora, Double bonoExtra) {
        super(nombre, 0, TipoContrato.HORAS, bonoExtra);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return (horasTrabajadas * pagoPorHora) + getBono();
    }
}

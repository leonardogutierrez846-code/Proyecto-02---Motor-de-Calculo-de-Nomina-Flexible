import java.util.List;

public class Calculadora<T extends Empleado> {

    public double calcularNominaTotal(List<T> empleados) {

        return empleados.stream()
                .map(Empleado::calcularSalario)
                .reduce(0.0, Double::sum);
    }
}

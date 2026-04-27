import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(
                new EmpleadoTiempoCompleto("Juan", 100, 200.0),
                new EmpleadoTiempoCompleto("Ana", 150, null),
                new EmpleadoPorHoras("Luis", 40, 10, 100.0),
                new EmpleadoPorHoras("Maria", 30, 15, null)
        );

        Calculadora<Empleado> calculadora = new Calculadora<>();

        double totalNomina = calculadora.calcularNominaTotal(empleados);

        empleados.forEach(emp ->
                System.out.println(emp.nombre + " gana: $" + emp.calcularSalario())
        );

        System.out.println("Total de la nómina: $" + totalNomina);
    }
}

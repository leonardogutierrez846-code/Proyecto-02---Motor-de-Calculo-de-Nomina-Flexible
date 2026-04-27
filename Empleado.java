import java.util.Optional;

public abstract class Empleado {

    protected String nombre;
    protected double salarioBase;
    protected TipoContrato tipoContrato;
    protected Optional<Double> bonoExtra;

    public Empleado(String nombre, double salarioBase, TipoContrato tipoContrato, Double bonoExtra) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
        this.bonoExtra = Optional.ofNullable(bonoExtra);
    }

    public double getBono() {
        return bonoExtra.orElse(0.0);
    }

    public abstract double calcularSalario();
}

import java.util.Scanner;

class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre =nombre;
        this.edad =edad;
        this.salario =salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre =nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad =edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario =salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado ("Justin Imbaquingo", 20, 1000);

        Scanner scanner= new Scanner(System.in);

        System.out.print ("Ingrese el nombre del empleado: ");
        String nombre=scanner.nextLine();

        System.out.print ("Ingrese la edad: ");
        int edad =scanner.nextInt();

        System.out.print ("Ingrese el salario: ");
        double salario =scanner.nextDouble();

        Empleado empleado2 =new Empleado(nombre, edad, salario);

        System.out.println ("Primer empleado");
        System.out.println ("Nombre: " +empleado1.getNombre());
        System.out.println ("Edad: " +empleado1.getEdad());
        System.out.println ("Salario: " +empleado1.getSalario());
        System.out.println();
        System.out.println ("Segundo empleado");
        System.out.println ("Nombre: " +empleado2.getNombre());
        System.out.println ("Edad: " +empleado2.getEdad());
        System.out.println ("Salario: " +empleado2.getSalario());
    }
}

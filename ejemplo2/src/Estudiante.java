import java.util.Scanner;

public class Estudiante {
    public static String cedula;
    public static String nombre;
    public static double promedioFinal;

    private static final Scanner leer= new Scanner(System.in);
    public static void imprimirDatos(){
        System.out.println("El estudiante: " +Estudiante.nombre+ ", con la cédula" +
                Estudiante.cedula+ " cuenta con un promedio final de "+promedioFinal);
    }

    public static int calcularPromedio(int nota1, int nota2, int nota3){
        int promedio= (nota1+nota2+nota3)/3;
        return promedio;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre= leer.nextLine();
        Estudiante.nombre= nombre;

        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula= leer.nextLine();
        Estudiante.cedula= cedula;

        System.out.println("Ingrese el promedio del primer cuatrimestre: ");
        int nota1= leer.nextInt();

        System.out.println("Ingrese el promedio del segundo cuatrimestre: ");
        int nota2= leer.nextInt();

        System.out.println("Ingrese el promedio del tercer cuatrimestre: ");
        int nota3= leer.nextInt();
        Estudiante.promedioFinal= calcularPromedio(nota1, nota2, nota3);

        Estudiante.imprimirDatos();
    }
}

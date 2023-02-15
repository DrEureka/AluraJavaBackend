public class valoresVariables {
    public static void main(String[] args) {
       System.out.println("Condicionales if: ");
        System.out.println("El or en java es ||");

       int edad = 17;
       int cantidadPersonas = 2;
       if (edad >= 18 || cantidadPersonas <= 2) {
           System.out.println("Es mayor de 18, puede ingresar.");
       }
       else {
           System.out.println("No puede ingresar, no es mayor de 18.");
       }
    }
}

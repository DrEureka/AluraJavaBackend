public class valoresVariables {
    public static void main(String[] args) {
       System.out.println("Condicionales if: ");

       int edad = 17;
       int cantidad = 2;
       if (edad >= 18) {
           System.out.println("Es mayor de 18, puede ingresar.");
       }
       else {
           if (cantidad >=2 ) {
               System.out.println("Es menor de edad pero puede ingresar al ser 2 personas.");
           }else

           System.out.println("No puede ingresar, no es mayor de 18.");
       }
    }
}

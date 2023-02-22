public class EjemploMatriz {
    public static void main(String[] args) {
        for(int fila = 0; fila <= 10; fila ++){

            for (int columna = 0; columna <= 10; columna ++){
                if (columna > fila ){
                    break;
                }
                System.out.println("*");
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}

package examenrefactcod;

public class ExamenRefactCOD {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int digCambio = 3;
        int digitos = 0;
        if (digCambio <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divis = i;

            int cuenta = 0;

            while (divis != 0) {
                divis = divis / 10;
                cuenta++;
            }
            digitos = cuenta;

            if (digitos == digCambio) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contadorCondi = 0;
                        int j = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (j <= k) {
                            if (i % j == 0) {
                                contadorCondi++;
                            }
                            j += 2;
                            if (contadorCondi == 2) {
                                j = k + 1;
                            }
                        }

                        if (contadorCondi == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        int numeroWhile = 10;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numero del bucle while es: " + numeroWhile);

        }

        int numeroDoWhile = 10;


        do {
            System.out.println("Do While es " + numeroDoWhile++);
        } while (numeroDoWhile < 3);


        for( int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("Numero del For" + numeroFor);
        }


        int estacion =3;
        switch (estacion) {
            case 1:
                System.out.println("La estación es Invierno");
                break;
            case 2:
                System.out.println("La estación es Verano");
                break;
            case 3:
                System.out.println("La estación es primavera");
                break;
            case 4:
                System.out.println("La estación es Otoño");
        }



    }





}


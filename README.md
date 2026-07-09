import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el tamaño del arreglo: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arreglo = new int[n];
        llenarAleatorio(arreglo);

        int opcion;
        do{
            System.out.println("\n===== RECURSIVIDAD =====");
            System.out.println("1. Imprimir arreglo");
            System.out.println("2. Sumar arreglo");
            System.out.println("3. Contar positivos");
            System.out.println("4. Factorial");
            System.out.println("5. Fibonacci");
            System.out.println("6. Máximo Común Divisor");
            System.out.println("7. Potencia rápida");
            System.out.println("8. Llenar arreglo");
            System.out.println("9. Salir");
            opcion=Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 1:
                    imprimirArreglo(arreglo,0);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Suma = "+sumarArreglo(arreglo,0));
                    break;
                case 3:
                    System.out.println("Positivos = "+contarPositivos(arreglo,0));
                    break;
                case 4:
                    System.out.print("Número: ");
                    System.out.println("Factorial = "+factorial(Integer.parseInt(sc.nextLine())));
                    break;
                case 5:
                    System.out.print("Número: ");
                    System.out.println("Fibonacci = "+fibonacci(Integer.parseInt(sc.nextLine())));
                    break;
                case 6:
                    System.out.print("A: ");
                    int a=Integer.parseInt(sc.nextLine());
                    System.out.print("B: ");
                    int b=Integer.parseInt(sc.nextLine());
                    System.out.println("MCD = "+maximoComunDivisor(a,b));
                    break;
                
                case 8:
                    llenarAleatorio(arreglo);
                    break;
            }
        }while(opcion!=9);
        sc.close();
    }

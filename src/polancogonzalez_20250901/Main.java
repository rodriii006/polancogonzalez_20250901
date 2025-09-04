/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polancogonzalez_20250901;

/**
 *
 * @author Dell
 */


import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz();
        
    }
    
    
    public static void matriz(){
        // SE INSTANCIA EL SCANNER PARA LECTURA DE TECLADO
        Scanner scanner = new Scanner(System.in);
        
        //SE INSTANCIA LA MATRIZ DE TIPO INTEGER
        int[][] matriz = new int[3][3];
        int suma = 0; //VARIABLE  PARA SUMA DE VALORES DIGITADOS
        int total_elementos = 0; //CONTADOR DE ELEMENTOS DE LA MATRIZ
        double promedio = 0d; //CÁLULO DEL PROMEDIO DE EDADES DIGITADAS
        
        //SALIDA AL USUARIO PARA INDICAR QUE DEBE INGRESAR DATOS
        System.out.println("Ingrese los valores para una matriz 3 x 3");
        
        //SE RECORRE PRIMERO LAS FILAS CON UNA ESTRUCTURA DE CONTROL ITERATIVA
        //DE TIPO FOR
        for(int i=0; i < matriz.length; i++){
                //EN CADA ITERACIÓN SE DEBERÁ OBTENER LA CANTIDAD DE ELEMENTOS
                //QUE EXISTE EN EL ARREGLO (CANTIDAD DE COLUMNAS)
                total_elementos += matriz[i].length;
                
                //SE RECORRE LAS COLUMNAS DE LA MATRIZ CON UNA ESTRUCTURA DE CONTROL
                //ITERATIVA DE TIPO FOR
                //DEBIDO A QUE DEBERMOS OBTENER EL VALOR DE CADA CELDA (FILA Y COLUMNA)
                for(int j = 0; j < matriz[i].length; j++){
             //SE VUELVE UN ARRAY----^
                    //SE IMPRIME LA PETICIÓN AL USUARIO PARA EL INGRESO DE DATOS
                    System.out.println("Elemento [" +i+ "][" +j+ "]");
                    
                    //SE HACE LECTURA DE TECLADO
                    matriz[i][j] = scanner.nextInt();
                
                }// CIERRE EL FOR PARA OBTENER COLUMNAS
        }//CIERRE DEL FOR PARA OBTENER FILAS
        
        
        //SALIDA DE VALORES PARA EL USUARIO
        System.out.println("Matriz ingresada: ");
        
        //SE RECORREN LAS FILAS DE LA MATRIZ
        for(int x = 0; x < matriz.length; x++){
        
            //SE RECORREN LAS COLUMNAS DE LA MATRIZ
            for(int y=0; y < matriz[x].length; y++){
         //SE VUELVE UN ARRAY----^
                //SE IMPRIME EL VALOR DE CADA CELDA DE LA MATRIZ (FILA,COLUMNA)
                //FILA: x  COLUMNA: y
                System.out.print(matriz[x][y]+" ");
                
                //SE SUMAN LOS VALORES DIGITADOS DE CADA CELDA
                suma += matriz[x][y];
                
            }
            //SE IMPRIME UN SALTO DE LINEA
            System.out.println();
        }
        
        //CÁLCULO DE LOS VALORES
        promedio = (double) suma/total_elementos;
        
        //SE IMPRIME LA SALIDA DEL PROGRAMA AL USUARIO CON LOS VALORES CALCULADOS
        System.out.println(suma+" es la sumatoria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
        System.out.println("El promedio de edad es: "+promedio);
        
        
        //SE CIERRA EL USO DE LA CLASE Scanner
        scanner.close();
    }
    
    
    
    
}
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


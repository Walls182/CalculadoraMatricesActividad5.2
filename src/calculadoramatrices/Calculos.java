/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramatrices;

/**
 *
 * @author Walls
 */
public class Calculos {
    private int[][] sumar(int [][]a,int [][]b){
       int suma[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length; j++) {
               suma[i][j] = a[i][j] + b[i][j]; 
            }
        }
     return suma;
        
    
    
    } 
    private int[][] restar(int [][]a,int [][]b){
       int resta[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
               resta[i][j] = a[i][j] - b[i][j]; 
            }
        }
     return resta;
        
    
    
    }
    private int traza(int [][]a){
        int traza=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i==j) {
                  traza+= a[i][j];   
                }
 
            }
        }
     return traza;
        
    
    
    }
   private void cofactor(int[][]m,int [][]temp,int a,int b,int n){
       int i =0;    
       int j =0;
       for (int filas = 0; filas < m.length; filas++) {
           for (int columnas = 0; columnas <m.length; columnas++) {
               if (filas!=a&&filas!=b) {
                   temp[i][j++]= m[filas][columnas];
                   if (j==n-1) {
                       j=0;
                       i++;
                   }
               }
           }
           
       }
   
   }
  private int determinante(int [][]a){
     int deter=0;
      if (a.length==1) {
          return a[0][0];
      }
      int temp[][]= new int [a.length][a.length];
      int mul=1;
      for (int i = 0; i <a.length; i++) {
          cofactor(a,temp,0,0,0);
          deter+=mul*a[0][i]* determinante(temp);
          mul=-mul;
      }
      return deter;


}
    
}

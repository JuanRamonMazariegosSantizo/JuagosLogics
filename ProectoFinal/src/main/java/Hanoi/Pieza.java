/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hanoi;

/**
 *
 * @author Juancho956
 */
public class Pieza {
    static private int valores[][] = new int [3][8];
    
    public static void setValor(int valor, int x){
        valores[1][x] = valor;
    }
    public static void setParal(int paral, int x){
        valores[0][x] = paral;
    }
    public static void setAncho(int ancho, int x){
        valores[2][x] = ancho;
    }
    
    public static int getValor(int x){
        return valores[1][x];
    }
    public static int getParal(int x){
        return valores[0][x];
    }
    public static int getAncho(int x){
        return valores[2][x];
    }
    
    public static boolean paloVacio(){
        boolean a = true;
        int b = 0;
        for(int x = 0 ; x < 8;x++){
            if(valores[1][x]==0){
                b++;
            }
        }
        if (b != 0){
            a = false;
        }else{
            a = true;
        }
        return a;
    }
}

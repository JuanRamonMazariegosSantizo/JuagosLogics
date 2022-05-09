/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proectofinal;

/**
 *
 * @author Juancho956
 */
public class PartidasGuardadas {
static String partidas [][][] = new String[8][8][10];
static int noPartida = 0;
static String Jugador1[] = new String[10];
static String Jugador2[] = new String[10];

public static void GUARDAR(int x,int y,int k,String pieza,String j1, String j2){
    partidas[x][y][k] = pieza;
    Jugador1[k] = j1;
    Jugador2[k] = j2;
}

public static String CARGARTablero(int x, int y, int k){
    return partidas[x][y][k];
}

public static String CARGARJ1(int k){
    return Jugador1[k];
}

public static String CARGARJ2(int k){
    return Jugador2[k];
}
public static void setNoPartidas(){
    noPartida++;
}

public static int getNoPartidas(){
    return noPartida;
}

}

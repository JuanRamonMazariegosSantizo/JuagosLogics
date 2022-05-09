/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Juancho956
 */
public class Usuarios {
static String nombres [] = new String[50];
static int CantJugadores = 1;

    public static void Datos(int cantJugadores){
        nombres[cantJugadores] = JOptionPane.showInputDialog("Ingrese su nombre");
    }
    
    public static void NombresJugadores(){
        nombres[0] = "IA";
        Datos(CantJugadores);
        CantJugadores++;
    }
    
    public static String EnviarNombre(int x){
        return nombres[x];
    }
    
    public static int getCantJugadores(){
        return CantJugadores;
    }
    
}

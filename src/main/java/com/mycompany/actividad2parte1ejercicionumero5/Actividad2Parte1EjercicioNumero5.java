/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero5;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero5 {

    public static void main(String[] args) {
        String NOM;
        int NI,EST;
        double PAT,PAGMAT;
        PAGMAT = 50000;
        Scanner leer = new Scanner(System.in);
        System.out.println("numero de inscripcion");
        NI = leer.nextInt();
        leer.nextLine();
        System.out.println("nombre");
        NOM = leer.nextLine();
        System.out.println("patrimonio");
        PAT = leer.nextDouble();
        System.out.println("estrato");
        EST = leer.nextInt();
        if(PAT>2000000 && EST>3){
        PAGMAT = PAGMAT+(0.03*PAT);
        System.out.println("El estudiante con numero de inscripcion "+NI+" y nombre "+NOM+" debe pagar $"+PAGMAT);
        }
        else{
        System.out.println("El estudiante con numero de inscripcion "+NI+" y nombre "+NOM+" debe pagar $"+PAGMAT);
        }   
    }
}

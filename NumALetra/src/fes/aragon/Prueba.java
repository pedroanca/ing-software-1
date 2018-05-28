/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

/**
 *
 * @author Pedro Antunez
 */
import java.io.*;

public class Prueba{
	public static void main(String Arg[ ]) throws IOException{
	NumALetra numero;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int num;
	String res;
        System.out.print("Ingrese el numero a convertir en letras : ");
        num = Integer.parseInt(in.readLine( ));
		numero = new NumALetra(num);
		res = numero.convertirLetras(num);
		System.out.print(res);
		System.out.println("\n");
	}	
}


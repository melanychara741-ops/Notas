/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
import java.util.Scanner;
        
public class Main {
    
    public static void main(String[] args) {
        int cantidad;
        double suma=0;
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de notas que quiere registrar");
        cantidad=scan.nextInt();
        
        double[] notas= new double[cantidad];
        
        for(int i=0; i<cantidad;i++){
        System.out.println("Ingresa la nota " + (i+1) + ": ");
        notas[i]=scan.nextDouble();
        suma+=notas[i];
        }
        
        double notaAlta= notas[0];
        double notaBaja= notas[0];
        
        for(int i=0;i<cantidad;i++){
        if(notaAlta>notas[i]){
        notaAlta=notas[i];
        }
        if(notaBaja<notas[i]){
        notaBaja=notas[i];
        }
        
        
        }
        
        double prom=suma/cantidad;
        
        
        for(int i=0;i<cantidad-1;i++){
        for(int j=0;j<cantidad-1-i;j++){
            if(notas[j]<notas[j+1]){
        double aux=notas[j];
        notas[j]=notas[j+1];
        notas[j+1]=aux;
            }
        }
        }
        
        System.out.println("****RESULTADOS****");
        System.out.println("PROMEDIO GENERAL: "+prom);
        System.out.println("NOTA MAS ALTA: "+notaAlta);
        System.out.println("NOTA MAS BAJA: "+notaBaja);
        
        System.out.println("Notas ordenadas de mayor a menor");
        
        for(int i=0;i<cantidad;i++){
        
        System.out.println(notas[i]+",");
        }
        System.out.println("");
        scan.close();
    }
    
    
}

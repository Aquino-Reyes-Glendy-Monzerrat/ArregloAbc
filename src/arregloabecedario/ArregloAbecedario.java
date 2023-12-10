
package arregloabecedario;

//5. letras del abecedario en mayusculas ,cogiendo letras de sus posiciones

import java.util.Scanner;

public class ArregloAbecedario {

    
    public static void main(String[] args) {
       
    char abecedario[]= new char[91-65 ];   
        
      for(int in=65,indice=0;in<91;in++,indice++){
      
          abecedario[indice]=(char)in;
           
      
      }  
       Scanner leer=new Scanner(System.in); 
        System.out.println("ingrese numero");
        int num=leer.nextInt();
        
        String cadena="";
        
        
        while(num!=-1){
        
            if (num>=0 && num<abecedario.length){
            
            cadena+=abecedario[num];
            
            }else{
                System.out.println("numero no valido ingrese numero entre 0 y "+(abecedario.length-1) + "o -1 para acabar" );
            
            }
              System.out.println("ingrese numero");
        num=leer.nextInt();
        }
        System.out.println("la cadena resultante es " + cadena);
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicios;
import java.util.*;
/**3
 *
 * @author fabio
 */
public class Fatorial {
    
       public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int num;
        int fatorial = 1;
        int loop = 1;

        do{
            System.out.println("Digite um inteiro");
            num = in.nextInt();
            
            for(int i = 1;i <= num; i++){
                fatorial *= i;
            }
            
            System.out.println(num +"!"+ " = " + fatorial);
            loop++;
            
       }while(loop < 2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicios;

import java.util.*;

/**
 *
 * @author fabio
 */
public class MDC {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = in.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int y = in.nextInt();
        boolean m = true;
        int atual,retorno =0;
        
        do{
            if ((y<=x) && ((x%y)==0)){
               retorno = y;
               m = false;
            }else if(x<y){
                atual = x;
                x = y;
                y = atual;
            }else{
                atual = y;
                y = x%y;
                x = atual;
            }
        }while(m);
        
        System.out.printf("%d \n",retorno);
    }
}

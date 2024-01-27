package com.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int parametroUm = ler.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = ler.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.err.println("O parametro UM deve ser menor que o parametro DOIS!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if(parametroUm < parametroDois){
            for(int i = 0; i <= contagem; i++){
                System.out.println("Imprimindo o número "+i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
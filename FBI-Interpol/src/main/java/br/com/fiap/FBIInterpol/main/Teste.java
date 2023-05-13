package br.com.fiap.FBIInterpol.main;

import java.util.Scanner;

import br.com.fiap.FBIInterpol.API.FBI;
import br.com.fiap.FBIInterpol.model.Procurado;

public class Teste {
    public static void main(String[] args) throws Exception {
        Procurado procurado = FBI.ConsultarPorNome("DANNY LIGGETT");

        System.out.println(procurado);
//
//
    }
}

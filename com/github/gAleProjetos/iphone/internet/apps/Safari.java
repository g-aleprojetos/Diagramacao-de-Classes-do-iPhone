package com.github.gAleProjetos.iphone.internet.apps;

import com.github.gAleProjetos.iphone.internet.Navegador;

public class Safari extends Navegador {
    public Safari(String url) {
        super(url);
    }

    @Override
    public void exibirPagina() {
        validarConexaoInternet();
        System.out.println("Exibindo página no Safari...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Safari.");
    }
}

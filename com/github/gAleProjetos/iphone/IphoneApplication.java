package com.github.gAleProjetos.iphone;

import com.github.gAleProjetos.iphone.internet.Email;
import com.github.gAleProjetos.iphone.internet.Navegador;
import com.github.gAleProjetos.iphone.internet.apps.Chrome;
import com.github.gAleProjetos.iphone.internet.apps.Instagram;
import com.github.gAleProjetos.iphone.internet.apps.Safari;
import com.github.gAleProjetos.iphone.ipad.ReprodutorMusical;
import com.github.gAleProjetos.iphone.ipad.apps.Itunes;
import com.github.gAleProjetos.iphone.ipad.apps.Spotify;
import com.github.gAleProjetos.iphone.telefone.Contato;
import com.github.gAleProjetos.iphone.telefone.Telefone;

import java.time.Instant;

public class IphoneApplication {
    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        navegador = new Safari("https://www.google.com");

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        Email email = new Email("qualqueremail@email.com");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        reprodutorMusical = new Spotify("Save Your Tears", "The Weeknd");

        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica();

        Telefone telefone = new Telefone("11999999999");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Maria", "Silva", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Maria", "senha123");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}

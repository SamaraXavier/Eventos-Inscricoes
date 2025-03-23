package br.ufrpe.eventos_inscricoes;

import br.ufrpe.eventos_inscricoes.dados.RepositorioEvento;
import br.ufrpe.eventos_inscricoes.dados.RepositorioUsuario;
import br.ufrpe.eventos_inscricoes.negocio.beans.Evento;
import br.ufrpe.eventos_inscricoes.negocio.beans.TipoUsuario;
import br.ufrpe.eventos_inscricoes.negocio.beans.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersistenciaDados {
    public static void main(String[] args) {
        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
        RepositorioEvento repositorioEvento = new RepositorioEvento();

//        Usuario usuario1 = new Usuario(365641, "Raul seixas", "rs@gmail.com", "senha123", TipoUsuario.COMUM, LocalDate.now());
//        Usuario usuario2 = new Usuario(111111, "Monteiro Xavier", "MX@gmail.com", "senha123", TipoUsuario.COMUM, LocalDate.now());
//        Usuario usuario3 = new Usuario(354213, "Pedro Enzo", "ps@gmail.com", "senha123", TipoUsuario.COMUM, LocalDate.now());
        Usuario usuario4 = new Usuario(874524, "Samara Xaxier", "samara@gmail.com", "senha2005", TipoUsuario.ADMINISTRADOR, LocalDate.now());
//
//        repositorioUsuario.cadastrar(usuario1);
//        repositorioUsuario.cadastrar(usuario2);
//        repositorioUsuario.cadastrar(usuario3);
//        repositorioUsuario.cadastrar(usuario4);

        for (Usuario u : repositorioUsuario.listar()) {
            System.out.println(u);
        }

        System.out.println("\nBUSCANDO O PEDRO ENZO POR ID");
        System.out.println(repositorioUsuario.buscar(354213));

        // ------- Repositorio de Eventos -------
        System.out.println(" ");
//        repositorioEvento.cadastrar(new Evento(6514, "Evento animado e divertido", "CampusParty", LocalDateTime.now(), "Recife-PE", 20, 65, usuario4));

        for (Evento e : repositorioEvento.listar()) {
            System.out.println(e);
        }
    }
}

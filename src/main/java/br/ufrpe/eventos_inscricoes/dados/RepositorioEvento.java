package br.ufrpe.eventos_inscricoes.dados;

import br.ufrpe.eventos_inscricoes.negocio.beans.Evento;

public class RepositorioEvento extends RepositorioGenerico<Evento> {
    public RepositorioEvento() {
        super("src/main/java/br/ufrpe/eventos_inscricoes/dados/eventos.dat");
    }
}

package br.ufrpe.eventos_inscricoes.dados;

import br.ufrpe.eventos_inscricoes.negocio.beans.Inscricao;

public class RepositorioInscricao extends RepositorioGenerico<Inscricao> {
    public RepositorioInscricao () {
        super("src/main/java/br/ufrpe/eventos_inscricoes/dados/inscricoes.dat"); // Define o nome do arquivo específico para usuários
    }
}

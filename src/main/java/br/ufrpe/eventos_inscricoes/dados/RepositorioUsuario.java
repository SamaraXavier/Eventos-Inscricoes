package br.ufrpe.eventos_inscricoes.dados;

import br.ufrpe.eventos_inscricoes.negocio.beans.Usuario;

public class RepositorioUsuario extends RepositorioGenerico<Usuario> {
    public RepositorioUsuario() {
        super("src/main/java/br/ufrpe/eventos_inscricoes/dados/usuarios.dat"); // Define o nome do arquivo específico para usuários
    }
}

package br.ufrpe.eventos_inscricoes.dados;

import br.ufrpe.eventos_inscricoes.negocio.beans.Certificado;

public class RepositorioCertificado extends RepositorioGenerico<Certificado> {
    public RepositorioCertificado() {
        super("src/main/java/br/ufrpe/eventos_inscricoes/dados/certificados.dat");
    }
}

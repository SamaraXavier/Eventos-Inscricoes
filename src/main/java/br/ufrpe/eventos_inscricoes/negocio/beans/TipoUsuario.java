package br.ufrpe.eventos_inscricoes.negocio.beans;

public enum TipoUsuario {
    ADMINISTRADOR(1),
    COMUM(2);

    private final int VALOR;

    TipoUsuario(int VALOR) {
        this.VALOR = VALOR;
    }

    public int getValor() {
        return this.VALOR;
    }

}

package br.ufrpe.eventos_inscricoes.negocio.beans;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Inscricao extends Entidade implements Serializable {
    private static final long serialVersionUID = 1L; // Versão do objeto para evitar problemas de compatibilidade
    private long id;
    private boolean status;
    private Evento evento;
    private LocalDateTime dataInscricao;
    private Usuario usuario;

    public Inscricao(long id, Evento evento, LocalDateTime dataInscricao, Usuario usuario) {
        this.id = id;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.usuario = usuario;
        this.status = false;
        this.dataInscricao = LocalDateTime.now();
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Inscricao) {
            Inscricao inscricao = (Inscricao) o;
            retorno = this.id == inscricao.getId() || this.usuario.equals(inscricao.getUsuario()) && this.evento.equals(inscricao.getEvento());
        }
        return retorno;
    }

    @Override
    public String toString() {
        String retorno = "";
        retorno += "ID: " + this.id + "\n";
        retorno += "Status: " + this.status + "\n";
        retorno += "Evento: " + this.evento + "\n";
        retorno += "Data de Inscricao: " + this.dataInscricao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n";
        retorno += "Usuario: " + this.usuario + "\n";
        return retorno;
    }
}

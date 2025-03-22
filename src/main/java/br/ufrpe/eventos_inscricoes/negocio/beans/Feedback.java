package br.ufrpe.eventos_inscricoes.negocio.beans;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Feedback extends Entidade {
    private long id;
    private String mensagem;
    private int avaliacao;
    private LocalDateTime dataEnvia;

    public Feedback(long id, String mensagem, int avaliacao, LocalDateTime dataEnvia) {
        this.id = id;
        this.mensagem = mensagem;
        this.avaliacao = avaliacao;
        this.dataEnvia = dataEnvia;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", mensagem='" + mensagem + '\'' +
                ", avaliacao=" + avaliacao +
                ", dataEnvia=" + dataEnvia.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                '}';
    }

    @Override
    public long getId() {
        return this.id;
    }
}

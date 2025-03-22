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
    private Evento evento;
    private Usuario avaliador;

    public Feedback(long id, String mensagem, int avaliacao, LocalDateTime dataEnvia, Evento evento, Usuario avaliador) {
        this.id = id;
        this.mensagem = mensagem;
        this.avaliacao = avaliacao;
        this.dataEnvia = dataEnvia;
        this.evento = evento;
        this.avaliador = avaliador;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Feedback) {
            Feedback feedback = (Feedback) o;
            retorno = this.id == feedback.id || this.avaliador.equals(feedback.getAvaliador()) && this.mensagem.equals(feedback.mensagem) && this.evento.equals(feedback.getEvento());
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", mensagem='" + mensagem + '\'' +
                ", avaliacao=" + avaliacao +
                ", dataEnvia=" + dataEnvia.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                ", evento=" + evento +
                ", avaliador=" + avaliador +
                '}';
    }
}

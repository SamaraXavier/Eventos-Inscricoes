package br.ufrpe.eventos_inscricoes.negocio.beans;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Getter
@Setter
public class Evento extends Entidade {
    private long id;
    private String descricao;
    private String titulo;
    private LocalDateTime dataEvento;
    private String local;
    private int capacidadeMaxima;
    private double preco;
    private Usuario cadastradoPor;
    private ArrayList<Inscricao> inscricoes;

    public Evento(long id, String descricao, String titulo, LocalDateTime dataEvento, String local, int capacidadeMaxima, double preco, Usuario cadastradoPor) {
        this.id = id;
        this.descricao = descricao;
        this.titulo = titulo;
        this.dataEvento = dataEvento;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.preco = preco;
        this.cadastradoPor = cadastradoPor;
    }

    @Override
    public long getId() {
        return this.id;
    }

    public void adicionarInscricao(Inscricao novaInscricao) {
        this.inscricoes.add(novaInscricao);
    }

    public void removerInscricao(Inscricao inscricao) {
        this.inscricoes.remove(inscricao);
    }

    public int getQuantidadeInscricao() {
        return this.inscricoes.size();
    }

    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Evento) {
            Evento evento = (Evento) o;
            retorno = this.id == evento.id;
        }
        return retorno;
    }

    public String toString() {
        String retorno = "";
        retorno += "ID: " + this.id + "\n";
        retorno += "Descricao: " + this.descricao + "\n";
        retorno += "Titulo: " + this.titulo + "\n";
        retorno += "DataEvento: " + dataEvento.format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm")) + "\n";
        retorno += "Local: " + this.local + "\n";
        retorno += "CapacidadeMaximo: " + this.capacidadeMaxima + "\n";
        retorno += "Preco: " + this.preco + "\n";
        retorno += "Cadastrado Por: " + this.cadastradoPor + "\n";
        return retorno;
    }
}

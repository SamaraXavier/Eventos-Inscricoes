package br.ufrpe.eventos_inscricoes.negocio.beans;

import java.time.LocalDateTime;
import java.util.Objects;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Certificado extends Entidade {
    private long id;
    private Usuario usuario;
    private LocalDateTime dataEmissao;

    public Certificado (long id, Usuario usuario, LocalDateTime dataEmissao) {
        setId(id);
        setUsuario(usuario);
        setDataEmissao(dataEmissao);
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", dataEmissao=" + dataEmissao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Certificado that = (Certificado) o;
        return id == that.id && Objects.equals(usuario, that.usuario) && Objects.equals(dataEmissao, that.dataEmissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, dataEmissao);
    }
}

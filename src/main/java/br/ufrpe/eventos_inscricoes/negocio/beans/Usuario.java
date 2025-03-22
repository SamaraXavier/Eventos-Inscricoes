package br.ufrpe.eventos_inscricoes.negocio.beans;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario extends Entidade {
    private long id;
    private String nome;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;
    private LocalDate dataNascimento;

    public Usuario(long id, String nome, String email, String senha, TipoUsuario tipoUsuario, LocalDate dataNascimento) {
        setId(id);
        setNome(nome);
        setEmail(email);
        setNome(senha);
        setTipoUsuario(tipoUsuario);
        setDataNascimento(dataNascimento);
    }

    public boolean verificarAniversario() {
        return LocalDate.now().equals(this.dataNascimento);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if (obj instanceof Usuario) {
            Usuario usuario = (Usuario) obj;
            if (this.id == usuario.getId() || this.email.equals(usuario.getEmail())) {
                resultado = true;
            }
        }
        return resultado;
    }
}

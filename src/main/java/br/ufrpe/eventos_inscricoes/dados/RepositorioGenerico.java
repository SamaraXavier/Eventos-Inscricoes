package br.ufrpe.eventos_inscricoes.dados;

import br.ufrpe.eventos_inscricoes.negocio.beans.Entidade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioGenerico<T extends Entidade> implements IRepositorio<T> {

    protected List<T> lista;
    private final String nomeArquivo; // Nome do arquivo para persistência

    // Construtor agora recebe o nome do arquivo
    public RepositorioGenerico(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.lista = carregarArquivo(); // Carrega os dados do arquivo ao iniciar
    }

    @Override
    public void cadastrar(T obj) {
        lista.add(obj);
        salvarArquivo(); // Atualiza o arquivo após cadastrar
    }

    @Override
    public T buscar(long id) {
        for (T obj : lista) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public void remover(T obj) {
        if (lista.remove(obj)) {
            salvarArquivo(); // Atualiza o arquivo após remoção
        }
    }

    @Override
    public boolean existe(T obj) {
        return lista.contains(obj);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    // SALVAR OS OBJETOS NO ARQUIVO (Serialização)
    private void salvarArquivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            out.writeObject(lista); // Escreve a lista de objetos no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CARREGAR OS OBJETOS DO ARQUIVO (Desserialização)
    private List<T> carregarArquivo() {
        File file = new File(nomeArquivo);
        if (!file.exists()) {
            return new ArrayList<>(); // Se o arquivo não existir, retorna lista vazia
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) in.readObject(); // Lê e converte os bytes de volta para uma lista
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

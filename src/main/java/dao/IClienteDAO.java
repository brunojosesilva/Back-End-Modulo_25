package main.java.dao;

import main.java.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);

    public Cliente buscaPorCpf(Long cpf);

    Boolean excluir(Cliente cliente);

    Boolean alterar(Cliente cliente);
}

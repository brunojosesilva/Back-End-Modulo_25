package main.java.dao;

import main.java.Cliente;

public class ClienteDAO implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscaPorCpf(Long cpf) {
        return null;
    }

    @Override
    public Boolean excluir(Cliente cliente) {
        return null;
    }

    @Override
    public Boolean alterar(Cliente cliente) {
        return true;
    }
}

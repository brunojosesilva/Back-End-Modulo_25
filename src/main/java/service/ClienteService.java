package main.java.service;

import main.java.Cliente;
import main.java.dao.ClienteDAO;
import main.java.dao.IClienteDAO;

public class ClienteService implements IClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscaPorCpf(Long cpf) {
        return clienteDAO.buscaPorCpf(cpf);
    }

    @Override
    public Boolean excluir(Cliente cliente) {
        return true;
    }

    @Override
    public Boolean alterar(Cliente cliente) {
        return true;
    }
}

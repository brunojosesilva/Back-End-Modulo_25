package teste.java.dao;

import main.java.Cliente;
import main.java.dao.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscaPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
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

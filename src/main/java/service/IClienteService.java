package main.java.service;

import main.java.Cliente;

public interface IClienteService {

    public Boolean salvar(Cliente cliente);

    public Cliente buscaPorCpf(Long cpf);

    Boolean excluir(Cliente cliente);

    Boolean alterar(Cliente cliente);
}

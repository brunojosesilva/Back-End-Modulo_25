package teste.java;

import main.java.Cliente;
import main.java.dao.IClienteDAO;
import main.java.service.ClienteService;
import main.java.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import teste.java.dao.ClienteDAOMock;

public class ClienteDAOTeste {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTeste() {
        clienteDAO = new ClienteDAOMock();
    }

    // Usado para antes de cada teste ele faz este procedimento
    @Before
    public void init() {

        cliente = new Cliente();
        cliente.setCpf(11223445l);
        cliente.setNome("Bruno");
        cliente.setCidade("Brasilia");
        cliente.setEnd("rua");
        cliente.setEstado("DF");
        cliente.setNumero(11);
        cliente.setTel(121212l);

    }

    @Test
    public void pesquisarCliente() {
        System.out.println("Pesquisa");
        Cliente clienteConsultado = clienteDAO.buscaPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        System.out.println("Salvando");
        Boolean retornoSalvar = clienteDAO.salvar(cliente);
        Assert.assertTrue(retornoSalvar);
    }

    @Test
    public void excluirCliente() {
        System.out.println("Excluindo");
        Boolean retornoExcluir = clienteDAO.excluir(cliente);
        Assert.assertTrue(retornoExcluir);
    }

    @Test
    public void alterarCliente() {
        System.out.println("Alterando");
        Boolean retornoAlterar = clienteDAO.alterar(cliente);
        Assert.assertTrue(retornoAlterar);
    }
}

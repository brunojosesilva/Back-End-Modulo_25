package teste.java;

import main.java.Cliente;
import main.java.dao.IClienteDAO;
import main.java.service.ClienteService;
import main.java.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import teste.java.dao.ClienteDAOMock;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO daoMock = new ClienteDAOMock();
        clienteService = new ClienteService(daoMock);
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
        Cliente clienteConsultado = clienteService.buscaPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        System.out.println("Salvando");
        Boolean retornoSalvar = clienteService.salvar(cliente);
        Assert.assertTrue(retornoSalvar);
    }

    @Test
    public void excluirCliente() {
        System.out.println("Excluindo");
        Boolean retornoExcluir = clienteService.excluir(cliente);
        Assert.assertTrue(retornoExcluir);
    }

    @Test
    public void alterarCliente() {
        System.out.println("Alterando");
        Boolean retornoAlterar = clienteService.alterar(cliente);
        Assert.assertTrue(retornoAlterar);
    }
}

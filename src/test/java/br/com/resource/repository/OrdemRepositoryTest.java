package br.com.resource.repository;

import br.com.alura.model.Ordem;
import br.com.alura.repository.OrdemRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class OrdemRepositoryTest {


    @InjectMock
    OrdemRepository ordemRepository;

    /*
    Teste exemplo do repository, utilizando o Junit-mockito
     */
    @Test
    public void testarSeListAllRetornaOrdensCorretas() {
        Ordem primeiraOrdem = new Ordem();
        Ordem segundaOrdem = new Ordem();
        List<Ordem> ordens = new ArrayList<Ordem>();

        ordens.add(primeiraOrdem);
        ordens.add(segundaOrdem);

        Mockito.when(ordemRepository.listAll()).thenReturn(ordens);

        Assertions.assertSame(segundaOrdem, ordemRepository.listAll().get(1));
    }
}

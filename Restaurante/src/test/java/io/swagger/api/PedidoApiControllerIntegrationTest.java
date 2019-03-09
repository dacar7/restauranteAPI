package io.swagger.api;

import io.swagger.model.Pedido;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PedidoApiControllerIntegrationTest {

    @Autowired
    private PedidoApi api;

    @Test
    public void buscarPedidoTest() throws Exception {
        String idPedido = "idPedido_example";
        ResponseEntity<List<Pedido>> responseEntity = api.buscarPedido(idPedido);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void crearPedidoTest() throws Exception {
        Pedido body = new Pedido();
        ResponseEntity<Void> responseEntity = api.crearPedido(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

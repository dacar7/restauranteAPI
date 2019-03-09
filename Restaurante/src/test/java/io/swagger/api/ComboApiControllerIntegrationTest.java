package io.swagger.api;

import io.swagger.model.Combo;
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
public class ComboApiControllerIntegrationTest {

    @Autowired
    private ComboApi api;

    @Test
    public void buscarComboTest() throws Exception {
        String idCombo = "idCombo_example";
        ResponseEntity<Combo> responseEntity = api.buscarCombo(idCombo);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void reemplazarComboTest() throws Exception {
        String idCombo = "idCombo_example";
        Combo body = new Combo();
        ResponseEntity<Void> responseEntity = api.reemplazarCombo(idCombo, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

package io.swagger.api;

import io.swagger.model.Combo;
import io.swagger.model.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-09T15:05:13.892Z[GMT]")
@Controller
public class PedidoApiController implements PedidoApi {

    private static final Logger log = LoggerFactory.getLogger(PedidoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PedidoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Pedido>> buscarPedido(@ApiParam(value = "ingresar el id especifico del pedido") @Valid @RequestParam(value = "idPedido", required = false) String idPedido) {
        List<Pedido> lstPedido = new ArrayList<>();

        Pedido pedido1 = new Pedido();
        pedido1.setIdPedido("p100");
        pedido1.setNombre("pedido grande");
        pedido1.setUsuario("user1");
        pedido1.add(linkTo(methodOn(PedidoApi.class).buscarPedido(pedido1.getIdPedido())).withSelfRel());

        List<Combo> lstCombos = methodOn(PedidoApi.class).consultarCombosPedido(pedido1.getIdPedido());
        Link linkCombos = linkTo(lstCombos).withRel("TodosCombos");
        pedido1.add(linkCombos);

        Pedido pedido2 = new Pedido();
        pedido2.setIdPedido("p101");
        pedido2.setNombre("pedido mediano");
        pedido2.setUsuario("user2");
        pedido2.add(linkTo(methodOn(PedidoApi.class).buscarPedido(pedido2.getIdPedido())).withSelfRel());

        List<Combo> lstCombos2 = methodOn(PedidoApi.class).consultarCombosPedido(pedido2.getIdPedido());
        Link linkCombos2 = linkTo(lstCombos2).withRel("TodosCombos");
        pedido2.add(linkCombos2);

        if(pedido1.getIdPedido().equals(idPedido)){
            lstPedido.add(pedido1);
        }else if (pedido2.getIdPedido().equals(idPedido)){
            lstPedido.add(pedido2);
        }else{
            lstPedido.add(pedido1);
            lstPedido.add(pedido2);
        }

        return new ResponseEntity<List<Pedido>>(lstPedido, null, HttpStatus.OK);
    }

    public ResponseEntity<Void> crearPedido(@ApiParam(value = "Agrega un nuevo pedido"  )  @Valid @RequestBody Pedido body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public @ResponseBody List<Combo> consultarCombosPedido(@PathVariable("idPedido") String idPedido){
        List<Combo> lstCombo = new ArrayList<>();
        Combo combo1 = new Combo();
        combo1.setIdCombo("c100");
        combo1.setPlatoPpal("tamal");
        combo1.setPostre("flan de chocolate");
        combo1.add(linkTo(ComboApi.class).slash(combo1.getIdCombo()).withSelfRel());

        Combo combo2 = new Combo();
        combo2.setIdCombo("c200");
        combo2.setPlatoPpal("calentao");
        combo2.setPostre("fresas");
        combo2.add(linkTo(ComboApi.class).slash(combo2.getIdCombo()).withSelfRel());
        lstCombo.add(combo1);
        lstCombo.add(combo2);
        return lstCombo;
    }

}

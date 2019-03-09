package io.swagger.api;

import io.swagger.model.Combo;
import io.swagger.model.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-09T15:05:13.892Z[GMT]")
@Controller
public class ComboApiController implements ComboApi {

    private static final Logger log = LoggerFactory.getLogger(ComboApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ComboApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Combo> buscarCombo(@ApiParam(value = "ingresar el id especifico del combo",required=true) @PathVariable("idCombo") String idCombo) {

        //DTO de respuesta
        Combo combo = new Combo();
        combo.setIdCombo("c100");
        combo.setPlatoPpal("tamal");
        combo.setPostre("flan de chocolate");
        combo.add(linkTo(ComboApi.class).slash(combo.getIdCombo()).withSelfRel());

        //Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setExpires(1000);
        headers.set("MiHeader", "tamal sin sal");

        return new ResponseEntity<Combo>(combo, headers, HttpStatus.OK);
    }

    public ResponseEntity<Void> reemplazarCombo(@ApiParam(value = "ingresar el id especifico del combo",required=true) @PathVariable("idCombo") String idCombo,@ApiParam(value = "Agrega un nuevo pedido"  )  @Valid @RequestBody Combo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

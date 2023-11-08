package academy.wakanda.wakacop.pauta.apllication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PautaCadastradaResponse cadastraPauta(@RequestBody novaPautaRequest novaPauta);
}



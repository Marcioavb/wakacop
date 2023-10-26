package academy.wakanda.wakacop.sessaoVotacao.application.api;

import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao/abertura")
public interface SessaoVotacaoApi {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    SessaoArbeturaResponse abreSessao(@RequestBody SessaoAberturaRequest sessaoArbeturaRequest);
}

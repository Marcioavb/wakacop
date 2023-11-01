package academy.wakanda.wakacop.sessaoVotacao.application.api;

import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sessao")
public interface SessaoVotacaoApi {
    @PostMapping("/abertura")
    @ResponseStatus(HttpStatus.CREATED)
    SessaoArbeturaResponse abreSessao(@RequestBody SessaoAberturaRequest sessaoArbeturaRequest);

    @PostMapping("/{idSessao}/voto")
    @ResponseStatus(HttpStatus.CREATED)
    VotoResponse recebeVoto(@PathVariable UUID idSessao, @RequestBody VotoRequest novoVoto);
}

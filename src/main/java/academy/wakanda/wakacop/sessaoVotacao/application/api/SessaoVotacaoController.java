package academy.wakanda.wakacop.sessaoVotacao.application.api;

import academy.wakanda.wakacop.sessaoVotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoController implements SessaoVotacaoApi {
    private final SessaoVotacaoService sessaoVotacaoService;

    @Override
    public SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest) {
        log.info("[inicia] SessaoVotacaoController - abreSessao");
        SessaoArbeturaResponse sessaoArbeturaResponse = sessaoVotacaoService.abreSessao(sessaoArbeturaRequest);
        log.info("[finaliza] SessaoVotacaoController - abreSessao");
        return sessaoArbeturaResponse;
    }
}

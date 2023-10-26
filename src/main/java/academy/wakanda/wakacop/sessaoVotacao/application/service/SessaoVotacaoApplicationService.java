package academy.wakanda.wakacop.sessaoVotacao.application.service;

import academy.wakanda.wakacop.pauta.apllication.repository.PautaRepository;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoArbeturaResponse;
import academy.wakanda.wakacop.sessaoVotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaoVotacaoRepository;

    @Override
    public SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest) {
        log.info("[inicia] SessaoVotacaoApplicationService - abreSessao");
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoArbeturaRequest));
        log.info("[finaliza] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoArbeturaResponse(sessaoVotacao);
    }
}

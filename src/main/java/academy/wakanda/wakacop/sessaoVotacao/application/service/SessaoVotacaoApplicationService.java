package academy.wakanda.wakacop.sessaoVotacao.application.service;

import academy.wakanda.wakacop.pauta.apllication.repository.PautaRepository;
import academy.wakanda.wakacop.pauta.apllication.service.PautaService;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoArbeturaResponse;
import academy.wakanda.wakacop.sessaoVotacao.application.api.VotoRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.VotoResponse;
import academy.wakanda.wakacop.sessaoVotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import academy.wakanda.wakacop.sessaoVotacao.domain.VotoPauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaoVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest) {
        log.info("[inicia] SessaoVotacaoApplicationService - abreSessao");
        Pauta pauta = pautaService.getPautaPorId(sessaoArbeturaRequest.getIdPauta());
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoArbeturaRequest, pauta));
        log.info("[finaliza] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoArbeturaResponse(sessaoVotacao);
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.info("[inicia] SessaoVotacaoApplicationService - recebeVoto");
        SessaoVotacao sessao = sessaoVotacaoRepository.buscaPorId(idSessao);
        VotoPauta voto = sessao.recebeVoto(novoVoto);
        sessaoVotacaoRepository.salva(sessao);
        log.info("[finaliza] SessaoVotacaoApplicationService - recebeVoto");
        return new VotoResponse(voto);
    }
}

package academy.wakanda.wakacop.sessaoVotacao.application.service;

import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoArbeturaResponse;

public interface SessaoVotacaoService {
    SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest);
}

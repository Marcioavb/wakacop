package academy.wakanda.wakacop.sessaoVotacao.application.service;

import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.SessaoArbeturaResponse;
import academy.wakanda.wakacop.sessaoVotacao.application.api.VotoRequest;
import academy.wakanda.wakacop.sessaoVotacao.application.api.VotoResponse;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}

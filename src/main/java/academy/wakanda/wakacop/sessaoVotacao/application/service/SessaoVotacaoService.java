package academy.wakanda.wakacop.sessaoVotacao.application.service;

import academy.wakanda.wakacop.sessaoVotacao.application.api.*;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoArbeturaResponse abreSessao(SessaoAberturaRequest sessaoArbeturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
    ResultadoSessaoResponse obtemRecebe(UUID idSessao);
}

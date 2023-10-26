package academy.wakanda.wakacop.sessaoVotacao.application.api;

import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class SessaoArbeturaResponse {
    private UUID idSessao;
    public SessaoArbeturaResponse(SessaoVotacao sessaoVotacao) {
        this.idSessao = sessaoVotacao.getId();
    }
}

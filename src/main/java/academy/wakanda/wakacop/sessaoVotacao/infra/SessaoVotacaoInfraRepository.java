package academy.wakanda.wakacop.sessaoVotacao.infra;

import academy.wakanda.wakacop.sessaoVotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Log4j2
@Repository
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaoVotacaoSpringDataJPARepopsitory sessaoVotacaoSpringDataJPARepopsitory;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[inicia] SessaoVotacaoInfraRepository - salva");
        sessaoVotacaoSpringDataJPARepopsitory.save(sessaoVotacao);
        log.info("[finaliza] SessaoVotacaoInfraRepository - salva");
        return sessaoVotacao;
    }
}

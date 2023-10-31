package academy.wakanda.wakacop.sessaoVotacao.infra;

import academy.wakanda.wakacop.sessaoVotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.UUID;

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

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.info("[inicia] SessaoVotacaoInfraRepository - buscaPorId");
        SessaoVotacao sessao = sessaoVotacaoSpringDataJPARepopsitory.findById(idSessao)
                        .orElseThrow(()-> new RuntimeException("Sessao Nao encontrada"));
        log.info("[finaliza] SessaoVotacaoInfraRepository - buscaPorId");
        return sessao;
    }
}

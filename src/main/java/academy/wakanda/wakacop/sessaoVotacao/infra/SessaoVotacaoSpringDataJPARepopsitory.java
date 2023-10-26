package academy.wakanda.wakacop.sessaoVotacao.infra;

import academy.wakanda.wakacop.sessaoVotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepopsitory extends JpaRepository<SessaoVotacao, UUID> {
}

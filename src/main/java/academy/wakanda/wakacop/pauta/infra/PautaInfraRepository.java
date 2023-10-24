package academy.wakanda.wakacop.pauta.infra;

import academy.wakanda.wakacop.pauta.apllication.repository.PautaRepository;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[inicia] PautaInfraRepository - salva");
        pautaSpringDataJPARepository.save(pauta);
        log.info("[finaliza] PautaInfraRepository - salva");
        return pauta;
    }
}

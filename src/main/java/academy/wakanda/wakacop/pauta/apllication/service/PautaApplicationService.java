package academy.wakanda.wakacop.pauta.apllication.service;

import academy.wakanda.wakacop.pauta.apllication.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.apllication.api.novaPautaRequest;
import academy.wakanda.wakacop.pauta.apllication.repository.PautaRepository;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(novaPautaRequest novaPauta) {
        log.info("[inicia] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}", novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finaliza] PautaApplicationService - cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {
        log.info("[inicia]  PautaApplicationService - getPautaPorId");
        Pauta pauraPrId = pautaRepository.buscaPautaPorId(idPauta);
        log.info("[finaliza]  PautaApplicationService - getPautaPorId");
        return pauraPrId;
    }
}


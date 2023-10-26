package academy.wakanda.wakacop.pauta.apllication.service;

import academy.wakanda.wakacop.pauta.apllication.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.apllication.api.novaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.Pauta;

import java.util.UUID;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(novaPautaRequest novaPauta);
    Pauta getPautaPorId(UUID idPauta);
}

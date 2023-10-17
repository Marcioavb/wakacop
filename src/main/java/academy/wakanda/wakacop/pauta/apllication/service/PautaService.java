package academy.wakanda.wakacop.pauta.apllication.service;

import academy.wakanda.wakacop.pauta.apllication.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.apllication.api.novaPautaRequest;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(novaPautaRequest novaPauta);
}

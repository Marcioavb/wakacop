package academy.wakanda.wakacop.pauta.apllication.api;

import academy.wakanda.wakacop.pauta.apllication.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PautaController implements PautaApi {
    private final PautaService pautaService;

    @Override
    public PautaCadastradaResponse cadastraPauta(novaPautaRequest novaPauta) {
        log.info("[inicia] PautaController - cadastraPauta");
        PautaCadastradaResponse pautaCadastrada = pautaService.cadastraPauta(novaPauta);
        log.info("[finaliza] PautaController - cadastraPauta");
      return pautaCadastrada;
    }
}

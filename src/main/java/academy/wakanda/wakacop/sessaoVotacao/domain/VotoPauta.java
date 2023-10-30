package academy.wakanda.wakacop.sessaoVotacao.domain;

import academy.wakanda.wakacop.sessaoVotacao.application.api.VotoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VotoPauta {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sessao_votacao_id")
    private SessaoVotacao sessaoVotacao;
    private String cpfAssociado;
    private OpcaoVotos opcaoVotos;
    private LocalDateTime momentoVoto;

    public VotoPauta(SessaoVotacao sessaoVotacao, VotoRequest votoRequest) {
        this.sessaoVotacao = sessaoVotacao;
        this.cpfAssociado = votoRequest.getCpfAssociado();
        this.opcaoVotos = votoRequest.getOpcao();
        this.momentoVoto = LocalDateTime.now();
    }
}
# Wakacop

Desenvolvemos com sucesso uma solução back-end baseada na nuvem para gerenciar sessões de votação em um contexto de cooperativismo. Esta solução oferece uma API REST com funcionalidades abrangentes:

- Cadastro de Pautas: Agora é possível cadastrar pautas de votação de forma simples e eficiente, proporcionando uma maneira fácil de incluir novas questões na agenda das sessões.

- Abertura de Sessões de Votação: As sessões de votação podem ser abertas com facilidade e precisão, permitindo especificar um tempo determinado para a votação. A configuração padrão de 1 minuto economiza tempo na preparação das sessões.

- Recebimento de Votos: Associados têm a capacidade de expressar suas opiniões de maneira clara e inequívoca, com a escolha entre 'Sim' ou 'Não'. Cada associado é identificado por um ID único, garantindo a integridade do processo.

- Contabilização dos Votos e Resultados: A solução tem a capacidade de contabilizar os votos de maneira precisa e fornece resultados imediatos. Isso permite uma tomada de decisão ágil e transparente.

- Persistência de Dados: A segurança dos dados é uma prioridade, e a persistência das pautas e votos está garantida, mesmo em caso de reinício da aplicação. Isso garante a integridade dos registros e a rastreabilidade das decisões tomadas.

Nossa solução proporciona um ambiente confiável para a gestão de votações em cooperativas, com uma API REST que simplifica o processo de votação, desde o cadastro das pautas até a divulgação dos resultados, enquanto garante a persistência dos dados em todos os momentos.


## Tecnologias e bibliotecas usadas
- ``Java 11``
- ``Spring Boot 3+``
- ``Spring Data JPA``
- ``H2 Database``
- ``Swagger 3``
- ``Lombok``
- ``Feign``

## Endpoint
- `POST /pauta`: Cadastrar uma nova Pauta para uma convocação de sessão.
- `POST /sessao/abertura`: Arbetura de uma sessão para votação.
- `POST /sessao/{idSessao}/voto`: Cadastrar um voto.
- `GET /sessao/{idSessao}/resultado`: Buscar os resultados da sessão.

# postman

https://elements.getpostman.com/redirect?entityId=23408890-dc5c8d81-0749-4541-a136-8026de109d1c&entityType=collection

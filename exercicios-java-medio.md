# Lista de Exercícios de Java — Nível Médio

Cada exercício descreve uma situação. Nenhum enunciado diz qual estrutura de linguagem usar —
parte do exercício é você olhar para o problema e reconhecer o conceito por trás dele.
Os conceitos estão nos títulos das seções só para fins de organização do seu estudo;
tente resolver o exercício sem espiar o título antes de pensar no problema.

---

## 1. Generics

**1.1 — Repositório Reutilizável**
Um sistema precisa armazenar, buscar por id e remover registros de várias entidades diferentes (produtos, clientes, pedidos). Hoje existe uma classe de repositório separada para cada entidade, com código quase idêntico entre elas, mudando só o tipo armazenado. Reorganize isso para eliminar a duplicação, mantendo a segurança de tipos (ou seja, não deve ser possível inserir um `Cliente` num repositório destinado a `Produto`).

**1.2 — Maior Valor entre Itens Comparáveis**
Você precisa de uma função que descubra o "maior" item de uma lista — às vezes é uma lista de preços, às vezes de datas de vencimento, às vezes de notas de avaliação. Hoje existe uma função `maiorPreco`, outra `maiorData`, outra `maiorNota`, todas fazendo a mesma lógica de comparação. Unifique isso em uma única função que funcione para qualquer tipo de item, desde que os itens possam ser comparados entre si.

---

## 2. Interfaces

**2.1 — Canais de Notificação**
Um sistema envia notificações por e-mail. O time de produto quer, nos próximos meses, adicionar notificação por SMS e por push, e possivelmente mais canais depois disso — sem que o código que "decide disparar uma notificação" precise saber os detalhes de cada canal, nem seja alterado toda vez que um canal novo for adicionado.

**2.2 — Formas de Pagamento no Carrinho**
Um carrinho de compras hoje só aceita cartão de crédito, e o método de finalizar compra tem a lógica de cobrança do cartão escrita diretamente nele. Agora é preciso aceitar também boleto e Pix, cada um com uma forma completamente diferente de processar o pagamento, mas o carrinho não deveria precisar saber os detalhes de "como" cada forma de pagamento funciona por dentro.

---

## 3. Lambdas e Funções de Alta Ordem

**3.1 — Regras de Desconto por Tipo de Cliente**
Uma loja aplica descontos diferentes dependendo do tipo de cliente (novo, fidelidade, VIP), e a fórmula de cada tipo muda com frequência conforme campanhas de marketing. Hoje existe um bloco gigante de `if/else` decidindo a fórmula. O time quer poder trocar a fórmula de um tipo de cliente específico sem precisar alterar o restante do sistema nem criar uma classe nova a cada campanha.

**3.2 — Gerador de Regras de Validação**
Vários formulários do sistema precisam validar se um número está dentro de uma faixa (idade entre 18 e 65, nota entre 0 e 10, quantidade entre 1 e 100, etc.). Em vez de escrever uma validação específica para cada faixa espalhada pelo código, você precisa de uma forma de "fabricar" uma regra de validação sob demanda, dado apenas o mínimo e o máximo desejados, para reutilizar em qualquer lugar do sistema.

---

## 4. Streams e Programação Funcional

**4.1 — Categorias Mais Vendidas**
Dada a lista de pedidos de um e-commerce (cada um com produto, categoria e valor), descubra o total vendido por categoria e liste as três categorias com maior faturamento, em ordem decrescente.

**4.2 — Palavras Mais Usadas em Avaliações**
Você tem uma lista de textos de avaliações de clientes sobre um produto. Descubra quais palavras aparecem com mais frequência no total (ignorando diferenças de maiúsculas/minúsculas), considerando todas as avaliações juntas, não uma de cada vez.

---

## 5. SOLID

**5.1 — Exportação de Relatórios**
Um sistema de relatórios hoje só sabe gerar arquivos em PDF, e a lógica de "montar o relatório" está misturada com a lógica de "desenhar o PDF" na mesma classe. O cliente acabou de pedir suporte a exportação em Excel e, futuramente, HTML. Como você reorganizaria esse código para atender esse pedido sem reescrever a lógica de montagem do relatório a cada novo formato?

**5.2 — Classe Funcionário Sobrecarregada**
A classe `Funcionario` do sistema de RH hoje calcula o próprio salário, registra a própria folha de ponto e também gera seu contracheque em PDF, tudo dentro dos métodos da mesma classe. O time quer escrever testes automatizados só para a regra de cálculo de salário, mas isso está exigindo simular geração de PDF e banco de dados de ponto, o que torna os testes lentos e frágeis. Como você resolveria isso?

---

## 6. Strings (Manipulação Avançada)

**6.1 — Extração de Campos de um Log**
Um sistema de monitoramento recebe linhas de log no formato `2026-09-02 14:32:10 ERROR Falha ao conectar ao banco`. Você precisa separar a data, a hora, o nível do log (INFO, ERROR, WARN) e a mensagem em campos distintos, para depois poder filtrar e contar quantos logs de cada nível ocorreram em um arquivo inteiro.

**6.2 — Geração de Iniciais Formatadas**
Dado o nome completo de uma pessoa, que pode ter dois ou mais nomes do meio (ex.: "Maria da Silva Santos"), gere uma versão abreviada mantendo o primeiro nome por extenso, abreviando os nomes do meio com ponto, e mantendo o último sobrenome completo (ex.: "Maria d. S. Santos").

---

## 7. Utilitários de `java.util`

**7.1 — Cadastro sem E-mails Duplicados, em Ordem de Chegada**
Um sistema de cadastro precisa impedir que dois usuários se registrem com o mesmo e-mail, permitir busca rápida por e-mail exato, e ainda listar todos os usuários exatamente na ordem em que foram cadastrados (não em ordem alfabética nem aleatória).

**7.2 — Fila de Atendimento com Prioridade**
Um totem de atendimento distribui senhas normais e preferenciais. Senhas preferenciais devem sempre ser chamadas antes das normais, mas dentro do mesmo tipo de senha, quem chegou primeiro deve ser atendido primeiro. Como você organizaria a estrutura que guarda as senhas aguardando atendimento?

---

## 8. Optional

**8.1 — Telefone de Contato no Cartão de Visita**
No perfil de um usuário, o campo "telefone secundário" pode não estar preenchido. Ao gerar um cartão de contato digital, se não houver telefone secundário, deve-se usar o telefone principal; se nenhum dos dois existir, a linha de telefone simplesmente não deve aparecer no cartão — sem lançar erro em nenhum desses casos.

**8.2 — Produto Substituto no Catálogo**
Ao buscar um produto pelo código no catálogo, se ele não for encontrado, o sistema deve sugerir automaticamente um produto substituto de categoria semelhante; e só se nenhum substituto existir, o sistema deve informar que o produto está indisponível. Nenhuma dessas situações (produto não encontrado, sem substituto) é considerada um erro do sistema — são casos esperados do fluxo normal.

---

## 9. Exceções Customizadas

**9.1 — Regras de Reserva de Voo**
Um sistema de reservas deve recusar uma reserva quando o voo está lotado, quando o passageiro já tem uma reserva duplicada no mesmo voo, ou quando o CPF informado é inválido. Cada uma dessas situações precisa ser tratada de forma diferente pela tela de atendimento (mensagens diferentes, e em um dos casos uma ação automática de sugerir outro voo) — sem que a tela precise adivinhar qual problema ocorreu a partir do texto da mensagem de erro.

**9.2 — Importação de Arquivos com Falha no Meio**
Um processo de importação abre vários arquivos para leitura. Se a leitura de um deles falhar no meio do processo, todos os arquivos já abertos precisam ser fechados corretamente mesmo assim. E se o fechamento de algum arquivo também falhar, essa segunda falha não pode simplesmente desaparecer silenciosamente — ela precisa continuar visível para quem for investigar o problema depois.

---

## 10. Enums Avançados

**10.1 — Máquina de Vendas Automática**
Uma máquina de vendas automática passa por estados bem definidos: aguardando pagamento, pago, dispensando produto, e erro. O comportamento do botão "confirmar" muda completamente dependendo do estado atual da máquina, mas a lista de estados possíveis é fixa e não muda com frequência.

**10.2 — Bônus por Cargo**
O sistema de folha de pagamento calcula bônus de forma diferente para cada categoria de cargo (júnior, pleno, sênior), cada uma com sua própria fórmula. Essas fórmulas raramente mudam, mas o time de RH precisa conseguir consultar facilmente qual é a regra de cada categoria sem vasculhar um método cheio de condicionais.

---

## 11. `equals`/`hashCode` e `Comparable`/`Comparator`

**11.1 — Identidade de Produto pelo Código de Barras**
No cadastro de produtos, dois registros devem ser considerados "o mesmo produto" quando têm o mesmo código de barras — mesmo que o preço ou a descrição tenham sido atualizados entre um cadastro e outro. Isso precisa funcionar corretamente quando os produtos são colocados em uma coleção que não permite duplicados.

**11.2 — Ordenação Flexível de Candidatos**
Uma lista de candidatos a uma vaga precisa poder ser ordenada, dependendo do relatório que o recrutador quer gerar, tanto por nota do teste técnico (do maior para o menor) quanto por tempo de experiência (do menor para o maior) — e o recrutador deve poder escolher esse critério na hora de gerar o relatório, sem que exista uma função de ordenação hardcoded para cada combinação possível.

---

*Dica: se você não conseguir enxergar de cara qual estrutura resolve o problema, tente primeiro descrever em uma frase "o que muda" e "o que fica fixo" no cenário — isso costuma apontar diretamente para o conceito certo.*

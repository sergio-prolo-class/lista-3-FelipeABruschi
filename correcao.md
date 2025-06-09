# Correção

| Questão     | Legibilidade | Diagramas | P1 | P2 | P3 | Total |
|-------------|--------------|-----------|----|----|----|-------|
| Nota máxima | 10           | 10        | 20 | 25 | 35 | 100   |
| Nota        | 2            | 0         | 17 | 4  | 0  | 23    |

pacote do sistema de gerenciamento de logins com nome ifsc.poo

## Diagramas


## P1

- SoC: Gerenciador usa println, deveria ser preocupação apenas de App
- Set é uma classe que já cuida de duplicatas, se bem usada. não precisas verificar na mão
  - Contudo, você não sobrescreve equals() e hashCode() de Usuario
  - Então, o Set não iria funcionar bem sem sua verificação manual
- Listar usuários deveria listar apenas os logins, listar senhas é uma falha de segurança
- App não testa remoção

### Requisitos Funcionais
- [x] Cadastrar novos usuários
- [x] Remover usuários
- [x] Listar os logins
- [x] Autenticar usuários

## P2

- Sua solução não usa Filas, então não respeita FIFO
- Crias uma lista de clientes, e não solicitações
- Objeto solicitação não sabe qual cliente o fez
- Construtor de solicitacao gera uma exceção que não é tratada pelo Cliente
- Se um Cliente gera uma nova solicitação, ele continua com o atributo atendido como true
- Não há garantia de telefone único de clientes 

### Requisitos Funcionais
- [ ] Registrar novas solicitações
- [x] Listar os telefones dos clientes registrados
- [ ] Imprimir o nome do próximo cliente
- [ ] Atender o próximo cliente
- [ ] Listar os nomes dos clientes já atendidos
- [ ] Listar os telefones dos clientes em espera
- [ ] Gerar um relatório estatístico
- [ ] ... total de solicitações registradas, atendidas, em espera
- [ ] ... distribuição percentual das solicitações por categoria

## P3

não fez

### Requisitos Funcionais
- [ ] Cadastrar autores
- [ ] Cadastrar livros
- [ ] Cadastrar leitores
- [ ] Registrar empréstimos de livros para leitores
- [ ] ... pelo menos uma cópia
- [ ] ... leitor não tenha esse livro
- [ ] ... leitor possua no máximo 5 livros emprestados
- [ ] Listar autores em ordem alfabética
- [ ] Listar leitores em ordem alfabética
- [ ] Listar leitores por id
- [ ] Listar livros por título
- [ ] Listar livros por autor
- [ ] Listar livros por ISBN
- [ ] Listar empréstimos por data
- [ ] Listar empréstimos de um leitor, por data
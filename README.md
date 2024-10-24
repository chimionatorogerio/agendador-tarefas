<< Atualmente estou trabalhando no desenvolvimento desta aplicação no microsserviço  Notificação por email >>

A principal função dessa aplicação será enviar p/ o usuário um lembrete das tarefas que ele agendou.

METODOLOGIA ÁGIL KANBAN
Vamos dividir a aplicação em quatro microsserviços. p/ cada microsserviço, faremos uma lista de tarefas. O objetivo é melhorar a organização do projeto e agilizar o desenvolvimento da aplicação.

MICROSSERVIÇOS QUE PRECISAM SER DESENVOLVIDOS
1) Cadastro de usuários ✅
2) Agendador de tarefas ✅
3) Notificação por email (em desenvolvimento)
4) BFF (Back-end For Front-end). Este padrão de arquitetura fará a intermediação entre os 3 primeiros microsserviços e o Front-end

CADASTRO DE USUÁRIOS - TAREFAS ✅
Criar o banco de dados db_usuario no PostegreSQL ✅
Inicializar a aplicação usando o Spring Initializr ✅
Criar o repositório usuario no GitHub ✅
Configurar o CI/CD ✅
Configurar a segurança com Spring Security ✅
Criar método:
- Post p/ cadastrar usuários ✅
- Get p/ buscar usuários ✅
- Delete p/ excluir usuários ✅
- de login de usuário ✅
Criar métodos Put p/ alterar:
- Nome, email e senha ✅
- Endereços ✅
- Telefones ✅
Criar métodos Post p/ que usuários já cadastrados possam incluir um:
- Endereço ✅
- Telefone ✅

AGENDADOR DE TAREFAS - TAREFAS
Criar o banco de dados NoSQL db_agendador no MongoDB ✅
Criar o esqueleto do projeto no Spring ✅
Criar o repositório agendador no GitHub ✅
Criar o Security ✅
Criar método:
- Post/cadastrar tarefas ✅
- Get/buscar tarefas por:
> data ✅
> email ✅
- Put/alterar tarefas ✅
- Patch/alterar status das tarefas ✅
- Delete/excluir tarefas ✅

NOTIFICAÇÃO POR EMAIL - TAREFAS
Criar método p/ enviar email

BFF - TAREFAS
Criar endpoints que apontam p/ o: 
- Cadastro de usuários
- Agendador de tarefas
Criar cron que chama a notificação por email

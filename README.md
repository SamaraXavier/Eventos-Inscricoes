# Sistema de Eventos e Inscrições

## Colaboradores 

- Cauã Wallacy Gomes Teodoro - caua.wallacy@ufrpe.br
- Samara Monteiro Xavier - samara.xavier@ufrpe.br

## Descrição geral do projeto
Este sistema será uma plataforma para o gerenciamento de eventos e inscrições. Ele permitirá a criação, publicação e administração de eventos de diferentes tipos, como conferências, workshops, cursos, shows e seminários, com foco em facilitar o processo de inscrição dos participantes. O administrador será responsável por criar os eventos, definir sua descrição, datas, localização e capacidade, enquanto os usuários poderão se inscrever, acompanhar o status de suas inscrições e receber notificações sobre o evento.

O sistema também permitirá que os organizadores monitorem a participação, visualizem o número de inscrições, enviem e-mails de confirmação ou lembretes aos inscritos e façam o acompanhamento do evento. Para tornar a experiência mais rica, o sistema poderá incluir funcionalidades como envio de e-mails de boas-vindas, check-in no evento e a geração de certificados de participação.

**Exemplo de sistemas reais**: Plataformas como **Eventbrite**, **Sympla** e **Ticketmaster** oferecem funcionalidades semelhantes, com a criação de eventos, inscrições online e notificações de status.

## Requisitos Funcionais

### Gerenciamento de Entidades
- **REQ01**: Gerenciamento de usuários, permitindo a criação de contas, login, visualização de eventos e inscrição em eventos.
- **REQ02**: Gerenciamento de eventos, com funcionalidades para criação, edição e remoção de eventos.
- **REQ03**: Gerenciamento de inscrições, onde o sistema permite que os usuários se inscrevam, cancelem ou confirmem suas inscrições em eventos.

### Cadastro e Detalhes dos Eventos
- **REQ04**: Criação de eventos, com informações detalhadas como título, descrição, data, hora, local, preço (se aplicável) e número máximo de participantes.
- **REQ05**: Adicionar recursos ao evento, como upload de materiais (por exemplo, agendas, mapas) ou links para webinars.
- **REQ06**: Definir o número máximo de inscrições para cada evento, gerenciando a capacidade do evento.

### Inscrição e Participação
- **REQ07**: Sistema de inscrição para eventos, permitindo que os usuários se inscrevam de forma simples, com verificação do status da inscrição (pendente, confirmada, cancelada).
- **REQ08**: Capacidade de visualizar eventos em que o usuário está inscrito, com opção de cancelamento de inscrição.
- **REQ09**: Envio de confirmação de inscrição por e-mail para o usuário, com informações do evento e instruções importantes.

### Acompanhamento e Notificações
- **REQ10**: Sistema de lembretes automáticos para os participantes antes da data do evento (ex.: 1 dia antes, 1 semana antes).
- **REQ11**: Envio de notificações por e-mail ou SMS em caso de alterações no evento, como mudança de data, local ou horário.
- **REQ12**: Check-in no evento, permitindo que o participante marque presença e receba confirmação de participação.

### Certificação e Feedback
- **REQ13**: Geração de certificados de participação, com a possibilidade de personalizar o layout e incluir detalhes do evento.
- **REQ14**: Coleta de feedback dos participantes sobre o evento, permitindo que os organizadores melhorem eventos futuros com base nas respostas recebidas.

### Relatórios e Estatísticas
- **REQ15**: Geração de relatórios sobre o número de inscrições, taxa de comparecimento, feedback recebido e outros dados relacionados ao evento.
- **REQ16**: Visualização de gráficos e relatórios sobre a performance do evento, com estatísticas de engajamento e sucesso da promoção.

## Possíveis APIs/Bibliotecas a serem usadas
- **Google Calendar API**: Para integração com calendários dos usuários, permitindo a sincronização de datas e lembretes de eventos.
- **Twilio API** ou **SendGrid API**: Para envio de notificações por SMS ou e-mail, como confirmações de inscrição ou alertas de mudança de evento.
- **iText API**: Para a geração de certificados em formato PDF.

## Cronograma de MVPs

### **MVP 1 - Cadastro e Gestão Básica de Eventos**
Objetivo: Criar a base do sistema permitindo a criação e inscrição em eventos.

**Requisitos incluídos:**
- **REQ01**: Gerenciamento de usuários (cadastro, login, autenticação).
- **REQ02**: Criação, edição e exclusão de eventos.
- **REQ04**: Informações detalhadas dos eventos (título, descrição, data, local, capacidade).
- **REQ07**: Inscrição nos eventos com status (pendente, confirmada, cancelada).
- **REQ08**: Listagem de eventos em que o usuário está inscrito.
- **REQ09**: Envio de confirmação de inscrição por e-mail.

### **MVP 2 - Notificações e Acompanhamento**
Objetivo: Melhorar a experiência do usuário com lembretes e comunicação eficiente.

**Requisitos incluídos:**
- **REQ10**: Sistema de lembretes automáticos para participantes.
- **REQ11**: Envio de notificações sobre alterações nos eventos.
- **REQ12**: Check-in no evento para confirmação de presença.

### **MVP 3 - Certificação e Feedback**
Objetivo: Adicionar funcionalidades para certificação e avaliação dos eventos.

**Requisitos incluídos:**
- **REQ13**: Geração de certificados personalizados.
- **REQ14**: Coleta de feedback dos participantes.

### **MVP 4 - Relatórios e Estatísticas**
Objetivo: Implementar ferramentas de análise para os organizadores.

**Requisitos incluídos:**
- **REQ15**: Relatórios sobre número de inscrições e taxa de comparecimento.
- **REQ16**: Visualização de estatísticas do evento.

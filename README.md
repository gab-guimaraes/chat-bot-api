<h1>Chat Bot API</h1>
<h4>by: Gabriel Guimarães</h4>
<h3>Java, Spring Boot, MongoDB, Lombok</h3>

<p>Projeto originalmente criado no GitHub <a href="https://github.com/johnwick182/chat-bot-api">https://github.com/johnwick182/chat-bot-api</a> e exportado para o GitLab</p>
<br>
<h4>Como executar:</h4>
<p>1. Baixar o projeto</p>
<p>2. Iniciar o mongoDB na porta 27017</p>
<p>3. Executar o comando no terminal <b>mvn spring-boot:run</b> na raiz do projeto</p>
<br>
<h4>Observação</h4>
<p>Database e collections serão criadas automaticamente pela API</p>
<p>Colletion com endpoints e exemplos disponível em /colletions</p>
<p>Criei a API com Java (Spring Boot) e MongoDB. Criei duas colletions, Bot e Message para armazenar os dados.</p>
<p>Criei todas as operações sugeridas e também uma adicional para listar todos os bots</p>
<p>Os ids são criados automaticamente pelo MongoDB e retornados nas chamadas da API</p>
<p>Os id da conversa, from e to devem ser passados pelo client.</p>

<br>
<br>
<p>Endpoints:
<br>
<b>/BOT</b>
  <ul>
    <li>[GET]    /bot/all - lista todos os bots criados </li>
    <li>[GET]    /bot/:id - busca bot por id </li>
    <li>[POST]   /bot/    - cria um novo bot</li>
    <li>[DELETE] /bot/:id - deleta o bot por id</li>
    <li>[PUT]    /bot/:id - altera o bot </li>
    </ul> 
   <br>
   
<b>/MESSAGE</b>

 <ul>
    <li>[POST] /message - criar nova mensagem</li>
    <li>[GET]  /message/:id - busca mensagem por id</li>
    <li>[GET]  /message/conversation/:id - busca mensagens de uma determinada conversa</li>
    </ul> 

<img src="img/mongoDBdraw.png" alt="mongodb">

<h1>Testes Postman</h1>

<h1>List All Bots</h1>
<img src="img/AllBots.png" alt="All bots">
<br>
<h1>Get Bot By Id</h1>
<img src="img/getBotById.png" alt="Get Bot By Id">
<br>
<h1>Create Bot</h1>
<img src="img/CreateBot.png" alt="Create bot">
<br>
<h1>Delete Bot</h1>
<img src="img/DeleteBot.png" alt="Delete bot">
<br>
<h1>Update Bot</h1>
<img src="img/UpdateBot.png" alt="Update bot">

<h1>Create New Message</h1>
<img src="img/postNewMessage.png" alt="Create New Message">

<h1>Get Message By Conversation</h1>
<img src="img/getMessageByConversation.png" alt="Get Message By convesation">
<h1>Get Message By Id</h1>
<img src="img/getMessageById.png" alt="Get Message By id">


<h1>Testes de Performance</h1>
<h4>Realizados em: Macbook Air - 8gb RAM - i5</h4>
<h3>Teste l</h3>
<img src="img/performanceTests/firstTest/firstscreen.png" alt="All bots">
<img src="img/performanceTests/firstTest/hitsPerSecond.png" alt="All bots">
<img src="img/performanceTests/firstTest/responseTime.png" alt="All bots">
<hr>
<h3>Teste ll</h3>
<img src="img/performanceTests/secondTest/firstscreen.png" alt="All bots">
<img src="img/performanceTests/secondTest/hitsPerSecond.png" alt="All bots">
<img src="img/performanceTests/secondTest/responseTime.png" alt="All bots">

<p> Débitos e melhorias:</p>
<ul>
<li>Criar testes unitários</li>
<li>Implementar camada de análise de mensagens e respostas do Bot (avaliar solução: DialogFlow)</li>
<li>Implementar JWT Token</li>
</ul>

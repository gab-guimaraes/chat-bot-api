<h1>Chat Bot API</h1>
<h4>by: Gabriel Guimarães</h4>
<h5>Java, Spring Boot, MongoDB, Lombok</h5>
<br>
<p>Como executar:</p>
<p>1. Baixar o projeto</p>
<p>2. Iniciar o mongoDB na porta 27017</p>
<p>3. Executar o comando no terminal mvn spring-boot:run na raiz do projeto</p>
<p>Database e collections serão criadas automaticamente pela API</p>
<p>Colletion com endpoints e exemplos disponível em /colletions</p>

<br>

<p> Débitos e melhorias:</p>
<ul>
<li>Criar testes unitários</li>
<li></li>
<li>Criar testes unitários</li>

</ul>


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



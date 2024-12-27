API com interface crud escrita em java.


Versão do java: 17

Banco de dados utilizado: Postgresql

Api estruturada com o framework java spring boot.

# MÉTODO GET:

url:localhost:8080/

retorna a página html do blog com uma listagem dos blog's mais recentes, ordenados pela data(Decrescente).

url:localhost:8080/Post/{id}

retorna uma postágem em específico utilizando o id como parâmetro.

# MÉTODO POST:

url:localhost:8080/

Através deste método você poderá realizar uma inserção no banco de dados de um novo blog.

Os valores deverão ser escritos desta forma em formato json:
{
  "title": "aqui você insere o título",
  "blog": "aqui fica o texto do blog"
}

O id e a data de criação do blog serão gerenciados automaticamnte pela API.

# MÉTODO DELETE:


url:localhost:8080/{id}

Neste método para deletar um blog você precisará inserir seu ID como parâmetro na url.

# MÉTODO PUT:

url:localhost:8080/{id}

No método put vc precisará inserir o id como parâmetro e inserir os novos valores que serão atualizados, como mostrado no método post.




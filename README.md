# alticci-sequence
Repositório para sequência de alticci utilizando java e arquitetura rest.
Neste projeto também foi utilizado swagger para documentação da API e um
Dockerfile para criar imagem docker da aplicação.

Primeiro passo para ter acesso ao código fonte é baixando 
o repositório via github na URL:
https://github.com/igormelo9001/alticci-sequence.git


Instruções para executar localmente via browser ou client
de requisição HTTP:

Utilizando uma IDE para execução (Meu ambiente no caso é Intellij) 
basta mandar executar o arquivo main "alticciSequenceApplication", 
uma vez que a aplicação subir ela deverá retornar uma mensagem
do tipo "Started AlticciSequenceApplication". Ao fazer isso você
pode utilizar o browser e digitar "localhost:8080/alticci/n" sendo
"n" o índice da sequência que você deseja retornar. Se utilizado
um client de requisição como Postman ou Insônia, o retorno será
o mesmo.

Instruções para executar localmente com Swagger:

Basicamente você irá fazer como no passo anterior 
mas a diferença estará na URL de acesso que você utilizará 
que será "localhost:8080/swagger-ui.html". Com o swagger, 
haverá um diretório chamado "controllers" e dentro dele
estará o endpoint de acesso definido pelo o verbo HTTP GET:
endpoint get /alticci/{n}. Ao clicar em "Try it Out" 
aparecerá em um campo description em que você pode digitar
o valor do índice para a sequência. 

Instruções para build e execução da aplicação via Docker.

Uma vez que você tenha o docker instalado abra um terminal
de comando do sistema operacional, navegue até o diretório
raiz do projeto e em seguida execute o comando para build
"sudo docker build -t alticci-sequence ." Este comando
irá criar a imagem Docker da aplicação. Em seguida para
execução do container digite "sudo docker run alticci-sequence"
e novamente, siga os passos anteriores via browser ou swagger
para usar a aplicação.

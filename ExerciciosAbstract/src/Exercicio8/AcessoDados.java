package Exercicio8;
//8) Crie uma interface chamada AcessoDados que contenha os seguintes métodos: conectar(),
// desconectar(), inserir(), atualizar() e excluir().
//Crie uma classe BancoDeDados que implemente a interface AcessoDados.
// Implemente os métodos da interface para que eles realizem as operações de conectar-se ao banco de dados,
// desconectar-se, inserir dados, atualizar dados e excluir dados.


interface AcessoDados {
    void conectar();

    void desconectar();

    void inserir(String dados);

    void atualizar(String dados);

}

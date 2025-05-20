package Exercicio8;

public class BancoDeDados implements AcessoDados{
    private boolean conectado;
    private String dados;
    private String StatusConexao;

    public String getStatusConexao() {
        if(conectado) {
            return StatusConexao = "Banco de dados conectado";
        } else {
            return StatusConexao = "Banco de dados desconectado";
        }
    }

    @Override
    public void conectar() {
        System.out.println("Conectou no banco de dados");
        conectado = true;
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectou do banco de dados");
        conectado = false;

    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public String getDados() {
        return dados;
    }

    @Override
    public void inserir(String dados) {

        if(conectado) {
            setDados(dados);
            System.out.println("Inseriu no banco de dados: " + dados);
        }
        else {
            System.out.println("nao esta conectado , nao pode inserir");

        }

    }
    @Override
    public void atualizar(String dados) {
        if(conectado) {
            System.out.println("Atualizou no banco de dados o Dado: (" + getDados() + ") para :" + dados);
        }
        else
            System.out.println("nao esta conectado , nao pode atualizar");

    }
}

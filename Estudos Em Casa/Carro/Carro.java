package Aula18_03.Carro;

public class Carro {
        public String marca;
        public String modelo;
        public boolean Alugado;

    public Carro (String modelocarro, String marcacarro){
        modelo = modelocarro;
        marca = marcacarro;
    }
    
    public Carro (){
    }

    public boolean VerificaDisponibilidade(){
        if(Alugado == true)
        System.out.println("Alugado com sucesso");
    else
        System.out.println("Veiculo ja alugado");
        return Alugado;
    }

    public void Alugar(){
        if(VerificaDisponibilidade()){
            Alugado = true;
        }
    }

    public void Devolver(){
        if(VerificaDisponibilidade()){
            Alugado = false;
            System.out.println("Carro devolvido");
        }
       else{
        System.out.println("Carro nao alugado,nao é possivel devoluçao");
       }
    } 
    public void exibirDados(){
        System.out.println("Marca : "+ marca);
        System.out.println("Modelo : "+modelo);

    }
        

}

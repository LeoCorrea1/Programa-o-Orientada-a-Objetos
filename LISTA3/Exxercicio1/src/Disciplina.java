import java.util.Scanner;

public class Disciplina {
    String Nome;
    int CargaHoraria;
    String NomeProfessor;

    public void Atribuir(String NomeDisc, String NomeProfessorDisc, int CargaHorariaDisc){
        this.Nome = NomeDisc;
        this.NomeProfessor = NomeProfessorDisc;
        this.CargaHoraria = CargaHorariaDisc;

    }
    public String RecuperarNome() {
    	return Nome;       
 
    }
    public String RecuperarNomeProfessor() {
    	return NomeProfessor;       
 
    }
    public int RecuperarCargaHoraria() {
    	return CargaHoraria;       
 
    }
    

    }

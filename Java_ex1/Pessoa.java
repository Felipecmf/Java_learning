public class Pessoa {
    String nome;
    int idade;
    void apresentar(){
        System.out.println("generico");
    }
}
class Aluno extends Pessoa {
    int matricula;
    void apresentar(){
    }
}
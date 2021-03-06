    public class Principal {

        public static void main(String[] args) {

            // Declaração e inicialização de um objeto chamado aluno1
            // O objeto é da classe Aluno
            Aluno aluno1 = new Aluno();

            // Atribuindo valores aos atributos do objeto.
            aluno1.nome = "Francisco";
            aluno1.matricula = "123456789";
            aluno1.idade = 29;

            // Imprimir valores dos atributos do objeto aluno1
            System.out.println("Nome: " + aluno1.nome);
            System.out.println("Matrícula: " + aluno1.matricula);
            System.out.println("Idade: " + aluno1.idade);


        }

    }

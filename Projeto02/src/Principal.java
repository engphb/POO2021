        public class Principal {

            public static void main(String[] args) {

                // Declaração e inicialização de um objeto chamado aluno1
                // O objeto é da classe Aluno
                Aluno aluno1 = new Aluno("Francisco", "123456789", 29);

                int resultado = aluno1.somar (50, 50);
                System.out.println(resultado);

                System.out.println(aluno1.somar(10));
                System.out.println(aluno1.somar(10,10));
                System.out.println(aluno1.somar(1,2,3));

                // Atribuindo valores aos atributos do objeto.
                aluno1.setNome("Francisco");
                aluno1.setMatricula("123456789");
                aluno1.setIdade(29);

                Aluno aluno2 = new Aluno();
                // Atribuindo valores aos atributos do objeto.
                aluno2.setNome("Fulano");
                aluno2.setMatricula("040900283");
                aluno2.setIdade(25);

                // Imprimir valores dos atributos do objeto aluno1
                System.out.println("Nome: " + aluno1.getNome());
                System.out.println("Matrícula: " + aluno1.getMatricula());
                System.out.println("Idade: " + aluno1.getIdade());

                // Imprimir valores dos atributos do objeto aluno2
                System.out.println("Nome: " + aluno2.getNome());
                System.out.println("Matrícula: " + aluno2.getMatricula());
                System.out.println("Idade: " + aluno2.getIdade());

                Professor professor1 = new Professor();
                // Atribuindo valores aos atributos do objeto.
                professor1.setSalario(800.50);
                // Imprimir valores dos atributos do objeto professor1
                System.out.println("O salario é: " + professor1.getSalarioFormatado());
            }

        }

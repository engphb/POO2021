    public class Aluno{

        private String nome;
        private String matricula;
        private int idade;

        public Aluno(){
        }
        public Aluno(String nome){
            this.nome = nome;
        }
        public Aluno(String nome, String matricula){
            this.nome = nome;
            this.matricula = matricula;
        }

        public Aluno(String francisco, String s, int i) {

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }


        public int somar(int a){
            return a + 1;
        }

        public int somar(int a, int b){
            return a + b;
        }

        public int somar(int a, String b){
            return a + 1000;
        }
        public int somar(int a, int b, int c){
        return a + b + c;
        }

    }
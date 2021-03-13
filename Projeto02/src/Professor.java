import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Professor {
        Locale ptBr = new Locale("pt", "BR");
        private double salario;

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;

        }

    public String getSalarioFormatado(){
        DecimalFormat df = new DecimalFormat("###, ###.00");
        return "R$" + df.format(this.salario);
    }

}



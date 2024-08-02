import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class main {

    public static void main(String[] args) {
    
    exercicioN();

    }

    private static void exercicioN(){

        DecimalFormat deci = new DecimalFormat("0.00");
        String var;
        
        var = JOptionPane.showInputDialog("Insira a quantidade de notas que serão informadas: ");
        int quantidadeNotas = Integer.parseInt(var);

        double pesoTotal = 0;
        double mediaPonderada = 0;
        double peso[] = new double [quantidadeNotas];
        double nota[] = new double [quantidadeNotas];

        
        for (int i = 0; i < quantidadeNotas; i++) {
            var = JOptionPane.showInputDialog("Insira a nota: ");
            nota[i] = Double.parseDouble(var);

            if (nota[i] >= 1 && nota[i] <= 10){
            var = JOptionPane.showInputDialog("Informe o peso da última nota digitada: ");
            peso[i] = Double.parseDouble(var) / 100;
                
            pesoTotal += peso[i];
            mediaPonderada += nota[i] * peso[i];
            }
            else {
                JOptionPane.showMessageDialog(null, "A nota precisa estar entre 1 e 10.");
            }
        }

        if (pesoTotal != 1) {
            JOptionPane.showMessageDialog(null, "O peso total das notas precisa ser igual a 100 (%)");
        }
        else {
            JOptionPane.showMessageDialog(null, "Media ponderada: " + mediaPonderada);
        }

        if (mediaPonderada < 6) { 
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        }
    }
}

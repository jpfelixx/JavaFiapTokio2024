package JavaPoo.aulas;

import javax.swing.JOptionPane;

public class exComFront {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		//aparece uma janelinha
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
		double v1 = Double.parseDouble(valor1); 
		double v2 = Double.parseDouble(valor2); 
		double s = v1+v2;
		
		JOptionPane.showMessageDialog(null, "Soma: "+s);
		System.out.println("teste");
		
	}

}

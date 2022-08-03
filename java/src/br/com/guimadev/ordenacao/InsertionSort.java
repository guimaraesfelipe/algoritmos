package br.com.guimadev.ordenacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class InsertionSort {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da VETOR"));
		for(int i = 0; i < n; i++) {
			numeros.add(Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + n + " - Digite um número: ")));
		}
		
		for (int i = 1; i < numeros.size(); i++) {
			int analyzing = i;
			while (analyzing > 0 && numeros.get(analyzing) < numeros.get(analyzing - 1)) {
				int auxAnalyzing = numeros.get(analyzing);
				int auxLeftAnalyzing = numeros.get(analyzing - 1);
				numeros.set(analyzing, auxLeftAnalyzing);
				numeros.set(analyzing - 1, auxAnalyzing);
				analyzing--;
			}
		}
		System.out.println(numeros);
	}
}

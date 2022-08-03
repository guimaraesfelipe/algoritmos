package br.com.guimadev.ordenacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SelectionSort {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da VETOR"));
		for(int i = 0; i < n; i++) {
			numeros.add(Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + n + " - Digite um número: ")));
		}
		
		for (int i = 0; i < numeros.size() - 1; i++) {
			int smaller = findSmaller(numeros, i, numeros.size());
			int auxSmaller = numeros.get(smaller);
			int auxCurrent = numeros.get(i);
			numeros.set(i, auxSmaller);
			numeros.set(smaller, auxCurrent);
		}
		System.out.println(numeros);
	}
	
	private static int findSmaller(List<Integer> numeros, int start, int stop) {
		int smaller = start;

		for (int i = start; i <= stop - 1; i++) {
			if (numeros.get(i) < numeros.get(smaller)) {
				smaller = i;
			}
		}
		return smaller;
	}
}

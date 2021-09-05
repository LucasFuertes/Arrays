package com.capacitacion.array;

import java.util.Scanner;

public class Array {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int array[] = cargarVector();
		mostrarVector(array);
		buscaYMuestraMayor(array);
		ordenarMenorMayor(array);

		System.out.println("Que valor clave desea buscar?: ");
		int clave = in.nextInt();
		buscarClave(array, clave);
		in.close();

	}

	public static int[] cargarVector() {
		int vector[] = new int[4];

		for (int e = 0; e < vector.length; e++) {
			System.out.println("introduzca el numero en la casilla " + e);
			vector[e] = in.nextInt();
			System.out.println("Acabo de guardar el numero " + vector[e]);
		}

		return vector;
	}

	public static void mostrarVector(int[] vector) {
		System.out.println("Los valores del vector son: ");
		for (int a = 0; a < vector.length; a++) {
			System.out.println(vector[a]);
		}
	}

	public static void buscaYMuestraMayor(int[] vector) {
		int aux = vector[0];

		for (int i = 0; i < vector.length; i++) {

			if (vector[i] > aux) {
				aux = vector[i];
			}
		}
		System.out.println("el mayor es " + aux);
	}

	public static void ordenarMenorMayor(int[] vector) {
		int aux = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int e = 0; e < vector.length - 1; e++) {
				if (vector[e] > vector[e + 1]) {
					aux = vector[e];
					vector[e] = vector[e + 1];
					vector[e + 1] = aux;
				}
			}
		}
		mostrarVector(vector);
	}

	public static void buscarClave(int[] vector, int llave) {
		int contadorCoincidencia = 0;

		for (int i = 0; i < vector.length; i++) {
			if (llave == vector[i]) {
				System.out.println("Encontre el valor " + llave + " que buscabas en la casilla nro " + i);
				contadorCoincidencia++;
			}
		}

		if (contadorCoincidencia == 0) {
			System.out.println("No existe coincidencias con el valor: " + llave);
		} else {
			System.out.println("Se encontro el valor " + llave + " con un total de " + contadorCoincidencia + " coincidencias.");
		}
	}
}

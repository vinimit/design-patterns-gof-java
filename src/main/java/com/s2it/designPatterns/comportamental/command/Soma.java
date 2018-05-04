package com.s2it.designPatterns.comportamental.command;

//ConcreteCommand
public class Soma extends Command {

	private Calculadora calculadora;
	private int numero;

	public Soma(Calculadora calculadora, int numero) {
		this.calculadora = calculadora;
		this.numero = numero;
	}

	public void calcular() {
		calculadora.setValor(calculadora.getValor() + numero);
		System.out.println(calculadora.getValor());
	}

	public void desfazer() {
		calculadora.setValor(calculadora.getValor() - numero);
		System.out.println(calculadora.getValor());
	}
}

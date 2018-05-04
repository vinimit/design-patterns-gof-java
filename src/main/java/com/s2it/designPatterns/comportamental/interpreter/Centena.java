package com.s2it.designPatterns.comportamental.interpreter;

public class Centena extends Expressao {

	public String Um() { return "C"; }
    public String Quatro() { return "CD"; }
    public String Cinco() { return "D"; }
    public String Nove() { return "CM"; }
    public int Multiplicador() { return 100; }
}
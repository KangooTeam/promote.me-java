package br.com.me.promote;

public class Vaga {
	private int cdVaga;
	private String titulo;
	private int carreira;
	private double salario;
	
	public Vaga(int cdVaga, String titulo, int carreira) {
	}

	public int getCdVaga() {
		return cdVaga;
	}

	public void setCdVaga(int cdVaga) {
		this.cdVaga = cdVaga;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCarreira() {
		return carreira;
	}

	public void setCarreira(int carreira) {
		this.carreira = carreira;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

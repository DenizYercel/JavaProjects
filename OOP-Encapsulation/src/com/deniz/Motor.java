package com.deniz;

public class Motor {
	
	private int hacim;
	private String yakitTipi;
	private int beygirGucu;
	
	public Motor(int hacim,String yakitTipi,int beygirGucu) {
		this.hacim=hacim;
		this.yakitTipi=yakitTipi;
		this.beygirGucu=beygirGucu;
	}

	public int getHacim() {
		return hacim;
	}

	public void setHacim(int hacim) {
		this.hacim = hacim;
	}

	public String getYakitTipi() {
		return yakitTipi;
	}

	public void setYakitTipi(String yakitTipi) {
		this.yakitTipi = yakitTipi;
	}

	public int getBeygirGucu() {
		return beygirGucu;
	}

	public void setBeygirGucu(int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}
	
	
}

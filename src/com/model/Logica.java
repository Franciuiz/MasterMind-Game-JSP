package com.model;
import java.util.Random;


public class Logica {

	private int[] segredo = new int[4];
	private int otimo;
	private int bom;
	private int ruim = 4;
	
	
	public Logica() {
		int aux;
		for(int j=0; j<4; j++){
			Random ent = new Random();
			aux = ent.nextInt(9);
			for(int i=0; i<4; i++){
				if(aux==0){
					Random ent1 = new Random();
					aux = ent1.nextInt(9);
				}
				if(aux==segredo[i]){
					Random ent1 = new Random();
					aux = ent1.nextInt(9);
				}
				else{
					segredo[j] = aux;
				}
			}
		}
	}


	public Boolean realizarPalpite(int[] palpite){
		//gambiarra huehue
		this.otimo = 0; this.bom = 0; this.ruim = 4;
		
		
		for(int i=0; i<4; i++){
			if(segredo[i]==palpite[i]){
				this.otimo++;
				this.ruim--;
			}
			for(int j=0; j<4; j++){
				if((segredo[i]==palpite[j]) && (segredo[i]!=palpite[i])){
					this.bom++;
					this.ruim--;
				}
			}
		}
		if(this.otimo==4){
			return true;
		}
		else{
			return false;
		}
	}


	public int getOtimo() {
		return otimo;
	}


	public int getBom() {
		return bom;
	}


	public int getRuim() {
		return ruim;
	}

	//teste de caixa preta
	public int getSegredo(int x) {
		return segredo[x];
	}
	
	
	
}
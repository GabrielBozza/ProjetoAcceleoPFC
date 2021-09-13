package br.eb.ime.rules;
//package RadioPFC.rule Test 1;

/**
 * 
 *	Class Rule Test 1
 * 
 **/

public class RuleTest1 {

	public static String checkMode(String CurrentMode, boolean ASC_SampleValues, boolean DESC_SampleValues, double SecLevel, double CarrierFreq, String OpRole){

		final String NewMode;

		if(((ASC_SampleValues==true)&&((SecLevel>=0.5)&&(CarrierFreq==50.0)&&(OpRole.equalsIgnoreCase("cmt"))))){
			NewState = "Mode_3";
			return NewState;
			//ChangeRadioMode(NewState);//Funcao que faz o link com a parte fisica do radio --> Fora do escopo do trabalho
		}
		else{
			return (CurrentMode + "(MANTEM MODO)");
		}
	}
}	
	

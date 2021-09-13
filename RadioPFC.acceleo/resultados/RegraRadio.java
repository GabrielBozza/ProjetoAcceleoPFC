package RadioPFC.regraTeste1;

/**
 * 
 *	Class RegraTeste1
 * 
 **/
public class RegraTeste1 {

	String resultado = "";
	Double SampleSignal  = 0.5;

	// Variaveis que serao puxadas da parte do programa  que le os dados do radio (independente dessa parte) 
		//Condicionais
			private String Condicional = ">";
		//Atributos
			private String OpRole = "";
			private String SecLevel = "";
        //Valores de referencia
			private Double CompareNum = 5.0;
			private String CompareString = "Cmd";

	//Formacao da regras --> APENAS EXEMPLOS DE FORMACAO DE REGRAS
	
	Switch(Condicional){
	 case ">":
		if( OpRole.equals("Soldier") && SampleSignalValue >= CompareNum){
			resultado = "Modo1";
		} else {
			resultado = "Modo2";
		}
		break;
	case "<":
		if( SecLevel.equals("Low") && OpRole.equals(CompareString) && SampleSignalValue < CompareNum){
			resultado = "Modo3";
		} else {
			resultado = "Modo4";
		}
		break;
	default:
		String resultado = "Modo4";
		break;
	}

}		

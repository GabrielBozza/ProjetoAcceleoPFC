package RadioPFC.rule Test 1;

/**
 * 
 *	Class Rule Test 1
 * 
 **/

	//Exemplo de um array previamente populado com as variaveis que serao lidas pelo metodo da regra (isso viria de um codigo externo fora do escopo do trabalho)
	public static ArrayList ValuesArray = new ArrayList();
		ValuesArray.add("soldier");//OpRole
		ValuesArray.add("0.3");//SecLevel
		ValuesArray.add("100");//CarrierFreq
		ValuesArray.add("true");//SampleValues_ASC
		ValuesArray.add("false");//SampleValues_DESC

public class Rule Test 1 {

	public static String OpRole, NewState;
	public static Double SecLevel, CarierFreq;
	public static Boolean SampleValues_ASC, SampleValues_DESC;

	static void ChangeRadioState(){

		ReadVarValues();

		if(					(ASC_SampleValues == true )
					&&
					(						(SecLevel >=  0.5)
						&&(CarrierFreq ==  50.0)
						&&(OpRole == cmt )
)
){
			NewState = Mode_3;
			ChangeRadioMode(NewState);//Funcao que faz o link com a parte fisica do radio --> Fora do escopo do trabalho
		}
	}

	//Metodo para ler os valores das variaveis
	static void ReadVarValues(){
		OpRole = ValuesArray.get(0);
		SecLevel = Double.parseDouble(ValuesArray.get(1));
		CarrierFreq = Double.parseDouble(ValuesArray.get(2));
		SampleValues_ASC = Boolean.parseBoolean(ValuesArray.get(3));
		SampleValues_DESC = Boolean.parseBoolean(ValuesArray.get(4));
	}

}		

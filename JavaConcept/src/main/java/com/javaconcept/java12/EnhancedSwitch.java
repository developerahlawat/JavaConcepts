package com.javaconcept.java12;

public class EnhancedSwitch {
	

	  public static void main(String[] args) {
        System.out.println("New Switch Expression result:");
        executeOldSwitchExpression("M");
        executeNewSwitchExpression("M");
        executeNewSwitchExpression("TH");
        executeNewSwitchExpression("");
        executeNewSwitchExpression("SUN");
    }

	//With the new Switch expression, we don’t need to set break everywhere thus prevent logic errors!
    public static void executeNewSwitchExpression(String day){

        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> "Please insert valid day";
        };

        System.out.println(result);
    }
	
    //Classic switch statement:
    public static void executeOldSwitchExpression(String day){

	String results = "";
    switch (day) {
        case "M":
        case "W":
        case "F": {
            results = "MWF";
            break;
        }
        case "T":
        case "TH":
        case "S": {
            results = "TTS";
            break;
        }
    };

    System.out.println("Old Switch Result:");
    System.out.println(results);
      
	}
}



package com.javaconcept.java12;

public class EnhancedSwitch {
	

	public static void main(String[] args) {
	//Classic switch statement:

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
    
    
    
    //With the new Switch expression, we don’t need to set break everywhere thus prevent logic errors!

      String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    break "Please insert a valid day.";
                else
                    break "Looks like a Sunday.";
            }

        };

        System.out.println(result);
        
        //Let’s run the below program containing the new Switch Expression using JDK 12.
      /*  public static void main(String[] args)
        {
            System.out.println("New Switch Expression result:");
            executeNewSwitchExpression("M");
            executeNewSwitchExpression("TH");
            executeNewSwitchExpression("");
            executeNewSwitchExpression("SUN");
        }

        public static void executeNewSwitchExpression(String day){

            String result = switch (day) {
                case "M", "W", "F" -> "MWF";
                case "T", "TH", "S" -> "TTS";
                default -> {
                    if(day.isEmpty())
                        break "Please insert a valid day.";
                    else
                        break "Looks like a Sunday.";
                }

            };

            System.out.println(result);
        }*/
	}
}

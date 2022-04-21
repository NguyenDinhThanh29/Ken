public class Code10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String declaration
        String day="Monday";
        String hour="am";
        //Outer switch statement
        switch (day){
            case "Sunday":
                System.out.println("Sunday is a Holiday...");
                //Inner switch statement
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }//End of switch-case statement
                break;//Terminates the outer case staement
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }//End of switch-case statement
                break;
            default:
                System.out.println("InvalidDay");
        }//End of switch-case statement
    }
}

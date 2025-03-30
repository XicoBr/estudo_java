package classes.enums;

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.LOW;

        switch (myVar) {
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
            default:
                System.out.println("UNDEFINED");
        }

        System.out.println("-=-=-=-=-=-=-=-=");

//        loop through
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }
}

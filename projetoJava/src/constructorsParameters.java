public class constructorsParameters {

    int modelYear;
    String modelName;

    // Criando um constructor
    // pode receber mais de um parametro
    public constructorsParameters(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        constructorsParameters obj = new constructorsParameters(2012, "Ferrari F70");
        System.out.println(obj.modelYear + "-" + obj.modelName);
    }

}
class modifiers2 {
    public static void main(String[] args) {
        // criando um objeto da subclasse Student, que herda atributos e metodos de modifiers1
        Student myObject = new Student();

        System.out.println("Name: " + myObject.fName);
        System.out.println("Age: " + myObject.age);
        System.out.println("Graduation year: " + myObject.gradYear);

        // chamando o metodo abstrato
        myObject.study();
    }
}
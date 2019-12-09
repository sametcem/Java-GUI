package java_gui.EQE_058;

// EQE-AbstractAnimals/Main.java

public class Main {
    public static void main(String[] args) {

        Animal max =
                new Animal("Max", 15) {
                    @Override
                    public String speak() {
                        return "bow-wow";
                    }
                };

        Animal[] animals =
                {
                        max,
                        new Animal("Batty", 3.5) {
                            @Override
                            public String speak() {
                                return "miaou-miaou";
                            }
                        }
                };

        for (Animal a : animals)
            System.out.println(a);
    }
}


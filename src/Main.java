public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark(),
                new Shark(),
                new Shark(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Eagle(),
                new Eagle(),
                new Eagle()};
        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();

            }
            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }
            if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }

        for (Animal a : animals) {
            if (a.getClass().getName().equals("Shark")) {
                ((Shark) a).attack();
            } else if (a.getClass().getName().equals("Eagle")) {
                ((Eagle) a).fly();
            }


            }

            }







            }


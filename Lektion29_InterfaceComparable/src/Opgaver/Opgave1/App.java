package Opgaver.Opgave1;

public class App {
    public static void main(String[] args) {
        Chili c1 = new Chili("Hej",100);
        Chili c2 = new Chili("Hej",111);
        Chili c3 = new Chili("Hej",222);
        Chili c4 = new Chili("Hej",333);
        Chili c5 = new Chili("Hej",444);
        Chili c6 = new Chili("Hej",555);
        Chili c7 = new Chili("Hej",666);
        Chili c8 = new Chili("Hej",777);
        Chili c9 = new Chili("Hej",888);
        Chili c10 = new Chili("Hej",999);

        Chili[] chilis = new Chili[10];

        chilis[0] = c1;
        chilis[1] = c2;
        chilis[2] = c3;
        chilis[3] = c4;
        chilis[4] = c5;
        chilis[5] = c6;
        chilis[6] = c7;
        chilis[7] = c8;
        chilis[8] = c9;
        chilis[9] = c10;

        System.out.println(max(chilis));

    }
        public static Measurable max(Measurable[] objects) {
            Measurable max = objects[0];
            for (int i = 0; i < objects.length; i++) {
                if (objects[i].getMeasure() > max.getMeasure()) {
                    max = objects[i];
                }
            }
            return max;

        }
        public static double avg(Measurable[] objects) {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < objects.length; i++) {
                sum += objects[i].getMeasure();
                count++;
            }
        return sum / count;
        }
    }


package Opgaver.Opg3_DictionaryBinærtTræ;

public class App {
            public static void main(String[] args) {
                Dictionary<String, Integer> dictionary = new DictionaryBST<>();

                // Tilføj elementer til ordbogen
                dictionary.put("Alice", 25);
                dictionary.put("Bob", 30);
                dictionary.put("Charlie", 35);
                dictionary.put("David", 40);
                System.out.println("Størrelse på ordbogen: " + dictionary.size());

                // Få værdierne for nogle nøgler
                System.out.println("Alder for Alice: " + dictionary.get("Alice"));
                System.out.println("Alder for Bob: " + dictionary.get("Bob"));
                System.out.println("Alder for Charlie: " + dictionary.get("Charlie"));

                // Opdater værdien for en nøgle
                dictionary.put("Alice", 26);
                System.out.println("Opdateret alder for Alice: " + dictionary.get("Alice"));

                // Fjern en nøgle og dens værdi
                Integer removedAge = dictionary.remove("Bob");
                System.out.println("Fjernet alder for Bob: " + removedAge);

                // Tjek om ordbogen er tom
                System.out.println("Er ordbogen tom? " + dictionary.isEmpty());

                // Tjek størrelsen af ordbogen
                System.out.println("Størrelse på ordbogen: " + dictionary.size());
            }
        }

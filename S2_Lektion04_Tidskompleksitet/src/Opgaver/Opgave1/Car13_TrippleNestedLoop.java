package Opgaver.Opgave1;

public class Car13_TrippleNestedLoop {

    // Første loop O(n) [lineært] hvor n er problemstørrelsen
    // Andet loop O(n) [lineært] hvor n igen er problemstørrelsen
    // Tredje loop er O(n)
    // Ergo er det O(n^3)

    void TrippleNestedLoopFunction(int n) {
        for (int pass = 1; pass <= n; pass++) {
            for (int index = 0; index < n; index++) {
                for (int count = 1; count < n; count++) {
                }
            }
        }
    }
}

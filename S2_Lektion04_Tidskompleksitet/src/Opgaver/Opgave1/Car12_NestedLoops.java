package Opgaver.Opgave1;

public class Car12_NestedLoops {

    // Første loop O(n) [lineært] hvor n er problemstørrelsen
    // Andet loop O(n) [lineært] hvor n igen er problemstørrelsen
    // Tredje loop er O + 10
    // Ergo er det O(n^2) + 10 = O(n^2)

    void NestedLoopFunction(int n) {
        for (int pass = 1; pass <= n; pass++) {
            for (int index = 0; index < n; index++) {
                for (int count = 1; count < 10; count++) {
                }
            }
        }
    }
}

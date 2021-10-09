public class toolsHelper {
    static int reduceOperationCustom(int [] number, OperationTest operationTest, int init) {
        int saved = init;

        for (int item: number) {
            saved = operationTest.applyOperation(item, saved);
        }

        return saved;
    }
}
public class PiramideNumeros {
    public static void main(String[] args) {
        int pyramidHeight = 10;
        for (int i = 1; i <= pyramidHeight; i++){
            String pyramidPrint = "";
            pyramidPrint += i;
            for (int j = 1; j < i; j++) {
                pyramidPrint += i;
            }
            System.out.println(pyramidPrint);
        }
    }
}

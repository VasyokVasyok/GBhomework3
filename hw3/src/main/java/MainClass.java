public class MainClass {
    public static void main(String[] args) {
        Integer[] ar1 = {1, 2, 3, 4, 5};
        Double[] ar2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] ar3 = {"one", "two", "three", "four", "five"};
        changePosition(ar1);
        changePosition(ar2);
        changePosition(ar3);
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangesBox = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBox = new Box<>();
        System.out.println("Box of apples weighs " + appleBox.getWeight());
        System.out.println("Box of oranges weight " + orangesBox.getWeight());
        System.out.println(appleBox.compare(orangesBox));
        orangesBox.replaceFruitsToAnotherBox(anotherBox);
        System.out.println(orangesBox.getBox());
        System.out.println(anotherBox.getBox());
    }

    private static void changePosition(Object[] ar) {
        int firstPos = 2;
        int secondPos = 4;
        Object helper = ar[firstPos];
        ar[firstPos] = ar[secondPos];
        ar[secondPos] = helper;
        showResult(ar);
    }

    private static void showResult(Object[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
        System.out.println();
    }
}
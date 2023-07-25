import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3var1();
        task3var2();
        task4();

    }

    public static void task1() {
        System.out.println("Задание первое");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < (nums1.size()); i++) {
            if (nums1.get(i) % 2 != 0) {
                System.out.println(nums1.get(i));
            }
        }
    }

    public static void task2() {
        System.out.println("Задание второе");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 != 1) {
                if (nums2.get(i).equals(nums2.get(i + 1))) {
                    nums2.remove(i);
                }
                System.out.println(nums2.get(i));
            }
        }
    }

    public static void task3var1() {
        System.out.println("Задание третье");
        List<String> words = new ArrayList<>(List.of("book", "knife", "fork", "pork", "book", "book", "fork"));
        Map<String, Integer> mapOfWords = new HashMap<>();
        for (String word : words) {
            if (mapOfWords.getOrDefault(word, 0) == 0) {
                mapOfWords.put(word, 1);
            } else {
                Integer val = mapOfWords.get(word);
                mapOfWords.put(word, val + 1);
            }
            if (mapOfWords.getOrDefault(word, 1) == 1) {
                System.out.println(word);
            }
        }
    }

    public static void task3var2() {
        System.out.println("Задание третье");
        List<String> words1 = new ArrayList<>(List.of("book", "knife", "fork", "pork", "book", "book", "fork"));
        Set<String> mapOfWords1 = new HashSet<>();
        for (String word : words1) {
            mapOfWords1.add(word);
        }
        System.out.println(mapOfWords1);

    }

    public static void task4() {
        System.out.println("Задание четвертое");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> mapOfStrings = new HashMap<>();
        for (String word : strings) {
            if (mapOfStrings.getOrDefault(word, 0) == 0) {
                mapOfStrings.put(word, 1);
            } else {
                Integer val = mapOfStrings.get(word);
                mapOfStrings.put(word, val + 1);
            }
        }
        System.out.println(mapOfStrings);
    }
}
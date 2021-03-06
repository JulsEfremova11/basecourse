package week3;

/**
 * 1. Из данного предложения, найти самое короткое и самое длинное слово.
 * Вывести найденные слова и их длину.
 *
 * В случае, если слова минимальной / максимальной длинны будут в нескольких вариациях - вывести первые встречные.
 *
 * Предложение не будет содержать знаков препинания.
 *
 * "Min - я (1), max - синхрофазотрон (14)"
 *
 * В случае, если строка будет пустой - вывести на экран пустую строку
 *
 */
public class Task1 {
    public static void main(String[] args) {

        String text = args[0];

        if (text == "") {
            System.out.printf("");
        }else {
            String[] word = text.split(" ");

            String min = word[0];
            String max = word[0];

            for (int i=0;  i < word.length; i++){
                if (word[i].length() < min.length()) {
                    min = word[i];
                } else if (word[i].length() > max.length()) {
                    max = word[i];
                }

            }

            System.out.printf("Min - %s (%d), max - %s (%d)", min, min.length(), max,  max.length());
        }

    }
}

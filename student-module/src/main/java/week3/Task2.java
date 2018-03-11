package week3;

/**
 * Напишите программу, которая заменяет в строке все вхождения слова «бяка» на «вырезано цензурой»
 * (не используя метод replaceAll()).
 *
 * "Он настоящая бяка" -> "Он настоящая "вырезано цензурой""
 *
 */
public class Task2 {
    public static void main(String[] args) {

        String text = args[0];

        String[] word1 = text.split(" ");
        //String[] word2 = text.split("вырезано цензурой");

        for (int i=0;  i < word1.length; i++){
            if (word1[i].equals("бяка")){
                word1[i] = "\"вырезано цензурой\"";
            }

        }
        String res ="";

        for (int i=0; i < word1.length; i++){
            res = res + word1[i] + " ";
        }
        System.out.print(res);

    }
}

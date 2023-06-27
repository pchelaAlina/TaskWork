import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строчку, например “I love java 8 Я люблю java 14 core1” >>");
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        str = str.replaceAll(",", "");
        String s[] = str.split(" ");
        System.out.println("Искомые слова(латинскими иероглифами):");
        for (int i = 0; i < s.length; i++) {
            boolean check = true; //изначально полагаем, что s[i] - искомое слово
            for (int j = 0; j < s[i].length() && check; j++) {
                char c = s[i].charAt(j);
                check = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
                if (!check) break;
            }
            if (check) System.out.println(s[i]);
        }
        //количество слов латиницей
        String[] words = "\\s+".split(str);
        System.out.println("Answer:\nCount words = " + words.length + ";");
    }
}


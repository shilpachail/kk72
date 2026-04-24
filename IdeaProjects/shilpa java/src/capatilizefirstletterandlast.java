import java.util.Scanner;

public class capatilizefirstletterandlast {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string ");
            String str = sc.nextLine();

            char[] ch = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {


                if (i == 0 && ch[i] != ' ') {
                    ch[i] = Character.toUpperCase(ch[i]);
                }


                else if (i > 0 && ch[i - 1] == ' ' && ch[i] != ' ') {
                    ch[i] = Character.toUpperCase(ch[i]);
                }


                else if (i < ch.length - 1 && ch[i + 1] == ' ' && ch[i] != ' ') {
                    ch[i] = Character.toUpperCase(ch[i]);
                }


                else if (i == ch.length - 1 && ch[i] != ' ') {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }

            System.out.println(new String(ch));
        }
    }


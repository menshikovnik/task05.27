import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int w = scanner.nextInt();
        System.out.println("Введите высоту: ");
        int h = scanner.nextInt();
        if ((w >= 5 && h >= 5) && (w % 2 != 0 && h % 2 != 0)){

        for (int r = 0; r <= h; r++) { // цикл для первой половины
            for (int c = 0; c <= w; c++) {
                if ((c == 0 || c == w/2) && (r == 0 || r == h/2) || (c == w - 1 && r == h/2)) {
                    System.out.print("*");
                }
                else if ( c < w/2 && r == 0){
                    System.out.print("_");
                }
                else if (r < h/2 && c == 0){
                    System.out.print("|");
                }

                else if (r == h/2 && c < w/2){
                    System.out.print("_");
                }
                else if (r < h/2 && c < w/2){
                    System.out.print(" ");
                }
                else if (c == w/2 && r < h/2){
                    System.out.print("|");
                }
                else if (c < w/2 && r < h/2){
                    System.out.print(" ");
                }
                else if (r == h/2 && c < w - 1){
                    System.out.print("_");
                }
                if (c == w/2 && r < h/2 && r != h/2){
                    System.out.println();
                }
            }
        }
System.out.println();

        for (int r = h/2 + 1;r <= h - 1;r++){ // цикл для второй половины
            for (int c = 0;c <= w - 1;c++){
              if (c == w/2 && r == h - 1){
                  System.out.print("*");
              }
                else if (r <= h - 1 && c < w/2){ // пробелы пробелы пробелы
                    System.out.print(" ");
                }
                else if (c == w/2 && r < h - 1){ // левые палочки
                    System.out.print("|");
                }
                else if (r < h - 1 && c < w - 1){ // пробелы внутри фигуры
                    System.out.print(" ");
                }
                else if (c == w - 1 && r < h - 1){ // правые палочки
                    System.out.print("|");
                }
                else if (c < w - 1 && r == h - 1){
                    System.out.print("_");
                }
                else if (c == w - 1 && r == h - 1){
                    System.out.print("+");
              }
                if (c == w - 1){
                    System.out.println();
                }
            }
        }
    }
        else {
            System.out.println("Значения не подходят, введите другие значения!");
        }
    }
}


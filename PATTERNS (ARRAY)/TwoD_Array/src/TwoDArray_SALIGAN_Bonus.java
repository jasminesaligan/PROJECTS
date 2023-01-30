import java.util.Scanner;
public class TwoDArray_SALIGAN_Bonus {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        int[][] num= new int[row][column];
        for (int rows = 0; rows < row; rows++) {
            for (int index = 0; index < column; index++) {
                System.out.println("Enter element for row [" + (rows+1) + "] column ["+ (index+1) + "]");
                num[rows][index] = sc.nextInt();
            }
        }

        int i, j, temp;
        int n=num.length;
        int m=num[0].length;
        for (i = 0; i < n * m - 1; ++i) {
            for (j = 0; j < n * m - 1 - i; ++j) {
                if (num[j / m][j % m] > num[(j + 1) / m][(j + 1) % m]) {
                temp = num[(j + 1) / m][(j + 1) % m];
                num[(j + 1) / m][(j + 1) % m] = num[j / m][j % m];
                num[j / m][j % m] = temp;
                }
            }
        }

        System.out.println("The 2d array is: ");
        for (int c = 0; c < row; c++) {
            for (int d = 0; d < column; d++) {
                System.out.print(num[c][d] + " ");
            }
        }

    }
}
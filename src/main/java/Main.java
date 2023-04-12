import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Board + integers
        char[][] board = {
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };
        char[] OX = {'X', 'O'};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String Name;
        int a = random.nextInt(2);
        int b = Math.abs(a - 1);
        Boolean playerWin = null;
        int tilesFilled = 0;

        //Welcome screen
        System.out.print("Name: ");
        Name = scanner.nextLine();
        System.out.println("GL " + Name + ", You'll be playing as " + OX[a] + " in this game." + OX[b]);
        System.out.println("Please enter number for corresponding tile you want to place your symbol like this:");
        System.out.println(" 1   2   3");
        System.out.println(" 4   5   6");
        System.out.println(" 7   8   9");
        //Gameplay
        do {
            //Printing board
            for (int i = 0; i < board.length; i++) {
                System.out.println();
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print("  " + board[i][j]);
                }
            }
            System.out.println();
            System.out.print("Enter a number of the tile: ");
            int tile = scanner.nextInt();
            //Checking values of tile
            switch (tile) {
                case 1 -> {
                    if (board[0][0] == '_') {
                        board[0][0] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 2 -> {
                    if (board[0][1] == '_') {
                        board[0][1] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 3 -> {
                    if (board[0][2] == '_') {
                        board[0][2] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 4 -> {
                    if (board[1][0] == '_') {
                        board[1][0] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 5 -> {
                    if (board[1][1] == '_') {
                        board[1][1] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 6 -> {
                    if (board[1][2] == '_') {
                        board[1][2] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 7 -> {
                    if (board[2][0] == '_') {
                        board[2][0] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 8 -> {
                    if (board[2][1] == '_') {
                        board[2][1] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                case 9 -> {
                    if (board[2][2] == '_') {
                        board[2][2] = OX[a];
                    } else {
                        System.out.println("This tile is already filled!");
                    }
                }
                default -> System.out.print("Please enter a correct value");
            }
                tilesFilled++;
                //Computer moves (randomly XD)
                boolean setOfNumbers = false;
                do {
                    int c = random.nextInt(3);
                    int d = random.nextInt(3);
                    if (board[c][d] == '_') {
                        board[c][d] = OX[b];
                        setOfNumbers = true;
                    }
                } while (!setOfNumbers);
                tilesFilled++;
            //Victory conditions
            if (
                            (board[0][0] == OX[a] && board[0][1] == OX[a] && board[0][2] == OX[a]) ||
                            (board[1][0] == OX[a] && board[1][1] == OX[a] && board[1][2] == OX[a]) ||
                            (board[2][0] == OX[a] && board[2][1] == OX[a] && board[2][2] == OX[a]) ||
                            (board[0][0] == OX[a] && board[1][0] == OX[a] && board[2][0] == OX[a]) ||
                            (board[0][1] == OX[a] && board[1][1] == OX[a] && board[2][1] == OX[a]) ||
                            (board[0][2] == OX[a] && board[1][2] == OX[a] && board[2][2] == OX[a]) ||
                            (board[0][0] == OX[a] && board[1][1] == OX[a] && board[2][2] == OX[a]) ||
                            (board[0][2] == OX[a] && board[1][1] == OX[a] && board[2][0] == OX[a])
            ) {
                playerWin = true;
            } else if (
                            (board[0][0] == OX[b] && board[0][1] == OX[b] && board[0][2] == OX[b]) ||
                            (board[1][0] == OX[b] && board[1][1] == OX[b] && board[1][2] == OX[b]) ||
                            (board[2][0] == OX[b] && board[2][1] == OX[b] && board[2][2] == OX[b]) ||
                            (board[0][0] == OX[b] && board[1][0] == OX[b] && board[2][0] == OX[b]) ||
                            (board[0][1] == OX[b] && board[1][1] == OX[b] && board[2][1] == OX[b]) ||
                            (board[0][2] == OX[b] && board[1][2] == OX[b] && board[2][2] == OX[b]) ||
                            (board[0][0] == OX[b] && board[1][1] == OX[b] && board[2][2] == OX[b]) ||
                            (board[0][2] == OX[b] && board[1][1] == OX[b] && board[2][0] == OX[b])
            ) {
                playerWin = false;
            }
        } while (tilesFilled <= 9 || playerWin == true || playerWin == false);

            if (playerWin) {
                System.out.println("You won!");
            } else if (!playerWin) {
                System.out.println("Computer won XD.");
            }   else {
                System.out.println("Tie.");
            }
    }
}
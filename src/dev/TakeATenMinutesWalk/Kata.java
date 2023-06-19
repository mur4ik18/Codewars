package dev.TakeATenMinutesWalk;

public class Kata {
    public static boolean main(char[] walk) {
        if (walk.length == 10) {
            int x = 0, y = 0;
            for (char n: walk) {
                switch (n) {
                    case 'n':
                        y++;
                        break;
                    case 's':
                        y--;
                        break;
                    case 'w':
                        x--;
                        break;
                    case 'e':
                        x++;
                        break;
                    default:
                        break;
                }
            }
            if ((x == 0) && (y == 0)) return true;
            else return false;

        } else return false;

    }
}

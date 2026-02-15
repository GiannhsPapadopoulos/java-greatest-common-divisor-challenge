public class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int maxNumber = Math.max(first, second);
        int minNumber = Math.min(first, second);

        if (maxNumber % minNumber == 0) {
            return minNumber;
        }

        int i = 1;
        int MKD = 1;
        while (i <= minNumber) {
            if ((first % i == 0) && (second % i == 0)) {
                MKD = i;
            }
            i++;
        }
        return MKD;

    }
}
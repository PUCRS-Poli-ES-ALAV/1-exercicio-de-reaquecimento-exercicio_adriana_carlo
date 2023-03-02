import java.util.*;

public class ex{

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter a number: ");
    //int num = sc.nextInt();
    //System.out.println("Enter a number to multiply by: ");
    //int times = sc.nextInt();
    //System.out.println(multNat(times, num));
    //System.out.println("Enter a number to add to: ");
    //int num1 = sc.nextInt();
    //System.out.println("Enter a number to add: ");
    //int num2 = sc.nextInt();
    //System.out.println(natSum(num1, num2));
    //System.out.println("Enter a number to calculate under the pattern of 1/1 + 1/2 + ... 1/n: ");
    //int n = sc.nextInt();
    //System.out.println(fraction(n));
    //System.out.println("Enter a string to invert: ");
    //String text = sc.next();
    //System.out.println(stringInversion(text));
    //System.out.println("Enter a number to calculate the sequence: ");
    //int n = sc.nextInt();
    //System.out.println(sequence(n));
    //System.out.println("Enter a m to calculate the Ackerman Sequence: ");
    //int m = sc.nextInt();
    //System.out.println("Enter a n to calculate the Ackerman Sequence: ");
    //int n = sc.nextInt();
    //System.out.println(ackermanSequence(m, n));a
    //int[] array = {1, 2, 3, 4, 5};
    //System.out.println(sumArr(array, array.length-1));
    //System.out.println(prodArr(array, array.length-1));
    //System.out.println("Enter a string to check if it is a palyndrome: ");
    //String text = sc.next();
    //System.out.println(palyndrome(text));
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    System.out.println("Enter a number to calculate the alphabet combinations: ");
    int n = sc.nextInt();
    System.out.println(alphabetCombinations(n, alphabet));
    //System.out.println("Enter a starting number to calculate the fibonacci sequence: ");
    //int n1 = sc.nextInt();
    //System.out.println("Enter a endpoint number to calculate the fibonacci sequence: ");
    //int n2 = sc.nextInt();
    //System.out.println("Enter a number to calculate the fibonacci sequence: ");
    //int n3 = sc.nextInt();
    //System.out.println(fibSequence(n1, n2, n3));
    


}

private static String multNat(int times, int value){
    if (times < 0){
        return "Error: times must be a positive integer";
    }
    if(times == 0){
        return "0";
    }
    else{
        return value + multNat(times - 1, value);
    }
}
private static int natSum (int num1, int num2){
    if (num1 < 0 || num2 < 0){
        return -1;
    }
    if (num1 == 0){
        return num2;
    }
    else{
        return 1 + natSum(num1 - 1, num2);
    }
}
private static double fraction (int n){
    if (n == 0){
        return -1;
    }
    if (n == 1){
        return 1;
    }
    else {
        return 1.0/n + fraction(n - 1);
    }
}
private static String stringInversion (String text){
    if (text.length() == 0){
        return "";
    }
    else{
        return text.charAt(text.length()-1) + stringInversion(text.substring(0, text.length()-1));
    }
}
private static int sequence (int n){
    if (n <= 0){
        throw new IllegalArgumentException("n must be a positive integer");
    }
    else if (n == 1){
        return 1;
    }
    else if (n==2){
        return 2;
    }
    else {
        return 2 * sequence (n - 1) + 3*sequence (n - 2);
    }
}
private static int ackermanSequence(int m, int n){
    if (m == 0){
        return n + 1;
    }
    if (m != 0 && n == 0){
        return ackermanSequence(m - 1, 1);
    }
    if (m != 0 && n != 0){
        return ackermanSequence(m - 1, ackermanSequence(m, n - 1));
    }
    return n;
}
private static int sumArr(int[] arr, int length){
    if (length == 0){
        return arr[length];
    }
    else{
        return arr[length] + sumArr(arr, length - 1);
    }
}
private static int prodArr(int[] arr, int length){
    if (length == 0){
        return arr[length];
    }
    else{
        return arr[length] * prodArr(arr, length - 1);
    }
}
private static boolean palyndrome (String text){
    if (text.length() == 0 || text.length() == 1){
        return true;
    }
    if (text.charAt(0) == text.charAt(text.length()-1)){
        return palyndrome(text.substring(1, text.length()-1));
    }
    return false;
}
private static ArrayList<String> alphabetCombinations (int n, String[] alphabet){
    ArrayList<String> combinations = new ArrayList<String>();
    if (n == 0){
        combinations.add("");
        return combinations;
    }
    else{
        for (int i = 0; i < n; i++){
            ArrayList<String> temp = alphabetCombinations(n - 1, alphabet);
            for (int j = 0; j < temp.size(); j++){
                combinations.add(alphabet[i] + temp.get(j));
            }
        }
    }
    return combinations;
}


private static int fibSequence (int f0, int f1, int n){
    if (n == 0){
        return f0;
    }
    else if (n==1){
        return f1;
    }
    else if (n > 1){
        return fibSequence(f0, f1, n - 1) + fibSequence(f0, f1, n - 2);
    }
    return 0;
}


}
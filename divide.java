public class divide {
    //take a String of a fraction (7/6), and return a Stirng of its float form
    public String div(String toSolve) {
        String[] num = toSolve.split("/");
        int num1 = Integer.parseInt(num[0]);
        double num1_new = num1;
        int num2 = Integer.parseInt(num[1]);
        double num2_new = num2;
        return String.valueOf(num1_new/num2_new);
    }
}
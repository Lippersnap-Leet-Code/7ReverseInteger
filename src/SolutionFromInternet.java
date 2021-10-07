public class SolutionFromInternet {
    public int reverse(int x){
        String string = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(string) * -1 : Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

public class TaxUtil{
    public double calculateTax(double amount, double rate){
        return amount * rate;
    }

    public static void main(String[] args) {
        TaxUtil t = new TaxUtil();
        System.out.println(t.calculateTax(20,0.15));
    }
}

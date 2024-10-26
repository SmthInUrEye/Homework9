public class Main {

    public static String reverseString(char[] array) {
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        //task 9

        int date = 31;
        double[] expenses = new double[5];
        double expensesSum = 0.00;
        double expensesMax = 0;
        double expensesMin = 0;
        double expensesAvg = 0.00;
        int index = 0;

        System.out.printf ( "Expenses: " );
        for (index = 0; index < expenses.length; index++) {
            expenses[index] = date * (Math.PI / 2) * Math.random () * 1000;
        }
        expensesMax = expensesMin = expenses[0];
        for (index = 0; index < expenses.length; index++) {
            expensesSum += expenses[index];
            if ( expensesMax < expenses[index] ) {
                expensesMax = expenses[index];
            }
            if ( expensesMin > expenses[index] ) {
                expensesMin = expenses[index];
            }
            expensesAvg = expensesSum / expenses.length;
            System.out.printf ( "   " + expenses[index] );
        }
        System.out.println ( "\n SUM = " + expensesSum + "\n MAX = " + expensesMax + "\n MIN = " + expensesMin + "\n AVG = " + expensesAvg );

        //Reverse task
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println ( reverseString ( reverseFullName ) );
    }
}

public class Main {
    public static void main(String[] args) {
        //выберем для ввода стоимости билета тип double,
        //чтобы пользователь или система могли точно передать любую оплаченную сумму
        double paidAmount = 56397.65;
        int oneMileAmount = 20;
        //при расчете переведем оплаченную сумму в тип int,
        //чтобы отбросить дробные значения и исключить ошибку в типах при расчете
        int miles = (int) paidAmount / oneMileAmount;
        //исключим возможность получения отрицательных результатов
        if (miles < 0) {
            miles = 0;
        }
        System.out.println("Количество миль для начисления за купленный билет составит: " + miles);
    }
}
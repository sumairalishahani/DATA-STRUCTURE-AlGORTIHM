package primitive_dataType;

public class Employee {
    public static void main(String[] args) {

        int age=29;
        System.out.println("Age:"+age);
        boolean isAManager=true;
        System.out.println(isAManager);

        double yearsofService=2.5;
        System.out.println(yearsofService);
        int baseSalary=3000;
        int overtimePayment=40;
        int totalPayment=baseSalary+overtimePayment;
        System.out.println("total payment:"+totalPayment);
        double firstBonus,secondBonus,thirdBonus;
        firstBonus=10.00;
        secondBonus=22.00;
        thirdBonus=35.00;

        double sum=firstBonus+secondBonus+thirdBonus;
        System.out.println("sum:"+sum);
    }
}

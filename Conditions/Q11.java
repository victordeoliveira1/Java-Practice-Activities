import java.util.Scanner;

public class Q11 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o salário do funcionário: ");
    double salary = scanner.nextDouble();

    double salaryAdjustment =0;

    if (salary <=280) {
        salaryAdjustment = 0.20;
    }else if (salary<=700) {
        salaryAdjustment = 0.15;
    }else if (salary <=1500) {
        salaryAdjustment = 0.10;
    }else{
        salaryAdjustment = 0.05;
    }

    double newSalary = salary+(salary*salaryAdjustment);  
    System.out.printf("The previous salary was: R$ %.2f, it was increased by %.0f%%, the adjusted amount  it was R$ %.2f and the new salary is: R$ %.2f",salary,(salaryAdjustment*100),(salary*salaryAdjustment), newSalary);

    scanner.close();
 }
}

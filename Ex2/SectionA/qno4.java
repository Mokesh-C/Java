    package Ex2.SectionA;

    import java.util.Scanner;

    public class qno4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Gender : ");
            String gender = sc.next().toLowerCase();
            System.out.println("Enter the Height (in meters): ");
            float height = sc.nextFloat();
            System.out.println("Enter the Weight (in Kgs): ");
            float weight = sc.nextFloat();
            float bmi = weight / (height * height);

            if ((bmi >= 27.8 && gender.equals("male")) || (bmi >= 25 && gender.equals("female"))) {
                System.out.println("Person is Obese");
            } else {
                System.out.println("Person is Fit");
            }

        }
    }

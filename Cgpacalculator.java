import java.util.Scanner;
class Cgpacalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Semesters");
        int n=sc.nextInt();
        int combinedCredits=0;
        double combinedSum=0;
        for(int i=1;i<=n;i++){
            System.out.println("**********"+"  "+"Semester"+"-"+i+"  "+"************");
            System.out.println("Enter the number of Subjects:");
            int a=sc.nextInt();
            int totalCredits=0;
            double totalSum=0;
            String[] subjects=new String[a];
            String[] grade=new String[a];
            int[] credits=new int[a];
            for(int j=0;j<a;j++)
            {
                System.out.println("Enter the name of Subject"+" "+(j+1));
                subjects[j]=sc.next();
                System.out.println("Enter the credits for Subject"+" "+(j+1));
                credits[j]=sc.nextInt();
                System.out.println("Enter the grade for Subject"+" "+(j+1));
                grade[j]=sc.next();
                int grades;
            if(grade[j].equalsIgnoreCase("O")){
                grades=10;
            }
            else if(grade[j].equalsIgnoreCase("A+")){
                grades=9;
            }
            else if(grade[j].equalsIgnoreCase("A")){
                grades=8;
            }
            else if(grade[j].equals("B+")||grade[j].equals("b+")){
                grades=7;
            }
            else if(grade[j].equals("B")||grade[j].equals("b")){
                grades=6;
            }
            else if(grade[j].equals("C")||grade[j].equals("c")){
                grades=5;
            }
            else{
                grades=0;
            }
            totalCredits=totalCredits+credits[j];
            totalSum=totalSum+(credits[j]*grades);
        }
        double sgpa=totalSum/totalCredits;
        System.out.println("YOUR SGPA IS"+" : "+sgpa);
        combinedCredits=combinedCredits+totalCredits;
        combinedSum=combinedSum+totalSum;
    }
     double cgpa=combinedSum/combinedCredits;
     System.out.println("YOUR CGPA IS"+" : "+cgpa);
     double percentage=cgpa*9.5;
     System.out.println("Your Percentage is:"+percentage);
     if(cgpa>9){
        System.out.println("Excellent Perfomance");
     }
     else if(cgpa>8){
        System.out.println("Very good Perfomance");
     }
     else if(cgpa>7){
        System.out.println("Good Perfomance");
     }
     else if(cgpa>6){
        System.out.println("Average Perfomance");
     }
     else if(cgpa>5){
        System.out.println("Poor Perfomance");
     }
     else{
        System.out.println("Fail...Try next time");
     }

     sc.close();
}
}
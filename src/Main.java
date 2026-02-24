//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;



void PrintArray( int [] array){
    System.out.print("Your array is: ");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
}

int SumElementOfArray(int [] array){
    int sum=0;
    for(int number:array){
        sum+=number;
    }
    return sum;
}
int MaxOfArray(int [] array){
    int max=array[0];
    for(int number:array){
        if(number>=max){
            max=number;}
        }
    return max;
}
int MinOfArray(int [] array){
    int min=array[0];
    for(int number:array){
        if(number<=min){
            min=number;}
    }
    return min;
}

void main() {
//1.1
    int[] array1 = {1, 2, 3, 4, 5};
    PrintArray(array1);
/*System.out.print("Your array is: ");
for(int i=0;i<array1.length;i++){
    System.out.print(array1[i]+" ");
}
    System.out.println();
*/

//1.2
    String[] names = {"Student1", "Student2", "Student3", "Student4"};
    for (String name : names) {
        System.out.print(name + " ");
    }
    System.out.println();


//1.3
    int[] array2 = {2, 4, 6, 8};

    for (int i = 0; i < array2.length; i++) {
        array2[i] *= array2[i];
    }
    PrintArray(array2);


//2.1.1
    int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = 0; i < array3.length; i++) {
        if ((array3[i] & 1) == 0) {
            System.out.print(array3[i] + " ");
        }
    }

    System.out.println();


//2.1.2
    for (int odd : array3) {
        if (odd % 2 == 0) {
            System.out.print(odd + " ");
        }

    }
    System.out.println();

//2.2
    System.out.println("Sum of Element is " + SumElementOfArray(array3));
/*    int sum=0;
    for(int number:array3){
        sum+=number;
        }
    System.out.println(sum);
*/

//2.3
    String[] cities = {"Dortmund", "Hamburg", "Berlin", "Hanover"};
    for (int i = 0; i < cities.length; i++) {
        System.out.print(cities[i] + " " + i + "\n");
    }


//2.4
    /*
int max=array3[0],min=array3[0];
for(int number:array3){
    if(number>=max){
        max=number;}
    if(number<=min){
        min=number;
    }
}*/
    System.out.println("min= " + MinOfArray(array3) + " max= " + MaxOfArray(array3));


//3.1
    for (int i = 0; i < array3.length; i++) {
        array3[i] *= 2;
    }
    PrintArray(array3);

//3.2
    String[] vornames = {"Vorname1", "Vorname2", "Vorname3", "Vorname4"};

    for (int i = 0, j = 0; i < names.length && j < vornames.length; i++, j++) {
        System.out.println(names[i] + " " + vornames[j]);

    }
//3.3


    int size = 0;
    System.out.println("Input arrays size:");
    Scanner scaner = new Scanner(System.in);
    if (scaner.hasNextInt()) {
        size = scaner.nextInt();
    } else {
        System.out.println("Itsnt number");
    }
    int[] array4 = new int[size];

    for (int i = 0; i < array4.length; i++) {
        array4[i] = scaner.nextInt();
    }


    PrintArray(array4);


//3.4
    int[] ExamNotes = {2, 21, 95, 60};
    int sum = SumElementOfArray(ExamNotes);
    double average = sum / ExamNotes.length;
    if (average > 70) {
        System.out.println("Durchschnitt bestanden");
    } else {
        System.out.println("Durchschnitt nicht bestanden");
    }


//3.5
    int Size = 10;
    int[] array5 = new int[Size];

    Random random = new Random();
    for (int i = 0; i < Size; i++) {
        array5[i] = random.nextInt(100);
    }
    PrintArray(array5);
    Arrays.sort(array5);
    PrintArray(array5);
    System.out.println("Min is "+MinOfArray(array5)+" Max is "+MaxOfArray(array5)+" average is "+ (double)SumElementOfArray(array5)/array5.length);
}











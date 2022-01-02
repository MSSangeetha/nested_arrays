import java.util.Arrays;

public class NestedArrays {

//    create a function that returns true or false
//    true if the first array can be nested inside the second
//    condition
//    array1's min is greater than array2's min
//            array1's max is less than array2's max

//    main function
public static void main (String[] args){

//    declaring an array of integers
    int[] array1 = {1,2,3,4};
    int[] array2 = {0,6};

    NestedArrays nestedArrays = new NestedArrays();
    System.out.println(nestedArrays.canNest(array1,array2));
//    nestedArrays.canNest(array1,array2);
}

public boolean canNest(int[] a,int[] b){
    int minimumA = a[0];
    int minimumB = b[0];

//    System.out.println(a.length);
//    System.out.println(a[0]);
    for(int i=0;i<a.length;i++){
        if(a[i]< minimumA){
            minimumA = a[i];
        }
    }

    for(int j=0;j<b.length;j++) {
        if(b[j]<minimumB){
            minimumB = b[j];
        }
    }

    System.out.println("The min in Array1 is " + minimumA);
    System.out.println("The min in Array2 is " + minimumB);

    if(minimumA>minimumB){
        return true;
    }
    else{
        return false;
    }

//    return minimumA;
//    return true;


}

}
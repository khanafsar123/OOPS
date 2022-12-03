package wrapperClasses;

public class Converting {
    public static void main(String[] args) {
        int num=10;
        // boxing or manual conversaion from primitive to wrapper type. it happened befor java 1.5
        // Integer wrappedNum=Integer.valueOf(num);

        // automatic conversion or AutoBoxing
        // this is how its converted
        Integer wrappedNum=num;


        // we can simply write
        Integer wrappedNum1=10;

    }
}

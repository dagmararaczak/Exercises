package zadania.sety;

import java.util.TreeSet;

import static java.lang.System.*;

 abstract class AddingClass {

    int a;
    public AddingClass(int a) {

        this.a = a;
    }

    public AddingClass() {
    }

    public abstract void dupa ();

    public String name(){
        return "";
    }

    public static void main(String[] args) {
        TreeSet<String> names = new CountSet<>();

        names.add("Dagmara");
        names.add("Sandra");
        names.add("Dominika");
        out.println(CountSet.count);

        fizzBuzz(56);


    }

    public static void fizzBuzz(int n){


        for(int i = 1 ; i<=n; i++){

            if(i%3 == 0 && i%5 == 0){
                out.println("fizzBuzz");
            }else if( i%3 == 0) {
                out.println("fizz");
            }else if(i%5 == 0){
                out.println("buzz");
            }else{
                out.println(i);
            }
        }


    }

}

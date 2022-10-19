public class StringSearch {

    public static void main(String[] args) {

        String st = "I LOVE U oo";



        char ch = 'm';

        if(search(st, ch)){

            System.out.println("Found!");
        }
        else {
            System.out.println("Not found!");
        }


    }

    static boolean search(String st, char ch){

        for (int i = 0; i < st.length(); i++) {

            if (ch == st.charAt(i)){ //searching one by one->linearly
                return true;
            }

        }
        return false;
    }
}

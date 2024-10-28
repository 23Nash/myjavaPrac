package prac5;


public class prac5_2 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello");
        str.append(" World ");
        System.out.println("1. append(): " + str.toString());

        str.insert(6, "Beautiful ");
        System.out.println("2. insert(): " + str.toString());

        str.replace(0, 5, "Hi");
        System.out.println("3. replace(): " + str.toString());

        str.delete(0, 2);
        System.out.println("4. delete(): " + str.toString());

        str.reverse();
        System.out.println("5. reverse(): " + str.toString());
        str.reverse();


        System.out.println("6. charAt(): " + str.charAt(3));

        System.out.println("7. substring(): " + str.substring(0, 5));

        System.out.println("8. capacity(): " + str.capacity());

        System.out.println("9. indexOf(World\"): " + str.indexOf("World"));

        str.setCharAt(str.length()-1, 's');
        System.out.println("10. setCharAt(): " + str.toString());


    }
}

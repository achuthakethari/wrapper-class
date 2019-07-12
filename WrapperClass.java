public class WrapperClass {

    public static void main(String[] args) {


        Integer in = new Integer(5);
        int j = in.intValue();
        System.out.println(j);

        Integer rollno = 101;
        String str = rollno.toString();
        System.out.println("Rollno in string format and its length: ");
        System.out.println(str + "\n" + str.length());

        System.out.println();

        String stringvalue = "500";
        System.out.println("Sringvalue in integer format: ");
        int val = Integer.parseInt(stringvalue);
        System.out.println(val);
        System.out.println("Adding 25 to converted Stringvalue");
        System.out.println((val + 25));

        System.out.println();

    }

}

// Assignment
//String [] str = {"10", "20", "30", "40",  "50"};
// calculate the sum.
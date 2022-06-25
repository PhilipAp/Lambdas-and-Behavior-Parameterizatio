public class Example {

    public static void main(String[] args) {
        FirstInterfaceImpl printer = new FirstInterfaceImpl();
        printer.print(
                (String param) -> {System.out.println("My lambda's parameter value is "+ param);}
        );


    }
}

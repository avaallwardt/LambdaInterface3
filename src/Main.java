public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student stu = new Student("Jasmin", "Thomas");
        stu.multiThreadSave("Documents Folder");

        // didnt have to implement the runnable interface or extend the run class bc predefined
        // savehandler doesnt have anything to do with runnable


    }

}
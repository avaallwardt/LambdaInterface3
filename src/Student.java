public class Student extends Person{
    // can implement multiple but can't extend multiple (can't have multiple parents)

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void saveStudent(){
        SaveHandler saveHandler = new SaveHandler() {
            @Override
            public void saveObject(Object object) {
                System.out.println("object saved");
            }
        };

        saveHandler.saveObject(this);

    }

    public void multiThreadSave(String directoryLocation){
        // run method can take in no arguments, cant add parameters
        // start calls run for multithreading
        // this method will eventually become multithread
        Thread t1;
        Thread t2;
        //t1 = new Thread();
        // make a new runnable object
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    System.out.println("Running 1 " + directoryLocation);

                }
            }
        };

        // LAMBDA
        Runnable runnable2 = () -> {
            for(int i = 0; i < 1000; ){
                System.out.println("Running 2 " + directoryLocation);
            }
        };

        // Lambda is only available with functional interfaces
        // dont need to wirte out the method header bc functional interfaces can only have one method so it knows which one you are referring to

        // implementing Runnable here, and storing that implementation in an object/variable called runnable
        t1 = new Thread(runnable);
        t2 = new Thread(runnable2);
        t1.start();
        t2.start();



    }


}

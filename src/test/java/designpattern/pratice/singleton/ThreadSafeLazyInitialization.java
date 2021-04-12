package designpattern.pratice.singleton;

public class ThreadSafeLazyInitialization {

    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization(){}

    public static ThreadSafeLazyInitialization getInstance(){
        //Double-checked locking
        if(instance == null){
            synchronized (ThreadSafeLazyInitialization.class) {
                if(instance == null)
                    instance = new ThreadSafeLazyInitialization();
            }

        }
        return instance;
    }
}
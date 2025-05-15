package multithreading;

class StringBuilderThread extends Thread {  
    private StringBuilder stringBuilder;  

    public StringBuilderThread(StringBuilder stringBuilder) {  
        this.stringBuilder = stringBuilder;  
    }  

    @Override  
    public void run() {  
        for (int i = 0; i < 10000; i++) {  
            stringBuilder.append("A");  
        }  
    }  
}  

class StringBufferThread extends Thread {  
    private StringBuffer stringBuffer;  

    public StringBufferThread(StringBuffer stringBuffer) {  
        this.stringBuffer = stringBuffer;  
    }  

    @Override  
    public void run() {  
        for (int i = 0; i < 10000; i++) {  
            stringBuffer.append("A");  
        }  
    }  
}  

public class ThreadSafetyExample {  
    public static void main(String[] args) throws InterruptedException {  
        // StringBuilder example  
        StringBuilder stringBuilder = new StringBuilder();  
        StringBuilderThread thread1 = new StringBuilderThread(stringBuilder);  
        StringBuilderThread thread2 = new StringBuilderThread(stringBuilder);  
        thread1.start();  
        thread2.start();  
        thread1.join();  
        thread2.join();  
        System.out.println("StringBuilder length: " + stringBuilder.length());  

        // StringBuffer example  
        StringBuffer stringBuffer = new StringBuffer();  
        StringBufferThread thread3 = new StringBufferThread(stringBuffer);  
        StringBufferThread thread4 = new StringBufferThread(stringBuffer);  
        thread3.start();  
        thread4.start();  
        thread3.join();  
        thread4.join();  
        System.out.println("StringBuffer length: " + stringBuffer.length());  
    }  
}
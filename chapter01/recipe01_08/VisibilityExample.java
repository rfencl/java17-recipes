

class TestClass {
    private long visibleOnlyInThisClass;
    double visibleFromEntire;
    
    void setLong (long val) {
        visibleOnlyInThisClass = val;
    }
    
    long getLong () {
       return visibleOnlyInThisClass;
    }  
}

public class VisibilityExample {            
    public static void main(String[] args) {
        TestClass tc = new TestClass();  
        tc.setLong(32768);
        tc.visibleFromEntire=3.4;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFromEntire);
    }
}


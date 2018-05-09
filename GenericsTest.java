public class GenericsTest<T,S> {

    private T fParam;
    private S sParam;

    public T getfParam() {
        return fParam;
    }

    public void setfParam(T fParam) {
        this.fParam = fParam;
    }

    public GenericsTest(){


    }

    public GenericsTest(T fParam, S sParam){
        this.fParam=fParam;
        this.sParam=sParam;
    }

    public static void main(String args[]){
        GenericsTest obj1 = new GenericsTest("sonu",31);
        GenericsTest obj2 = new GenericsTest(10,20);
        GenericsTest obj3 = new GenericsTest();
        System.out.println(obj3.fParam +" "+obj3.sParam);
        System.out.println(obj1.fParam +"  "+obj1.sParam);
        System.out.println(obj2.fParam +"  "+obj2.sParam);
    }
}

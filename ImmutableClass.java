public final class ImmutableClass {
    private final  int uid;
    public ImmutableClass(int uid){
        this.uid=uid;
    }

    public int getUid(){
        return uid;
    }
    public static void main(String args[]){

        ImmutableClass obj1 = new ImmutableClass(10);

        System.out.println("The UID: "+obj1.getUid());
    }
}



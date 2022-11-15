public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
        //create new object from method
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        //call class method
        getData2();


    }
    //method not return anithing, if return can using integer
    //when using static, the method move to class level 
    //this is method
    public String getData(){
        System.out.println("hello world");
        return "Ega Rijki";
    }
    public static String getData2(){
        System.out.println("hello world 2");
        return "Ega Rijki";
    }


}

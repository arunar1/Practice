public class constructor {
    String name;
    int rno;
    constructor(){
        name="abin";
        rno=67;
    }
    // parameterized constructor

    constructor(String str, int rn){
        name=str;
        rno=rn ;
    }
    public static void main(String[] args) {

        constructor obj1=new constructor();
        System.out.println(obj1.name);
        System.out.println(obj1.rno);

        constructor obj2 =new constructor("manu",45);
        System.out.println(obj2.name);
        System.out.println(obj2.rno);
        
    }
    
}

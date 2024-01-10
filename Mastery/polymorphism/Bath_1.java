public class Bath_1 {
   

    private String name;

    public Bath_1(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void makebath(){
        System.out.println("Hello welcome");
    }
    
    public void makeshower(String shower){
        System.out.println("Showerd :"+ shower);
    }
    public void makeshower(String shower,int times){
        System.out.println(times + " times s showerd "+shower);
    }

    

}

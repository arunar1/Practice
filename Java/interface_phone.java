interface Features{
    void dialing();
    void messaging();
}
interface Addon{
    void vcalling();
    void mms();
}


class FeaturedPhone implements Features{
    public void dialing(){
        System.out.println("Featured phone is dialing...");
    }
    public void messaging(){
        System.out.println("Featured Phone is messaging");
    }
}

class SmartPhone implements Features,Addon{
     public void dialing(){
        System.out.println("Smartphone phone is dialing...");
    }
    public void messaging(){
        System.out.println("smartphone Phone is messaging");
    }
     public void vcalling(){
        System.out.println("Smart phone is video calling...");
    }
    public void mms(){
        System.out.println("Smart Phone is mms");
    }
}


public class interface_phone {
    public static void main(String[] args) {
        FeaturedPhone fp = new FeaturedPhone();
        fp.dialing();
        fp.messaging();

        SmartPhone sp= new SmartPhone();
        sp.dialing();
        sp.messaging();
        sp.vcalling();
        sp.mms();
    }

    
}

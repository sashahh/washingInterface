public class Fresh implements WashCatergory{
    public  String clothType;
    public String catergory;

    public String clothType(){
        return clothType;
    }
    public String catergory(){
        return catergory();
    }

    public void wash(){
        System.out.println("wash your jeans with fresh");

    }
    public void rinse(){
        System.out.println("rinse with fresh");
    }
    public void dry(){
        System.out.println("dry with fresh");
    }
}

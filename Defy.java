import java.util.Scanner;

public class Defy implements WashCatergory{

    private String clothType;
    private String catergory;


    public String clothType(){
        return clothType;
    }
    public String catergory(){
        return catergory();
    }



@Override
    public void  wash() {

    System.out.println("wash cotton with defy");
}
@Override
public void  rinse(){
    System.out.println("rinse with defy ");
}
@Override
    public void  dry(){
    System.out.println("dry with defy");
}


}

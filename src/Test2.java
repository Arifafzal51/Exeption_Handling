import java.io.FileInputStream;

public class Test2
{
    public static void main(String[] args)
    {
        try {
            FileInputStream fis= new FileInputStream("d:/Atraction.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}

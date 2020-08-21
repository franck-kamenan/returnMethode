package be.intecbrussel.hoofdstuk8.returnMethode;

public class ReturnRectangleApp
{
    public static void main(String[] args)
    {
        ReturnRectangle monRetRect = new ReturnRectangle();
        monRetRect.height = 8;
        monRetRect.width = 4;
        double area = monRetRect.getArea();
        System.out.println(area);
        System.out.println(monRetRect.getArea());
    }
}

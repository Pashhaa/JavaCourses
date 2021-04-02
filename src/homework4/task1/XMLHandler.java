package homework4.task1;

public class XMLHandler extends AbstractHandler{

    @Override

    public void open() {
        System.out.println("Открыт xml документ");
    }

    @Override
    public void create() {
        System.out.println("Cоздан xml документ");

    }

    @Override
   public void change() {
        System.out.println("Изменен xml документ");

    }

    @Override
    public void save() {
        System.out.println("Изменен xml документ");

    }
}

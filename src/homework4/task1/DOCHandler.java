package homework4.task1;

public class DOCHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Открыт doc документ");
    }

    @Override
   public void create() {
        System.out.println("Создан doc документ");
    }

    @Override
    public void change() {
        System.out.println("Изменен doc документ");
    }

    @Override
   public void save() {
        System.out.println("Сохранен doc документ");

    }
}

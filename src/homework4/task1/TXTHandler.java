package homework4.task1;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открыт txt документ");
    }

    @Override
   public void create() {
        System.out.println("Создан txt документ");
    }

    @Override
   public void change() {
        System.out.println("Изменен txt документ");
    }

    @Override
   public void save() {
        System.out.println("Сохранен txt документ");
    }
}

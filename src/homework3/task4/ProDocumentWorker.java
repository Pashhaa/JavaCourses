package homework3.task4;

public class ProDocumentWorker extends DocumentWorker {


    @Override
    public void editDocument() {

        System.out.println("Документ отредактирван");
    }

    @Override
    public void saveDocument() {

        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}

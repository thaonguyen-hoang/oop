package decorator.filebehavior;

public interface DataSource {
    void writeData(String data);
    String readData();
}

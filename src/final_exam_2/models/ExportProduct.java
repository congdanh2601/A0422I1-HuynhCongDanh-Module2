package final_exam_2.models;

public class ExportProduct extends Product {
    private int exportPrice;
    private String importNation;

    public ExportProduct() {
    }

    public ExportProduct(int id, String code, String name, int price, int amount, String brand, int exportPrice, String importNation) {
        super(id, code, name, price, amount, brand);
        this.exportPrice = exportPrice;
        this.importNation = importNation;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getImportNation() {
        return importNation;
    }

    public void setImportNation(String importNation) {
        this.importNation = importNation;
    }

    @Override
    public String toString() {
        return "ExportProduct{" + super.toString() +
                "exportPrice=" + exportPrice +
                ", importNation='" + importNation + '\'' +
                '}';
    }
}

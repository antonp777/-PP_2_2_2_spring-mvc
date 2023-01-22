package web.model;

public class Car {
    private int id;
    private String labelCar;
    private String modelCar;

    public Car(int id, String labelCar, String modelCar) {
        this.id = id;
        this.labelCar = labelCar;
        this.modelCar = modelCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabelCar() {
        return labelCar;
    }

    public void setLabelCar(String labelCar) {
        this.labelCar = labelCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
}

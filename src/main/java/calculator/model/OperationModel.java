package calculator.model;

public class OperationModel {

    private String operation;
    private float a;
    private float b;
    private float c;

    public OperationModel() {
    }

    public OperationModel(float c) {
        this.c = c;
    }

    public OperationModel(String operation) {
        this.operation = operation;
    }

    public OperationModel(float a, float b) {
        this.a = a;
        this.b = b;
    }


    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}

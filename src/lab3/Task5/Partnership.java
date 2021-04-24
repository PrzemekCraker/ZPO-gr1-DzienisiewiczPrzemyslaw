package lab3.Task5;

public class Partnership implements Observer {
    public Partnership(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public void update(int value) {
        float v = value*this.value/100 + this.value;
        System.out.print(name);
        System.out.println(" - Share value: "+v);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    private String[] actions;
    private Integer value;
    private String name;
}
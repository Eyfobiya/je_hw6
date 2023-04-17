package task_4;
// Створіть перечислювальний тип (enum) Vehicles, що містить конструктор, який повинен набувати
// цілого числа (вартість автомобіля), містити метод getColor(), який повертає рядок з кольором
// автомобіля, і містити перевантажений метод toString(), який повинен повертати рядок з назвою
// екземпляра, кольором та вартістю автомобіля.
public enum Vehicles {
    Audi(99999);
    final int PRICE;
    final String COLOR = "Orange";

    Vehicles(int price){
        this.PRICE = price;
    }
    public String getColor() {
        return COLOR;
    }
    @Override
    public String toString(){
        return "Car: " + super.toString() + ", color: " + getColor() + ", price: " + getPRICE();
    }
    public int getPRICE() {
        return PRICE;
    }
}
class Main {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.Audi;
        System.out.println(vehicles);
    }
}

package task_2;
// Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати
// цілого числа (вік тварини), і містити перевантажений метод toString(),
// який повинен повертати назву екземпляра та вік тварини.
public enum Animals {
    Debby(3);
    final int AGE;
    Animals(int age){
        this.AGE = age;
    }
    @Override
    public String toString(){
       return "Name: " + super.toString() + ", age: " + getAGE();
    }
    public int getAGE() {
        return AGE;
    }
}
class Main {
    public static void main(String[] args) {
        Animals animalName = Animals.Debby;
        System.out.println(animalName);

    }
}


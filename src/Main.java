public class Main {


    public static void main(String[] args) {

        Employee[] list = new Employee[10];
        list[0] = new Employee("Гусева Нина Алексеевна", 1, 5800);
        list[1] = new Employee("Кожемяка Геннадий Николаевич", 1, 5500);
        list[2] = new Employee("Янюк Василий Иванович", 2, 6000);
        list[3] = new Employee("Ковбасюк Ольга Сергеевна", 2, 5900);
        list[4] = new Employee("Сметаненко Руслан Владимирович", 3, 6100);
        list[5] = new Employee("Саввин Вячеслав Михаилович", 3, 5555);
        list[6] = new Employee("Штука Екатерина Александровна", 4, 6200);
        list[7] = new Employee("Хащеватская Галина Сергеевна", 5, 5950);
        list[8] = new Employee("Бабичев Владимир Владимирович", 4, 4100);
        list[9] = new Employee("Першина Вероника Алексеевна", 5, 6480);

        System.out.println("Общая сумма " + sum(list));
        System.out.println("Максимальная ставка " + maxWage(list));
        System.out.println("Минимальная ставка " + minWage(list));
        System.out.println("Средняя зарплата составляет " + averageWage(list));
        printList(list);

    }

    //метод суммы
    public static double sum(Employee[] list) {
        //list[0].getWage();
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getWage();
        }
        return sum;
    }

    //методы макс
    public static double maxWage(Employee[] list) {
        double maxWage = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getWage() > maxWage) {
                maxWage = list[i].getWage();
            }
        }
        return maxWage;
    }
    //методы мин

    public static double minWage(Employee[] list) {
        double minWage = 5000_0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getWage() < minWage) {
                minWage = list[i].getWage();
            }
        }
        return minWage;
    }

    //метод средней зп
    public static double averageWage(Employee[] list) {
        double average = sum(list) / list.length;
        return average;
    }

    //метод списка
    private static void printList(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }


}








package modifiers.employee;

/**
 * Created by RENT on 2017-02-14.
 */
public abstract class Employee {
    protected Double salary;

    public abstract Double getSalary();

    public void test() {
        Employee e = new Employee() {
            @Override
            public Double getSalary() {              // anonimowy extend, anonimowe rozszerzenie klasy, takie niby utworzenie obiektu w klasie abstrakcyjnej
                return null;
            }
        };
    }
}

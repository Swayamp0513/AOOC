// Problem 2:
// Create class hierarchy for Employee, Manager, Developer, Programmer.
// Include methods for bonus and performance.

class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, String j, double s) {
        name = n;
        address = a;
        jobTitle = j;
        salary = s;
    }

    void bonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performance() {
        System.out.println("Performance: Good");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    void manageProject() {
        System.out.println("Managing projects");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a// Problem 2:
// Create class hierarchy for Employee, Manager, Developer, Programmer.
// Include methods for bonus and performance.

class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, String j, double s) {
        name = n;
        address = a;
        jobTitle = j;
        salary = s;
    }

    void bonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performance() {
        System.out.println("Performance: Good");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    void manageProject() {
        System.out.println("Managing projects");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, "Programmer", s);
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", "Kolhapur", 60000);
        Developer d = new Developer("Amit", "Pune", 50000);

        m.bonus();
        m.manageProject();

        d.bonus();
        d.performance();
    }
}, "Programmer", s);
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", "Kolhapur", 60000);
        Developer d = new Developer("Amit", "Pune", 50000);

        m.bonus();
        m.manageProject();

        d.bonus();
        d.performance();
    }
}
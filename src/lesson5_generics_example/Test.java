package lesson5_generics_example;

public class Test {
    public static void main(String[] args) {
        SchoolChild child1 = new SchoolChild("Andrey", 13);
        SchoolChild child2 = new SchoolChild("Anna", 14);

        Student student1 = new Student("Sergey", 19);
        Student student2 = new Student("Elena", 19);

        Employee employee1 = new Employee("Anton", 35);
        Employee employee2 = new Employee("Evgeniy", 37);

        Team<SchoolChild> schoolTeam = new Team<>("Dragons");
        schoolTeam.addNewParticipant(child1);
        schoolTeam.addNewParticipant(child2);

        Team<SchoolChild> schoolTeam2 = new Team<>("Poindexter");
        schoolTeam.addNewParticipant(new SchoolChild("Artem", 13));
        schoolTeam.addNewParticipant(new SchoolChild("Alena", 14));

        Team<Student> studentTeam = new Team<>("Beaver");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Hunky");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolTeam.playWith(schoolTeam2);
    }
}

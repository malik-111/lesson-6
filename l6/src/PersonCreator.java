public class PersonCreator{

    public static void main(String[] args) {
        Person person01 = new Person("James", "Peterson", 34, 180.0, 73.5);
        Person person02 = new Person("Bob", "Thornley", 25, 171.0, 68.2);

        String p1details = person01.getFirstName() + " " + person01.getLastName() + " " + person01.getAge() + " " + person01.getHeight() + " " + person01.getWeight();
        String p2details = person02.getFirstName() + " " + person02.getLastName() + " " + person02.getAge() + " " + person02.getHeight() + " " + person02.getWeight();


        System.out.println(p1details);
        System.out.println(p2details);

        person01.growOlder(person01.getAge(), person01.getHeight(), person01.getWeight());
        System.out.println(person01.getFirstName() + " " + person01.getLastName() + " " + person01.getAge() + " " + person01.getHeight() + " " + person01.getWeight());
    }
}

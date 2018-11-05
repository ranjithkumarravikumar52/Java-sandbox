package designpatterns.builderpattern.factedbuilder;

public class Person {
    public String streetAddress;
    public String postCode;
    public String city;

    public String companyName;
    public String position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

class PersonBuilder{
    protected Person person = new Person();

    //PersonAddressBuilder
    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }

    //PersonJobBuilder
    public PersonJobBuilder works(){
        return new PersonJobBuilder(person);
    }

    public Person build(){
        return this.person;
    }
}

class PersonJobBuilder extends PersonBuilder{
    public PersonJobBuilder(Person person){
        this.person = person;
    }

    public PersonJobBuilder at(String companyName){
        this.person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position){
        this.person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome){
        this.person.annualIncome = annualIncome;
        return this;
    }
}

class PersonAddressBuilder extends PersonBuilder{
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress){
        this.person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder in(String city){
        this.person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode){
        this.person.postCode = postCode;
        return this;
    }
}

class Demo{
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person ranjith = pb
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostCode("123BLM")
                .works()
                    .asA("Developer")
                    .at("Nexmo")
                    .earning(60000)
                .build();
        System.out.println(ranjith);
    }
}
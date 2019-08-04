package ac.za.cput.kaylin.assignment10.domain.person;

public class Employee
{
    private String empNum, firstName, lastName;

    private Employee() {
    }

    private Employee(Builder builder) {
        this.empNum = builder.empNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder
    {
        private String empNum, firstName, lastName;

        public Builder empNum(String empNum)
        {
            this.empNum = empNum;
            return this;
        }
        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }
        public Employee build()
        {
            return new Employee(this);
        }

        @Override
        public String toString()
        {
            return " Employee Number" + empNum + " First Name" + firstName + " Last Name" + lastName;
        }
    }
}

package ac.za.cput.kaylin.assignment10.domain.person;

public class EmployeeGender
{
    private String empNum, genderId;

    private EmployeeGender() {
    }

    private EmployeeGender(Builder builder) {
        this.empNum = builder.empNum;
        this.genderId = builder.genderId;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getGenderId() {
        return genderId;
    }

    public static class Builder
    {
        private String empNum, genderId;

        public Builder empNum(String empNum)
        {
            this.empNum = empNum;
            return this;
        }
        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public EmployeeGender build()
        {
            return new EmployeeGender(this);
        }

        @Override
        public String toString()
        {
            return " Employee Number" + empNum + " Gender ID" + genderId;
        }
    }
}

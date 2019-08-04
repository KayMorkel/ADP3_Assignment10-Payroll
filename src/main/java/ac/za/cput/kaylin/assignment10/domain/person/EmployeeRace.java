package ac.za.cput.kaylin.assignment10.domain.person;

public class EmployeeRace
{
    private String empNum, raceId;

    private EmployeeRace() {
    }

    private EmployeeRace(Builder builder) {
        this.empNum = builder.empNum;
        this.raceId = builder.raceId;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getRaceId() {
        return raceId;
    }

    public static class Builder
    {
        private String empNum, raceId;

        public Builder empNum(String empNum)
        {
            this.empNum = empNum;
            return this;
        }
        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build()
        {
            return new EmployeeRace(this);
        }

        @Override
        public String toString()
        {
            return " Employee Number" + empNum + " Race ID" + raceId;
        }
    }
}

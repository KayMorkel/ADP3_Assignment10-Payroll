package ac.za.cput.kaylin.assignment10.domain.demography;

public class Gender
{
    private String genderId, genderDescr;

    private Gender() {
    }

    private Gender(Builder builder) {
        this.genderId = builder.genderId;
        this.genderDescr = builder.genderDescr;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderDescr() {
        return genderDescr;
    }

    public static class Builder
    {
        private String genderId, genderDescr;

        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }
        public Builder genderDescr(String genderDescr)
        {
            this.genderDescr = genderDescr;
            return this;
        }
        public Gender build()
        {
            return new Gender(this);
        }

        @Override
        public String toString()
        {
            return "Gender Id" + genderId + " Gender description: " + genderDescr;
        }
    }
}

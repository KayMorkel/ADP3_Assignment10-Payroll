package ac.za.cput.kaylin.assignment10.domain.demography;

public class Race
{
    private String raceId, raceDescr;

    private Race() {
    }

    private Race(Builder builder) {
        this.raceId = builder.raceId;
        this.raceDescr = builder.raceDescr;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getRaceDescr() {
        return raceDescr;
    }

    public static class Builder
    {
        private String raceId, raceDescr;

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }
        public Builder raceDescr(String raceDescr)
        {
            this.raceDescr = raceDescr;
            return this;
        }
        public Race build()
        {
            return new Race(this);
        }

        @Override
        public String toString()
        {
            return "Race ID" + raceId + " Race Description: " + raceDescr;
        }
    }
}

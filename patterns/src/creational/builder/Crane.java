package creational.builder;

public class Crane {

    private String typeCrane;
    private Integer boomReach;
    private Integer liftingCapacity;

    public String getTypeCrane() {
        return typeCrane;
    }

    public Integer getBoomReach() {
        return boomReach;
    }

    public Integer getLiftingCapacity() {
        return liftingCapacity;
    }

    public static class CraneBuilder {
        private String typeCrane;
        private Integer boomReach;
        private Integer liftingCapacity;

        public CraneBuilder(String typeCrane) {
            this.typeCrane = typeCrane;
        }

        public CraneBuilder setBoomReach(Integer boomReach) {
            this.boomReach = boomReach;
            return this;
        }

        public CraneBuilder setLiftingCapacity(Integer liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
            return this;
        }

        public Crane buildCrane() {
            return new Crane(this);
        }
    }

    public Crane(CraneBuilder builder) {
        this.typeCrane = builder.typeCrane;
        this.boomReach = builder.boomReach;
        this.liftingCapacity = builder.liftingCapacity;
    }


}

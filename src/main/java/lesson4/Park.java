package lesson4;

public class Park {
    private String parkName;

    public Attraction[] attractions;

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public String getParkName() {
        return parkName;
    }

    public Attraction[] getAttractions() {
        return attractions;
    }
}

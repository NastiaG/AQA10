/* 7.	Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 времени их работы и стоимости. */

package lesson4;

public class MainForPark {
    public static void main(String[] args) {
        Park park = new Park("Central park");
        park.attractions = new Park.Attraction[3];

        park.attractions[0] = park.new Attraction("Roller Coaster", "12:00 - 23:00", 20.0);
        park.attractions[1] = park.new Attraction("Carousel", "11:00 - 23:00", 10.0);
        park.attractions[2] = park.new Attraction("Water Ride", "10:00 - 20:00", 15.0);

        getInfo(park);
    }

    public static void getInfo(Park park) {
        System.out.println("Attractions in the " + park.getParkName() + ":");
        System.out.println();
        for (Park.Attraction attr: park.attractions) {
            System.out.println("Name of the Attraction: " + attr.getName());
            System.out.println("Working hours of the Attraction: " + attr.getWorkingHours());
            System.out.println("Price of the Attraction: " + attr.getPrice());
            System.out.println();
        }
    }
}

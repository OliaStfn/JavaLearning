package Patterns.Structural.Facade;

public class BookingHotel {
    public int bookingRoom(int quantityRoom) {
        switch (quantityRoom) {
            case 1:
                return 300;
            case 2:
                return 400;
            case 3:
                return 500;
            case 4:
                return 600;
            case 5:
                return 700;
                default:
                    System.out.println("Cannot number with "+quantityRoom+" rooms");
                    return 0;
        }
    }
}

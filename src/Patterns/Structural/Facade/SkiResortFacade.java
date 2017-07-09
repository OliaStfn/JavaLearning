package Patterns.Structural.Facade;

public class SkiResortFacade {
    private RentSki rentSki = new RentSki();
    private BookingHotel bookingHotel = new BookingHotel();
    private SkiResortTicket skiResortTicket = new SkiResortTicket();

    public int haveGoodRest(int height,int weight,int size,int skiLevel,int quantityRoom){
        int allPrice=0;
        allPrice+=rentSki.rentBoots(size,skiLevel);
        allPrice+=rentSki.rentSki(weight,skiLevel);
        allPrice+=rentSki.rentPole(height);
        allPrice+=bookingHotel.bookingRoom(quantityRoom);
        allPrice+=skiResortTicket.buyOneDayTicket();

        return allPrice;
    }

    public int buyOneDayTicket() {
       return  skiResortTicket.buyOneDayTicket();
    }

    public int buyHalfDayTicket() {
       return skiResortTicket.buyHalfDayTicket();
    }

    public int bookingRoom(int quantityRoom) {
        return bookingHotel.bookingRoom(quantityRoom);
    }
}

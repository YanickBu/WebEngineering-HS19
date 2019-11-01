package webec

class BootStrap {

    def init = { servletContext ->
        Person dierk = new Person(firstName: "Dierk", lastName: "König").save();
        Person yanick = new Person(firstName: "Yanick", lastName: "Businger").save();
        Room room1 = new Room(name: "1.313", capacity: 60).save();
        Room room2 = new Room(name: "3.113", capacity: 60).save();
        Date today = new Date();

        for (int i = 0; i < 100; i++) {
            Booking booking = new Booking(booker: dierk, room: room1, day: today, slot: Booking.AM).save();
        }

        Booking booking = new Booking(booker: dierk, room: room1, day: today, slot: Booking.AM).save();
    }
    def destroy = {
    }
}

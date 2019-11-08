package webec

class BookingController {

    def probiere() {
        // find the last names of all people that booked
        // room named "1.313"
        def booker = Person.findByLastName('Holz')
        def result = Booking.findAllByBooker(booker)*.room
        render text: result.toString()
    }

    def booker() {
        def room = Room.findByName('1.313')
        def result = Booking.findAllByRoom(room)*.booker.unique().lastName
        render text: result.toString()
    }

    static scaffold = Booking
}

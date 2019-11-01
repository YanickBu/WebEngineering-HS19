package webec

class BookingController {

    def probiere() {
        def booker = Person.findByLastName('König')
        def result = Booking.findAllByBooker(booker)*.room.unique()
        render text: result.toString()
    }

    def booker() {
        def room = Room.findByName('1.313')
        def result = Booking.findAllByRoom(room)*.booker.unique().lastName
        render text: result.toString()
    }

    static scaffold = Booking
}

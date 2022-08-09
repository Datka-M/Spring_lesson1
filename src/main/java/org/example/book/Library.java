package org.example.book;

public class Library {

//    private Book book;
    private Autobiography autobiography;
    private BusinessBook businessBook;
    private ClassicBook classicBook;
    private Fantasy fantasy;
    private Fiction fiction;
    private History history;
    private Horror horror;
    private NonFiction nonFiction;
    private Politic politic;
    private RomanBook romanBook;
    private TravelBook travelBook;

//    public Library(Book book) {
//        this.book = book;
//    }


    public Library(Autobiography autobiography, BusinessBook businessBook,
                   ClassicBook classicBook, Fantasy fantasy, Fiction fiction, History history,
                   Horror horror, NonFiction nonFiction, Politic politic, RomanBook romanBook,
                   TravelBook travelBook) {
        this.autobiography = autobiography;
        this.businessBook = businessBook;
        this.classicBook = classicBook;
        this.fantasy = fantasy;
        this.fiction = fiction;
        this.history = history;
        this.horror = horror;
        this.nonFiction = nonFiction;
        this.politic = politic;
        this.romanBook = romanBook;
        this.travelBook = travelBook;
    }

    public Library (){

    }

    public void setAutobiography(Autobiography autobiography) {
        this.autobiography = autobiography;
    }

    public void setBusinessBook(BusinessBook businessBook) {
        this.businessBook = businessBook;
    }

    public void setClassicBook(ClassicBook classicBook) {
        this.classicBook = classicBook;
    }

    public void setFantasy(Fantasy fantasy) {
        this.fantasy = fantasy;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public void setHorror(Horror horror) {
        this.horror = horror;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

    public void setPolitic(Politic politic) {
        this.politic = politic;
    }

    public void setRomanBook(RomanBook romanBook) {
        this.romanBook = romanBook;
    }

    public void setTravelBook(TravelBook travelBook) {
        this.travelBook = travelBook;
    }

    public Autobiography getAutobiography() {
        return autobiography;
    }

    public BusinessBook getBusinessBook() {
        return businessBook;
    }

    public ClassicBook getClassicBook() {
        return classicBook;
    }

    public Fantasy getFantasy() {
        return fantasy;
    }

    public Fiction getFiction() {
        return fiction;
    }

    public History getHistory() {
        return history;
    }

    public Horror getHorror() {
        return horror;
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public Politic getPolitic() {
        return politic;
    }

    public RomanBook getRomanBook() {
        return romanBook;
    }

    public TravelBook getTravelBook() {
        return travelBook;
    }

    public void myLibrary(){
        System.out.println("Welcome to my library");
//        book.myBooks();
        autobiography.myBooks();
        businessBook.myBooks();
        classicBook.myBooks();
        fantasy.myBooks();
        fiction.myBooks();
        history.myBooks();
        horror.myBooks();
        nonFiction.myBooks();
        politic.myBooks();
        romanBook.myBooks();
        travelBook.myBooks();

    }
}

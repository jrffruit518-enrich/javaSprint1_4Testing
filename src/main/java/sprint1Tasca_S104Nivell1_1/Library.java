package sprint1Tasca_S104Nivell1_1;


public class Library {
    private BookManagement bookManagement;

    public Library() {
        this.bookManagement = new BookManagement();
    }

    public BookManagement getBookManagement() {
        return bookManagement;
    }

    public void menu() {
        boolean flag = true;
        do {

            System.out.println("1: Add one book.");
            System.out.println("2: Show all the books. ");
            System.out.println("3: Show the name of a book. ");
            System.out.println("4: Add one book by index.");
            System.out.println("5: Remove one book by name. ");
            System.out.println("6: Exit. ");
            int option = LibraryEntry.readInt("Please enter the name between 1-6." + '\n');
            switch (option) {
                case 1:
                    try {
                        String name = LibraryEntry.readString(("Please enter the name." + '\n'));
                        this.bookManagement.addBook(name);
                        System.out.println("The book is added." + '\n');
                    } catch (ExceptionBookExisted e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 2:
                    try {
                        if (bookManagement.getBooks().size() <= 0) {
                            throw new ExceptionBookEmpty("There is no book." + '\n');
                        }
                        this.bookManagement.show();
                    } catch (ExceptionBookEmpty e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 3:
                    int i = LibraryEntry.readInt("Please enter the index of book." + '\n');
                    try {
                        System.out.println("The book is : " + this.bookManagement.showName(i) + '\n');
                    } catch (ExceptionBookOutOfBound e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }

                    break;

                case 4:
                    try {
                        int i1 = LibraryEntry.readInt("Please enter the index of book." + '\n');
                        String name = LibraryEntry.readString(("Please enter the name." + '\n'));
                        this.bookManagement.addBookByInt(i1, name);
                        System.out.println("The book is added." + '\n');
                    } catch (ExceptionBookOutOfBound e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    } catch (ExceptionBookExisted e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;

                case 5:

                    String name = LibraryEntry.readString("Please enter the name." + '\n');
                    try {
                        this.bookManagement.removeBook(name);
                        System.out.println("The book is removed." + '\n');
                    } catch (ExceptionBookEmpty e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 6:
                    flag = false;
                    System.out.println("Thank you for using.");
                    break;

                default:
                    System.out.println("The number you entered is invalid,please try again." + '\n');
                    System.out.println();

            }

        } while (flag);
    }

}


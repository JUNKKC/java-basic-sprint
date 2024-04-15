class Book{


    public String title;
    public String author;
    public int price;



    public Book(String title, String author, int price){

        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void adds(){
        System.out.printf("제목은 %s 저자는 %s 가격은 %d 원 입니다 %n",title,author,price);
    }


}

package main.java.com.soft2036.study.week5;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class TestBook {
    public static void main(String[] args) {
        Book []books = new Book[]{
                Book.builder().ISBN("1231231231231").bookName("java暴力破解").price(99).build(),
                Book.builder().ISBN("123123123123A").bookName("java从入门到精通").price(99).build(),
                Book.builder().ISBN("1231231231231").bookName("java学习笔记").price(199).build(),
                Book.builder().ISBN("1231231231231").bookName("java案例开发").price(99).build()};
        BookService bs = new BookServiceImpl();
        for (Book book: books){
            try {
                boolean b = bs.PutOnSale(book);
                if(b){
                    System.out.println(book.getBookName()+"成功上架");
                }
            }catch (PriceException e) {
                e.printStackTrace();
            } catch (BookNameException e) {
                e.printStackTrace();
            } catch (ISBNException e) {
                e.printStackTrace();
            }

        }
    }
}

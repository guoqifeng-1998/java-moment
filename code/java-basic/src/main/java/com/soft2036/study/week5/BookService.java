package main.java.com.soft2036.study.week5;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public interface BookService {
    boolean PutOnSale(Book book) throws ISBNException, BookNameException, PriceException;
}

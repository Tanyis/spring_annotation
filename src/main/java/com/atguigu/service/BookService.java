package service;

import com.atguigu.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BookService {

    @Inject
    private BookDao bookDao;

    public void  print(){
        System.out.println(bookDao);
    }
    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}

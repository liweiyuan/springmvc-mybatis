package com.wade.service;

import com.wade.entity.Book;
import com.wade.mapper.BookDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tingyun on 2018/3/13.
 */
@Service
public class BookService {

    @Resource
    private BookDAO dao;

    public List<Book> getAllBooks() {
        return dao.getAllBooks();
    }

    public Book getBookById(int id) {
        return dao.getBookById(id);
    }

    public int add(Book entity) {
        return dao.add(entity);
    }

    @Transactional
    public int add(Book entity1, Book entity2) {
        int row = 0;
        row = dao.add(entity1);
        row = dao.add(entity2);
        return row;
    }

    public int delete(int id) {
        return dao.delete(id);
    }

    /**
     * 多删除
     */
    public int delete(String[] ids) {
        int rows = 0;
        for (String idStr : ids) {
            int id = Integer.parseInt(idStr);
            rows += delete(id);
        }
        return rows;
    }

    public int update(Book entity) {
        return dao.update(entity);
    }
}

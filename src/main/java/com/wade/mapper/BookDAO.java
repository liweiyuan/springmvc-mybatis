package com.wade.mapper;

import com.wade.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tingyun on 2018/3/13.
 */
public interface BookDAO {

    public List<Book> getAllBooks();

    /**
     * 根据图书编号获得图书对象
     */
    public Book getBookById(@Param("id") int id);

    /**
     * 添加图书
     */
    public int add(Book entity);
    /**
     * 根据图书编号删除图书
     */
    public int delete(int id);
    /**
     * 更新图书
     */
    public int update(Book entity);
}

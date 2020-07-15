package com.example.library.bookApi.v1.mapper;

import com.example.library.bookApi.v1.model.BookDTO;
import com.example.library.model.Book;
import org.mapstruct.Mapper;
import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = getMapper(BookMapper.class);
    BookDTO bookToBookDTO(Book book);

}

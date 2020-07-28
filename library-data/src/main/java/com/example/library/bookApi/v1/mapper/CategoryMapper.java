package com.example.library.bookApi.v1.mapper;

import com.example.library.bookApi.v1.model.CategoryDTO;
import com.example.library.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
    Category categoryDtoToCategory(CategoryDTO categoryDTO);
}

package com.ecommerce.library.service;

import com.ecommerce.library.dto.CategoryDto;
import com.ecommerce.library.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save (Category category);
    Category findById(Long id);
    Category update(Category category);
    void enabledById(Long id);
    void deleteById(Long id);
    List<Category> findAllByActivated();

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();

}

package gov.iti.jets.services.mapper;

import gov.iti.jets.persistent.dto.CategoryDto;
import gov.iti.jets.persistent.entity.Category;

public class CategoryMapper implements Mapper<Category, CategoryDto> {

    @Override
    public CategoryDto toDto(Category t) {
        return new CategoryDto(t.getId(), t.getParentId(), t.getName());
    }

    @Override
    public Category toEntity(CategoryDto r) {
        Category cat = new Category();
        cat.setName(r.getName());
        cat.setParentId(0);
        cat.setId(r.getId());
        return cat;
    }

}

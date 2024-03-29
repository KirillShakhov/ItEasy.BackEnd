package ru.itapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itapp.entity.RecipeCategory;


@Repository
public interface CustomizedRecipeCategoryCrudRepository extends CrudRepository<RecipeCategory, Long> {

}

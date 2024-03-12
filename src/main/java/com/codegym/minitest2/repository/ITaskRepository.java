package com.codegym.minitest2.repository;

import com.codegym.minitest2.model.entity.Category;
import com.codegym.minitest2.model.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepository extends CrudRepository<Task, Long> {
    Iterable<Task> findAllByCategory(Category category);
    Page<Task> findAll(Pageable pageable);
    Page<Task> findAllByNameContaining(Pageable pageable, String nameTask);
}

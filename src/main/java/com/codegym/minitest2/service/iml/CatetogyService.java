package com.codegym.minitest2.service.iml;

import com.codegym.minitest2.model.dto.Statistical;
import com.codegym.minitest2.model.entity.Category;
import com.codegym.minitest2.repository.ICategoryRepository;
import com.codegym.minitest2.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatetogyService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public Iterable<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public Iterable<Statistical> statistical() {
        return iCategoryRepository.statistical();
    }
}

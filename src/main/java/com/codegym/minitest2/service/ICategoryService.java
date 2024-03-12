package com.codegym.minitest2.service;

import com.codegym.minitest2.model.dto.Statistical;
import com.codegym.minitest2.model.entity.Category;

public interface ICategoryService extends IGenerateService<Category> {
    Iterable<Statistical> statistical();
}

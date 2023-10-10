package com.study123.board123.repository;

import com.study123.board123.entity.ModelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<ModelEntity, Long> {

}

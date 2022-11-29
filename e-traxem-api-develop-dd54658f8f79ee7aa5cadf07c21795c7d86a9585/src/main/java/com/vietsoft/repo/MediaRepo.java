package com.vietsoft.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vietsoft.model.Media;


@RepositoryRestResource(exported = false)
@Cacheable(value = "GlobalCache")
public interface MediaRepo extends PagingAndSortingRepository<Media, String> {

}

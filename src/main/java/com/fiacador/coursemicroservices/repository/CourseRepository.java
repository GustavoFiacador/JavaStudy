package com.fiacador.coursemicroservices.repository;

import com.fiacador.coursemicroservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}

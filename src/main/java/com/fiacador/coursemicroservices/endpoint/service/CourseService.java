package com.fiacador.coursemicroservices.endpoint.service;

import com.fiacador.coursemicroservices.model.Course;
import com.fiacador.coursemicroservices.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;
    public Iterable<Course> list(Pageable pageable) {
        log.info("Listing all Courses");
        return courseRepository.findAll(pageable);
    }
}

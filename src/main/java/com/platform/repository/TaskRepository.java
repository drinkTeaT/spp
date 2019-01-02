package com.platform.repository;

import com.platform.entity.Task;
import com.platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: zwl
 * @Date: 2018/12/24 17:45
 */
public interface TaskRepository extends JpaRepository<Task,Integer> {

    List<Task> findByTouser(User touser);
}

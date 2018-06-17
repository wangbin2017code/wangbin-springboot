package com.wangbin.controller;

import com.wangbin.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wangbin
 * @date 2018/6/16 15:23
 */
public interface AnimalRepository extends JpaRepository<Animal,Integer>{

    // 通过kind来查找(扩展方法)
    List<Animal> findByKind(String kind);
}

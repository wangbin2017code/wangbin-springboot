package com.wangbin.controller;

import com.wangbin.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * @author wangbin
 * @date 2018/6/12 23:27
 */
@RestController
public class HelloController {

    @Autowired
    private AnimalRepository animalRepository;

    // 查询所有
    @PostMapping("/getAll")
    public List<Animal> getAllAnimal() {
        return animalRepository.findAll();
    }

    // 增加
    @PostMapping("/addAnimal")
    public Animal addAnimal(@Valid Animal animal, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError());
            return null;
        }
        return animalRepository.save(animal);
    }

    // 删除
    @DeleteMapping("/deleteAnimal/{id}")
    public void deleteAnimal(@PathVariable("id") Integer id) {
        animalRepository.deleteById(id);
    }

    // 更新
    @PutMapping("/updateAnimal/{id}")
    public Animal updateAnimal(@PathVariable("id") Integer id, @RequestParam("name") String name, @RequestParam("kind") String kind) {
        Animal animal = new Animal();
        animal.setId(id);
        animal.setName(name);
        animal.setKind(kind);
        return animalRepository.save(animal);
    }

    // 根据id查找
    @GetMapping("/findById")
    public Animal findOne(@RequestParam("id") Integer id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.get();
    }

    // 根据kind查找
    @GetMapping("/findByKind/{kind}")
    public List<Animal> findByKind(@PathVariable(value = "kind") String kind) {
        return animalRepository.findByKind(kind);
    }
}

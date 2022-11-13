package com.spring.just.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class User {
    @Override
    public String toString() {
        int x =10;
        for(int i=0;i<10;i++){
            System.out.println("X"+i);
            System.out.println("hi");
        }
        return super.toString();

    }
}

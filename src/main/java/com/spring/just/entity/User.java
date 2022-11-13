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
        return super.toString();
    }
}

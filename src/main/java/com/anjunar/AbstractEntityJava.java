package com.anjunar;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
class AbstractEntityJava {
    @Id
    public UUID id = UUID.randomUUID();
}
package com.anjunar;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
class EventJava extends AbstractEntity {
    @Basic
    String name;
}
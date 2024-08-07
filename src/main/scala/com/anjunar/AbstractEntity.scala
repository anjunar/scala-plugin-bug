package com.anjunar

import jakarta.persistence.{Id, MappedSuperclass}

import java.util.UUID

@MappedSuperclass
class AbstractEntity {
  
  @Id
  var id : UUID = UUID.randomUUID()

}

package com.anjunar

import jakarta.persistence.{Basic, Entity}

import scala.compiletime.uninitialized

@Entity
class Event extends AbstractEntity {
  
  @Basic
  var name : String = uninitialized
  
}

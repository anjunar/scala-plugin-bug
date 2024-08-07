package com.anjunar

import jakarta.persistence.EntityManager

import java.util.UUID

object Main {

  def main(args : Array[String]): Unit = {

    val entityManager : EntityManager = null

    val value = entityManager.createQuery("select e from Event e where e.name = :name and e.id = :id", classOf[Event])
      .setParameter("name", "test")
      .setParameter("id", UUID.randomUUID())
      .getSingleResult

  }

}

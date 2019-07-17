package com.yiche.batch

import org.apache.spark.{SparkConf, SparkContext}

class SparkJob1 {
  def test(): Unit={
    val conf = new SparkConf().setAppName("WordCount").setMaster("local");
    val sc = new SparkContext(conf)
    println("---------------");
  }

}

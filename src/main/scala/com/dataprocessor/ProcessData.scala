package com.dataprocessor

import java.io.StringReader

import com.opencsv.CSVReader
import org.apache.spark._
import org.apache.spark.rdd._

/**
  * Created by cloudera on 8/8/16.
  */
object ProcessData {

  def parseLine(line:String): Array[Double] = {
    val reader = new CSVReader(new StringReader(line))
    reader.readNext().map(_.toDouble)
  }

  def mapStringLength(inputRDD: RDD[String]): RDD[(String,Int)] = {
   val totalLengths =  inputRDD.flatMap(lines => lines.split(","))
      .map(word => (word,word.length()))
      .reduceByKey(_ + _)
    totalLengths
  }

  def handleInput(invalidLineCounter: Accumulator[Int],inFile: RDD[String]): RDD[Double] = {
    val numericData = inFile.flatMap(line => {
      try{
        Some(parseLine(line))
      }catch{
        case _: Throwable =>
          invalidLineCounter += 1
          None
      }
    })

//    println("****numericData count: " + numericData.count())
    numericData.map(row => row.sum)
/*    val numericData = inFile.map(line => parseLine(line))

    val returnData = numericData.map(row => row.sum)

    println("****numericData count: " + numericData.count())

    returnData*/

  }


}

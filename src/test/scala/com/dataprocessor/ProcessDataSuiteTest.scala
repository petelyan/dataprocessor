package com.dataprocessor

import org.scalatest._
import com.dataprocessor._

/**
  * Created by cloudera on 8/8/16.
  */
class ProcessDataSuiteTest extends FunSuite with Matchers{

  test("should parse a csv line with numbers"){
    ProcessData.parseLine("1,2") should equal (Array[Double](1.0,2.0))
    ProcessData.parseLine("100,-1,1.0,2.0,2.5") should equal(Array[Double](100,-1,1.0,2.0,2.5))
  }

  test("should throw a NumberFormatException if there is no number"){
    intercept[NumberFormatException] {
      ProcessData.parseLine("pandas")
    }
  }

}

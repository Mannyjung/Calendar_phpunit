<?php
include "Date.php";
use PHPUnit\Framework\TestCase;
class Celendar extends TestCase{
    private $calendar;
    
    public function setUp():void{
        $this->calendar =new Date();
       
    }
    public function testDate1(){
        $this->assertEquals('Wednesday',$this->calendar->one(02,03));
    }
    public function testDate2(){
        $this->assertEquals('Friday',$this->calendar->one(01,15));
    }
    public function testDate3(){
        $this->assertEquals('Tuesday',$this->calendar->one(04,20));
    }

}

?>
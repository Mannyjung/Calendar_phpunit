<?php
 
class Date{
    public function one($month,$day){
        $date = "2021-".$month."-".$day; 
        $dayOfWeek = date("l", strtotime($date));
        return $dayOfWeek;
    }
 
}
 ?>
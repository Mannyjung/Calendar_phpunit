<?php
 
class Date{
    public function one($mount,$day){
        $date = "2021-".$mount."-".$day; 
        $dayOfWeek = date("l", strtotime($date));
        return $dayOfWeek;
    }
 
}
 ?>
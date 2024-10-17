package com.unh.tinylog.ui.home

data class ChildData(
    var id: String = "",
    var img: String = "",
    var name: String = "",
    var age: Int = 0,
    var genderBoy: Boolean = false,
    var desc: String = ""
)

val childList: ArrayList<ChildData>
= arrayListOf(
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, ""),
    ChildData("0", "", "John",10,true, ""),
    ChildData("0", "", "Jane",5,false, ""),
    ChildData("0", "", "Marc",22,true, "")
)
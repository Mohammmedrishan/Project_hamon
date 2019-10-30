package com.example.apicall;

import com.google.gson.annotations.SerializedName;

class Students {
    @SerializedName("name")
    private String layout;
    private  String name;
    private Integer size;

    public Students(String layout,String name,Integer size){
        this.layout = layout;
        this.name = name;
        this.size = size;
    }

    public String getLayout(){
        return layout;
    }
    public String getName(){
        return  name;
    }
    public Integer getSize(){
        return size;
    }

}

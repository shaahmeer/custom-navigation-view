package com.example.navigationview;

public class model {


    String header;
    int image;

    public model(String header, int image){
        this.image = image;
        this.header = header;

    }

    public String getHeader(){
        return header;
    }
    public int getImage(){
        return image;
    }

    public void setHeader(String header) {
        this.header = header;
    }


    public void getImage(int image){
        this.image=image;
    }

}

package com.huang.myfirstmap.demo.entity;

/**
 * Created by huang on 2016/6/5.
 */
public class TravelNotes {
    private int imgId;
    private String mood;
    private int user_imgId;
    private String name;
    private String location;
    private int browse;

    public TravelNotes() {
        super();
    }

    public TravelNotes(int imgId, String mood, int user_imgId, String name, String location, int browse) {
        this.imgId = imgId;
        this.mood = mood;
        this.user_imgId = user_imgId;
        this.name = name;
        this.location = location;
        this.browse = browse;
    }
    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getUser_imgId() {
        return user_imgId;
    }

    public void setUser_imgId(int user_imgId) {
        this.user_imgId = user_imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }


}

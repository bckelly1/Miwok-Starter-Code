package com.example.android.miwok;


/**
 * Created by Brian on 6/25/2017.
 */

public class Word{

    private static final int NO_IMAGE_FOUND = -1;

    private String miwokTranslation = "";
    private String defaultTranslation = "";
    private int imageSrc = NO_IMAGE_FOUND;
    private int soundFile = NO_IMAGE_FOUND;


    public Word(String defaultTranslation, String miwokTranslation, int soundFile){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.soundFile = soundFile;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imagePath, int soundFile){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageSrc = imagePath;
        this.soundFile = soundFile;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImagePath() {
        return imageSrc;
    }

    public int getSoundFile(){
        return soundFile;
    }

    public boolean hasImage(){
        return imageSrc != NO_IMAGE_FOUND;
    }
}

package com.example.android.miwok;

public class Word {
    //default translation of the word
    private String defaultTranslation;

    //Miwok translation of the word
    private String miwokTranslation;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new word object
     *
     * @param defaultTranslation is the default translation
     * @param miwokTranslation   is the Miwok translation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /**
     * Create a new word object
     *
     * @param defaultTranslation is the default translation
     * @param miwokTranslation   is the Miwok translation
     * @param imageResourceId    is the image resurce id
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
    }


    /**
     * @return the default translation
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * @return the Miwok translation
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     * @return the Image resource Id
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return whether the word has an associated image or not
     */
    public boolean hasImage(){
        return this.mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

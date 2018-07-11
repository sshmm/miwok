package com.example.android.miwok;

public class Word {
    //default translation of the word
    private String defaultTranslation;

    //Miwok translation of the word
    private String miwokTranslation;


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
}

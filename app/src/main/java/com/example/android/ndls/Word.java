/*
 *  Copyright (C) 2020 The National Disaster Logging System (NDLS) Project
 *  This project is a property of Michael Oberkoh and Ruth Yankson
 *  Unless giving explicit permission in writing, this project shouldn't be used whole or in part by a third person.
 */
package com.example.android.ndls;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, NDLS translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int mDefaultTranslationId;

    /** String resource ID for the NDLS translation of the word */
    private int mNdlsTranslationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param ndlsTranslationId is the string resource Id for the word in the NDLS language
     */
    public Word(int defaultTranslationId, int ndlsTranslationId) {
        mDefaultTranslationId = defaultTranslationId;
        mNdlsTranslationId = ndlsTranslationId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param ndlsTranslationId is the string resource Id for the word in the NDLS language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int defaultTranslationId, int ndlsTranslationId, int imageResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mNdlsTranslationId = ndlsTranslationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    /**
     * Get the string resource ID for the NDLS translation of the word.
     */
    public int getNdlsTranslationId() {
        return mNdlsTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
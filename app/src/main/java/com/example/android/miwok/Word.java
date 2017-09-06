package com.example.android.miwok;

/**
 * Created by Administrator on 6/1/2017.
 */

public class Word {
    /*Miwok translation for work*/
    private String mVietTranslation;
    /*defautl translation for work*/
    private String mDefautlTranslation;


    /*mipmap id */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**/
    private int mAudioResourceId;

    //constructer PharasesActivity called
    public Word(String defautlTranslation,String vietTranslation,int imageResourceId,int audioResourceId) {
        this.mDefautlTranslation = defautlTranslation;
        this.mVietTranslation = vietTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    /*get default translation of the word*/
    public String getDefautlTranslation() {
        return mDefautlTranslation;
    }

    /*get miwok translation of the work*/
    public String getVietTranslation() {
        return mVietTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
    /*get audio resource id for each word*/
    public int getmAudioResourceId () {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mVietTranslation='" + mVietTranslation + '\'' +
                ", mDefautlTranslation='" + mDefautlTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }


}

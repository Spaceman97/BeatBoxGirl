package com.example.soundmix;

/**
 * Created by Хаертдинов on 26.04.2019.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Integer getSoundId() {

        return mSoundId;
    }
    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }



    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }
    public String getAssetPath() {
        return mAssetPath;
    }
    public String getName() {
        return mName;
}
}

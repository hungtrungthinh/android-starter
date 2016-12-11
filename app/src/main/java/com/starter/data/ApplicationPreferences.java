package com.starter.data;

import android.content.SharedPreferences;

public class ApplicationPreferences {
    private static final String KEY_SENT_GCM_TOKEN_TO_SERVER = "KEY_SENT_GCM_TOKEN_TO_SERVER";

    SharedPreferences sharedPreferences = null;

    public ApplicationPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public boolean getSentGCMTokenToServer() {
        return sharedPreferences.getBoolean(KEY_SENT_GCM_TOKEN_TO_SERVER, false);
    }

    public void setSentGCMTokenToServer(boolean sentTokenToServer) {
        sharedPreferences.edit()
            .putBoolean(KEY_SENT_GCM_TOKEN_TO_SERVER, sentTokenToServer)
            .apply();
    }
}
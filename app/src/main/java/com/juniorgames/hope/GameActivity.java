package com.juniorgames.hope;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class GameActivity extends AndroidApplication {
    @Override
    protected void onCreate(Bundle s)
    {
        super.onCreate(s);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new Game(),config);
    }
}

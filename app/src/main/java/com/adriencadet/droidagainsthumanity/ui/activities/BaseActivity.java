package com.adriencadet.droidagainsthumanity.ui.activities;

import android.app.Activity;
import android.os.Bundle;

import com.adriencadet.droidagainsthumanity.AndroidAgainstHumanityApplication;
import com.adriencadet.droidagainsthumanity.ui.routers.IRouter;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * BaseActivity
 * <p>
 */
public abstract class BaseActivity extends Activity {

    @Inject
    @Named("main")
    IRouter mainRouter;

    @Inject
    @Named("modal")
    IRouter modalRouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidAgainstHumanityApplication.getApplicationComponent().inject(this);
    }
}

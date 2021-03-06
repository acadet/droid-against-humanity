package com.adriencadet.droidagainsthumanity.ui.routers;

import com.adriencadet.droidagainsthumanity.ui.screens.toast.InitToastScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScooper;

/**
 * ToastRouter
 * <p>
 */
class ToastRouter extends BaseRouter {
    ToastRouter(ScreenScooper screenScooper) {
        super(screenScooper);
    }

    @Override
    public void goTo(Screen screen) {
        if (!(screen instanceof InitToastScreen)) {
            super.goTo(new InitToastScreen());
        }
        super.goTo(screen);
    }
}

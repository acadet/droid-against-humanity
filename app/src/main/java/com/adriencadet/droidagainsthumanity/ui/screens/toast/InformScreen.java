package com.adriencadet.droidagainsthumanity.ui.screens.toast;

import com.adriencadet.droidagainsthumanity.ui.controllers.toast.ToastController;
import com.lyft.scoop.Controller;
import com.lyft.scoop.EnterTransition;
import com.lyft.scoop.ExitTransition;
import com.lyft.scoop.Screen;
import com.lyft.scoop.transitions.DownwardSlideTransition;
import com.lyft.scoop.transitions.UpwardSlideTransition;

/**
 * InformScreen
 * <p>
 */
@Controller(ToastController.class)
@EnterTransition(DownwardSlideTransition.class)
@ExitTransition(UpwardSlideTransition.class)
public class InformScreen extends Screen {
    public String message;

    public InformScreen(String message) {
        this.message = message;
    }
}

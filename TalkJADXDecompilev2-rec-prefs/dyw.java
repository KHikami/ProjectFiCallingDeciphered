package p000;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class dyw implements OnApplyWindowInsetsListener {
    final /* synthetic */ NavigationDrawerFragment f10881a;

    dyw(NavigationDrawerFragment navigationDrawerFragment) {
        this.f10881a = navigationDrawerFragment;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        this.f10881a.au.m20829a(systemWindowInsetTop);
        this.f10881a.f6506e.m9960a(systemWindowInsetTop);
        return windowInsets;
    }
}

package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

/* renamed from: dyw */
public final class dyw implements OnApplyWindowInsetsListener {
    final /* synthetic */ NavigationDrawerFragment a;

    dyw(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        this.a.au.a(systemWindowInsetTop);
        this.a.e.a(systemWindowInsetTop);
        return windowInsets;
    }
}

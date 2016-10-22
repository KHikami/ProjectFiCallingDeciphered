package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

/* renamed from: dym */
public final class dym implements OnApplyWindowInsetsListener {
    final /* synthetic */ NavigationDrawerFragment a;

    public dym(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return windowInsets;
    }
}

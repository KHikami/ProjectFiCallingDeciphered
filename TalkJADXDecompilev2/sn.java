package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class sn implements OnApplyWindowInsetsListener {
    sn() {
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((so) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}

package p000;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class sn implements OnApplyWindowInsetsListener {
    sn() {
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((so) view).m40642a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}

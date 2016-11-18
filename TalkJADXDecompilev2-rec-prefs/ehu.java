package p000;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;

final class ehu implements OnFocusChangeListener {
    final /* synthetic */ eht f11524a;

    ehu(eht eht) {
        this.f11524a = eht;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            ((InputMethodManager) this.f11524a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}

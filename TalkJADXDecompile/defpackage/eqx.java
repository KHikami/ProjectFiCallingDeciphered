package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;

/* renamed from: eqx */
final class eqx implements OnFocusChangeListener {
    final /* synthetic */ equ a;

    eqx(equ equ) {
        this.a = equ;
    }

    public void onFocusChange(View view, boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}

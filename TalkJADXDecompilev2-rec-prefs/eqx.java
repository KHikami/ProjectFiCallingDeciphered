package p000;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;

final class eqx implements OnFocusChangeListener {
    final /* synthetic */ equ f12093a;

    eqx(equ equ) {
        this.f12093a = equ;
    }

    public void onFocusChange(View view, boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f12093a.getActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}

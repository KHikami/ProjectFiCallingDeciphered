package defpackage;

import android.view.inputmethod.InputMethodManager;

/* renamed from: gji */
public final class gji implements kcj, kcq {
    private final dr a;

    public gji(dr drVar, kbu kbu) {
        this.a = drVar;
        kbu.a((kcq) this);
    }

    public void T_() {
        ((InputMethodManager) this.a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getView().getWindowToken(), 0);
    }
}

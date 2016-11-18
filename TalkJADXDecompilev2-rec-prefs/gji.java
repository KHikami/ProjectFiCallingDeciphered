package p000;

import android.view.inputmethod.InputMethodManager;

public final class gji implements kcj, kcq {
    private final dr f15363a;

    public gji(dr drVar, kbu kbu) {
        this.f15363a = drVar;
        kbu.m25514a((kcq) this);
    }

    public void T_() {
        ((InputMethodManager) this.f15363a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f15363a.getView().getWindowToken(), 0);
    }
}

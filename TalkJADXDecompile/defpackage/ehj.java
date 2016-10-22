package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.inputmethod.InputMethodManager;

/* renamed from: ehj */
final class ehj extends aei {
    ehj() {
    }

    public void a(RecyclerView recyclerView, int i) {
        ((InputMethodManager) recyclerView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
    }
}

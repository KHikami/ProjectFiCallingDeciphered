package p000;

import android.support.v7.widget.RecyclerView;
import android.view.inputmethod.InputMethodManager;

final class ehj extends aei {
    ehj() {
    }

    public void mo305a(RecyclerView recyclerView, int i) {
        ((InputMethodManager) recyclerView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
    }

    public void mo306a(RecyclerView recyclerView, int i, int i2) {
    }
}

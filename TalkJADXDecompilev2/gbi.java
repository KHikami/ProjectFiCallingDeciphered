package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class gbi implements OnClickListener {
    final /* synthetic */ gbg a;

    gbi(gbg gbg) {
        this.a = gbg;
    }

    public void onClick(View view) {
        gbg gbg = this.a;
        ((InputMethodManager) gbg.a.getSystemService("input_method")).hideSoftInputFromWindow(gbg.e.getWindowToken(), 0);
        gbg.b.getActivity().finish();
    }
}

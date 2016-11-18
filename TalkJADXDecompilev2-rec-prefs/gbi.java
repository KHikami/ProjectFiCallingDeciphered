package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

final class gbi implements OnClickListener {
    final /* synthetic */ gbg f14595a;

    gbi(gbg gbg) {
        this.f14595a = gbg;
    }

    public void onClick(View view) {
        gbg gbg = this.f14595a;
        ((InputMethodManager) gbg.f14584a.getSystemService("input_method")).hideSoftInputFromWindow(gbg.f14588e.getWindowToken(), 0);
        gbg.f14585b.getActivity().finish();
    }
}

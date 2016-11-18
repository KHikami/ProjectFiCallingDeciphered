package p000;

import android.text.style.URLSpan;
import android.view.View;

final class cpo extends URLSpan {
    private final cph f8797a;

    cpo(cph cph, String str) {
        super(str);
        this.f8797a = cph;
    }

    public void onClick(View view) {
        this.f8797a.m10628a(view.getContext(), getURL());
    }
}

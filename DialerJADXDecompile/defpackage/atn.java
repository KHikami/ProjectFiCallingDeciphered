package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
/* renamed from: atn */
public final class atn implements OnClickListener {
    private /* synthetic */ SearchEditTextLayout a;

    public atn(SearchEditTextLayout searchEditTextLayout) {
        this.a = searchEditTextLayout;
    }

    public final void onClick(View view) {
        if (this.a.g != null) {
            this.a.g.a();
        }
    }
}

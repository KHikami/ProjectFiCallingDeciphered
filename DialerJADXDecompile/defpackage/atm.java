package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
/* renamed from: atm */
public final class atm implements OnClickListener {
    private /* synthetic */ SearchEditTextLayout a;

    public atm(SearchEditTextLayout searchEditTextLayout) {
        this.a = searchEditTextLayout;
    }

    public final void onClick(View view) {
        this.a.d.setText(null);
    }
}

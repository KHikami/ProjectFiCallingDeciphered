package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
/* renamed from: atl */
public final class atl implements TextWatcher {
    private /* synthetic */ SearchEditTextLayout a;

    public atl(SearchEditTextLayout searchEditTextLayout) {
        this.a = searchEditTextLayout;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void afterTextChanged(Editable editable) {
    }
}

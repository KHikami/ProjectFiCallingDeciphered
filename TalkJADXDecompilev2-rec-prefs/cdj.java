package p000;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;

final class cdj implements TextWatcher {
    final /* synthetic */ Context f5073a;
    final /* synthetic */ cdh f5074b;

    cdj(cdh cdh, Context context) {
        this.f5074b = cdh;
        this.f5073a = context;
    }

    public void afterTextChanged(Editable editable) {
        gob.m18199a(this.f5073a).mo2308a((Spannable) editable, null, this.f5074b.f5060b);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        gwb.m2042b(this.f5074b.f5069k);
        this.f5074b.f5069k.m7285a(charSequence, i2, i3);
        gwb.m1863a(this.f5074b.f5069k);
    }
}

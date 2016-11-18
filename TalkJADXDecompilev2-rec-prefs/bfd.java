package p000;

import android.content.Context;
import android.widget.TextView;

final class bfd implements kcg, kcq {
    final TextView f3180a;
    final dw f3181b;
    final bet f3182c;
    final /* synthetic */ bfc f3183d;
    private final int f3184e;

    bfd(bfc bfc, kbu kbu, dw dwVar, TextView textView) {
        this.f3183d = bfc;
        kbu.m25514a((kcq) this);
        this.f3181b = dwVar;
        this.f3180a = textView;
        this.f3184e = ((jca) jyn.m25426a((Context) dwVar, jca.class)).mo2317a();
        this.f3182c = new bfe(this, bfc);
        this.f3181b.m1095f().mo1998b(1, null, new bfg(this)).m1293v();
    }

    public void o_() {
        bes.m5028a(this.f3184e, this.f3182c);
    }
}

package defpackage;

import android.content.Context;
import android.widget.TextView;

final class bfd implements kcg, kcq {
    final TextView a;
    final dw b;
    final bet c;
    final /* synthetic */ bfc d;
    private final int e;

    bfd(bfc bfc, kbu kbu, dw dwVar, TextView textView) {
        this.d = bfc;
        kbu.a((kcq) this);
        this.b = dwVar;
        this.a = textView;
        this.e = ((jca) jyn.a((Context) dwVar, jca.class)).a();
        this.c = new bfe(this, bfc);
        this.b.f().b(1, null, new bfg(this)).v();
    }

    public void o_() {
        bes.a(this.e, this.c);
    }
}

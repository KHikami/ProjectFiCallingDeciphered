package defpackage;

import android.content.Context;

/* renamed from: egl */
final class egl extends egi {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ egj b;

    egl(egj egj, Context context, bck bck, int i, boolean z, boolean z2, fna fna, gou gou, bxt bxt, CharSequence charSequence) {
        this.b = egj;
        this.a = charSequence;
        super(context, bck, i, true, false, fna, gou, bxt);
    }

    protected void a(aer aer) {
        egp egp = (egp) aer;
        egp.p.setText(this.a);
        egp.p.setFocusableInTouchMode(true);
    }
}

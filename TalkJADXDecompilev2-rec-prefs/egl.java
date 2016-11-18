package p000;

import android.content.Context;

final class egl extends egi {
    final /* synthetic */ CharSequence f11446a;
    final /* synthetic */ egj f11447b;

    egl(egj egj, Context context, bck bck, int i, boolean z, boolean z2, fna fna, gou gou, bxt bxt, CharSequence charSequence) {
        this.f11447b = egj;
        this.f11446a = charSequence;
        super(context, bck, i, true, false, fna, gou, bxt);
    }

    protected void mo1861a(aer aer) {
        egp egp = (egp) aer;
        egp.f11453p.setText(this.f11446a);
        egp.f11453p.setFocusableInTouchMode(true);
    }
}

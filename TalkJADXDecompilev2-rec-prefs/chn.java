package p000;

import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class chn extends gai {
    public /* synthetic */ gai mo970b(jyn jyn) {
        return m7663a(jyn);
    }

    public chn(dr drVar, kbu kbu) {
        super(drVar, kbu);
    }

    public chn m7663a(jyn jyn) {
        super.mo970b(jyn);
        return this;
    }

    protected void mo969a(gag gag, boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.c.getParent();
        Snackbar snackbar = (Snackbar) this.b.getLayoutInflater().inflate(gwb.fV, viewGroup, false);
        viewGroup.addView(snackbar);
        m7654a(snackbar);
        super.mo969a(gag, z);
    }
}

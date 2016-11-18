package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class chn extends gai {
    public /* synthetic */ gai b(jyn jyn) {
        return a(jyn);
    }

    public chn(dr drVar, kbu kbu) {
        super(drVar, kbu);
    }

    public chn a(jyn jyn) {
        super.b(jyn);
        return this;
    }

    protected void a(gag gag, boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.c.getParent();
        Snackbar snackbar = (Snackbar) this.b.getLayoutInflater().inflate(gwb.fV, viewGroup, false);
        viewGroup.addView(snackbar);
        a(snackbar);
        super.a(gag, z);
    }
}

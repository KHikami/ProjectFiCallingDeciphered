package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: bje */
final class bje implements brm {
    private /* synthetic */ brc a;

    bje(brc brc) {
        this.a = brc;
    }

    public final /* synthetic */ void a(brl brl) {
        String valueOf = String.valueOf((Status) brl);
        new StringBuilder(String.valueOf(valueOf).length() + 27).append("Phenotype register status: ").append(valueOf);
        this.a.c();
    }
}

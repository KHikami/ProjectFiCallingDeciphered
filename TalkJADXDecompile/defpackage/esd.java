package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: esd */
public final class esd implements jza, kcq {
    private final kbu a;

    public esd(kbu kbu) {
        this.a = kbu;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        ese ese = (ese) jyn.b(ese.class);
        if (ese != null) {
            ese.a(context, this.a);
        }
    }
}

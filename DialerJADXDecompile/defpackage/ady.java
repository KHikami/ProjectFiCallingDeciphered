package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: ady */
final class ady implements OnClickListener {
    private /* synthetic */ adx a;

    ady(adx adx) {
        this.a = adx;
    }

    public final void onClick(View view) {
        if (this.a.b != null) {
            adz adz = this.a.b;
            Uri uri = this.a.c;
            abn.a(this.a);
            adz.a(uri);
        }
    }
}

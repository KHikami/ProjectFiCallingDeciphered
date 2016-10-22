package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: atu */
final class atu implements OnClickListener {
    private /* synthetic */ Uri a;
    private /* synthetic */ att b;

    atu(att att, Uri uri) {
        this.b = att;
        this.a = uri;
    }

    public final void onClick(View view) {
        buf.H(this.b.a).b(23);
        this.b.c.c.a(this.b.b, this.a);
    }
}

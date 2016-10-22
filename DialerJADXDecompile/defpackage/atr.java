package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* compiled from: PG */
/* renamed from: atr */
final class atr implements OnClickListener {
    private /* synthetic */ boolean a;
    private /* synthetic */ atq b;

    atr(atq atq, boolean z) {
        this.b = atq;
        this.a = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a) {
            atq atq = this.b;
            CharSequence b = atq.b();
            CharSequence a = atq.a();
            aty aty = atq.e;
            int c = atq.c();
            atq.c.a(new atw(atq, atq.getContext().getApplicationContext(), new atv(atq, a, aty), b, c, aty), Integer.valueOf(atq.getArguments().getInt("argBlockId")));
            return;
        }
        atq = this.b;
        b = atq.a();
        a = atq.b();
        aty = atq.e;
        atq.c.a(new att(atq, atq.getContext().getApplicationContext(), new ats(atq, a, aty), b, atq.c(), aty), atq.a, atq.b);
    }
}

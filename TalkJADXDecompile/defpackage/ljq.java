package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ljq */
final class ljq implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ OnClickListener b;
    final /* synthetic */ ljp c;

    ljq(ljp ljp, String str, OnClickListener onClickListener) {
        this.c = ljp;
        this.a = str;
        this.b = onClickListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.c.a(this.a);
        try {
            this.b.onClick(dialogInterface, i);
        } finally {
            lkb.b(this.a);
        }
    }
}

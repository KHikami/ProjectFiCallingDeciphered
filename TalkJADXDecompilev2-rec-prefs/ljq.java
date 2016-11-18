package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ljq implements OnClickListener {
    final /* synthetic */ String f25105a;
    final /* synthetic */ OnClickListener f25106b;
    final /* synthetic */ ljp f25107c;

    ljq(ljp ljp, String str, OnClickListener onClickListener) {
        this.f25107c = ljp;
        this.f25105a = str;
        this.f25106b = onClickListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f25107c.m29182a(this.f25105a);
        try {
            this.f25106b.onClick(dialogInterface, i);
        } finally {
            lkb.m29210b(this.f25105a);
        }
    }
}

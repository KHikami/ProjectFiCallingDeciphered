package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fur implements OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ fuo b;

    fur(fuo fuo, boolean z) {
        this.b = fuo;
        this.a = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        bkq.c(this.b.getContext(), this.b.a, this.a);
        this.b.b.a(this.a);
    }
}

package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fur implements OnClickListener {
    final /* synthetic */ boolean f14046a;
    final /* synthetic */ fuo f14047b;

    fur(fuo fuo, boolean z) {
        this.f14047b = fuo;
        this.f14046a = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        bkq.m5688c(this.f14047b.getContext(), this.f14047b.f14041a, this.f14046a);
        this.f14047b.f14042b.mo534a(this.f14046a);
    }
}

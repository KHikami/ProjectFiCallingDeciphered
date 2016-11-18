package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bfn implements OnClickListener {
    final /* synthetic */ String[] f3216a;
    final /* synthetic */ bfj f3217b;

    bfn(bfj bfj, String[] strArr) {
        this.f3217b = bfj;
        this.f3216a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        bfj bfj = this.f3217b;
        bfj.f3203b.startActivity(gwb.m1541a(bfj.f3203b, false, bfj.f3204c, glq.m18012c(this.f3217b.f3203b, this.f3216a[i])));
    }
}

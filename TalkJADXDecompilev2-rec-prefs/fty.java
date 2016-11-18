package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fty implements OnClickListener {
    final /* synthetic */ ftx f13998a;

    fty(ftx ftx) {
        this.f13998a = ftx;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f13998a.startActivityForResult(gwb.m2125d(this.f13998a.f13994a, this.f13998a.f13994a.m5632b().f11244a), 1);
    }
}

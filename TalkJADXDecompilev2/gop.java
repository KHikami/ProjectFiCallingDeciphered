package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

final class gop implements OnLongClickListener {
    final /* synthetic */ gor a;
    final /* synthetic */ gon b;

    gop(gon gon, gor gor) {
        this.b = gon;
        this.a = gor;
    }

    public boolean onLongClick(View view) {
        this.a.a(this.b);
        return true;
    }
}

package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class btx implements OnClickListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ bko b;
    final /* synthetic */ String c;
    final /* synthetic */ btw d;

    btx(btw btw, Activity activity, bko bko, String str) {
        this.d = btw;
        this.a = activity;
        this.b = bko;
        this.c = str;
    }

    public void onClick(View view) {
        gwb.a(this.a, this.b, view, this.d.a, this.c);
    }
}

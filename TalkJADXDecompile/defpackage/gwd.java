package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: gwd */
final class gwd extends gwc {
    final /* synthetic */ Activity a;
    final /* synthetic */ Intent b;
    final /* synthetic */ int c;

    gwd(Activity activity, Intent intent, int i) {
        this.a = activity;
        this.b = intent;
        this.c = i;
    }

    public void a() {
        this.a.startActivityForResult(this.b, this.c);
    }
}

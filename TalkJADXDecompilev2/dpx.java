package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class dpx extends jgc {
    final /* synthetic */ Activity a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ Uri d;
    private dpm[] g;

    dpx(Context context, String str, Activity activity, int i, String str2, Uri uri) {
        this.a = activity;
        this.b = i;
        this.c = str2;
        this.d = uri;
        super(context, str);
    }

    protected jgz a(Context context) {
        List arrayList = new ArrayList();
        for (dpn b : jyn.c(this.a, dpn.class)) {
            Collections.addAll(arrayList, b.b(this.a, this.b));
        }
        if (!arrayList.isEmpty()) {
            this.g = (dpm[]) arrayList.toArray(new dpm[arrayList.size()]);
        }
        return new jgz(true);
    }

    protected void b() {
        dpw.a(this.a, this.c, this.d, this.g);
    }
}

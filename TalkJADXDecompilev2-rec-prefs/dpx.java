package p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class dpx extends jgc {
    final /* synthetic */ Activity f10314a;
    final /* synthetic */ int f10315b;
    final /* synthetic */ String f10316c;
    final /* synthetic */ Uri f10317d;
    private dpm[] f10318g;

    dpx(Context context, String str, Activity activity, int i, String str2, Uri uri) {
        this.f10314a = activity;
        this.f10315b = i;
        this.f10316c = str2;
        this.f10317d = uri;
        super(context, str);
    }

    protected jgz mo648a(Context context) {
        List arrayList = new ArrayList();
        for (dpn b : jyn.m25438c(this.f10314a, dpn.class)) {
            Collections.addAll(arrayList, b.mo1598b(this.f10314a, this.f10315b));
        }
        if (!arrayList.isEmpty()) {
            this.f10318g = (dpm[]) arrayList.toArray(new dpm[arrayList.size()]);
        }
        return new jgz(true);
    }

    protected void mo1649b() {
        dpw.m12464a(this.f10314a, this.f10316c, this.f10317d, this.f10318g);
    }
}

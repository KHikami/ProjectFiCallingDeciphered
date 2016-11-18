package p000;

import android.net.Uri;
import android.os.AsyncTask;

final class cji extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String f5425a;
    final /* synthetic */ bxy f5426b;
    final /* synthetic */ cjh f5427c;

    cji(cjh cjh, String str, bxy bxy) {
        this.f5427c = cjh;
        this.f5425a = str;
        this.f5426b = bxy;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7774a();
    }

    private Void m7774a() {
        ccy.m7220a(this.f5427c.f5424a.context.getContentResolver(), ccy.m7231b(Uri.parse(this.f5425a)), this.f5426b.c);
        return null;
    }
}

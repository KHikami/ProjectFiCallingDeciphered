package defpackage;

import android.net.Uri;
import android.os.AsyncTask;

final class cji extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ bxy b;
    final /* synthetic */ cjh c;

    cji(cjh cjh, String str, bxy bxy) {
        this.c = cjh;
        this.a = str;
        this.b = bxy;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        ccy.a(this.c.a.context.getContentResolver(), ccy.b(Uri.parse(this.a)), this.b.c);
        return null;
    }
}

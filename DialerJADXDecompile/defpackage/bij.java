package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: bij */
public final class bij extends AsyncTask {
    private final String a;
    private final bik b;
    private /* synthetic */ bih c;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        this.c.a.remove(this.a);
        if (isCancelled()) {
            bdf.a((Object) this, "Request was cancelled; ignoring result");
        } else {
            this.b.a(new bil(this.a, bundle));
        }
    }

    public bij(bih bih, String str, bik bik) {
        this.c = bih;
        this.a = str;
        this.b = bik;
    }

    private Bundle a() {
        try {
            String str = "Fetching rate info for ";
            String valueOf = String.valueOf(this.a);
            bdf.b((Object) this, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return this.c.b.a(this.a);
        } catch (Exception e) {
            bdf.a(this.c, "Unable to fetch call cost", e);
            return Bundle.EMPTY;
        }
    }
}

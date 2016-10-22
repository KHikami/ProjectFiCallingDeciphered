package defpackage;

import android.os.AsyncTask;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: jku */
final class jku extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ jkp a;

    jku(jkp jkp) {
        this.a = jkp;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        Writer stringWriter = new StringWriter();
        this.a.b(new PrintWriter(stringWriter));
        gwb.a(4, "ImageResourceManager", stringWriter.toString());
        return null;
    }
}

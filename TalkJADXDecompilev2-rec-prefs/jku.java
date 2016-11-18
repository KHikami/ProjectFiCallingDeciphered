package p000;

import android.os.AsyncTask;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

final class jku extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ jkp f20381a;

    jku(jkp jkp) {
        this.f20381a = jkp;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m24614a();
    }

    private Void m24614a() {
        Writer stringWriter = new StringWriter();
        this.f20381a.m24599b(new PrintWriter(stringWriter));
        gwb.m1734a(4, "ImageResourceManager", stringWriter.toString());
        return null;
    }
}

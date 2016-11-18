package p000;

import android.os.AsyncTask;
import android.widget.TextView;

public final class deu extends AsyncTask<Void, Void, bbk> {
    private final String f9581a;
    private final TextView f9582b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11541a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m11542a((bbk) obj);
    }

    public deu(String str, TextView textView) {
        this.f9581a = str;
        this.f9582b = textView;
    }

    private bbk m11541a() {
        return new bbk(this.f9581a);
    }

    private void m11542a(bbk bbk) {
        if (bbk != null && !isCancelled()) {
            this.f9582b.addTextChangedListener(bbk);
        }
    }
}

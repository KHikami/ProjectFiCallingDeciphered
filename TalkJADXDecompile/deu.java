import android.os.AsyncTask;
import android.widget.TextView;

public final class deu extends AsyncTask<Void, Void, bbk> {
    private final String a;
    private final TextView b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((bbk) obj);
    }

    public deu(String str, TextView textView) {
        this.a = str;
        this.b = textView;
    }

    private bbk a() {
        return new bbk(this.a);
    }

    private void a(bbk bbk) {
        if (bbk != null && !isCancelled()) {
            this.b.addTextChangedListener(bbk);
        }
    }
}

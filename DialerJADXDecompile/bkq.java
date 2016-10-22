import android.os.AsyncTask;

/* compiled from: PG */
public final class bkq extends AsyncTask {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ bkk e;

    public bkq(bkk bkk, String str, String str2, int i, int i2) {
        this.e = bkk;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.e.b.a(this.a, this.b, this.c, this.d);
        return null;
    }
}

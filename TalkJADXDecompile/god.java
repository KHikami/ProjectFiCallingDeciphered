import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import android.view.View;

final class god extends AsyncTask<Void, Void, Void> {
    goe a;
    final /* synthetic */ goc b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    god(goc goc, goe goe) {
        this.b = goc;
        this.a = goe;
    }

    private Void a() {
        goc goc = this.b;
        goe goe = this.a;
        Options a = gjs.a();
        int size = goe.a.size();
        for (int i = 0; i < size; i++) {
            gof gof = (gof) goe.b.get(i);
            Bitmap a2 = goc.a.a(gwb.a((Integer) goe.a.get(i)), a, gof.a, gof.b, null);
            if (a2 != null) {
                gof.a(a2);
            }
        }
        return null;
    }

    private void b() {
        View view = (View) this.a.c.get();
        if (view != null) {
            view.invalidate();
        }
    }
}

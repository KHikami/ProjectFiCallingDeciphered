package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import android.view.View;

final class god extends AsyncTask<Void, Void, Void> {
    goe f15778a;
    final /* synthetic */ goc f15779b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18209a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m18210b();
    }

    god(goc goc, goe goe) {
        this.f15779b = goc;
        this.f15778a = goe;
    }

    private Void m18209a() {
        goc goc = this.f15779b;
        goe goe = this.f15778a;
        Options a = gjs.m17851a();
        int size = goe.f15780a.size();
        for (int i = 0; i < size; i++) {
            gof gof = (gof) goe.f15781b.get(i);
            Bitmap a2 = goc.f15773a.mo2285a(gwb.m1507a((Integer) goe.f15780a.get(i)), a, gof.f15783a, gof.f15784b, null);
            if (a2 != null) {
                gof.m18213a(a2);
            }
        }
        return null;
    }

    private void m18210b() {
        View view = (View) this.f15778a.f15782c.get();
        if (view != null) {
            view.invalidate();
        }
    }
}

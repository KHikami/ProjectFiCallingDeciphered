package p000;

import android.content.Context;
import android.os.AsyncTask;

final class hwv extends AsyncTask<Void, Void, Integer> {
    final /* synthetic */ Context f17430a;
    final /* synthetic */ hww f17431b;

    hwv(Context context, hww hww) {
        this.f17430a = context;
        this.f17431b = hww;
    }

    private Integer m21154a() {
        try {
            hwu.m21152a(this.f17430a);
            return Integer.valueOf(0);
        } catch (gts e) {
            return Integer.valueOf(e.m18567a());
        } catch (gtr e2) {
            return Integer.valueOf(e2.f16133a);
        }
    }

    private void m21155a(Integer num) {
        if (num.intValue() != 0) {
            this.f17431b.mo1073a(num.intValue(), hwu.f17427a.mo2337a(this.f17430a, num.intValue(), "pi"));
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21154a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m21155a((Integer) obj);
    }
}

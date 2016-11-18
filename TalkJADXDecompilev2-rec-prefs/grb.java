package p000;

import android.os.AsyncTask;

final class grb extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ gqz f15946a;

    grb(gqz gqz) {
        this.f15946a = gqz;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18317a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m18318a((Void) obj);
    }

    private Void m18317a() {
        this.f15946a.f4704c = blf.m5805b(this.f15946a.f4705d, this.f15946a.f4702a, this.f15946a.f4703b, "video/*");
        return null;
    }

    private void m18318a(Void voidR) {
        super.onPostExecute(voidR);
        this.f15946a.setEnabled(true);
    }
}

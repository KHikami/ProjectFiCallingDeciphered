package p000;

import com.google.android.gms.common.data.DataHolder;

final class hyo implements Runnable {
    final /* synthetic */ DataHolder f17467a;
    final /* synthetic */ hyn f17468b;

    hyo(hyn hyn, DataHolder dataHolder) {
        this.f17468b = hyn;
        this.f17467a = dataHolder;
    }

    public void run() {
        hxv hxv = new hxv(this.f17467a);
        try {
            this.f17468b.f17465a.mo1275a(hxv);
        } finally {
            hxv.mo2073b();
        }
    }
}

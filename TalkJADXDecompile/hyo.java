import com.google.android.gms.common.data.DataHolder;

final class hyo implements Runnable {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ hyn b;

    hyo(hyn hyn, DataHolder dataHolder) {
        this.b = hyn;
        this.a = dataHolder;
    }

    public void run() {
        hxv hxv = new hxv(this.a);
        try {
            this.b.a.a(hxv);
        } finally {
            hxv.b();
        }
    }
}

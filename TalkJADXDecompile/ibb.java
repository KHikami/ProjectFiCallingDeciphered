import com.google.android.gms.common.data.DataHolder;

final class ibb implements hgg<hxs> {
    final /* synthetic */ DataHolder a;

    ibb(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    private void a(hxs hxs) {
        try {
            hxs.a(new hxv(this.a));
        } finally {
            this.a.close();
        }
    }

    public void a() {
        this.a.close();
    }

    public /* synthetic */ void a(Object obj) {
        a((hxs) obj);
    }
}

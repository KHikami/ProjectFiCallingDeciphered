package p000;

import com.google.android.gms.common.data.DataHolder;

final class ibb implements hgg<hxs> {
    final /* synthetic */ DataHolder f17526a;

    ibb(DataHolder dataHolder) {
        this.f17526a = dataHolder;
    }

    private void m21519a(hxs hxs) {
        try {
            hxs.mo1275a(new hxv(this.f17526a));
        } finally {
            this.f17526a.close();
        }
    }

    public void mo3024a() {
        this.f17526a.close();
    }

    public /* synthetic */ void mo3025a(Object obj) {
        m21519a((hxs) obj);
    }
}

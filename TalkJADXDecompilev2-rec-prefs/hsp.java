package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class hsp {
    Context f17179a;
    List<hwn> f17180b = new ArrayList();
    List<hwn> f17181c = new ArrayList();
    HashMap<String, hwn> f17182d = new HashMap();
    hsq f17183e;
    private hsr f17184f;

    public hsp(Context context, hsq hsq) {
        this.f17179a = context;
        this.f17183e = hsq;
    }

    public void m20775a(List<hwn> list) {
        if (this.f17183e != null) {
            if (this.f17184f != null) {
                this.f17184f.cancel(true);
                this.f17184f = null;
            }
            if (list == null || list.isEmpty()) {
                this.f17183e.mo2947a(null);
                return;
            }
            this.f17180b = list;
            this.f17181c.addAll(list);
            this.f17184f = new hsr(this);
            this.f17184f.execute(new Void[0]);
        }
    }

    void m20774a() {
        this.f17182d.clear();
        this.f17181c.clear();
        this.f17180b.clear();
    }
}

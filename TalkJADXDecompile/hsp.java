import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class hsp {
    Context a;
    List<hwn> b;
    List<hwn> c;
    HashMap<String, hwn> d;
    hsq e;
    private hsr f;

    public hsp(Context context, hsq hsq) {
        this.a = context;
        this.d = new HashMap();
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.e = hsq;
    }

    public void a(List<hwn> list) {
        if (this.e != null) {
            if (this.f != null) {
                this.f.cancel(true);
                this.f = null;
            }
            if (list == null || list.isEmpty()) {
                this.e.a(null);
                return;
            }
            this.b = list;
            this.c.addAll(list);
            this.f = new hsr(this);
            this.f.execute(new Void[0]);
        }
    }

    void a() {
        this.d.clear();
        this.c.clear();
        this.b.clear();
    }
}

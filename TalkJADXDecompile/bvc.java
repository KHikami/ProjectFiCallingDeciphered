import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

public final class bvc {
    private final ky<fwy, btn> a;
    private final bvr b;

    public bvc(Context context) {
        this.a = new ky();
        List<btn> c = jyn.c(context, btn.class);
        this.b = (bvr) jyn.a(context, bvr.class);
        for (btn btn : c) {
            for (Object obj : btn.a()) {
                if (this.a.containsKey(obj)) {
                    String valueOf = String.valueOf(((btn) this.a.get(obj)).getClass().getName());
                    String valueOf2 = String.valueOf(btn.getClass().getName());
                    String valueOf3 = String.valueOf(obj);
                    iil.a(new StringBuilder(((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(" and ").append(valueOf2).append(" supports same MessageType: ").append(valueOf3).toString());
                }
                this.a.put(obj, btn);
            }
        }
    }

    public int a(fwy fwy) {
        if (this.a.containsKey(fwy)) {
            return this.a.a((Object) fwy);
        }
        return this.a.size();
    }

    public bwd a(dr drVar, ViewGroup viewGroup, int i) {
        fwy fwy;
        btn btn;
        if (i < this.a.size()) {
            fwy = (fwy) this.a.b(i);
        } else {
            fwy = fwy.UNKNOWN;
        }
        if (i < this.a.size()) {
            btn = (btn) this.a.c(i);
        } else {
            btn = this.b;
        }
        return new bwd(drVar, viewGroup, btn, fwy);
    }
}

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class duk extends frf {
    final fit a;
    final ConcurrentHashMap<Integer, String> b;
    final fip c;
    volatile boolean d;
    volatile boolean e;
    private final int g;
    private final Context h;
    private volatile blo i;

    public duk(Context context, int i) {
        this.b = new ConcurrentHashMap();
        this.c = new dul(this);
        this.h = context;
        this.g = i;
        this.e = false;
        this.a = (fit) jyn.a(context, fit.class);
    }

    void a(String str) {
        List<frj> c = c(str);
        if (c != null && c.size() != 0) {
            this.d = false;
            for (frj frj : c) {
                bkk bkk = (bkk) frj;
                bkk.b.a(bkk);
            }
        }
    }

    protected String a() {
        return "ConversationLoader";
    }

    protected void a(ArrayList<String> arrayList) {
        if (this.i == null) {
            this.i = new blo(this.h, this.g);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a(this.i, (String) obj);
        }
    }

    private void a(String str, bls bls) {
        a(new dum(this, bls, str));
    }

    private void a(blo blo, String str) {
        bls f = blo.f(str);
        if (f != null) {
            String valueOf = String.valueOf(f);
            new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()).append("Conversation info for ").append(str).append(" from DB is ").append(valueOf);
            a(str, f);
            return;
        }
        fme a = ((fmf) jyn.a(this.h, fmf.class)).a();
        this.b.put(Integer.valueOf(a.a()), str);
        if (!this.e) {
            this.a.a(this.c);
            this.e = true;
        }
        String valueOf2;
        if (this.d) {
            valueOf = "conversation meta data is already requested for ";
            valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            a(str, null);
            this.b.remove(Integer.valueOf(a.a()));
            return;
        }
        this.d = true;
        if (!this.a.a(a, this.g, str)) {
            valueOf = "conversation meta data request didn't get sent for ";
            valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            a(str, null);
            this.b.remove(Integer.valueOf(a.a()));
        }
    }
}

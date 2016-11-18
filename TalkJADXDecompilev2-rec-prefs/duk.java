package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class duk extends frf {
    final fit f10564a;
    final ConcurrentHashMap<Integer, String> f10565b = new ConcurrentHashMap();
    final fip f10566c = new dul(this);
    volatile boolean f10567d;
    volatile boolean f10568e;
    private final int f10569g;
    private final Context f10570h;
    private volatile blo f10571i;

    public duk(Context context, int i) {
        this.f10570h = context;
        this.f10569g = i;
        this.f10568e = false;
        this.f10564a = (fit) jyn.m25426a(context, fit.class);
    }

    void m12726a(String str) {
        List<frj> c = m12716c(str);
        if (c != null && c.size() != 0) {
            this.f10567d = false;
            for (frj frj : c) {
                bkk bkk = (bkk) frj;
                bkk.f3625b.mo1115a(bkk);
            }
        }
    }

    protected String mo1676a() {
        return "ConversationLoader";
    }

    protected void mo1677a(ArrayList<String> arrayList) {
        if (this.f10571i == null) {
            this.f10571i = new blo(this.f10570h, this.f10569g);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m12723a(this.f10571i, (String) obj);
        }
    }

    private void m12724a(String str, bls bls) {
        m12710a(new dum(this, bls, str));
    }

    private void m12723a(blo blo, String str) {
        bls f = blo.m6050f(str);
        if (f != null) {
            String valueOf = String.valueOf(f);
            new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()).append("Conversation info for ").append(str).append(" from DB is ").append(valueOf);
            m12724a(str, f);
            return;
        }
        fme a = ((fmf) jyn.m25426a(this.f10570h, fmf.class)).mo2035a();
        this.f10565b.put(Integer.valueOf(a.m15674a()), str);
        if (!this.f10568e) {
            this.f10564a.mo2007a(this.f10566c);
            this.f10568e = true;
        }
        String valueOf2;
        if (this.f10567d) {
            valueOf = "conversation meta data is already requested for ";
            valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            m12724a(str, null);
            this.f10565b.remove(Integer.valueOf(a.m15674a()));
            return;
        }
        this.f10567d = true;
        if (!this.f10564a.mo2013a(a, this.f10569g, str)) {
            valueOf = "conversation meta data request didn't get sent for ";
            valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            m12724a(str, null);
            this.f10565b.remove(Integer.valueOf(a.m15674a()));
        }
    }
}

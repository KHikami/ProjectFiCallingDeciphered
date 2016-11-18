package p000;

import android.content.Context;
import java.util.List;

public final class cob extends euj<lss, lsu> {
    private final int f5792a = 2;
    private final int f5793b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return cod.m8138a((lsu) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m8109a((lss) nzf);
    }

    public cob(Context context, int i, int i2, coc coc) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), coc, "conversations/markeventobserved", fom.HANGOUTS_API, new lss(), new lsu());
        this.f5793b = i;
    }

    private void m8109a(lss lss) {
        List c = ((coc) this.f5790e).m8115c();
        int size = c.size();
        lss.f26341a = new lst[size];
        for (int i = 0; i < size; i++) {
            lst lst = new lst();
            String a = ((eth) c.get(i)).m14460a();
            euj.m8097a(a, true);
            lst.f26343a = euk.m14555a(a);
            List b = ((eth) c.get(i)).m14461b();
            int size2 = b.size();
            lst.f26344b = new String[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                lst.f26344b[i2] = (String) b.get(i2);
            }
            lss.f26341a[i] = lst;
        }
        lss.requestHeader = m8100a(new esq().m14381a(this.f5793b).m14384b(this.f5792a).m14380a());
    }
}

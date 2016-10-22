import android.content.Context;
import java.util.List;

public final class cob extends euj<lss, lsu> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return cod.a((lsu) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lss) nzf);
    }

    public cob(Context context, int i, int i2, coc coc) {
        super(jvc.newBuilder().a(context, i).a(), coc, "conversations/markeventobserved", fom.HANGOUTS_API, new lss(), new lsu());
        this.a = 2;
        this.b = i;
    }

    private void a(lss lss) {
        List c = ((coc) this.e).c();
        int size = c.size();
        lss.a = new lst[size];
        for (int i = 0; i < size; i++) {
            lst lst = new lst();
            String a = ((eth) c.get(i)).a();
            euj.a(a, true);
            lst.a = euk.a(a);
            List b = ((eth) c.get(i)).b();
            int size2 = b.size();
            lst.b = new String[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                lst.b[i2] = (String) b.get(i2);
            }
            lss.a[i] = lst;
        }
        lss.requestHeader = a(new esq().a(this.b).b(this.a).a());
    }
}

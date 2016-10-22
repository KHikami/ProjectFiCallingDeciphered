import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class evs extends esw {
    private static final long serialVersionUID = 1;
    public final long c;
    public final List<evc> d;
    public final boolean e;
    private final List<byte[]> f;
    private boolean k;
    private boolean l;
    private final String m;

    public evs(long j, List<evc> list, List<Pair<String, Long>> list2, boolean z, boolean z2, String str) {
        this.c = j;
        this.d = list;
        List arrayList = new ArrayList();
        for (Pair pair : list2) {
            nzf lww = new lww();
            lww.a = euk.a((String) pair.first);
            lww.b = (Long) pair.second;
            arrayList.add(nzf.a(lww));
        }
        this.f = arrayList;
        this.k = z;
        this.e = z2;
        this.m = str;
    }

    public nzf a(String str, int i, int i2) {
        int i3 = 0;
        nzf lwn = new lwn();
        if (gjk.b) {
            gjn a = new gjn().a("sane_build_proto");
            String str2 = "id=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            a.b(valueOf).b("retry=" + i).b();
        }
        if (this.d != null) {
            lwn.b = new lsp[this.d.size()];
            int i4 = 0;
            for (evc a2 : this.d) {
                int i5 = i4 + 1;
                lwn.b[i4] = a2.a();
                i4 = i5;
            }
        } else {
            glk.e("BabelClient", "SyncAllNewEventsRequest.buildProtobuf: null localState", new Object[0]);
        }
        if (this.f != null) {
            lwn.c = new lww[this.f.size()];
            while (i3 < this.f.size()) {
                try {
                    lwn.c[i3] = (lww) nzf.a(new lww(), (byte[]) this.f.get(i3));
                } catch (nzd e) {
                }
                i3++;
            }
        } else {
            glk.e("BabelClient", "SyncAllNewEventsRequest.buildProtobuf: null rawUnreadConversationStates", new Object[0]);
        }
        lwn.d = Integer.valueOf(gwb.a(gwb.H(), "babel_smaxbytesperws", 100000));
        lwn.requestHeader = euk.a(str, i, i2, this.i);
        lwn.a = Long.valueOf(this.c);
        lwn.e = Boolean.valueOf(this.k);
        return lwn;
    }

    public String g() {
        return "conversations/syncallnewevents";
    }

    public long b() {
        if (this.k) {
            return gwb.a(gwb.H(), "babel_sane_refresh_timeout", 90000);
        }
        return gwb.a(gwb.H(), "babel_sane_timeout", fls.i);
    }

    public void a(Context context, bko bko, fdo fdo) {
        String a = bko.a();
        boolean z = fdo.c() == 120;
        if (a) {
            String str = "SyncAllNewEvents.onFailed ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (gjk.b) {
            new gjn().a("sane_expired").d(a).b("isReplaced=" + this.l).b("expired=" + z).b();
        }
        fjj.c(bko.g()).d(this.m);
    }

    public boolean a(ead ead) {
        iil.a(getClass(), ead.getClass());
        evs evs = (evs) ead;
        if (!evs.k) {
            this.k = false;
        }
        evs.l = true;
        return true;
    }

    public boolean n() {
        return this.k;
    }

    public String o() {
        return this.m;
    }
}

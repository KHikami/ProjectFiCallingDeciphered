package p000;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class evs extends esw {
    private static final long serialVersionUID = 1;
    public final long f12380c;
    public final List<evc> f12381d;
    public final boolean f12382e;
    private final List<byte[]> f12383f;
    private boolean f12384k;
    private boolean f12385l;
    private final String f12386m;

    public evs(long j, List<evc> list, List<Pair<String, Long>> list2, boolean z, boolean z2, String str) {
        this.f12380c = j;
        this.f12381d = list;
        List arrayList = new ArrayList();
        for (Pair pair : list2) {
            nzf lww = new lww();
            lww.f26731a = euk.m14555a((String) pair.first);
            lww.f26732b = (Long) pair.second;
            arrayList.add(nzf.m1029a(lww));
        }
        this.f12383f = arrayList;
        this.f12384k = z;
        this.f12382e = z2;
        this.f12386m = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        int i3 = 0;
        nzf lwn = new lwn();
        if (gjk.f15365b) {
            gjn a = new gjn().m17819a("sane_build_proto");
            String str2 = "id=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            a.m17823b(valueOf).m17823b("retry=" + i).m17824b();
        }
        if (this.f12381d != null) {
            lwn.f26695b = new lsp[this.f12381d.size()];
            int i4 = 0;
            for (evc a2 : this.f12381d) {
                int i5 = i4 + 1;
                lwn.f26695b[i4] = a2.m14613a();
                i4 = i5;
            }
        } else {
            glk.m17982e("BabelClient", "SyncAllNewEventsRequest.buildProtobuf: null localState", new Object[0]);
        }
        if (this.f12383f != null) {
            lwn.f26696c = new lww[this.f12383f.size()];
            while (i3 < this.f12383f.size()) {
                try {
                    lwn.f26696c[i3] = (lww) nzf.m1027a(new lww(), (byte[]) this.f12383f.get(i3));
                } catch (nzd e) {
                }
                i3++;
            }
        } else {
            glk.m17982e("BabelClient", "SyncAllNewEventsRequest.buildProtobuf: null rawUnreadConversationStates", new Object[0]);
        }
        lwn.f26697d = Integer.valueOf(gwb.m1492a(gwb.m1400H(), "babel_smaxbytesperws", 100000));
        lwn.requestHeader = euk.m14556a(str, i, i2, this.i);
        lwn.f26694a = Long.valueOf(this.f12380c);
        lwn.f26698e = Boolean.valueOf(this.f12384k);
        return lwn;
    }

    public String mo1947g() {
        return "conversations/syncallnewevents";
    }

    public long mo1017b() {
        if (this.f12384k) {
            return gwb.m1519a(gwb.m1400H(), "babel_sane_refresh_timeout", 90000);
        }
        return gwb.m1519a(gwb.m1400H(), "babel_sane_timeout", fls.f13432i);
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        String a = bko.m5629a();
        boolean z = fdo.m15084c() == 120;
        if (a) {
            String str = "SyncAllNewEvents.onFailed ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (gjk.f15365b) {
            new gjn().m17819a("sane_expired").m17827d(a).m17823b("isReplaced=" + this.f12385l).m17823b("expired=" + z).m17824b();
        }
        fjj.m15425c(bko.m5638g()).m15435d(this.f12386m);
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        evs evs = (evs) ead;
        if (!evs.f12384k) {
            this.f12384k = false;
        }
        evs.f12385l = true;
        return true;
    }

    public boolean m14671n() {
        return this.f12384k;
    }

    public String m14672o() {
        return this.f12386m;
    }
}

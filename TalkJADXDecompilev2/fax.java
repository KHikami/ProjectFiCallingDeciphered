package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class fax extends evz {
    private static final boolean g = false;
    private static final long serialVersionUID = 1;
    private final boolean h;
    private final long i;
    private final long j;
    private final List<byte[]> k = new ArrayList();
    private final boolean l;
    private final edk[] m;

    static {
        kae kae = glk.l;
    }

    private List<ess> d(long j) {
        boolean z;
        if (this.b != null) {
            boolean z2 = ((evt) this.b).f;
            if (g) {
                new StringBuilder(55).append("SRCResp.buildConversationStateList: suppressNotif=").append(z2);
            }
            z = z2;
        } else {
            z = false;
        }
        List<ess> arrayList = new ArrayList();
        for (byte[] a : this.k) {
            ess a2 = ess.a(a, z, j);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    fax(lwr lwr) {
        int i = 0;
        super(lwr, lwr.responseHeader, -1, lwr.f);
        if (lwr.a != null) {
            this.h = true;
            this.i = gwb.a(lwr.a);
        } else {
            this.h = false;
            this.i = 0;
        }
        if (lwr.c != null) {
            this.j = gwb.a(lwr.c);
        } else {
            this.j = -2;
        }
        lox[] loxArr = lwr.b;
        int length = loxArr.length;
        while (i < length) {
            this.k.add(nzf.a(loxArr[i]));
            i++;
        }
        this.m = evz.a(lwr.e, lwr.b);
        this.l = k();
        if (g) {
            String valueOf = String.valueOf(lwr);
            new StringBuilder(String.valueOf(valueOf).length() + 37).append("SyncRecentConversationsResponse from:").append(valueOf);
        }
    }

    public void a(blo blo, fhc fhc) {
        long b;
        super.a(blo, fhc);
        if (glk.a("Babel_SyncRC", 3)) {
            glk.b("Babel_SyncRC", "processSyncRecentConversationsResponse count: " + d(0).size() + " has_sync_timestamp: " + this.h + " sync_timestamp: " + this.i + " requestWasForScrollback: " + this.l, new Object[0]);
        }
        if (gjk.b) {
            new gjn().a("src_response").a(blo.g()).b("forScrollback=" + this.l).b();
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Object obj = null;
        if (blf.a) {
            b = glj.b();
        } else {
            b = 0;
        }
        if (j() != null) {
            j().a("sync_recent_conversations_response");
        }
        blo.a();
        long b2 = glj.b() * 1000;
        try {
            int i;
            String str;
            long b3 = glj.b();
            if (this.m != null) {
                for (edk edk : this.m) {
                    if (edk != null) {
                        blo.a(edk, true);
                    }
                }
            }
            for (ess ess : d(this.c.d)) {
                if (blf.a(blo.g(), ess.b)) {
                    long b4;
                    Object obj2;
                    Object obj3;
                    if (glj.b() - b3 >= g()) {
                        blo.d();
                        b4 = glj.b();
                    } else {
                        b4 = b3;
                    }
                    str = ess.a;
                    List list = ess.c;
                    if (glk.a("Babel_SyncRC", 3)) {
                        glk.b("Babel_SyncRC", new StringBuilder(String.valueOf(str).length() + 44).append("processing conversation ").append(str).append(" events: ").append(list.size()).toString(), new Object[0]);
                    }
                    if (ess.b != null) {
                        if (blf.a(blo, ess.b, ess.h, null, fhc, null, false)) {
                            obj = 1;
                        }
                    }
                    if (list.size() > 0) {
                        blf.a(blo, ess.a, ess.e, ess.f);
                        blf.a(blo, ess.a, 0, fhc, null);
                        ArrayList arrayList = new ArrayList();
                        obj2 = null;
                        int i2 = 0;
                        obj3 = null;
                        while (i2 < list.size()) {
                            Object obj4;
                            fpl fpl = (fpl) list.get(i2);
                            if (fpl.f() != null) {
                                arrayList.addAll(fpl.f());
                            }
                            if (fpl instanceof fpr) {
                                obj4 = 1;
                            } else if (!(fpl instanceof fox)) {
                                obj4 = obj2;
                            } else if (k()) {
                                ((fox) fpl).a(4);
                                i = 1;
                                obj4 = obj2;
                            } else {
                                ((fox) fpl).a(3);
                                i = 1;
                                obj4 = obj2;
                            }
                            blf.a(blo, fpl, fhc, h(), i(), b2);
                            i2++;
                            obj2 = obj4;
                        }
                        fhc.a(gwb.H(), blo, ess.a, arrayList);
                    } else {
                        obj3 = null;
                        obj2 = null;
                    }
                    if (obj3 != null) {
                        hashSet.add(ess.a);
                    }
                    if (obj2 != null) {
                        hashSet2.add(ess.a);
                    }
                    b3 = b4;
                } else {
                    gwb.a(blo.g(), 1839);
                }
            }
            i = ((evt) this.b).n();
            if (this.h && !this.l && i == 5) {
                bkq.b(gwb.H(), blo.g().g(), "last_successful_sync_time", this.i);
            }
            blo.a(this.j, i);
            if (i == 5) {
                blo.a(this.j, 1);
            } else if (i == 6) {
                blo.a(this.j, 3);
            }
            blo.m();
            blo.b();
            str = ((evt) this.b).p();
            if (!TextUtils.isEmpty(str)) {
                fjj.c(blo.g().g()).c(str);
            }
            if (blf.a) {
                new StringBuilder(59).append("processSyncRecentConversations took ").append(glj.b() - b).append(" ms");
            }
            if (obj != null) {
                blf.d(blo);
                blo.a(blo, null);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                blf.d(blo, (String) it.next());
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                blf.c(blo, (String) it.next());
            }
        } finally {
            blo.c();
            if (j() != null) {
                j().a(blo.g().g(), "sync_recent_conversations_response", glj.b(), 2);
            }
        }
    }

    public void a(Context context, bko bko) {
        if (bko != null) {
            evz.a(bko.g(), (evz) this);
        }
    }

    private boolean k() {
        if (this.b != null) {
            return ((evt) this.b).o();
        }
        return false;
    }
}

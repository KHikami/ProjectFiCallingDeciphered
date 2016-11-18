package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class fax extends evz {
    private static final boolean f12597g = false;
    private static final long serialVersionUID = 1;
    private final boolean f12598h;
    private final long f12599i;
    private final long f12600j;
    private final List<byte[]> f12601k = new ArrayList();
    private final boolean f12602l;
    private final edk[] f12603m;

    static {
        kae kae = glk.f15565l;
    }

    private List<ess> m14862d(long j) {
        boolean z;
        if (this.b != null) {
            boolean z2 = ((evt) this.b).f12390f;
            if (f12597g) {
                new StringBuilder(55).append("SRCResp.buildConversationStateList: suppressNotif=").append(z2);
            }
            z = z2;
        } else {
            z = false;
        }
        List<ess> arrayList = new ArrayList();
        for (byte[] a : this.f12601k) {
            ess a2 = ess.m14386a(a, z, j);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    fax(lwr lwr) {
        int i = 0;
        super(lwr, lwr.responseHeader, -1, lwr.f26723f);
        if (lwr.f26718a != null) {
            this.f12598h = true;
            this.f12599i = gwb.m1523a(lwr.f26718a);
        } else {
            this.f12598h = false;
            this.f12599i = 0;
        }
        if (lwr.f26720c != null) {
            this.f12600j = gwb.m1523a(lwr.f26720c);
        } else {
            this.f12600j = -2;
        }
        lox[] loxArr = lwr.f26719b;
        int length = loxArr.length;
        while (i < length) {
            this.f12601k.add(nzf.m1029a(loxArr[i]));
            i++;
        }
        this.f12603m = evz.m8121a(lwr.f26722e, lwr.f26719b);
        this.f12602l = m14863k();
        if (f12597g) {
            String valueOf = String.valueOf(lwr);
            new StringBuilder(String.valueOf(valueOf).length() + 37).append("SyncRecentConversationsResponse from:").append(valueOf);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        long b;
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel_SyncRC", 3)) {
            glk.m17976b("Babel_SyncRC", "processSyncRecentConversationsResponse count: " + m14862d(0).size() + " has_sync_timestamp: " + this.f12598h + " sync_timestamp: " + this.f12599i + " requestWasForScrollback: " + this.f12602l, new Object[0]);
        }
        if (gjk.f15365b) {
            new gjn().m17819a("src_response").m17817a(blo.m6056g()).m17823b("forScrollback=" + this.f12602l).m17824b();
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Object obj = null;
        if (blf.f3692a) {
            b = glj.m17963b();
        } else {
            b = 0;
        }
        if (m8137j() != null) {
            m8137j().mo1670a("sync_recent_conversations_response");
        }
        blo.m5958a();
        long b2 = glj.m17963b() * 1000;
        try {
            int i;
            String str;
            long b3 = glj.m17963b();
            if (this.f12603m != null) {
                for (edk edk : this.f12603m) {
                    if (edk != null) {
                        blo.m6002a(edk, true);
                    }
                }
            }
            for (ess ess : m14862d(this.c.f12531d)) {
                if (blf.m5798a(blo.m6056g(), ess.f12192b)) {
                    long b4;
                    Object obj2;
                    Object obj3;
                    if (glj.m17963b() - b3 >= m8134g()) {
                        blo.m6039d();
                        b4 = glj.m17963b();
                    } else {
                        b4 = b3;
                    }
                    str = ess.f12191a;
                    List list = ess.f12193c;
                    if (glk.m17973a("Babel_SyncRC", 3)) {
                        glk.m17976b("Babel_SyncRC", new StringBuilder(String.valueOf(str).length() + 44).append("processing conversation ").append(str).append(" events: ").append(list.size()).toString(), new Object[0]);
                    }
                    if (ess.f12192b != null) {
                        if (blf.m5799a(blo, ess.f12192b, ess.f12198h, null, fhc, null, false)) {
                            obj = 1;
                        }
                    }
                    if (list.size() > 0) {
                        blf.m5791a(blo, ess.f12191a, ess.f12195e, ess.f12196f);
                        blf.m5801a(blo, ess.f12191a, 0, fhc, null);
                        ArrayList arrayList = new ArrayList();
                        obj2 = null;
                        int i2 = 0;
                        obj3 = null;
                        while (i2 < list.size()) {
                            Object obj4;
                            fpl fpl = (fpl) list.get(i2);
                            if (fpl.mo2063f() != null) {
                                arrayList.addAll(fpl.mo2063f());
                            }
                            if (fpl instanceof fpr) {
                                obj4 = 1;
                            } else if (!(fpl instanceof fox)) {
                                obj4 = obj2;
                            } else if (m14863k()) {
                                ((fox) fpl).m15854a(4);
                                i = 1;
                                obj4 = obj2;
                            } else {
                                ((fox) fpl).m15854a(3);
                                i = 1;
                                obj4 = obj2;
                            }
                            blf.m5778a(blo, fpl, fhc, m8135h(), m8136i(), b2);
                            i2++;
                            obj2 = obj4;
                        }
                        fhc.m15306a(gwb.m1400H(), blo, ess.f12191a, arrayList);
                    } else {
                        obj3 = null;
                        obj2 = null;
                    }
                    if (obj3 != null) {
                        hashSet.add(ess.f12191a);
                    }
                    if (obj2 != null) {
                        hashSet2.add(ess.f12191a);
                    }
                    b3 = b4;
                } else {
                    gwb.m1823a(blo.m6056g(), 1839);
                }
            }
            i = ((evt) this.b).m14678n();
            if (this.f12598h && !this.f12602l && i == 5) {
                bkq.m5677b(gwb.m1400H(), blo.m6056g().m5638g(), "last_successful_sync_time", this.f12599i);
            }
            blo.m5962a(this.f12600j, i);
            if (i == 5) {
                blo.m5962a(this.f12600j, 1);
            } else if (i == 6) {
                blo.m5962a(this.f12600j, 3);
            }
            blo.m6085m();
            blo.m6015b();
            str = ((evt) this.b).m14680p();
            if (!TextUtils.isEmpty(str)) {
                fjj.m15425c(blo.m6056g().m5638g()).m15434c(str);
            }
            if (blf.f3692a) {
                new StringBuilder(59).append("processSyncRecentConversations took ").append(glj.m17963b() - b).append(" ms");
            }
            if (obj != null) {
                blf.m5820d(blo);
                blo.m5840a(blo, null);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                blf.m5821d(blo, (String) it.next());
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                blf.m5818c(blo, (String) it.next());
            }
        } finally {
            blo.m6028c();
            if (m8137j() != null) {
                m8137j().mo1669a(blo.m6056g().m5638g(), "sync_recent_conversations_response", glj.m17963b(), 2);
            }
        }
    }

    public void mo1958a(Context context, bko bko) {
        if (bko != null) {
            evz.m8116a(bko.m5638g(), (evz) this);
        }
    }

    private boolean m14863k() {
        if (this.b != null) {
            return ((evt) this.b).m14679o();
        }
        return false;
    }
}

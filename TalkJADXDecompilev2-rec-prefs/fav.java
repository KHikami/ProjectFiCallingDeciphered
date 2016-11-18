package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class fav extends evz {
    private static final boolean f12592g = false;
    private static final long serialVersionUID = 1;
    private final long f12593h;
    private final boolean f12594i;
    private final boolean f12595j;
    private final ArrayList<byte[]> f12596k = new ArrayList();

    static {
        kae kae = glk.f15565l;
    }

    public fav(lwo lwo) {
        super(lwo, lwo.responseHeader, -1, lwo.f26708g);
        this.f12593h = gwb.m1523a(lwo.f26703b);
        this.f12594i = gwb.m2061b(lwo.f26702a);
        this.f12595j = gwb.m2061b(lwo.f26705d);
        for (nzf a : lwo.f26704c) {
            this.f12596k.add(nzf.m1029a(a));
        }
        if (f12592g) {
            String valueOf = String.valueOf(lwo);
            new StringBuilder(String.valueOf(valueOf).length() + 30).append("SyncAllNewEventsResponse from:").append(valueOf);
        }
    }

    public void mo1958a(Context context, bko bko) {
        if (bko != null) {
            evz.m8116a(bko.m5638g(), (evz) this);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        boolean z = false;
        Object obj = null;
        String str = null;
        if (gjk.f15365b) {
            new gjn().m17819a("sane_response").m17817a(blo.m6056g()).m17824b();
        }
        String str2;
        String valueOf;
        if (this.f12594i) {
            super.mo1047a(blo, fhc);
            String str3 = "Babel_SANE";
            str2 = "Force clear cache and resync for account:";
            valueOf = String.valueOf(glk.m17974b(blo.m6056g().m5629a()));
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.m17981d(str3, valueOf, new Object[0]);
            blo.m5958a();
            try {
                blo.m6105t();
                bkq.m5677b(blo.m6049f(), blo.m6056g().m5638g(), "last_successful_sync_time", 0);
                blo.m6111w();
                blo.m6015b();
                bko g = blo.m6056g();
                fjj.m15425c(g.m5638g()).m15434c(((evs) this.b).m14672o());
                RealTimeChatService.m9006a(g.m5638g(), false, fjl.NO_DELAY, flt.CLEAR_CACHE_RESYNC);
                if (g.m5644m()) {
                    bkq.m5676b(blo.m6049f(), blo.m6056g().m5638g(), "sms_last_sync_time_millis");
                    fvy.m16344a(g.m5638g(), blo.m6049f());
                }
            } finally {
                blo.m6028c();
            }
        } else {
            long b;
            Object obj2;
            if (this.b != null) {
                boolean z2 = ((evs) this.b).f12382e;
                str = ((evs) this.b).m14672o();
                z = z2;
            }
            List<ess> a = ess.m14387a(this.f12596k, z, this.c.f12531d);
            super.mo1047a(blo, fhc);
            if (blf.f3692a) {
                b = glj.m17963b();
            } else {
                b = 0;
            }
            if (glk.m17973a("Babel_SANE", 3)) {
                glk.m17976b("Babel_SANE", "processSyncAllNewEventsResponse: count " + a.size(), new Object[0]);
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (m8137j() != null) {
                m8137j().mo1670a("sync_all_new_events_response");
            }
            blo.m5958a();
            long b2 = glj.m17963b() * 1000;
            Object obj3 = 1;
            if (!this.f12595j || a.size() <= gwb.m1492a(blo.m6049f(), "babel_separate_gcr_threshold", 5)) {
                try {
                    long b3 = glj.m17963b();
                    fjj c = fjj.m15425c(blo.m6056g().m5638g());
                    for (ess ess : a) {
                        if (blf.m5798a(blo.m6056g(), ess.f12192b)) {
                            long b4;
                            if (glj.m17963b() - b3 >= m8134g()) {
                                blo.m6039d();
                                b4 = glj.m17963b();
                            } else {
                                b4 = b3;
                            }
                            String str4 = ess.f12191a;
                            if (ess.f12197g != 0) {
                                if (f12592g) {
                                    new StringBuilder(String.valueOf(str4).length() + 53).append("Conversation ").append(str4).append(" has leaveTimestamp ").append(ess.f12197g);
                                }
                                blo.m6076k(str4);
                                b3 = b4;
                            } else {
                                String valueOf2;
                                if (!this.f12595j) {
                                    int size;
                                    List<fpl> list = ess.f12193c;
                                    if (list != null) {
                                        size = list.size();
                                    } else {
                                        size = 0;
                                    }
                                    if (!gwb.m1906a(blo.m6049f(), "babel_crashifmissedpush", false) || size <= 0 || this.b == null || !((evs) this.b).m14671n()) {
                                        if (blf.f3692a) {
                                            new StringBuilder(String.valueOf(str4).length() + 40).append("syncing conversation ").append(str4).append(" events ").append(size);
                                        } else if (size > 0 && glk.m17973a("Babel_SANE", 3)) {
                                            glk.m17976b("Babel_SANE", new StringBuilder(String.valueOf(str4).length() + 40).append("syncing conversation ").append(str4).append(" events ").append(size).toString(), new Object[0]);
                                        }
                                        if (ess.f12192b != null) {
                                            if (blf.m5799a(blo, ess.f12192b, ess.f12198h, null, fhc, null, false)) {
                                                obj = 1;
                                            }
                                            if (!ess.f12192b.m15884m()) {
                                                blo.m5961a(0, this.f12593h, ess.f12191a);
                                            }
                                        }
                                        if (list != null && list.size() > 0) {
                                            blf.m5801a(blo, ess.f12191a, 0, fhc, null);
                                            ArrayList arrayList = new ArrayList();
                                            Object obj4 = null;
                                            int i = 0;
                                            obj2 = null;
                                            while (i < list.size()) {
                                                Object obj5;
                                                fpl fpl = (fpl) list.get(i);
                                                if (fpl.mo2063f() != null) {
                                                    arrayList.addAll(fpl.mo2063f());
                                                }
                                                if (fpl instanceof fpr) {
                                                    obj5 = 1;
                                                } else if (fpl instanceof fox) {
                                                    evz.m8118a(blo.m6056g(), str, (fox) fpl);
                                                    ((fox) fpl).m15854a(2);
                                                    int i2 = 1;
                                                    obj5 = obj4;
                                                } else {
                                                    obj5 = obj4;
                                                }
                                                blf.m5778a(blo, fpl, fhc, m8135h(), m8136i(), b2);
                                                i++;
                                                obj4 = obj5;
                                            }
                                            fhc.m15306a(blo.m6049f(), blo, ess.f12191a, arrayList);
                                            if (obj2 != null) {
                                                hashSet.add(str4);
                                            }
                                            if (obj4 != null) {
                                                hashSet2.add(str4);
                                            }
                                        }
                                        if (blf.f3692a) {
                                            new StringBuilder(26).append("mustQuerySeparately: ").append(ess.f12194d);
                                        }
                                    } else {
                                        glk.m17982e("Babel_SANE", new StringBuilder(String.valueOf(str4).length() + 67).append("Got unexpected missed events in SANE ").append(str4).append(" sorttime ").append(ess.f12192b.m15896y()).toString(), new Object[0]);
                                        for (fpl fpl2 : list) {
                                            valueOf2 = String.valueOf(fpl2.m15842i());
                                            glk.m17982e("Babel_SANE", new StringBuilder(String.valueOf(valueOf2).length() + 28).append("  ").append(valueOf2).append(" time ").append(fpl2.m15832c()).toString(), new Object[0]);
                                        }
                                        str2 = "Got unexpected missed events in SANE ";
                                        valueOf = String.valueOf(str4);
                                        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                    }
                                }
                                Object obj6 = obj;
                                if (ess.f12192b == null) {
                                    if (!blo.m6101r(ess.f12191a)) {
                                        obj2 = null;
                                        if (!this.f12595j || r4 == null) {
                                            obj2 = null;
                                            if (blf.f3692a) {
                                                str2 = "requesting more events for ";
                                                valueOf2 = String.valueOf(ess.f12191a);
                                                if (valueOf2.length() == 0) {
                                                    str2.concat(valueOf2);
                                                } else {
                                                    valueOf2 = new String(str2);
                                                }
                                            }
                                            fhc.m15308a(new euw(ess.f12191a, true, true, false, null, 0, str, 0, null));
                                            c.m15430a(str);
                                        } else {
                                            obj2 = obj3;
                                        }
                                        b3 = b4;
                                        obj3 = obj2;
                                        obj = obj6;
                                    }
                                }
                                obj2 = 1;
                                if (this.f12595j) {
                                }
                                obj2 = null;
                                if (blf.f3692a) {
                                    str2 = "requesting more events for ";
                                    valueOf2 = String.valueOf(ess.f12191a);
                                    if (valueOf2.length() == 0) {
                                        valueOf2 = new String(str2);
                                    } else {
                                        str2.concat(valueOf2);
                                    }
                                }
                                fhc.m15308a(new euw(ess.f12191a, true, true, false, null, 0, str, 0, null));
                                c.m15430a(str);
                                b3 = b4;
                                obj3 = obj2;
                                obj = obj6;
                            }
                        } else {
                            gwb.m1823a(blo.m6056g(), 1839);
                        }
                    }
                    if (obj3 != null) {
                        z = blf.f3692a;
                        bkq.m5677b(blo.m6049f(), blo.m6056g().m5638g(), "last_successful_sync_time", this.f12593h);
                        c.m15434c(str);
                        obj2 = obj;
                    } else {
                        z = blf.f3692a;
                        bkq.m5677b(blo.m6049f(), blo.m6056g().m5638g(), "in_progress_sync_time", this.f12593h);
                        obj2 = obj;
                    }
                } finally {
                    blo.m6028c();
                    if (m8137j() != null) {
                        m8137j().mo1669a(blo.m6056g().m5638g(), "sync_all_new_events_response", glj.m17963b(), 3);
                    }
                }
            } else {
                fhc.m15308a(new evt(5, false, str));
                fhc.m15308a(new evt(6, false, null));
                blo.m6105t();
                blo.m6097p();
                bkq.m5677b(blo.m6049f(), blo.m6056g().m5638g(), "last_successful_sync_time", 0);
                obj2 = 1;
            }
            blo.m6015b();
            if (blf.f3692a) {
                new StringBuilder(40).append("processSANE took ").append(glj.m17963b() - b).append(" ms");
            }
            if (obj2 != null) {
                blf.m5820d(blo);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                blf.m5821d(blo, (String) it.next());
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                blf.m5818c(blo, (String) it.next());
            }
        }
    }
}

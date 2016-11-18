package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class fav extends evz {
    private static final boolean g = false;
    private static final long serialVersionUID = 1;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final ArrayList<byte[]> k = new ArrayList();

    static {
        kae kae = glk.l;
    }

    public fav(lwo lwo) {
        super(lwo, lwo.responseHeader, -1, lwo.g);
        this.h = gwb.a(lwo.b);
        this.i = gwb.b(lwo.a);
        this.j = gwb.b(lwo.d);
        for (nzf a : lwo.c) {
            this.k.add(nzf.a(a));
        }
        if (g) {
            String valueOf = String.valueOf(lwo);
            new StringBuilder(String.valueOf(valueOf).length() + 30).append("SyncAllNewEventsResponse from:").append(valueOf);
        }
    }

    public void a(Context context, bko bko) {
        if (bko != null) {
            evz.a(bko.g(), (evz) this);
        }
    }

    public void a(blo blo, fhc fhc) {
        boolean z = false;
        Object obj = null;
        String str = null;
        if (gjk.b) {
            new gjn().a("sane_response").a(blo.g()).b();
        }
        String str2;
        String valueOf;
        if (this.i) {
            super.a(blo, fhc);
            String str3 = "Babel_SANE";
            str2 = "Force clear cache and resync for account:";
            valueOf = String.valueOf(glk.b(blo.g().a()));
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.d(str3, valueOf, new Object[0]);
            blo.a();
            try {
                blo.t();
                bkq.b(blo.f(), blo.g().g(), "last_successful_sync_time", 0);
                blo.w();
                blo.b();
                bko g = blo.g();
                fjj.c(g.g()).c(((evs) this.b).o());
                RealTimeChatService.a(g.g(), false, fjl.NO_DELAY, flt.CLEAR_CACHE_RESYNC);
                if (g.m()) {
                    bkq.b(blo.f(), blo.g().g(), "sms_last_sync_time_millis");
                    fvy.a(g.g(), blo.f());
                }
            } finally {
                blo.c();
            }
        } else {
            long b;
            Object obj2;
            if (this.b != null) {
                boolean z2 = ((evs) this.b).e;
                str = ((evs) this.b).o();
                z = z2;
            }
            List<ess> a = ess.a(this.k, z, this.c.d);
            super.a(blo, fhc);
            if (blf.a) {
                b = glj.b();
            } else {
                b = 0;
            }
            if (glk.a("Babel_SANE", 3)) {
                glk.b("Babel_SANE", "processSyncAllNewEventsResponse: count " + a.size(), new Object[0]);
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (j() != null) {
                j().a("sync_all_new_events_response");
            }
            blo.a();
            long b2 = glj.b() * 1000;
            Object obj3 = 1;
            if (!this.j || a.size() <= gwb.a(blo.f(), "babel_separate_gcr_threshold", 5)) {
                try {
                    long b3 = glj.b();
                    fjj c = fjj.c(blo.g().g());
                    for (ess ess : a) {
                        if (blf.a(blo.g(), ess.b)) {
                            long b4;
                            if (glj.b() - b3 >= g()) {
                                blo.d();
                                b4 = glj.b();
                            } else {
                                b4 = b3;
                            }
                            String str4 = ess.a;
                            if (ess.g != 0) {
                                if (g) {
                                    new StringBuilder(String.valueOf(str4).length() + 53).append("Conversation ").append(str4).append(" has leaveTimestamp ").append(ess.g);
                                }
                                blo.k(str4);
                                b3 = b4;
                            } else {
                                String valueOf2;
                                if (!this.j) {
                                    int size;
                                    List<fpl> list = ess.c;
                                    if (list != null) {
                                        size = list.size();
                                    } else {
                                        size = 0;
                                    }
                                    if (!gwb.a(blo.f(), "babel_crashifmissedpush", false) || size <= 0 || this.b == null || !((evs) this.b).n()) {
                                        if (blf.a) {
                                            new StringBuilder(String.valueOf(str4).length() + 40).append("syncing conversation ").append(str4).append(" events ").append(size);
                                        } else if (size > 0 && glk.a("Babel_SANE", 3)) {
                                            glk.b("Babel_SANE", new StringBuilder(String.valueOf(str4).length() + 40).append("syncing conversation ").append(str4).append(" events ").append(size).toString(), new Object[0]);
                                        }
                                        if (ess.b != null) {
                                            if (blf.a(blo, ess.b, ess.h, null, fhc, null, false)) {
                                                obj = 1;
                                            }
                                            if (!ess.b.m()) {
                                                blo.a(0, this.h, ess.a);
                                            }
                                        }
                                        if (list != null && list.size() > 0) {
                                            blf.a(blo, ess.a, 0, fhc, null);
                                            ArrayList arrayList = new ArrayList();
                                            Object obj4 = null;
                                            int i = 0;
                                            obj2 = null;
                                            while (i < list.size()) {
                                                Object obj5;
                                                fpl fpl = (fpl) list.get(i);
                                                if (fpl.f() != null) {
                                                    arrayList.addAll(fpl.f());
                                                }
                                                if (fpl instanceof fpr) {
                                                    obj5 = 1;
                                                } else if (fpl instanceof fox) {
                                                    evz.a(blo.g(), str, (fox) fpl);
                                                    ((fox) fpl).a(2);
                                                    int i2 = 1;
                                                    obj5 = obj4;
                                                } else {
                                                    obj5 = obj4;
                                                }
                                                blf.a(blo, fpl, fhc, h(), i(), b2);
                                                i++;
                                                obj4 = obj5;
                                            }
                                            fhc.a(blo.f(), blo, ess.a, arrayList);
                                            if (obj2 != null) {
                                                hashSet.add(str4);
                                            }
                                            if (obj4 != null) {
                                                hashSet2.add(str4);
                                            }
                                        }
                                        if (blf.a) {
                                            new StringBuilder(26).append("mustQuerySeparately: ").append(ess.d);
                                        }
                                    } else {
                                        glk.e("Babel_SANE", new StringBuilder(String.valueOf(str4).length() + 67).append("Got unexpected missed events in SANE ").append(str4).append(" sorttime ").append(ess.b.y()).toString(), new Object[0]);
                                        for (fpl fpl2 : list) {
                                            valueOf2 = String.valueOf(fpl2.i());
                                            glk.e("Babel_SANE", new StringBuilder(String.valueOf(valueOf2).length() + 28).append("  ").append(valueOf2).append(" time ").append(fpl2.c()).toString(), new Object[0]);
                                        }
                                        str2 = "Got unexpected missed events in SANE ";
                                        valueOf = String.valueOf(str4);
                                        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                    }
                                }
                                Object obj6 = obj;
                                if (ess.b == null) {
                                    if (!blo.r(ess.a)) {
                                        obj2 = null;
                                        if (!this.j || r4 == null) {
                                            obj2 = null;
                                            if (blf.a) {
                                                str2 = "requesting more events for ";
                                                valueOf2 = String.valueOf(ess.a);
                                                if (valueOf2.length() == 0) {
                                                    str2.concat(valueOf2);
                                                } else {
                                                    valueOf2 = new String(str2);
                                                }
                                            }
                                            fhc.a(new euw(ess.a, true, true, false, null, 0, str, 0, null));
                                            c.a(str);
                                        } else {
                                            obj2 = obj3;
                                        }
                                        b3 = b4;
                                        obj3 = obj2;
                                        obj = obj6;
                                    }
                                }
                                obj2 = 1;
                                if (this.j) {
                                }
                                obj2 = null;
                                if (blf.a) {
                                    str2 = "requesting more events for ";
                                    valueOf2 = String.valueOf(ess.a);
                                    if (valueOf2.length() == 0) {
                                        valueOf2 = new String(str2);
                                    } else {
                                        str2.concat(valueOf2);
                                    }
                                }
                                fhc.a(new euw(ess.a, true, true, false, null, 0, str, 0, null));
                                c.a(str);
                                b3 = b4;
                                obj3 = obj2;
                                obj = obj6;
                            }
                        } else {
                            gwb.a(blo.g(), 1839);
                        }
                    }
                    if (obj3 != null) {
                        z = blf.a;
                        bkq.b(blo.f(), blo.g().g(), "last_successful_sync_time", this.h);
                        c.c(str);
                        obj2 = obj;
                    } else {
                        z = blf.a;
                        bkq.b(blo.f(), blo.g().g(), "in_progress_sync_time", this.h);
                        obj2 = obj;
                    }
                } finally {
                    blo.c();
                    if (j() != null) {
                        j().a(blo.g().g(), "sync_all_new_events_response", glj.b(), 3);
                    }
                }
            } else {
                fhc.a(new evt(5, false, str));
                fhc.a(new evt(6, false, null));
                blo.t();
                blo.p();
                bkq.b(blo.f(), blo.g().g(), "last_successful_sync_time", 0);
                obj2 = 1;
            }
            blo.b();
            if (blf.a) {
                new StringBuilder(40).append("processSANE took ").append(glj.b() - b).append(" ms");
            }
            if (obj2 != null) {
                blf.d(blo);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                blf.d(blo, (String) it.next());
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                blf.c(blo, (String) it.next());
            }
        }
    }
}

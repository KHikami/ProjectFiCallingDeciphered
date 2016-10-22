package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: exh */
public final class exh extends evz {
    private static final long serialVersionUID = 4;
    private final byte[] g;
    private final edk[] h;

    exh(lrc lrc) {
        lox[] loxArr = null;
        super(lrc, lrc.responseHeader, -1);
        this.g = lrc.b != null ? nzf.a(lrc.b) : null;
        if (lrc.b != null) {
            loxArr = new lox[]{lrc.b};
        }
        this.h = evz.a(lrc.e, loxArr);
        if (evz.a) {
            String valueOf = String.valueOf(lrc);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("GetConversationResponse from:").append(valueOf);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        String str = "";
        ess a = ess.a(this.g, false, this.c.d);
        if (a == null || a.b == null || blf.a(blo.g(), a.b)) {
            String str2;
            Collection collection;
            Object obj;
            String valueOf;
            long c;
            Object length;
            int i;
            List list;
            String str3;
            int size;
            if (a != null) {
                str2 = a.a;
                collection = a.c;
            } else {
                str2 = str;
                collection = null;
            }
            euw euw = (euw) this.b;
            fok fok = euw.s;
            boolean z = euw.d;
            Object obj2 = (euw.l == null && euw.m == 0) ? 1 : null;
            if (TextUtils.isEmpty(euw.n)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (!(z || collection == null || collection.size() <= 0)) {
                iil.a("Events were not requested, eventList should be empty");
            }
            if (euw.q != null) {
                if (evz.a) {
                    valueOf = String.valueOf(euw.q.i());
                    c = euw.q.c();
                    int length2 = String.valueOf(str2).length() + 92;
                    length = String.valueOf(valueOf).length();
                    new StringBuilder(length2 + length).append("Adding saved pushEvent to GetConversationResponse ").append(str2).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                }
                i = 0;
                if (collection != null) {
                    i = collection.size();
                }
                List arrayList = new ArrayList(i + 1);
                if (i != 0) {
                    arrayList.addAll(collection);
                }
                arrayList.add(euw.q);
                list = arrayList;
            } else {
                Collection collection2 = collection;
            }
            if (glk.a("Babel", 3)) {
                if (a != null) {
                    if (list.size() > 0) {
                        valueOf = " earliest: " + ((fpl) list.get(0)).c() + " latest: " + ((fpl) list.get(list.size() - 1)).c();
                    } else {
                        valueOf = "";
                    }
                    str3 = "Babel";
                    size = list.size();
                    String valueOf2 = String.valueOf(Arrays.toString(a.e));
                    glk.b(str3, new StringBuilder(((String.valueOf(str2).length() + 189) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processGetConversationResponse conversationId: ").append(str2).append(" requestedEvents: ").append(z).append(" eventCount: ").append(size).append(valueOf).append(" continuationToken: ").append(valueOf2).append(" continuationEventTimestamp: ").append(a.f).append(" num entities: ").append(this.h == null ? 0 : this.h.length).toString(), new Object[0]);
                } else {
                    glk.b("Babel", "processGetConversationResponse requestedEvents: " + z, new Object[0]);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                long c2;
                if (list.size() > 0) {
                    c2 = ((fpl) list.get(0)).c();
                } else {
                    c2 = 0;
                }
                if (j() != null) {
                    j().a("get_conversation_response");
                }
                blo.a();
                long b = glj.b() * 1000;
                if (!(fok == null || ba.i(fok.l))) {
                    gwb.a(blo.g(), 2527);
                }
                try {
                    int g;
                    boolean z2;
                    Object obj3;
                    if (this.h != null) {
                        for (edk edk : this.h) {
                            if (edk != null) {
                                blo.a(edk, true);
                            }
                        }
                    }
                    if (a.b != null) {
                        String str4;
                        if (fok != null) {
                            str4 = fok.k;
                        } else {
                            str4 = null;
                        }
                        boolean a2 = blf.a(blo, a.b, a.h, str4, fhc, null, euw.s != null);
                        if (!a.b.m()) {
                            blo.a(0, blo.M(a.a), a.a);
                        }
                        z2 = a2;
                    } else {
                        z2 = false;
                    }
                    if (list.size() > 0) {
                        blf.a(blo, str2, 0, fhc, null);
                        ArrayList arrayList2 = new ArrayList();
                        Object obj4 = null;
                        int i2 = 0;
                        obj3 = null;
                        while (i2 < list.size()) {
                            fpl fpl = (fpl) list.get(i2);
                            if (fpl.f() != null) {
                                arrayList2.addAll(fpl.f());
                            }
                            if (fpl instanceof fpr) {
                                obj3 = 1;
                            } else {
                                if ((fpl instanceof fox) && z) {
                                    if (euw.l != null) {
                                        ((fox) fpl).a(4);
                                        obj3 = obj4;
                                    } else if (obj != null) {
                                        evz.a(blo.g(), euw.n, (fox) fpl);
                                        ((fox) fpl).a(2);
                                        obj3 = obj4;
                                    } else {
                                        ((fox) fpl).a(5);
                                    }
                                }
                                obj3 = obj4;
                            }
                            blf.a(blo, fpl, fhc, h(), i(), b);
                            i2++;
                            obj4 = obj3;
                            i = 1;
                        }
                        fhc.a(gwb.H(), blo, str2, arrayList2);
                        length = obj4;
                    } else {
                        obj3 = null;
                        length = null;
                    }
                    if (z && obj2 != null) {
                        long a3 = bkq.a(gwb.H(), blo.g().g(), "last_successful_sync_time", 0);
                        if (blf.a || evz.a) {
                            new StringBuilder(86).append("lastSuccessfulSyncTime ").append(a3).append(" oldestEventInListTime ").append(c2);
                        }
                        if (list.size() > 0 && c2 > a3) {
                            glk.a("Babel", "getting rid of older messages", new Object[0]);
                            blo.a(str2, Long.valueOf(c2), false);
                        }
                    }
                    if (obj != null) {
                        if (blf.a) {
                            str = "conversation is now synced:";
                            str3 = String.valueOf(str2);
                            if (str3.length() != 0) {
                                str.concat(str3);
                            } else {
                                str3 = new String(str);
                            }
                        }
                        if (fjj.c(blo.g().g()).b(euw.n)) {
                            boolean z3 = blf.a;
                            g = blo.g().g();
                            Context H = gwb.H();
                            c = bkq.a(H, g, "in_progress_sync_time", 0);
                            bkq.b(H, g, "last_successful_sync_time", c);
                            bkq.b(H, g, "in_progress_sync_time", c);
                        }
                    }
                    if (z) {
                        blf.a(blo, str2, a.e, a.f);
                    }
                    blo.b();
                    if (z2) {
                        blf.d(blo);
                    }
                    if (obj3 != null) {
                        blf.d(blo, str2);
                    }
                    if (length != null) {
                        blf.c(blo, str2);
                    }
                } finally {
                    blo.c();
                    if (j() != null) {
                        j().a(blo.g().g(), "get_conversation_response", glj.b(), 4);
                    }
                }
            } else if (fok != null) {
                if (!ba.i(fok.l)) {
                    gwb.a(blo.g(), 2528);
                }
                fhc.a(fok);
            }
            if (!TextUtils.isEmpty(str2) && a != null && a.b != null && euw.p != 0 && euw.p != a.b.y()) {
                new StringBuilder(94).append("SortTimestamp mismatched (").append(euw.p).append(" != ").append(a.b.y()).append(") forcing immediate SANE");
                RealTimeChatService.a(blo.g().g(), true, fjl.NO_DELAY, flt.HASH_SYNC);
                return;
            }
            return;
        }
        gwb.a(blo.g(), 1839);
    }
}

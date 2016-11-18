package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class exh extends evz {
    private static final long serialVersionUID = 4;
    private final byte[] f12438g;
    private final edk[] f12439h;

    exh(lrc lrc) {
        lox[] loxArr = null;
        super(lrc, lrc.responseHeader, -1);
        this.f12438g = lrc.f26201b != null ? nzf.m1029a(lrc.f26201b) : null;
        if (lrc.f26201b != null) {
            loxArr = new lox[]{lrc.f26201b};
        }
        this.f12439h = evz.m8121a(lrc.f26204e, loxArr);
        if (evz.f5798a) {
            String valueOf = String.valueOf(lrc);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("GetConversationResponse from:").append(valueOf);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        String str = "";
        ess a = ess.m14386a(this.f12438g, false, this.c.f12531d);
        if (a == null || a.f12192b == null || blf.m5798a(blo.m6056g(), a.f12192b)) {
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
                str2 = a.f12191a;
                collection = a.f12193c;
            } else {
                str2 = str;
                collection = null;
            }
            euw euw = (euw) this.b;
            fok fok = euw.f12329s;
            boolean z = euw.f12320d;
            Object obj2 = (euw.f12322l == null && euw.f12323m == 0) ? 1 : null;
            if (TextUtils.isEmpty(euw.f12324n)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (!(z || collection == null || collection.size() <= 0)) {
                iil.m21870a("Events were not requested, eventList should be empty");
            }
            if (euw.f12327q != null) {
                if (evz.f5798a) {
                    valueOf = String.valueOf(euw.f12327q.m15842i());
                    c = euw.f12327q.m15832c();
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
                arrayList.add(euw.f12327q);
                list = arrayList;
            } else {
                Collection collection2 = collection;
            }
            if (glk.m17973a("Babel", 3)) {
                if (a != null) {
                    if (list.size() > 0) {
                        valueOf = " earliest: " + ((fpl) list.get(0)).m15832c() + " latest: " + ((fpl) list.get(list.size() - 1)).m15832c();
                    } else {
                        valueOf = "";
                    }
                    str3 = "Babel";
                    size = list.size();
                    String valueOf2 = String.valueOf(Arrays.toString(a.f12195e));
                    glk.m17976b(str3, new StringBuilder(((String.valueOf(str2).length() + 189) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processGetConversationResponse conversationId: ").append(str2).append(" requestedEvents: ").append(z).append(" eventCount: ").append(size).append(valueOf).append(" continuationToken: ").append(valueOf2).append(" continuationEventTimestamp: ").append(a.f12196f).append(" num entities: ").append(this.f12439h == null ? 0 : this.f12439h.length).toString(), new Object[0]);
                } else {
                    glk.m17976b("Babel", "processGetConversationResponse requestedEvents: " + z, new Object[0]);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                long c2;
                if (list.size() > 0) {
                    c2 = ((fpl) list.get(0)).m15832c();
                } else {
                    c2 = 0;
                }
                if (m8137j() != null) {
                    m8137j().mo1670a("get_conversation_response");
                }
                blo.m5958a();
                long b = glj.m17963b() * 1000;
                if (!(fok == null || ba.m4646i(fok.f12310l))) {
                    gwb.m1823a(blo.m6056g(), 2527);
                }
                try {
                    int g;
                    boolean z2;
                    Object obj3;
                    if (this.f12439h != null) {
                        for (edk edk : this.f12439h) {
                            if (edk != null) {
                                blo.m6002a(edk, true);
                            }
                        }
                    }
                    if (a.f12192b != null) {
                        String str4;
                        if (fok != null) {
                            str4 = fok.f12309k;
                        } else {
                            str4 = null;
                        }
                        boolean a2 = blf.m5799a(blo, a.f12192b, a.f12198h, str4, fhc, null, euw.f12329s != null);
                        if (!a.f12192b.m15884m()) {
                            blo.m5961a(0, blo.m5921M(a.f12191a), a.f12191a);
                        }
                        z2 = a2;
                    } else {
                        z2 = false;
                    }
                    if (list.size() > 0) {
                        blf.m5801a(blo, str2, 0, fhc, null);
                        ArrayList arrayList2 = new ArrayList();
                        Object obj4 = null;
                        int i2 = 0;
                        obj3 = null;
                        while (i2 < list.size()) {
                            fpl fpl = (fpl) list.get(i2);
                            if (fpl.mo2063f() != null) {
                                arrayList2.addAll(fpl.mo2063f());
                            }
                            if (fpl instanceof fpr) {
                                obj3 = 1;
                            } else {
                                if ((fpl instanceof fox) && z) {
                                    if (euw.f12322l != null) {
                                        ((fox) fpl).m15854a(4);
                                        obj3 = obj4;
                                    } else if (obj != null) {
                                        evz.m8118a(blo.m6056g(), euw.f12324n, (fox) fpl);
                                        ((fox) fpl).m15854a(2);
                                        obj3 = obj4;
                                    } else {
                                        ((fox) fpl).m15854a(5);
                                    }
                                }
                                obj3 = obj4;
                            }
                            blf.m5778a(blo, fpl, fhc, m8135h(), m8136i(), b);
                            i2++;
                            obj4 = obj3;
                            i = 1;
                        }
                        fhc.m15306a(gwb.m1400H(), blo, str2, arrayList2);
                        length = obj4;
                    } else {
                        obj3 = null;
                        length = null;
                    }
                    if (z && obj2 != null) {
                        long a3 = bkq.m5659a(gwb.m1400H(), blo.m6056g().m5638g(), "last_successful_sync_time", 0);
                        if (blf.f3692a || evz.f5798a) {
                            new StringBuilder(86).append("lastSuccessfulSyncTime ").append(a3).append(" oldestEventInListTime ").append(c2);
                        }
                        if (list.size() > 0 && c2 > a3) {
                            glk.m17970a("Babel", "getting rid of older messages", new Object[0]);
                            blo.m5987a(str2, Long.valueOf(c2), false);
                        }
                    }
                    if (obj != null) {
                        if (blf.f3692a) {
                            str = "conversation is now synced:";
                            str3 = String.valueOf(str2);
                            if (str3.length() != 0) {
                                str.concat(str3);
                            } else {
                                str3 = new String(str);
                            }
                        }
                        if (fjj.m15425c(blo.m6056g().m5638g()).m15433b(euw.f12324n)) {
                            boolean z3 = blf.f3692a;
                            g = blo.m6056g().m5638g();
                            Context H = gwb.m1400H();
                            c = bkq.m5659a(H, g, "in_progress_sync_time", 0);
                            bkq.m5677b(H, g, "last_successful_sync_time", c);
                            bkq.m5677b(H, g, "in_progress_sync_time", c);
                        }
                    }
                    if (z) {
                        blf.m5791a(blo, str2, a.f12195e, a.f12196f);
                    }
                    blo.m6015b();
                    if (z2) {
                        blf.m5820d(blo);
                    }
                    if (obj3 != null) {
                        blf.m5821d(blo, str2);
                    }
                    if (length != null) {
                        blf.m5818c(blo, str2);
                    }
                } finally {
                    blo.m6028c();
                    if (m8137j() != null) {
                        m8137j().mo1669a(blo.m6056g().m5638g(), "get_conversation_response", glj.m17963b(), 4);
                    }
                }
            } else if (fok != null) {
                if (!ba.m4646i(fok.f12310l)) {
                    gwb.m1823a(blo.m6056g(), 2528);
                }
                fhc.m15308a(fok);
            }
            if (!TextUtils.isEmpty(str2) && a != null && a.f12192b != null && euw.f12326p != 0 && euw.f12326p != a.f12192b.m15896y()) {
                new StringBuilder(94).append("SortTimestamp mismatched (").append(euw.f12326p).append(" != ").append(a.f12192b.m15896y()).append(") forcing immediate SANE");
                RealTimeChatService.m9006a(blo.m6056g().m5638g(), true, fjl.NO_DELAY, flt.HASH_SYNC);
                return;
            }
            return;
        }
        gwb.m1823a(blo.m6056g(), 1839);
    }
}

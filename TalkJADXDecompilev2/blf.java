package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.provider.Telephony.Sms.Inbox;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import android.telephony.SmsMessage.MessageClass;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.Pair;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class blf extends gwb {
    public static final boolean a = false;
    public static final Object b = new Object();
    public static int c = 0;
    private static final Uri d;
    private static CharSequence e;
    private static final HashSet<Uri> f = new HashSet();

    static {
        kae kae = glk.d;
        String str = EsProvider.a;
        d = Uri.parse(new StringBuilder(String.valueOf(str).length() + 12).append("receiver://").append(str).append("/").toString());
    }

    public static void a(blo blo, fpl fpl, fhc fhc, long j, long j2, long j3) {
        if (fpl instanceof fpt) {
            fpt fpt = (fpt) fpl;
            String a = fpt.a();
            String d = fpt.d();
            blo.a(a, d, 1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MEO sync: conid: ").append(a).append(" msgid: ").append(d);
            if (fdq.F.b(blo.g().g())) {
                gwb.a(blo.g().g(), 2906, stringBuilder.toString(), true);
            }
            blf.d(blo, a);
        } else if (fpl instanceof fox) {
            fox fox = (fox) fpl;
            new fea().a(fox).a(false).a(j).c(j2).d(j3).f(fle.a(blo.f(), blo.h(), fox.a())).a().b(blo, fhc);
            blf.a(blo, fox);
        } else if (fpl instanceof fpr) {
            blf.a(blo, (fpr) fpl, fhc, false);
        } else if (fpl instanceof fph) {
            new flc((fph) fpl).b(blo, fhc);
        } else if (fpl instanceof fpo) {
            blf.a(blo, (fpo) fpl, fhc);
        } else if (fpl instanceof fpu) {
            new flh((fpu) fpl).c(blo);
        } else if (fpl instanceof fpn) {
            new flf((fpn) fpl).c(blo);
        }
    }

    public static void a(blo blo, evz evz, fhc fhc) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String str = "Babel_ConversationsData";
            String str2 = "processServerResponse of type ";
            String valueOf = String.valueOf(evz.getClass().getSimpleName());
            glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        evz.f = false;
        evz.a(blo, fhc);
        if (!evz.f) {
            str2 = "did not call through to super -- ";
            valueOf = String.valueOf(evz.getClass().getSimpleName());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            throw new IllegalStateException(valueOf);
        }
    }

    public static void a(blo blo, fhc fhc, boolean z, boolean z2, String str) {
        glk.a("Babel_ConversationsData", "requestWarmSync", new Object[0]);
        blo.a();
        try {
            long a = bkq.a(gwb.H(), blo.g().g(), "last_successful_sync_time", 0);
            String valueOf;
            if (a == 0) {
                if (a) {
                    valueOf = String.valueOf(blo.g().a());
                    new StringBuilder(String.valueOf(valueOf).length() + 58).append("Warm sync fall back to cold sync for: ").append(valueOf).append(", create SRC request");
                }
                fhc.a(new evt(5, false, null));
                fhc.a(new evt(6, false, null));
            } else {
                List<Pair> d = blo.d(a);
                List linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                String str2 = null;
                List list = linkedList2;
                for (Pair pair : d) {
                    List linkedList3;
                    String str3 = (String) pair.first;
                    valueOf = (String) pair.second;
                    if (a) {
                        glk.a("Babel_ConversationsData", new StringBuilder((String.valueOf(str3).length() + 38) + String.valueOf(valueOf).length()).append("Warm sync new event since last sync: ").append(str3).append(" ").append(valueOf).toString(), new Object[0]);
                    }
                    if (str2 == null || !str2.equals(str3)) {
                        if (str2 != null) {
                            linkedList.add(new evc(str2, list));
                        }
                        linkedList3 = new LinkedList();
                    } else {
                        str3 = str2;
                        linkedList3 = list;
                    }
                    linkedList3.add(valueOf);
                    list = linkedList3;
                    str2 = str3;
                }
                if (str2 != null) {
                    linkedList.add(new evc(str2, list));
                }
                fok evs = new evs(a, linkedList, blo.o(), z, z2, str);
                if (glk.a("Babel_ConversationsData", 3)) {
                    glk.a("Babel_ConversationsData", "SyncAllNewEventsRequest " + a + " noMissedEventsExpected=" + z + " suppressNotifications=" + z2, new Object[0]);
                }
                fhc.a(evs);
            }
            blo.b();
            Context f = blo.f();
            if (gwb.a(f, "babel_gsi_atwarmsync", true) && !((fzw) jyn.a(f, fzw.class)).a(blo.h())) {
                RealTimeChatService.b(blo.g(), true);
            }
        } finally {
            blo.c();
        }
    }

    public static void a(blo blo, String str, byte[] bArr, long j) {
        long i = blo.i(str);
        if (j <= i || i == 0) {
            blo.a(str, bArr, j);
        }
    }

    public static void a(blo blo, fox fox) {
        if (!blo.g().b().equals(fox.b())) {
            fqj fqj = new fqj(fox.a(), fox.b(), fox.c());
            ((bor) jyn.a(gwb.H(), bor.class)).a(fqj);
            RealTimeChatService.a(fqj);
        }
    }

    public static boolean a(blo blo, fpo fpo, fhc fhc) {
        int i;
        Object obj;
        boolean z;
        long j;
        boolean contains;
        long j2;
        int i2;
        String a = fpo.a();
        long c = fpo.c();
        if (a) {
            int e = fpo.e();
            int d = fpo.d();
            long h = fpo.h();
            String valueOf = String.valueOf(fpo.u());
            String valueOf2 = String.valueOf(fpo.g().toString());
            new StringBuilder(((String.valueOf(a).length() + 150) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processHangoutEventInTransaction conversationId: ").append(a).append(" mediaType: ").append(e).append(" event type ").append(d).append(" duration ").append(h).append(" transfer ").append(valueOf).append(" participants: ").append(valueOf2);
        }
        if (fpo.e() == 2) {
            i = 1;
        } else {
            i = 2;
        }
        if (i == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        int k = fpo.k();
        fwy fwy = null;
        if (fpo.d() == 1) {
            fwy = fwy.HANGOUT_STOP_EVENT;
            k = 10;
            z = true;
        } else {
            if (fpo.d() == 0 && fpo.u() != null) {
                if (blo.t(fpo.u()) == 2) {
                    k = 10;
                    z = false;
                }
            }
            z = false;
        }
        long j3 = -1;
        if (z) {
            bls e2 = blo.e(a);
            String str = null;
            if (e2.b == 1) {
                edo b = blo.g().b();
                if (b.a(fpo.b())) {
                    edo edo;
                    e = fpo.g().size();
                    if (e > 0) {
                        d = e;
                        for (edo edo2 : fpo.g()) {
                            if (b.a(edo2)) {
                                e = d - 1;
                            } else {
                                e = d;
                            }
                            d = e;
                        }
                    } else {
                        d = e;
                    }
                    if (d == 0) {
                        List arrayList = new ArrayList();
                        for (edk edk : e2.h) {
                            edo2 = edk.b;
                            if (!b.a(edo2)) {
                                arrayList.add(edo2);
                            }
                        }
                        if (arrayList.size() == 1) {
                            str = blo.a(a, arrayList);
                        }
                    }
                }
            }
            if (str == null) {
                str = blo.a(a, fpo.g());
            }
            j3 = blo.a(a, fpo.i(), fwx.ON_SERVER, fpo.b(), fwy, c, fpo.j(), 0, k, null, str, i, null);
            if (k == 10) {
                fhc.e();
                j = j3;
                switch (fpo.d()) {
                    case 1:
                        contains = fpo.g().contains(blo.g().b());
                        if (c > blo.n(a)) {
                            if (contains) {
                                j2 = fpo.j();
                                if (obj == null) {
                                    i2 = 10;
                                } else {
                                    i2 = 1;
                                }
                                blo.a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                            } else {
                                j2 = fpo.j();
                                if (obj == null) {
                                    i2 = 11;
                                } else {
                                    i2 = 8;
                                }
                                blo.a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                            }
                        }
                        i = 0;
                        RealTimeChatService.a(a, null);
                        break;
                    case 5:
                        RealTimeChatService.a(a, fpo.g());
                        break;
                }
                blo.a(i, c, a);
                return z;
            }
            fhc.a(c);
        }
        j = j3;
        switch (fpo.d()) {
            case 1:
                contains = fpo.g().contains(blo.g().b());
                if (c > blo.n(a)) {
                    if (contains) {
                        j2 = fpo.j();
                        if (obj == null) {
                            i2 = 1;
                        } else {
                            i2 = 10;
                        }
                        blo.a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                    } else {
                        j2 = fpo.j();
                        if (obj == null) {
                            i2 = 8;
                        } else {
                            i2 = 11;
                        }
                        blo.a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                    }
                }
                i = 0;
                RealTimeChatService.a(a, null);
                break;
            case 5:
                RealTimeChatService.a(a, fpo.g());
                break;
        }
        blo.a(i, c, a);
        return z;
    }

    public static boolean a(blo blo, String str, long j, fhc fhc, fpl fpl) {
        bls f = blo.f(str);
        if (f == null) {
            long j2;
            if (glk.a("Babel_ConversationsData", 3)) {
                glk.a("Babel_ConversationsData", new StringBuilder(String.valueOf(str).length() + 36).append("conversation ").append(str).append(" does not exist locally").toString(), new Object[0]);
            }
            if (j == 0) {
                j2 = 0;
            } else {
                j2 = j - 1;
            }
            blo.a(str, j2);
        } else if (a) {
            new StringBuilder(String.valueOf(str).length() + 52).append("conversation ").append(str).append(" exists locally,  metadataPresent ").append(f.e);
        }
        if (f != null && f.e) {
            return true;
        }
        fhc.a(new euw(str, true, true, true, null, 0, null, 0, fpl));
        return false;
    }

    public static void a(blo blo, List<fbv> list, String str, String str2, long j, long j2) {
        if (glk.a("Babel_ConversationsData", 3)) {
            glk.a("Babel_ConversationsData", "processContactErrorInTransaction", new Object[0]);
        }
        List arrayList = new ArrayList();
        String c = blo.c(str, (List) list);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        for (fbv fbv : list) {
            fbw fbw = fbv.a;
            edo edo = null;
            if (!TextUtils.isEmpty(fbw.a)) {
                edo = edo.a(fbw.a);
            } else if (TextUtils.isEmpty(fbw.b)) {
                glk.e("Babel_ConversationsData", "processContactErrorInTransaction: server sends empty ids!", new Object[0]);
            } else {
                edo = edo.b(fbw.b);
            }
            String valueOf;
            if (fbv.b == 3) {
                valueOf = String.valueOf(edo);
                glk.a("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 71).append("processContactErrorInTransaction: force OTR conflict error for invitee ").append(valueOf).toString(), new Object[0]);
                Object obj4 = obj3;
                obj3 = 1;
                obj2 = obj;
            } else {
                if (fbv.b == 4) {
                    obj = 1;
                    valueOf = String.valueOf(edo);
                    glk.a("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processContactErrorInTransaction: force OTR fork error for invitee ").append(valueOf).toString(), new Object[0]);
                }
                int i = 1;
                obj3 = obj2;
                obj2 = obj;
            }
            if (edo != null) {
                if (blo.c(edo) == null) {
                    arrayList.add(edo);
                }
                obj = obj2;
                obj2 = obj3;
                obj3 = obj4;
            } else {
                obj = obj2;
                obj2 = obj3;
                obj3 = obj4;
            }
        }
        if (arrayList.size() > 0) {
            fhc fhc = new fhc();
            fhc.a(blo.g());
            fhc.a(gwb.H(), blo, str, arrayList);
            fhc.d();
        }
        fwy fwy = fwy.ERROR;
        if (obj != null) {
            fwy = fwy.ERROR_FORK;
        } else if (obj2 != null && obj3 == null) {
            fwy = fwy.ERROR_FORCE_OTR_CONFLICT;
        }
        String valueOf2 = String.valueOf(fwy);
        glk.e("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf2).length() + 48).append("processContactErrorInTransaction: message error ").append(valueOf2).toString(), new Object[0]);
        blo.a(str, str2, fwx.ON_SERVER, blo.g().b(), fwy, j, j2, 0, 30, null, c);
        blo.a(str, str2, fwx.FAILED_TO_SEND, 0);
    }

    public static boolean a(blo blo, fpg fpg, long j, String str, fhc fhc, blj blj, boolean z) {
        Object obj;
        String a = fpg.a();
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String valueOf = String.valueOf(fpg.o());
            int size = fpg.k().size();
            int r = fpg.r();
            int s = fpg.s();
            String valueOf2 = String.valueOf(Arrays.toString(fpg.t()));
            boolean m = fpg.m();
            int n = fpg.n();
            boolean w = fpg.w();
            if (fpg.l() == null) {
                obj = null;
            } else {
                obj = Long.valueOf(fpg.l().b);
            }
            String valueOf3 = String.valueOf(obj);
            int u = fpg.u();
            long y = fpg.y();
            glk.a(str2, new StringBuilder(((((String.valueOf(a).length() + 413) + String.valueOf(valueOf).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processConversationInTransaction conversationId: ").append(a).append(", clientGeneratedId: ").append(valueOf).append(", requestClientGeneratedId: ").append(str).append(", participantCount: ").append(size).append(", notificationLevel: ").append(r).append(", status: ").append(s).append(", view: ").append(valueOf2).append(", hasActiveHangout: ").append(m).append(", isGroupLinkSharingEnabled: ").append(n).append(", isGuest: ").append(w).append(", selfReadState.latestReadTimestamp: ").append(valueOf3).append(", otrStatus: ").append(u).append(", sortTimestamp: ").append(y).append(", otrToggle: ").append(fpg.v()).append(", isTemporary: ").append(fpg.A()).toString(), new Object[0]);
        }
        if (z || fpg.s() != 1 || blo.t(a) != 1 || fpg.t() == null || fpg.t().length <= 0 || fpg.t()[0] != 2) {
            bmb a2;
            blx blx;
            Object obj2;
            if (j > 0) {
                if (a) {
                    new StringBuilder(71).append("got upperBoundTimestamp ").append(j).append(" calling deleteConversation");
                }
                blo.c(a, j);
                if (fpg.y() <= j) {
                    return false;
                }
            }
            if (fpg.d() == 1) {
                edo b = blo.g().b();
                for (edo edo : fpg.k()) {
                    if (!edo.equals(b)) {
                        bmh a3 = blo.a(edo, true, 1);
                        if (a3 != null) {
                            valueOf3 = a3.a;
                            a2 = blo.a(a, str, fpg.o(), valueOf3);
                            blx = a2.a;
                            obj2 = null;
                            if (a) {
                                valueOf3 = blx != null ? "(null)" : blx.a;
                                new StringBuilder(String.valueOf(valueOf3).length() + 70).append("getExistingMergedConversationId returned ").append(valueOf3).append(" conversationIdsMerged: ").append(a2.b);
                            }
                            if (blx != null) {
                                valueOf = null;
                            } else {
                                valueOf = blx.a;
                            }
                            if (valueOf == null) {
                                if (a.equals(valueOf)) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj == null || a2.b || blx.b == null || !Arrays.equals(blx.b, fpg.z())) {
                                    blo.a(valueOf, blx.c, fpg);
                                    blo.G(a);
                                    obj2 = obj;
                                } else {
                                    if (a) {
                                        valueOf3 = "Skipping update ";
                                        str2 = String.valueOf(gwb.c(blx.b));
                                        if (str2.length() != 0) {
                                            valueOf3.concat(str2);
                                        } else {
                                            str2 = new String(valueOf3);
                                        }
                                    }
                                    blf.c(fpg.g(), a);
                                    if (blj != null) {
                                        blj.a = blx.a;
                                    }
                                    return false;
                                }
                            }
                            blo.a(fpg);
                            if (fpg.s() == 1) {
                                fhc.a(fpg.c());
                            }
                            fhc.a(gwb.H(), blo, a, fpg.k());
                            blo.a(a, fpg.j(), fpg.i());
                            blo.a(fpg.k(), fpg.h(), a);
                            if (fpg.h() != null) {
                                for (esr esr : fpg.h()) {
                                    if (!(esr.a == null || TextUtils.isEmpty(esr.c))) {
                                        blo.a(esr);
                                    }
                                }
                            }
                            blf.b(blo, a);
                            if (obj2 != null) {
                                RealTimeChatService.f(blo.g(), valueOf, a);
                                blf.a(fhc, blo, a);
                            }
                            if (valueOf == null && blo.m(a, 3)) {
                                if (blj != null) {
                                    blj.a = a;
                                }
                                return false;
                            }
                            if (fpg.l() != null) {
                                blo.a(a, fpg.l().b, false, "serverresponse");
                            }
                            blf.c(fpg.g(), a);
                            blo.a(fpg.u(), fpg.v(), 1 + blo.y(a), a);
                            blo.h(a, fpg.y());
                            blo.a(a, fpg.f());
                            blo.c(a, fpg.A());
                            if (z) {
                                if (fpg.t() != null && fpg.t().length > 0 && fpg.t()[0] == 2) {
                                    RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), a, fpg.c(), false, false);
                                }
                                if (fpg.s() == 1) {
                                    fhc.a(new evh(a, 1));
                                    blo.Z(a);
                                }
                            }
                            if (blj != null) {
                                blj.a = a;
                            }
                            blo.a(blo, a);
                            return true;
                        }
                    }
                }
            }
            valueOf3 = null;
            a2 = blo.a(a, str, fpg.o(), valueOf3);
            blx = a2.a;
            obj2 = null;
            if (a) {
                if (blx != null) {
                }
                new StringBuilder(String.valueOf(valueOf3).length() + 70).append("getExistingMergedConversationId returned ").append(valueOf3).append(" conversationIdsMerged: ").append(a2.b);
            }
            if (blx != null) {
                valueOf = blx.a;
            } else {
                valueOf = null;
            }
            if (valueOf == null) {
                blo.a(fpg);
                if (fpg.s() == 1) {
                    fhc.a(fpg.c());
                }
            } else {
                if (a.equals(valueOf)) {
                    obj = null;
                } else {
                    obj = 1;
                }
                if (obj == null) {
                }
                blo.a(valueOf, blx.c, fpg);
                blo.G(a);
                obj2 = obj;
            }
            fhc.a(gwb.H(), blo, a, fpg.k());
            blo.a(a, fpg.j(), fpg.i());
            blo.a(fpg.k(), fpg.h(), a);
            if (fpg.h() != null) {
                for (esr esr2 : fpg.h()) {
                    blo.a(esr2);
                }
            }
            blf.b(blo, a);
            if (obj2 != null) {
                RealTimeChatService.f(blo.g(), valueOf, a);
                blf.a(fhc, blo, a);
            }
            if (valueOf == null) {
            }
            if (fpg.l() != null) {
                blo.a(a, fpg.l().b, false, "serverresponse");
            }
            blf.c(fpg.g(), a);
            blo.a(fpg.u(), fpg.v(), 1 + blo.y(a), a);
            blo.h(a, fpg.y());
            blo.a(a, fpg.f());
            blo.c(a, fpg.A());
            if (z) {
                RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), a, fpg.c(), false, false);
                if (fpg.s() == 1) {
                    fhc.a(new evh(a, 1));
                    blo.Z(a);
                }
            }
            if (blj != null) {
                blj.a = a;
            }
            blo.a(blo, a);
            return true;
        }
        blo.B(a);
        return true;
    }

    private static void c(List<fbd> list, String str) {
        for (fbd fbd : list) {
            if (a) {
                String valueOf = String.valueOf(fbd.a.b);
                new StringBuilder((String.valueOf(valueOf).length() + 82) + String.valueOf(str).length()).append("process userReadState  chatId: ").append(valueOf).append("  conversationId: ").append(str).append("  timestamp: ").append(fbd.b);
            }
            fqj fqj = new fqj(str, fbd.a, fbd.b);
            ((bor) jyn.a(gwb.H(), bor.class)).a(fqj);
            RealTimeChatService.a(fqj);
        }
    }

    public static void a(blo blo, fpr fpr, fhc fhc, boolean z) {
        Object obj;
        long c = fpr.c();
        String a = fpr.a();
        edo b = fpr.b();
        if (a) {
            int d = fpr.d();
            String valueOf = String.valueOf(b);
            if (fpr.g() == null) {
                obj = "(null)";
            } else {
                obj = Integer.valueOf(fpr.g().size());
            }
            String valueOf2 = String.valueOf(obj);
            new StringBuilder(((String.valueOf(a).length() + 119) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processMembershipChange conversationId: ").append(a).append(" type: ").append(d).append(" sender: ").append(valueOf).append(" participant count: ").append(valueOf2).append(" timestamp: ").append(c);
        }
        if (fpr.g().size() == 0) {
            String str = "Babel_ConversationsData";
            valueOf = "empty participants in membership change ";
            valueOf2 = String.valueOf(a);
            glk.e(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
        }
        edo edo;
        String a2;
        switch (fpr.d()) {
            case 1:
                Object obj2;
                if (RealTimeChatService.d(blo.g(), a) || b.a(blo.g().b())) {
                    obj2 = null;
                } else {
                    int i = 1;
                }
                if (z) {
                    for (edo edo2 : fpr.g()) {
                        blo.a(a, edo2, true);
                    }
                }
                a2 = blo.a(a, fpr.g());
                blo.a(a, fpr.c(), fpr.j(), 4, b, blo.a(a, fpr.i(), fwx.ON_SERVER, b, fwy.MEMBERSHIP_CHANGE_JOIN, c, fpr.j(), 0, fpr.k(), null, a2), fwx.ON_SERVER, null, a2);
                if (obj2 != null) {
                    fhc.a(fpr.c());
                    return;
                }
                return;
            case 2:
                fwx fwx;
                fwy fwy;
                a2 = null;
                if (fpr.g().size() > 0) {
                    edo2 = (edo) fpr.g().get(0);
                    if (edo2 != null) {
                        if (z && blo.g().b().equals(edo2)) {
                            if (a != null) {
                                blo.k(a);
                                obj = 1;
                            } else {
                                glk.d("Babel_ConversationsData", "attempt to process presence for a nonexistant conversation id [null]", new Object[0]);
                                obj = null;
                            }
                            if (obj != null) {
                                str = String.valueOf(c);
                                fwx = fwx.ON_SERVER;
                                if (fpr.e() == 1) {
                                    fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                                } else {
                                    fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                                }
                                blo.a(a, str, fwx, b, fwy, c, fpr.j(), 0, fpr.k(), null, a2);
                                return;
                            }
                            return;
                        }
                        if (z) {
                            blo.a(a, edo2, false);
                        }
                        List arrayList = new ArrayList();
                        arrayList.add(edo2);
                        a2 = blo.a(a, arrayList);
                        obj = null;
                        if (obj != null) {
                            str = String.valueOf(c);
                            fwx = fwx.ON_SERVER;
                            if (fpr.e() == 1) {
                                fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                            } else {
                                fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                            }
                            blo.a(a, str, fwx, b, fwy, c, fpr.j(), 0, fpr.k(), null, a2);
                            return;
                        }
                        return;
                    }
                }
                obj = null;
                if (obj != null) {
                    str = String.valueOf(c);
                    fwx = fwx.ON_SERVER;
                    if (fpr.e() == 1) {
                        fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                    } else {
                        fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                    }
                    blo.a(a, str, fwx, b, fwy, c, fpr.j(), 0, fpr.k(), null, a2);
                    return;
                }
                return;
            default:
                glk.d("Babel_ConversationsData", "Ignoring unsupported membership change event", new Object[0]);
                return;
        }
    }

    public static String a(blo blo, boolean z, String str, List<edk> list, List<bcg> list2, List<fbt> list3, boy boy, int i, int i2, boolean z2, fhc fhc, String str2) {
        blo.a();
        try {
            String b = blf.b(blo, z, str, list, list2, list3, boy, i, i2, z2, fhc, str2);
            blo.b();
            fhc.c();
            return b;
        } finally {
            blo.c();
        }
    }

    public static String b(blo blo, boolean z, String str, List<edk> list, List<bcg> list2, List<fbt> list3, boy boy, int i, int i2, boolean z2, fhc fhc, String str2) {
        int i3;
        String a;
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        int i4;
        List arrayList;
        fok eup;
        Object obj2;
        if (glk.a("Babel_ConversationsData", 3)) {
            glk.a("Babel_ConversationsData", "createConversationLocally:  num invitees " + list.size(), new Object[0]);
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        bko g = blo.g();
        edo b = g.b();
        int size = list.size() - 1;
        while (size >= 0) {
            int i9;
            edk edk = (edk) list.get(size);
            edo edo = ((edk) list.get(size)).b;
            if (b.a(edo.b, edo.a)) {
                i9 = i8;
                i3 = i7;
                i8 = i6;
                i7 = i5;
            } else {
                i6 |= TextUtils.isEmpty(edk.f());
                i5 |= TextUtils.isEmpty(edo.a);
                i3 = edk.i() | i7;
                i9 = gwb.b(gwb.H(), edk) | i8;
                i8 = i6;
                i7 = i5;
            }
            size--;
            i5 = i7;
            i7 = i3;
            i6 = i8;
            i8 = i9;
        }
        Object obj3 = (i6 == 0 && (list2 == null || list2.size() == 0)) ? 1 : null;
        Object obj4 = (i5 == 0 && (list2 == null || list2.size() == 0)) ? 1 : null;
        if (i2 != 0) {
            i7 = i2;
        } else if (obj3 == null) {
            i7 = 1;
        } else if (!g.m() || (i == 1 && i7 == 0 && i8 == 0)) {
            i7 = g.a(0);
        } else {
            i7 = 3;
        }
        if (boy != boy.NONE) {
            if (i == 2) {
                if (obj3 != null) {
                    a = blo.a((List) list, i7);
                } else if (obj4 != null) {
                    a = blo.b((List) list);
                } else {
                    a = null;
                }
                if (TextUtils.isEmpty(a)) {
                    i3 = 0;
                    j = 0;
                    str3 = a;
                } else {
                    bls e = blo.e(a);
                    i3 = e.r;
                    j = e.q;
                    str3 = a;
                }
            } else if (list.size() == 1 && ((list2 == null || list2.size() == 0) && i == 1)) {
                edo edo2 = ((edk) list.get(0)).b;
                if (edo2 == null || edo2.a()) {
                    glk.e("Babel_ConversationsData", "Server returned a conversation with empty participantId", new Object[0]);
                    i3 = 0;
                    j = 0;
                    str3 = null;
                } else {
                    if (b.a(edo2.b, edo2.a)) {
                        glk.e("Babel_ConversationsData", "Trying to start a one on one with self", new Object[0]);
                        i3 = 0;
                        j = 0;
                        str3 = null;
                    } else {
                        bmh a2 = blo.a(edo2, false, i7);
                        if (a2 != null) {
                            str4 = a2.a;
                            j = a2.c;
                            i3 = a2.d;
                            str3 = str4;
                        }
                    }
                }
            }
            if (str3 != null) {
                if (obj3 == null) {
                    str4 = blo.j();
                } else {
                    str4 = blo.i();
                }
                str5 = "Babel_ConversationsData";
                str6 = "Creating new conversation no match found. generated id: ";
                a = String.valueOf(str4);
                glk.a(str5, a.length() == 0 ? str6.concat(a) : new String(str6), new Object[0]);
                if (gwb.h(i7)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                j = 1000 * glj.a();
                if (z) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                str5 = blo.a(str, i, i7, j, str4, i4);
                blo.D(str5);
                blf.a(blo, str5, (List) list, (List) list2);
                for (edk edk2 : list) {
                    if (edk2.g()) {
                        blo.b(blo, str5);
                        break;
                    }
                }
                blo.a(blo, str5);
                if (!(obj == null || fhc == null)) {
                    arrayList = new ArrayList();
                    for (edk edk22 : list) {
                        if (list3 != null) {
                            gwb.a(edk22, (Collection) list3);
                        }
                        arrayList.add(edk22);
                    }
                    if (list2 != null) {
                        for (bcg bcg : list2) {
                            arrayList.add(gwb.b(bcg.b(), bcg.d()));
                        }
                    }
                    eup = new eup(str4, i, i7, str, arrayList, str2);
                    if (boy != boy.LOCAL_AND_SERVER) {
                        fhc.a(new euw(eup));
                    } else {
                        fhc.a(eup);
                    }
                }
                String str7 = str5;
                obj2 = 1;
                a = str7;
            } else {
                if (glk.a("Babel_ConversationsData", 3)) {
                    str6 = "Babel_ConversationsData";
                    String str8 = "Using existing conversation ";
                    a = String.valueOf(str3);
                    glk.a(str6, a.length() == 0 ? str8.concat(a) : new String(str8), new Object[0]);
                }
                blo.k(str3, -2147483647L);
                if (!z && r5 == 2) {
                    RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), str3, j, false, false);
                }
                if (obj3 != null && z2) {
                    blf.a(blo, (List) list);
                }
                a = str3;
                obj2 = null;
            }
            if (obj2 != null) {
                blf.d(blo, a);
            }
            return a;
        }
        i3 = 0;
        j = 0;
        str3 = null;
        if (str3 != null) {
            if (glk.a("Babel_ConversationsData", 3)) {
                str6 = "Babel_ConversationsData";
                String str82 = "Using existing conversation ";
                a = String.valueOf(str3);
                if (a.length() == 0) {
                }
                glk.a(str6, a.length() == 0 ? str82.concat(a) : new String(str82), new Object[0]);
            }
            blo.k(str3, -2147483647L);
            RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), str3, j, false, false);
            blf.a(blo, (List) list);
            a = str3;
            obj2 = null;
        } else {
            if (obj3 == null) {
                str4 = blo.i();
            } else {
                str4 = blo.j();
            }
            str5 = "Babel_ConversationsData";
            str6 = "Creating new conversation no match found. generated id: ";
            a = String.valueOf(str4);
            if (a.length() == 0) {
            }
            glk.a(str5, a.length() == 0 ? str6.concat(a) : new String(str6), new Object[0]);
            if (gwb.h(i7)) {
                obj = null;
            } else {
                obj = 1;
            }
            j = 1000 * glj.a();
            if (z) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            str5 = blo.a(str, i, i7, j, str4, i4);
            blo.D(str5);
            blf.a(blo, str5, (List) list, (List) list2);
            while (r6.hasNext()) {
                if (edk22.g()) {
                    blo.b(blo, str5);
                    break;
                }
            }
            blo.a(blo, str5);
            arrayList = new ArrayList();
            for (edk edk222 : list) {
                if (list3 != null) {
                    gwb.a(edk222, (Collection) list3);
                }
                arrayList.add(edk222);
            }
            if (list2 != null) {
                for (bcg bcg2 : list2) {
                    arrayList.add(gwb.b(bcg2.b(), bcg2.d()));
                }
            }
            eup = new eup(str4, i, i7, str, arrayList, str2);
            if (boy != boy.LOCAL_AND_SERVER) {
                fhc.a(eup);
            } else {
                fhc.a(new euw(eup));
            }
            String str72 = str5;
            obj2 = 1;
            a = str72;
        }
        if (obj2 != null) {
            blf.d(blo, a);
        }
        return a;
    }

    public static List<edk> a(bko bko, String str) {
        return new blo(gwb.H(), bko.g()).a(str, bko.b());
    }

    public static void a(blo blo, String str, List<edk> list) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String valueOf = String.valueOf(list);
            glk.a("Babel_ConversationsData", new StringBuilder((String.valueOf(str).length() + 87) + String.valueOf(valueOf).length()).append("forking a new conversation for an existing conversation ").append(str).append(" with additional participants: ").append(valueOf).toString(), new Object[0]);
        }
        Collection H = blo.H(str);
        H.addAll(list);
        RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), gwb.b(H), str);
    }

    public static void a(blo blo, String str, long j, fhc fhc, long j2, long j3) {
        if (glk.a("Babel_ConversationsData", 3)) {
            bme bme = new Object[0];
            glk.a("Babel_ConversationsData", "resendSmsLocally messageRowId: " + j, (Object[]) bme);
        }
        blo.a();
        long b = glj.b();
        try {
            bme = blo.b(j);
            blf.a(blo, j, fhc);
            blo.b();
            if (!(bme == null || bme.a == null)) {
                long b2 = glj.b();
                int g = blo.g().g();
                dvm a = ba.c().a(str);
                if (blo.a(bme.a)) {
                    a.b(bme.a);
                } else {
                    a.c(bme.a);
                }
                ba.a(g, j2 / 1000, 10, a.a((int) HttpStatusCodes.STATUS_CODE_FOUND));
                ba.a(g, j3 / 1000, 10, a.a(205));
                ba.a(g, b, 10, a.a(105));
                ba.a(g, b2, 10, a.a(106));
            }
            blf.d(blo, str);
        } finally {
            blo.c();
        }
    }

    public static void a(fhc fhc, blo blo, String str) {
        Cursor cursor = null;
        try {
            cursor = blo.a(str, fwx.QUEUED, new String[]{"_id"});
            if (a) {
                new StringBuilder(String.valueOf(str).length() + 51).append("sendUnsentMessages ").append(str).append(" cursor ").append(cursor == null ? -1 : cursor.getCount()).append(" message rows");
            }
            blo.a();
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        if (a) {
                            new StringBuilder(String.valueOf(str).length() + 54).append("sendUnsentMessages ").append(str).append(" sending msgID ").append(cursor.getLong(0));
                        }
                        blf.a(blo, cursor.getLong(0), fhc);
                    } while (cursor.moveToNext());
                }
            }
            fhc.a(new eve(str, blo.T(str)));
            blo.b();
            blo.c();
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static long a(blo blo, String str, fhc fhc, long j, boolean z) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "updateConversationWatermark conversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            long j2 = new Object[0];
            glk.a(str2, valueOf, (Object[]) j2);
        }
        blo.a();
        try {
            blv N = blo.N(str);
            if (N != null) {
                j2 = Math.max(N.a, blo.n(str));
                if (j != 0) {
                    if (j > j2) {
                        glk.e("Babel_ConversationsData", "New watermark: " + j + "; max watermark: " + j2, new Object[0]);
                        iil.a("New watermark greater than maximum possible watermark");
                    }
                    j2 = j;
                }
                if (j2 > N.b) {
                    blo.a(str, j2, true, "useraction");
                    bko g = blo.g();
                    ((ect) jyn.a(gwb.H(), ect.class)).a(g.g(), true);
                    blf.a(gwb.H(), g.g());
                    if (fhc != null && !blo.a(str)) {
                        if (z) {
                            fhc.a(new evw(str, j2));
                        }
                        fhc.e();
                        blo.b();
                        blf.d(blo, str);
                        return j2;
                    } else if (blo.b(str)) {
                        long V = blo.V(str);
                        if (V != -1) {
                            fyi.a(V, j2 / 1000);
                        }
                    }
                }
            }
            j2 = -1;
            blo.b();
            blf.d(blo, str);
            return j2;
        } finally {
            blo.c();
        }
    }

    public static void a(blo blo, String str, fhc fhc) {
        blo.a();
        try {
            fok euw;
            bls f = blo.f(str);
            if (f == null) {
                String valueOf = String.valueOf(glk.b(blo.g().a()));
                glk.d("Babel_ConversationsData", new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(str).length()).append("Requested older events for an unknown conversation Account:").append(valueOf).append(" conversationId:").append(str).toString(), new Object[0]);
                euw = new euw(str, true, true, false, null, -1, null, 0, null);
            } else if (f.p) {
                if (glk.a("Babel_ConversationsData", 3)) {
                    glk.a("Babel_ConversationsData", new StringBuilder(String.valueOf(str).length() + 78).append("Skip requesting old events for conversation ").append(str).append(" since it already has oldest event").toString(), new Object[0]);
                }
                blo.b();
                blo.c();
                return;
            } else {
                if (glk.a("Babel_ConversationsData", 3)) {
                    String valueOf2 = String.valueOf(Arrays.toString(f.f));
                    glk.a("Babel_ConversationsData", new StringBuilder((String.valueOf(valueOf2).length() + 74) + String.valueOf(str).length()).append("requesting events before token ").append(valueOf2).append(" eventId ").append(f.g).append(" conversation ").append(str).toString(), new Object[0]);
                }
                euw = new euw(str, false, true, false, f.f, f.g, null, 0, null);
            }
            fhc.a(euw);
            blo.b();
        } finally {
            blo.c();
        }
    }

    public static void a(blo blo, fhc fhc, int i) {
        gjn gjn = null;
        if (gjk.b) {
            gjn = new gjn().a("request_more_conversations").b("filterMode=" + i).a(blo.g());
        }
        blo.a();
        try {
            long c = blo.c(i);
            if (c != -2) {
                long a = bkq.a(gwb.H(), blo.g().g(), "last_successful_sync_time", 0);
                if (c == -1) {
                    c = blo.a(i);
                }
                if (a) {
                    new StringBuilder(52).append("requesting conversations before ").append(c);
                }
                if (glk.a("Babel_ConversationsData", 3)) {
                    glk.a("Babel_ConversationsData", "create SRC from scroll back, filter=" + i + ", oldestConversationTimestamp=" + c + ", suppressNotification=true", new Object[0]);
                }
                if (gjn != null) {
                    gjn.b("continuationEndTimeStamp=" + c);
                }
                if (c <= 0 && a == 0 && i == 1) {
                    if (gjn != null) {
                        gjn.b("empty");
                    }
                    if (glk.a("Babel_ConversationsData", 3)) {
                        glk.a("Babel_ConversationsData", "requestMoreConversations - db empty, warm sync executing doing nothing", new Object[0]);
                    }
                } else {
                    if (gjn != null) {
                        gjn.b("calledSRC");
                    }
                    fhc.a(new evt(c, i, true));
                }
            } else if (gjn != null) {
                gjn.b("continuationEndTimeStamp=exhausted").b("notifyExhausted").b();
            }
            blo.b();
            if (gjn != null) {
                gjn.b();
            }
        } finally {
            blo.c();
        }
    }

    public static void a(fhc fhc, String str, long j) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "requesting conversation metadata for ";
            String valueOf = String.valueOf(str);
            glk.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        fhc.a(new euw(str, true, false, false, null, 0, null, j, null));
    }

    public static void a(blo blo, String str) {
        blo.aa(str);
        blf.d(blo);
    }

    public static void a(blo blo) {
        blo.y();
        blf.d(blo);
    }

    public static void a(blo blo, String str, String str2, fwx fwx, int i) {
        blo.a(str, str2, fwx, i);
    }

    public static void a(blo blo, long j) {
        blo.a();
        try {
            String str = (String) blo.c(j).first;
            if (str != null) {
                blo.f(j);
                ContentValues contentValues = new ContentValues();
                contentValues.put("snippet_type", Integer.valueOf(7));
                contentValues.putNull("snippet_author_chat_id");
                contentValues.putNull("snippet_text");
                contentValues.putNull("snippet_image_url");
                contentValues.putNull("snippet_message_row_id");
                contentValues.putNull("snippet_status");
                contentValues.putNull("previous_latest_timestamp");
                contentValues.putNull("snippet_new_conversation_name");
                contentValues.putNull("snippet_participant_keys");
                contentValues.putNull("snippet_sms_type");
                blo.e().a("conversations", contentValues, "conversation_id=? AND snippet_message_row_id=?", new String[]{str, String.valueOf(j)});
                blo.b();
            }
            blo.c();
            if (str != null) {
                blf.d(blo, str);
            } else {
                blf.d(blo);
            }
        } catch (Throwable th) {
            blo.c();
        }
    }

    public static void a(blo blo, String str, List list, fhc fhc) {
        String str2;
        if (glk.a("Babel_ConversationsData", 3)) {
            String str3 = "Babel_ConversationsData";
            str2 = "inviteParticipantsLocally: conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.a(str3, valueOf, new Object[0]);
        }
        blo.a();
        try {
            gkr J = blo.J(str);
            boolean b = blo.b(str);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (fbw fbw : list) {
                if (fbw.c == null || b) {
                    edo b2 = fbw.b(gwb.H());
                    Object obj = null;
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        if (((edo) it.next()).a(b2)) {
                            obj = 1;
                            break;
                        }
                    }
                    Object obj2 = b ? fbw.d != null ? 1 : null : (fbw.a == null || fbw.a(gwb.H())) ? null : 1;
                    if (obj == null && obj2 != null) {
                        arrayList.add(fbw);
                    }
                    if (obj2 == null) {
                        arrayList2.add(fbw);
                    }
                } else {
                    arrayList.add(fbw.b(fbw.c, fbw.e));
                }
            }
            edo b3 = blo.g().b();
            String b4 = blo.b(str, arrayList2);
            if (arrayList2.size() > 0) {
                blo.a(str, blo.i(), fwx.FAILED_TO_SEND, b3, fwy.MEMBERSHIP_CHANGE_JOIN, blo.M(str), -1, 0, 10, null, b4);
            }
            if (arrayList.size() == 0) {
                blo.b();
                return;
            }
            b4 = blo.b(str, arrayList);
            str2 = blo.i();
            long M = blo.M(str);
            blo.a(str, M, -1, 4, blo.g().b(), blo.a(str, str2, fwx.QUEUED, b3, fwy.MEMBERSHIP_CHANGE_JOIN, M, -1, 0, 10, null, b4), fwx.QUEUED, null, b4);
            if (!blo.a(str)) {
                fhc.a(new eum(str2, str, arrayList, M));
            }
            blo.b();
            blo.c();
        } finally {
            blo.c();
        }
    }

    public static void b(blo blo, String str, fhc fhc) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "leaveConversationLocally: conversationId=";
            String valueOf = String.valueOf(str);
            glk.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        blo.a();
        try {
            blo.a(str, true);
            if (blo.a(str)) {
                blo.l(str, 1);
            } else {
                blo.C(str);
                fhc.a(new evf(blo.i(), str, null));
            }
            blo.b();
            blf.d(blo);
        } finally {
            blo.c();
        }
    }

    public static int a(blo blo, gjj gjj) {
        int w;
        int i = 0;
        blo.a();
        if (gjj == null) {
            try {
                w = blo.w(null);
            } catch (Throwable th) {
                blo.c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.w((String) it.next());
            }
            w = i;
        }
        blo.b();
        blo.c();
        if (w > 0) {
            bko g = blo.g();
            if (g != null) {
                blf.a(gwb.H(), g.g());
            }
        }
        return w;
    }

    public static int b(blo blo, gjj gjj) {
        int x;
        int i = 0;
        blo.a();
        if (gjj == null) {
            try {
                x = blo.x(null);
            } catch (Throwable th) {
                blo.c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.x((String) it.next());
            }
            x = i;
        }
        blo.b();
        blo.c();
        return x;
    }

    public static int c(blo blo, gjj gjj) {
        int b;
        int i = 0;
        blo.a();
        if (gjj == null) {
            try {
                b = blo.b(null, true);
            } catch (Throwable th) {
                blo.c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.b((String) it.next(), true);
            }
            b = i;
        }
        blo.b();
        blo.c();
        return b;
    }

    public static void a(blo blo, String str, long j) {
        blo.k(str, -1);
        if ((4 & j) != 0) {
            new fdb(str, 1).a(blo);
        }
        if ((2 & j) != 0) {
            RealTimeChatService.a(blo, str, null);
        }
        blf.d(blo);
    }

    public static void b(blo blo, String str, long j) {
        blo.k(str, -2147483648L);
        if ((8 & j) != 0) {
            blf.a(blo, str, true);
        }
        if ((16 & j) != 0) {
            blf.a(blo, str, false);
        }
        if ((4 & j) != 0) {
            long n = blo.n(str);
            if (a) {
                new StringBuilder(String.valueOf(str).length() + 64).append("processPendingArchive ").append(str).append(" ").append(n).append(" ").append(n);
            }
            RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), blo.g(), str, n, true, false);
        }
        if ((1 & j) != 0) {
            if (a) {
                String str2 = "processPendingLeave ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            RealTimeChatService.g(blo.g(), str);
        }
        if ((2 & j) != 0) {
            long n2 = blo.n(str);
            if (a) {
                new StringBuilder(String.valueOf(str).length() + 63).append("processPendingDelete ").append(str).append(" ").append(n2).append(" ").append(n2);
            }
            RealTimeChatService.a(blo.g(), str, n2);
        }
    }

    private static void a(blo blo, String str, boolean z) {
        if (a) {
            new StringBuilder(String.valueOf(str).length() + 25).append("processPendingMute ").append(str).append(" ").append(z);
        }
        RealTimeChatService.b(blo.g(), str, z ? 10 : 30);
    }

    private static void a(blo blo, long j, fhc fhc) {
        bme b = blo.b(j);
        if (b == null || b.b == null) {
            glk.d("Babel_ConversationsData", "No such message " + j, new Object[0]);
            return;
        }
        if (a) {
            String valueOf = String.valueOf(b.g);
            String str = b.b;
            new StringBuilder((String.valueOf(valueOf).length() + 78) + String.valueOf(str).length()).append("sending queued message type: ").append(valueOf).append(" conversationId: ").append(str).append(" timestamp: ").append(b.h);
        }
        switch (blh.a[b.g.ordinal()]) {
            case 1:
                if (gwb.h(b.x)) {
                    blf.a(blo, j, fhc, b);
                    return;
                } else {
                    ((cnt) jyn.a(gwb.H(), cnt.class)).b(blo.h(), b.b, j);
                    return;
                }
            case 2:
                blf.a(fhc, b, true);
                return;
            case 3:
                blf.a(fhc, b, false);
                return;
            case 4:
            case 5:
                fhc.a(new eum(b.a, b.b, blo.I(b.F), b.h));
                return;
            case 6:
                fhc.a(new evg(b.a, b.b, b.E, null));
                return;
            default:
                str = String.valueOf(b.g);
                glk.e("Babel", new StringBuilder(String.valueOf(str).length() + 30).append("unknown message type to send: ").append(str).toString(), new Object[0]);
                return;
        }
    }

    private static void a(fhc fhc, bme bme, boolean z) {
        int i;
        String str = bme.a;
        String str2 = bme.b;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        fhc.a(new coh(str, str2, i));
    }

    private static void a(blo blo, long j, fhc fhc, bme bme) {
        List<String> g = blf.g(blo, bme.b);
        long d = blo.d(bme.b, 1000);
        String str;
        String str2;
        if (bme.z == 1) {
            str = bme.o;
            if ("hangouts/location".equals(str)) {
                str2 = "image/jpeg";
            } else {
                str2 = str;
            }
            fhc.a(new fjs(bme.b, bme.a, d).a((String[]) g.toArray(new String[g.size()])).a(bme.C).b(bme.a()).c(bme.j).d(str2).a(bme.A).b(bme.B).c(bme.D).e(bme.G).d(bme.H).a(j).a());
        } else if (bme.z == 0) {
            long a = fyi.a(gwb.H(), (List) g);
            str2 = blo.U(bme.b);
            for (String str3 : g) {
                fhc.a(new fjx(bme.b, bme.a, d).a(str3).b(bme.a()).a(a).c(str2).b(j).a());
            }
        } else {
            glk.e("Babel_ConversationsData", "Resending unknown type of SMS message: " + bme.z, new Object[0]);
            return;
        }
        blo.a(j, fwx.SENDING, d);
    }

    private static void a(blo blo, String str, List<edk> list, List<bcg> list2) {
        if (a) {
            String str2 = "insertTemporaryConversationParticipants ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        for (edk a : list) {
            blo.a(str, a, true);
        }
        if (list2 != null) {
            for (bcg a2 : list2) {
                blo.a(str, a2);
            }
        } else {
            blo.G(str);
        }
        blf.b(blo, str);
    }

    private static void a(blo blo, List<edk> list) {
        ContentValues contentValues = new ContentValues();
        String[] strArr = new String[1];
        for (edk edk : list) {
            String f = edk.f();
            if (f != null) {
                contentValues.clear();
                edo edo = edk.b;
                contentValues.put("phone_id", f);
                strArr[0] = edo.b;
                blo.e().a("participants", contentValues, "chat_id=?", strArr);
            }
        }
    }

    public static void b(blo blo, String str) {
        List<edk> H = blo.H(str);
        List arrayList = new ArrayList(H.size());
        List arrayList2 = new ArrayList(H.size());
        String str2 = null;
        bjm a = ((bjn) jyn.a(blo.f(), bjn.class)).a(blo.h());
        try {
            for (edk edk : H) {
                blo.a(a, edk);
                CharSequence charSequence = edk.h;
                if (TextUtils.isEmpty(charSequence)) {
                    if (!edk.b.equals(blo.g().b())) {
                        arrayList2.add(edk.e);
                    }
                } else if (edk.b.equals(blo.g().b())) {
                    str2 = charSequence;
                } else {
                    arrayList.add(charSequence);
                }
            }
            String a2 = gwb.a(arrayList, arrayList2);
            String b = blf.b(blo, str, (List) H);
            if (glk.a("Babel_ConversationsData", 3)) {
                String str3 = "Babel_ConversationsData";
                String str4 = "generated name ";
                String valueOf = String.valueOf(b);
                glk.a(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
                str3 = "Babel_ConversationsData";
                str4 = "packed participant urls ";
                valueOf = String.valueOf(a2);
                glk.a(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            }
            blo.b(str, b, a2, str2);
        } finally {
            a.a();
        }
    }

    private static String b(blo blo, String str, List<edk> list) {
        StringBuilder stringBuilder = new StringBuilder();
        edo b = blo.g().b();
        bls f = blo.f(str);
        if (f != null && f.d != null) {
            return f.d;
        }
        Object obj;
        if (f == null || f.b == 1 || (f.b == 2 && gwb.h(f.c))) {
            obj = 1;
        } else {
            obj = null;
        }
        Object obj2 = null;
        for (edk edk : list) {
            Object obj3;
            if (edk.d != null) {
                obj3 = edk.e;
            } else if (edk.b != null) {
                if (obj2 == null && edk.b.equals(b) && list.size() > 1) {
                    obj2 = 1;
                } else {
                    if (e == null) {
                        CharSequence f2 = glq.f(gwb.H());
                        e = f2;
                        if (f2 == null) {
                            e = "";
                        }
                    }
                    if (obj2 == null && TextUtils.equals(edk.f(), e)) {
                        obj2 = 1;
                    } else {
                        obj3 = gwb.a(gwb.H(), edk, obj == null);
                    }
                }
            }
            if (!TextUtils.isEmpty(obj3)) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj3);
            }
        }
        return stringBuilder.toString();
    }

    public static void b(blo blo) {
        glk.a("Babel_ConversationsData", "NOTIFY ALL PARTICIPANTS", new Object[0]);
        bkf.a(blo.g(), null);
    }

    public static void c(blo blo, String str) {
        String str2 = "Babel_ConversationsData";
        String str3 = "NOTIFY PARTICIPANTS, conversation_id=";
        String valueOf = String.valueOf(str);
        glk.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        gwb.H().getContentResolver().notifyChange(EsProvider.a(EsProvider.h, blo.g().g()), null);
        bkf.a(blo.g(), str);
    }

    public static void c(blo blo) {
        glk.a("Babel_ConversationsData", "NOTIFY ALL MESSAGES", new Object[0]);
        blf.d(blo, null);
    }

    public static void a() {
        synchronized (b) {
            if (c <= 0) {
                throw new IllegalStateException("sPendingChangeNotificationsCount is " + c);
            }
            int i = c - 1;
            c = i;
            if (i == 0) {
                ContentResolver contentResolver = gwb.H().getContentResolver();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (blf.i(uri)) {
                        blf.a(gwb.H(), Integer.parseInt(uri.getQueryParameter("account_id")));
                    } else {
                        contentResolver.notifyChange(uri, null);
                    }
                }
                f.clear();
            }
        }
    }

    private static void g(Uri uri) {
        synchronized (b) {
            if (c != 0) {
                f.add(uri);
            } else if (blf.i(uri)) {
                blf.a(gwb.H(), Integer.parseInt(uri.getQueryParameter("account_id")));
            } else {
                gwb.H().getContentResolver().notifyChange(uri, null);
            }
        }
    }

    public static void d(blo blo, String str) {
        String valueOf;
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "NOTIFY MESSAGES, conversation_id=";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.a(str2, valueOf, new Object[0]);
        }
        gid gid = (gid) jyn.a(blo.f(), gid.class);
        bko g = blo.g();
        blf.g(EsProvider.a(EsProvider.h, g.g()));
        Set set = null;
        if (str != null) {
            set = blo.ab(str);
        }
        String str4;
        if (r1 != null && r1.size() > 0) {
            for (String valueOf2 : r1) {
                if (glk.a("Babel_ConversationsData", 3)) {
                    str4 = "Babel_ConversationsData";
                    String str5 = "NOTIFY MESSAGES message id = ";
                    str2 = String.valueOf(valueOf2);
                    glk.a(str4, str2.length() != 0 ? str5.concat(str2) : new String(str5), new Object[0]);
                }
                blf.g(EsProvider.a(g, valueOf2));
            }
        } else if (str != null) {
            String str6 = "Babel_ConversationsData";
            str4 = "NOTIFY MESSAGES no messages yet for conversation id = ";
            str2 = String.valueOf(str);
            glk.d(str6, str2.length() != 0 ? str4.concat(str2) : new String(str4), new Object[0]);
            blf.g(EsProvider.a(g, str));
            ayo bow = new bow(str, g.g(), box.UNSPECIFIED);
            gid.a(bow, bow.a());
        } else {
            glk.e("Babel_ConversationsData", "NOTIFY MESSAGES no message/conversation yet!", new Object[0]);
        }
        blf.g(EsProvider.b(g, str));
        blf.g(blf.b(g.g()));
    }

    public static void e(blo blo, String str) {
        if (glk.a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "NOTIFY EVENT SUGGESTIONS, conversation_id=";
            String valueOf = String.valueOf(str);
            glk.a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        blf.g(EsProvider.c(blo.g().g(), str));
    }

    public static void d(blo blo) {
        blf.a(blo.g().g());
    }

    public static void a(int i) {
        blf.g(EsProvider.a(EsProvider.h, i));
        blf.g(EsProvider.a(EsProvider.i, i));
        blf.g(EsProvider.a(EsProvider.j, i));
        blf.g(blf.b(i));
    }

    public static void f(blo blo, String str) {
        blf.a(blo.g());
        ayo bow = new bow(str, blo.h(), box.UNSPECIFIED);
        ((gid) jyn.a(blo.f(), gid.class)).a(bow, bow.a());
    }

    public static void a(bko bko) {
        blf.g(EsProvider.a(EsProvider.i, bko.g()));
        blf.g(EsProvider.a(EsProvider.h, bko.g()));
        blf.g(blf.b(bko.g()));
    }

    public static void a(bko bko, String str, String str2) {
        if (str2 != null) {
            blo blo = new blo(gwb.H(), bko.g());
            blo.a();
            try {
                blo.c(str, str2);
                blo.b();
            } finally {
                blo.c();
            }
        } else {
            glk.e("Babel_ConversationsData", "revertConversationName: empty name", new Object[0]);
        }
    }

    public static void a(bko bko, String str, int i) {
        new blo(gwb.H(), bko.g()).g(str, i);
    }

    public static void a(bko bko, Intent intent, boolean z) {
        blf.a(bko, (Uri) intent.getParcelableExtra("uri"), intent.getLongExtra("notification_row_id", -1), null, z, false);
    }

    private static void a(bko bko, Uri uri, long j, Boolean bool, boolean z, boolean z2) {
        if (uri != null) {
            Object obj;
            String n;
            blo blo = new blo(gwb.H(), bko.g());
            if (j <= 0) {
                obj = null;
            } else if (z) {
                blo.m(j);
                obj = null;
            } else {
                n = blo.n(j);
                blo.f(j);
                String str = n;
            }
            fxp e = fyi.e(uri);
            if (e == null) {
                glk.e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: failed to load mms", new Object[0]);
            } else if (e.w.size() <= 0) {
                glk.e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS message has no part", new Object[0]);
            } else {
                List a = fyi.a(e.r);
                if (a == null || a.size() <= 0) {
                    glk.e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS message has no recipient", new Object[0]);
                    return;
                }
                edo b;
                String str2;
                if (z2) {
                    b = blo.g().b();
                    str2 = null;
                } else {
                    n = fyi.a(a, e.m);
                    if (TextUtils.isEmpty(n)) {
                        b = null;
                        str2 = n;
                    } else {
                        b = gwb.d(gwb.H(), n);
                        str2 = n;
                    }
                }
                if (b == null) {
                    glk.e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS has no From: id=" + e.m + " type=" + e.n + " thread_id=" + e.r, new Object[0]);
                    return;
                }
                edo edo;
                long j2 = e.q;
                boolean a2 = blf.a(b);
                if (a2) {
                    edo = b;
                } else {
                    edo = null;
                }
                n = fyi.a(blo, edo, a);
                if (TextUtils.isEmpty(n)) {
                    glk.e("Babel_ConversationsData", "EsConversationsData.processNewMms: empty conversation id", new Object[0]);
                    return;
                }
                bls e2 = blo.e(n);
                boolean d = RealTimeChatService.d(bko, n);
                if (bool == null) {
                    bool = Boolean.valueOf(d);
                }
                fyi.a(uri, gwb.b(bool));
                int k = e.k();
                boolean i = e.i();
                Object obj2 = (k > 1 || (k > 0 && !i)) ? 1 : null;
                int a3 = fle.a(blo.f(), bko.g(), n);
                fea f = new fea().a(n).a(b).e(j2).b(blo.i()).c(e.e()).b(e.l()).b(false).a(fwx.ON_SERVER).b(3).e(gwb.a(uri.toString())).c(e.s).g(e.h()).f(e.o);
                int i2 = obj2 != null ? 9 : i ? 3 : 2;
                f.d(i2).g(str2).h(fyi.a(a, str2)).c(true).e(1).f(a3).a().a(blo, new fhc());
                blo.a();
                try {
                    blo.h(n, j2);
                    blo.n(n, e.r);
                    if (!(a2 || d || e2.v != 30)) {
                        ((ect) jyn.a(gwb.H(), ect.class)).a(bko.g(), false);
                    }
                    if (gwb.b(bool)) {
                        blo.a(n, j2, false, "processnewsms");
                    } else if (a2) {
                        blo.w(n);
                    }
                    blo.b();
                    blf.d(blo, n);
                    if (!(TextUtils.equals(n, obj) || j <= 0 || z)) {
                        RealTimeChatService.i.post(new fhs(obj, bko, new blg(str2)));
                    }
                    blf.h(uri);
                    if (str2 != null) {
                        bkq.a(gwb.H(), bko.g(), "received_mms_count_since_last_upload");
                    }
                } finally {
                    blo.c();
                }
            }
        }
    }

    public static void a(bko bko, Intent intent) {
        ObjectOutputStream objectOutputStream;
        SmsMessage[] messagesFromIntent = Intents.getMessagesFromIntent(intent);
        String stringExtra = intent.getStringExtra("format");
        if (messagesFromIntent == null || messagesFromIntent.length <= 0) {
            glk.e("Babel_ConversationsData", "processReceivedSms: null or zero message", new Object[0]);
            return;
        }
        int length = messagesFromIntent.length;
        int i = 0;
        while (i < length) {
            try {
                messagesFromIntent[i].getDisplayMessageBody();
                i++;
            } catch (NullPointerException e) {
                glk.e("Babel_ConversationsData", "processReceivedSms: NPE inside SmsMessage", new Object[0]);
                return;
            }
        }
        if (fyi.g()) {
            long timestampMillis = messagesFromIntent[0].getTimestampMillis();
            Object[] objArr = (Object[]) intent.getSerializableExtra("pdus");
            String valueOf;
            try {
                valueOf = String.valueOf("smsdump-");
                String valueOf2 = String.valueOf(Long.toString(timestampMillis));
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                File file = new File(Environment.getExternalStorageDirectory(), valueOf2);
                if (file.exists()) {
                    file.delete();
                }
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                objectOutputStream.writeObject(objArr);
                objectOutputStream.flush();
                objectOutputStream.close();
            } catch (Throwable e2) {
                valueOf = String.valueOf(e2);
                glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 9).append("dumpSms: ").append(valueOf).toString(), e2);
            } catch (Throwable th) {
                objectOutputStream.close();
            }
        }
        if (messagesFromIntent[0].getMessageClass() == MessageClass.CLASS_0) {
            SmsMessage smsMessage = messagesFromIntent[0];
            Context H = gwb.H();
            H.startActivity(new Intent(H, ClassZeroActivity.class).putExtra("pdu", smsMessage.getPdu()).putExtra("format", stringExtra).putExtra("account_id", bko.g()).setFlags(402653184));
            return;
        }
        blf.a(messagesFromIntent, bko, intent.getIntExtra("errorCode", 0), null);
        bkq.a(gwb.H(), bko.g(), "received_sms_count_since_last_upload");
    }

    public static void a(SmsMessage[] smsMessageArr, bko bko, int i, Boolean bool) {
        Context H = gwb.H();
        ContentValues a = fyi.a(H, smsMessageArr, i);
        String asString = a.getAsString("address");
        String asString2 = a.getAsString("body");
        if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
            glk.e("Babel_ConversationsData", "EsConversationsData.storeSmsMessage: empty sender or body", new Object[0]);
            return;
        }
        edo edo;
        blo blo = new blo(gwb.H(), bko.g());
        edo d = gwb.d(gwb.H(), asString);
        boolean a2 = blf.a(d);
        if (a2) {
            edo = d;
        } else {
            edo = null;
        }
        String a3 = fyi.a(blo, edo, asString);
        if (TextUtils.isEmpty(a3)) {
            glk.e("Babel_ConversationsData", "EsConversationsData.storeSmsMessage: empty conversation id", new Object[0]);
            return;
        }
        String a4;
        bls e = blo.e(a3);
        boolean d2 = RealTimeChatService.d(bko, a3);
        if (bool == null) {
            bool = Boolean.valueOf(d2);
        }
        long a5 = gwb.a(fyi.a(smsMessageArr[0], blo.d(a3, 1000) / 1000));
        a.put("date", Long.valueOf(a5));
        a.put("read", gwb.b(bool) ? Integer.valueOf(1) : Integer.valueOf(0));
        if (gwb.a(H.getContentResolver(), Inbox.CONTENT_URI, a) != null) {
            a4 = gwb.a(gwb.a(H.getContentResolver(), Inbox.CONTENT_URI, a).toString());
        } else {
            glk.e("Babel_ConversationsData", "storeSmsMessage: failed to insert SMS to telephony", new Object[0]);
            a4 = null;
        }
        long j = 1000 * a5;
        Long asLong = a.getAsLong("date_sent");
        if (asLong == null) {
            a5 = 0;
        } else {
            a5 = gwb.a(asLong) * 1000;
        }
        new fea().a(a3).a(d).e(j).b(blo.i()).c(asString2).b(false).a(fwx.ON_SERVER).b(3).e(a4).f(a5).d(2).g(asString).c(true).e(0).f(fle.a(H, bko.g(), a3)).a().a(blo, new fhc());
        blo.a();
        try {
            blo.h(a3, j);
            Integer asInteger = a.getAsInteger("reply_path_present");
            a4 = a.getAsString("service_center");
            if (asInteger == null || gwb.a(asInteger) != 1) {
                blo.l(a3, null);
            } else {
                blo.l(a3, a4);
            }
            blo.n(a3, gwb.a(a.getAsLong("thread_id")));
            if (!(a2 || d2 || e.v != 30)) {
                ((ect) jyn.a(H, ect.class)).a(bko.g(), false);
            }
            if (gwb.b(bool)) {
                blo.a(a3, j, false, "storesms");
            } else if (a2) {
                blo.w(a3);
            }
            blo.b();
            blf.d(blo, a3);
        } finally {
            blo.c();
        }
    }

    public static void a(blo blo, String str, String str2, Uri uri, long j, long j2, boolean z, long j3, long j4) {
        try {
            blo.a();
            Long h = blo.h(str, str2);
            if (h == null) {
                String str3 = "Babel_ConversationsData";
                String str4 = "processSmsMmsSendResponse: received response for nonexistant  clientGeneratedId ";
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.e(str3, valueOf, new Object[0]);
            } else {
                if (z) {
                    blf.a(blo.g(), uri, j3, Boolean.valueOf(true), false, true);
                }
                blo.a(str, gwb.a(h), j2, 0);
                blo.a(str, str2, uri, j);
                blo.h(str, j2);
                blo.n(str, j4);
            }
            blo.b();
            blf.d(blo, str);
            blf.h(uri);
        } finally {
            blo.c();
        }
    }

    private static void h(Uri uri) {
        if (uri != null && uri.getAuthority() != null) {
            String toLowerCase = uri.getAuthority().toLowerCase(Locale.US);
            int i = -1;
            if ("sms".equals(toLowerCase)) {
                i = 0;
            } else if ("mms".equals(toLowerCase)) {
                i = 1;
            }
            if (i >= 0) {
                fzb.b(i, fyi.c(uri));
            }
        }
    }

    public static void a(int i, aif aif) {
        bko e = fde.e(i);
        if (e == null) {
            glk.e("Babel_ConversationsData", "EsConversationsData.processMmsNotification: no account", new Object[0]);
            return;
        }
        blo blo = new blo(gwb.H(), e.g());
        String a = fyi.a(aif.d(), "UTF-8");
        byte[] g = aif.g();
        String a2 = fyi.a(g, "UTF-8");
        aic c = aif.c();
        String c2 = c != null ? c.c() : null;
        if (c2 != null && c2.contains("@") && c2.contains("<")) {
            Rfc822Token[] tokenize = Rfc822Tokenizer.tokenize(c2);
            if (tokenize.length > 0) {
                for (Rfc822Token rfc822Token : tokenize) {
                    if (rfc822Token != null && !TextUtils.isEmpty(rfc822Token.getAddress())) {
                        c2 = rfc822Token.getAddress();
                        break;
                    }
                }
            }
        }
        long f = aif.f();
        long e2 = aif.e();
        boolean a3 = blf.a(gwb.d(gwb.H(), c2));
        if (!fyi.d() || a3) {
            blf.a(blo, a, a2, c2, a3, f, e2, 0, bc.gX);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content_location", a);
        contentValues.put("transaction_id", a2);
        contentValues.put("from_address", c2);
        contentValues.put("message_size", Long.valueOf(f));
        contentValues.put("expiry", Long.valueOf(e2));
        RealTimeChatService.a(e.g(), a, g, blo.a(contentValues), true);
    }

    private static void a(blo blo, String str, String str2, String str3, boolean z, long j, long j2, int i, int i2) {
        edo edo;
        String a;
        bko g = blo.g();
        Context H = gwb.H();
        Resources resources = H.getResources();
        if (TextUtils.isEmpty(str3)) {
            edo = gwb.A().b;
            a = fyi.a(blo, z, Arrays.asList(new edk[]{r2}));
        } else {
            edo = gwb.d(gwb.H(), str3);
            a = fyi.a(blo, z ? edo : null, str3);
        }
        if (TextUtils.isEmpty(a)) {
            glk.e("Babel_ConversationsData", "EsConversationsData.storeMmsNotificationMessage: failed to get conv.", new Object[0]);
            return;
        }
        long d = blo.d(a, 1000);
        Object[] objArr = new Object[2];
        String valueOf = String.valueOf(String.valueOf(fyi.b(j)));
        String valueOf2 = String.valueOf(resources.getString(bc.fH));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        objArr[0] = valueOf2;
        objArr[1] = DateUtils.formatDateTime(H, 1000 * j2, 131097);
        new fea().a(a).a(edo).e(d).b(blo.i()).a(gwb.a(resources.getString(i2, objArr), 2)).b(false).a(i == 0 ? fwx.ON_SERVER : fwx.FAILED_TO_SEND).a(i).b(3).e(gwb.a(str, str2)).d(2).c(true).e(2).a().a(blo, new fhc());
        blo.a();
        try {
            blo.g(a, d);
            if (z) {
                blo.w(a);
            } else if (!RealTimeChatService.d(blo.g(), a)) {
                ((ect) jyn.a(H, ect.class)).a(g.g(), false);
            }
            blo.b();
        } finally {
            blo.c();
        }
    }

    public static void a(bko bko, long j, boolean z, int i) {
        if (j < 0) {
            glk.e("Babel_ConversationsData", "displayMmsDownloadFailure: invalid notification row id " + j, new Object[0]);
            return;
        }
        blo blo = new blo(gwb.H(), bko.g());
        if (z) {
            String[] strArr = bli.a;
            String valueOf = String.valueOf("_id=");
            Cursor a = blo.e().a("mms_notification_inds", strArr, new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(j).toString(), null, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        blf.a(blo, a.getString(0), a.getString(1), a.getString(2), false, a.getLong(3), a.getLong(4), i, bc.gX);
                        blo.m(j);
                    }
                    a.close();
                    return;
                } catch (Throwable th) {
                    a.close();
                }
            } else {
                return;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i == 0 ? fwx.ON_SERVER.ordinal() : fwx.FAILED_TO_SEND.ordinal()));
        contentValues.put("sending_error", Integer.valueOf(i));
        String valueOf2 = String.valueOf("_id=");
        blo.a(contentValues, new StringBuilder(String.valueOf(valueOf2).length() + 20).append(valueOf2).append(j).toString(), null);
        blf.b(blo, j);
    }

    public static void b(blo blo, long j) {
        bme b = blo.b(j);
        if (b != null) {
            blf.d(blo, b.b);
        }
    }

    public static void b(bko bko, Intent intent) {
        SmsMessage a = fyi.a(intent);
        if (a == null) {
            glk.e("Babel_ConversationsData", "EsConversationsData.processSmsDeliveryReport: empty report message", new Object[0]);
            return;
        }
        long parseId = ContentUris.parseId(intent.getData());
        if (parseId < 0) {
            glk.e("Babel_ConversationsData", "EsConversationsData.processSmsDeliveryReport: can't find message", new Object[0]);
            return;
        }
        try {
            int status = a.getStatus();
            long a2 = glj.a();
            blo blo = new blo(gwb.H(), bko.g());
            blo.a(parseId, status, 1000 * a2);
            blf.b(blo, parseId);
            String n = gwb.n(blo.g(parseId));
            if (n != null) {
                fyi.a(n, status, a2);
            }
        } catch (NullPointerException e) {
            glk.e("Babel_ConversationsData", "processSmsDeliveryReport: NPE inside SmsMessage", new Object[0]);
        }
    }

    public static void b() {
        int e = fyi.e();
        glk.c("Babel_ConversationsData", "Message purging: deleted " + e + " media messages in telephony", new Object[0]);
        if (e > 0) {
            bko k = fde.k();
            if (k != null) {
                blo blo = new blo(gwb.H(), k.g());
                glk.c("Babel_ConversationsData", "Message purging: deleted " + blo.x() + " media messages in Hangouts", new Object[0]);
                blf.c(blo);
            }
        }
    }

    public static void a(long j) {
        long a = glj.a() - j;
        int c = fyi.c(a);
        glk.c("Babel_ConversationsData", "Message purging: deleted " + c + " old sms/mms messages in telephony", new Object[0]);
        if (c > 0) {
            bko k = fde.k();
            if (k != null) {
                blo blo = new blo(gwb.H(), k.g());
                glk.c("Babel_ConversationsData", "Message purging: deleted " + blo.l(a * 1000) + " old sms/mms messages in Hangouts", new Object[0]);
                blf.c(blo);
            }
        }
    }

    public static void a(bko bko, String str, String str2, String str3) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str2));
        if (ba.c(str3) || "hangouts/gv_voicemail".equals(str3)) {
            RealTimeChatService.m(bko, str2);
        } else if (ba.d(str3)) {
            RealTimeChatService.e(bko, str, str2);
        }
    }

    public static String b(bko bko, String str, String str2, String str3) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str2));
        String X = new blo(gwb.H(), bko.g()).X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        blf.a(bko, str, str2, str3);
        return null;
    }

    public static List<String> g(blo blo, String str) {
        List<edk> H = blo.H(str);
        List<String> arrayList = new ArrayList();
        for (edk f : H) {
            Object f2 = f.f();
            if (!TextUtils.isEmpty(f2)) {
                arrayList.add(f2.trim());
            }
        }
        return arrayList;
    }

    public static void a(bko bko, fhc fhc, String str) {
        blo blo = new blo(gwb.H(), bko.g());
        blo.g(str, 0);
        blf.a(fhc, blo, str);
    }

    public static void b(bko bko, String str) {
        Throwable e;
        aid aid = null;
        if (TextUtils.isEmpty(str)) {
            glk.e("Babel_ConversationsData", "receiveSmsFromDumpFile: empty dump file name", new Object[0]);
        } else if (str.startsWith("smsdump-")) {
            ObjectInputStream objectInputStream;
            try {
                r2 = String.valueOf(Environment.getExternalStorageDirectory());
                objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new StringBuilder((String.valueOf(r2).length() + 1) + String.valueOf(str).length()).append(r2).append("/").append(str).toString())));
                Object[] objArr = (Object[]) objectInputStream.readObject();
                objectInputStream.close();
                if (objArr == null || objArr.length <= 0) {
                    glk.e("Babel_ConversationsData", "receiveSmsFromDumpFile: empty data", new Object[0]);
                }
                SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                }
                blf.a(smsMessageArr, bko, 0, null);
            } catch (IOException e2) {
                e = e2;
                r2 = String.valueOf(e);
                glk.d("Babel_ConversationsData", new StringBuilder(String.valueOf(r2).length() + 24).append("receiveSmsFromDumpFile: ").append(r2).toString(), e);
            } catch (ClassNotFoundException e3) {
                e = e3;
                r2 = String.valueOf(e);
                glk.d("Babel_ConversationsData", new StringBuilder(String.valueOf(r2).length() + 24).append("receiveSmsFromDumpFile: ").append(r2).toString(), e);
            } catch (Throwable th) {
                objectInputStream.close();
            }
        } else if (str.startsWith("mmsdump-")) {
            try {
                r2 = String.valueOf(Environment.getExternalStorageDirectory());
                byte[] a = gwb.a(gwb.a(new File(new StringBuilder((String.valueOf(r2).length() + 1) + String.valueOf(str).length()).append(r2).append("/").append(str).toString()), false));
                if (a != null) {
                    aid = new ain(a).a();
                }
                if (aid == null || !(aid instanceof ait)) {
                    glk.e("Babel_ConversationsData", "receiveMmsFromDumpFile: failed to parse PDU", new Object[0]);
                    return;
                }
                Uri a2 = fyi.a(gwb.H(), (ait) aid);
                if (a2 == null) {
                    glk.e("Babel_ConversationsData", "receiveMmsFromDumpFile: failed to persist PDU", new Object[0]);
                } else {
                    blf.a(bko, a2, -1, null, true, false);
                }
            } catch (Throwable e4) {
                r2 = String.valueOf(e4);
                glk.d("Babel_ConversationsData", new StringBuilder(String.valueOf(r2).length() + 24).append("receiveMmsFromDumpFile: ").append(r2).toString(), e4);
            }
        } else {
            r2 = "Babel_ConversationsData";
            String str2 = "receiveSmsFromDumpFile: invalid dump file name ";
            String valueOf = String.valueOf(str);
            glk.e(r2, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public static boolean a(edo edo) {
        if (edo == null) {
            return false;
        }
        return new blo(gwb.H(), fde.k().g()).j(null, edo.b);
    }

    public static boolean a(bko bko, fpg fpg) {
        if (bko == null || fpg == null) {
            return false;
        }
        edo b = bko.b();
        for (edo equals : fpg.k()) {
            if (b.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, int i) {
        Intent intent = new Intent("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED");
        if (i != -1) {
            intent.putExtra("account_id", i);
        }
        context.sendBroadcast(intent);
    }

    private static Uri b(int i) {
        Builder buildUpon = d.buildUpon();
        buildUpon.appendQueryParameter("account_id", i);
        return buildUpon.build();
    }

    private static boolean i(Uri uri) {
        return uri != null && d.getPath().equals(uri.getPath());
    }
}

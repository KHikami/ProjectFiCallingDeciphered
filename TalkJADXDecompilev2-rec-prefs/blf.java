package p000;

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
    public static final boolean f3692a = false;
    public static final Object f3693b = new Object();
    public static int f3694c = 0;
    private static final Uri f3695d;
    private static CharSequence f3696e;
    private static final HashSet<Uri> f3697f = new HashSet();

    static {
        kae kae = glk.f15557d;
        String str = EsProvider.f5998a;
        f3695d = Uri.parse(new StringBuilder(String.valueOf(str).length() + 12).append("receiver://").append(str).append("/").toString());
    }

    public static void m5778a(blo blo, fpl fpl, fhc fhc, long j, long j2, long j3) {
        if (fpl instanceof fpt) {
            fpt fpt = (fpt) fpl;
            String a = fpt.m15827a();
            String d = fpt.m15933d();
            blo.m5989a(a, d, 1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MEO sync: conid: ").append(a).append(" msgid: ").append(d);
            if (fdq.f12764F.m14370b(blo.m6056g().m5638g())) {
                gwb.m1731a(blo.m6056g().m5638g(), 2906, stringBuilder.toString(), true);
            }
            blf.m5821d(blo, a);
        } else if (fpl instanceof fox) {
            fox fox = (fox) fpl;
            new fea().m15114a(fox).m15118a(false).m15112a(j).m15126c(j2).m15131d(j3).m15136f(fle.m15603a(blo.m6049f(), blo.m6061h(), fox.m15827a())).m15119a().m15621b(blo, fhc);
            blf.m5777a(blo, fox);
        } else if (fpl instanceof fpr) {
            blf.m5779a(blo, (fpr) fpl, fhc, false);
        } else if (fpl instanceof fph) {
            new flc((fph) fpl).m15602b(blo, fhc);
        } else if (fpl instanceof fpo) {
            blf.m5800a(blo, (fpo) fpl, fhc);
        } else if (fpl instanceof fpu) {
            new flh((fpu) fpl).m15636c(blo);
        } else if (fpl instanceof fpn) {
            new flf((fpn) fpl).m15630c(blo);
        }
    }

    public static void m5774a(blo blo, evz evz, fhc fhc) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str = "Babel_ConversationsData";
            String str2 = "processServerResponse of type ";
            String valueOf = String.valueOf(evz.getClass().getSimpleName());
            glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        evz.f5804f = false;
        evz.mo1047a(blo, fhc);
        if (!evz.f5804f) {
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

    public static void m5776a(blo blo, fhc fhc, boolean z, boolean z2, String str) {
        glk.m17970a("Babel_ConversationsData", "requestWarmSync", new Object[0]);
        blo.m5958a();
        try {
            long a = bkq.m5659a(gwb.m1400H(), blo.m6056g().m5638g(), "last_successful_sync_time", 0);
            String valueOf;
            if (a == 0) {
                if (f3692a) {
                    valueOf = String.valueOf(blo.m6056g().m5629a());
                    new StringBuilder(String.valueOf(valueOf).length() + 58).append("Warm sync fall back to cold sync for: ").append(valueOf).append(", create SRC request");
                }
                fhc.m15308a(new evt(5, false, null));
                fhc.m15308a(new evt(6, false, null));
            } else {
                List<Pair> d = blo.m6038d(a);
                List linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                String str2 = null;
                List list = linkedList2;
                for (Pair pair : d) {
                    List linkedList3;
                    String str3 = (String) pair.first;
                    valueOf = (String) pair.second;
                    if (f3692a) {
                        glk.m17970a("Babel_ConversationsData", new StringBuilder((String.valueOf(str3).length() + 38) + String.valueOf(valueOf).length()).append("Warm sync new event since last sync: ").append(str3).append(" ").append(valueOf).toString(), new Object[0]);
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
                fok evs = new evs(a, linkedList, blo.m6095o(), z, z2, str);
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    glk.m17970a("Babel_ConversationsData", "SyncAllNewEventsRequest " + a + " noMissedEventsExpected=" + z + " suppressNotifications=" + z2, new Object[0]);
                }
                fhc.m15308a(evs);
            }
            blo.m6015b();
            Context f = blo.m6049f();
            if (gwb.m1906a(f, "babel_gsi_atwarmsync", true) && !((fzw) jyn.m25426a(f, fzw.class)).mo2146a(blo.m6061h())) {
                RealTimeChatService.m9075b(blo.m6056g(), true);
            }
        } finally {
            blo.m6028c();
        }
    }

    public static void m5791a(blo blo, String str, byte[] bArr, long j) {
        long i = blo.m6067i(str);
        if (j <= i || i == 0) {
            blo.m5996a(str, bArr, j);
        }
    }

    public static void m5777a(blo blo, fox fox) {
        if (!blo.m6056g().m5632b().equals(fox.m15831b())) {
            fqj fqj = new fqj(fox.m15827a(), fox.m15831b(), fox.m15832c());
            ((bor) jyn.m25426a(gwb.m1400H(), bor.class)).m6322a(fqj);
            RealTimeChatService.m9058a(fqj);
        }
    }

    public static boolean m5800a(blo blo, fpo fpo, fhc fhc) {
        int i;
        Object obj;
        boolean z;
        long j;
        boolean contains;
        long j2;
        int i2;
        String a = fpo.m15827a();
        long c = fpo.m15832c();
        if (f3692a) {
            int e = fpo.m15915e();
            int d = fpo.m15914d();
            long h = fpo.m15918h();
            String valueOf = String.valueOf(fpo.m15919u());
            String valueOf2 = String.valueOf(fpo.m15917g().toString());
            new StringBuilder(((String.valueOf(a).length() + 150) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processHangoutEventInTransaction conversationId: ").append(a).append(" mediaType: ").append(e).append(" event type ").append(d).append(" duration ").append(h).append(" transfer ").append(valueOf).append(" participants: ").append(valueOf2);
        }
        if (fpo.m15915e() == 2) {
            i = 1;
        } else {
            i = 2;
        }
        if (i == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        int k = fpo.m15844k();
        fwy fwy = null;
        if (fpo.m15914d() == 1) {
            fwy = fwy.HANGOUT_STOP_EVENT;
            k = 10;
            z = true;
        } else {
            if (fpo.m15914d() == 0 && fpo.m15919u() != null) {
                if (blo.m6104t(fpo.m15919u()) == 2) {
                    k = 10;
                    z = false;
                }
            }
            z = false;
        }
        long j3 = -1;
        if (z) {
            bls e2 = blo.m6043e(a);
            String str = null;
            if (e2.f3756b == 1) {
                edo b = blo.m6056g().m5632b();
                if (b.m13608a(fpo.m15831b())) {
                    edo edo;
                    e = fpo.m15917g().size();
                    if (e > 0) {
                        d = e;
                        for (edo edo2 : fpo.m15917g()) {
                            if (b.m13608a(edo2)) {
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
                        for (edk edk : e2.f3762h) {
                            edo2 = edk.f11213b;
                            if (!b.m13608a(edo2)) {
                                arrayList.add(edo2);
                            }
                        }
                        if (arrayList.size() == 1) {
                            str = blo.m5953a(a, arrayList);
                        }
                    }
                }
            }
            if (str == null) {
                str = blo.m5953a(a, fpo.m15917g());
            }
            j3 = blo.m5943a(a, fpo.m15842i(), fwx.ON_SERVER, fpo.m15831b(), fwy, c, fpo.m15843j(), 0, k, null, str, i, null);
            if (k == 10) {
                fhc.m15316e();
                j = j3;
                switch (fpo.m15914d()) {
                    case 1:
                        contains = fpo.m15917g().contains(blo.m6056g().m5632b());
                        if (c > blo.m6089n(a)) {
                            if (contains) {
                                j2 = fpo.m15843j();
                                if (obj == null) {
                                    i2 = 10;
                                } else {
                                    i2 = 1;
                                }
                                blo.m6004a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                            } else {
                                j2 = fpo.m15843j();
                                if (obj == null) {
                                    i2 = 11;
                                } else {
                                    i2 = 8;
                                }
                                blo.m6004a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                            }
                        }
                        i = 0;
                        RealTimeChatService.m9060a(a, null);
                        break;
                    case 5:
                        RealTimeChatService.m9060a(a, fpo.m15917g());
                        break;
                }
                blo.m5961a(i, c, a);
                return z;
            }
            fhc.m15305a(c);
        }
        j = j3;
        switch (fpo.m15914d()) {
            case 1:
                contains = fpo.m15917g().contains(blo.m6056g().m5632b());
                if (c > blo.m6089n(a)) {
                    if (contains) {
                        j2 = fpo.m15843j();
                        if (obj == null) {
                            i2 = 1;
                        } else {
                            i2 = 10;
                        }
                        blo.m6004a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                    } else {
                        j2 = fpo.m15843j();
                        if (obj == null) {
                            i2 = 8;
                        } else {
                            i2 = 11;
                        }
                        blo.m6004a(a, c, j2, i2, null, j, fwx.ON_SERVER, null, null);
                    }
                }
                i = 0;
                RealTimeChatService.m9060a(a, null);
                break;
            case 5:
                RealTimeChatService.m9060a(a, fpo.m15917g());
                break;
        }
        blo.m5961a(i, c, a);
        return z;
    }

    public static boolean m5801a(blo blo, String str, long j, fhc fhc, fpl fpl) {
        bls f = blo.m6050f(str);
        if (f == null) {
            long j2;
            if (glk.m17973a("Babel_ConversationsData", 3)) {
                glk.m17970a("Babel_ConversationsData", new StringBuilder(String.valueOf(str).length() + 36).append("conversation ").append(str).append(" does not exist locally").toString(), new Object[0]);
            }
            if (j == 0) {
                j2 = 0;
            } else {
                j2 = j - 1;
            }
            blo.m5974a(str, j2);
        } else if (f3692a) {
            new StringBuilder(String.valueOf(str).length() + 52).append("conversation ").append(str).append(" exists locally,  metadataPresent ").append(f.f3759e);
        }
        if (f != null && f.f3759e) {
            return true;
        }
        fhc.m15308a(new euw(str, true, true, true, null, 0, null, 0, fpl));
        return false;
    }

    public static void m5793a(blo blo, List<fbv> list, String str, String str2, long j, long j2) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            glk.m17970a("Babel_ConversationsData", "processContactErrorInTransaction", new Object[0]);
        }
        List arrayList = new ArrayList();
        String c = blo.m6027c(str, (List) list);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        for (fbv fbv : list) {
            fbw fbw = fbv.f12663a;
            edo edo = null;
            if (!TextUtils.isEmpty(fbw.f12666a)) {
                edo = edo.m13604a(fbw.f12666a);
            } else if (TextUtils.isEmpty(fbw.f12667b)) {
                glk.m17982e("Babel_ConversationsData", "processContactErrorInTransaction: server sends empty ids!", new Object[0]);
            } else {
                edo = edo.m13606b(fbw.f12667b);
            }
            String valueOf;
            if (fbv.f12664b == 3) {
                valueOf = String.valueOf(edo);
                glk.m17970a("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 71).append("processContactErrorInTransaction: force OTR conflict error for invitee ").append(valueOf).toString(), new Object[0]);
                Object obj4 = obj3;
                obj3 = 1;
                obj2 = obj;
            } else {
                if (fbv.f12664b == 4) {
                    obj = 1;
                    valueOf = String.valueOf(edo);
                    glk.m17970a("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processContactErrorInTransaction: force OTR fork error for invitee ").append(valueOf).toString(), new Object[0]);
                }
                int i = 1;
                obj3 = obj2;
                obj2 = obj;
            }
            if (edo != null) {
                if (blo.m6026c(edo) == null) {
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
            fhc.m15307a(blo.m6056g());
            fhc.m15306a(gwb.m1400H(), blo, str, arrayList);
            fhc.m15315d();
        }
        fwy fwy = fwy.ERROR;
        if (obj != null) {
            fwy = fwy.ERROR_FORK;
        } else if (obj2 != null && obj3 == null) {
            fwy = fwy.ERROR_FORCE_OTR_CONFLICT;
        }
        String valueOf2 = String.valueOf(fwy);
        glk.m17982e("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf2).length() + 48).append("processContactErrorInTransaction: message error ").append(valueOf2).toString(), new Object[0]);
        blo.m5942a(str, str2, fwx.ON_SERVER, blo.m6056g().m5632b(), fwy, j, j2, 0, 30, null, c);
        blo.m5992a(str, str2, fwx.FAILED_TO_SEND, 0);
    }

    public static boolean m5799a(blo blo, fpg fpg, long j, String str, fhc fhc, blj blj, boolean z) {
        Object obj;
        String a = fpg.m15827a();
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String valueOf = String.valueOf(fpg.m15886o());
            int size = fpg.m15882k().size();
            int r = fpg.m15889r();
            int s = fpg.m15890s();
            String valueOf2 = String.valueOf(Arrays.toString(fpg.m15891t()));
            boolean m = fpg.m15884m();
            int n = fpg.m15885n();
            boolean w = fpg.m15894w();
            if (fpg.m15883l() == null) {
                obj = null;
            } else {
                obj = Long.valueOf(fpg.m15883l().f12620b);
            }
            String valueOf3 = String.valueOf(obj);
            int u = fpg.m15892u();
            long y = fpg.m15896y();
            glk.m17970a(str2, new StringBuilder(((((String.valueOf(a).length() + 413) + String.valueOf(valueOf).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processConversationInTransaction conversationId: ").append(a).append(", clientGeneratedId: ").append(valueOf).append(", requestClientGeneratedId: ").append(str).append(", participantCount: ").append(size).append(", notificationLevel: ").append(r).append(", status: ").append(s).append(", view: ").append(valueOf2).append(", hasActiveHangout: ").append(m).append(", isGroupLinkSharingEnabled: ").append(n).append(", isGuest: ").append(w).append(", selfReadState.latestReadTimestamp: ").append(valueOf3).append(", otrStatus: ").append(u).append(", sortTimestamp: ").append(y).append(", otrToggle: ").append(fpg.m15893v()).append(", isTemporary: ").append(fpg.m15870A()).toString(), new Object[0]);
        }
        if (z || fpg.m15890s() != 1 || blo.m6104t(a) != 1 || fpg.m15891t() == null || fpg.m15891t().length <= 0 || fpg.m15891t()[0] != 2) {
            bmb a2;
            blx blx;
            Object obj2;
            if (j > 0) {
                if (f3692a) {
                    new StringBuilder(71).append("got upperBoundTimestamp ").append(j).append(" calling deleteConversation");
                }
                blo.m6035c(a, j);
                if (fpg.m15896y() <= j) {
                    return false;
                }
            }
            if (fpg.m15875d() == 1) {
                edo b = blo.m6056g().m5632b();
                for (edo edo : fpg.m15882k()) {
                    if (!edo.equals(b)) {
                        bmh a3 = blo.m5946a(edo, true, 1);
                        if (a3 != null) {
                            valueOf3 = a3.f3963a;
                            a2 = blo.m5945a(a, str, fpg.m15886o(), valueOf3);
                            blx = a2.f3859a;
                            obj2 = null;
                            if (f3692a) {
                                valueOf3 = blx != null ? "(null)" : blx.f3790a;
                                new StringBuilder(String.valueOf(valueOf3).length() + 70).append("getExistingMergedConversationId returned ").append(valueOf3).append(" conversationIdsMerged: ").append(a2.f3860b);
                            }
                            if (blx != null) {
                                valueOf = null;
                            } else {
                                valueOf = blx.f3790a;
                            }
                            if (valueOf == null) {
                                if (a.equals(valueOf)) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj == null || a2.f3860b || blx.f3791b == null || !Arrays.equals(blx.f3791b, fpg.m15897z())) {
                                    blo.m5973a(valueOf, blx.f3792c, fpg);
                                    blo.m5915G(a);
                                    obj2 = obj;
                                } else {
                                    if (f3692a) {
                                        valueOf3 = "Skipping update ";
                                        str2 = String.valueOf(gwb.m2087c(blx.f3791b));
                                        if (str2.length() != 0) {
                                            valueOf3.concat(str2);
                                        } else {
                                            str2 = new String(valueOf3);
                                        }
                                    }
                                    blf.m5819c(fpg.m15878g(), a);
                                    if (blj != null) {
                                        blj.f3701a = blx.f3790a;
                                    }
                                    return false;
                                }
                            }
                            blo.m5971a(fpg);
                            if (fpg.m15890s() == 1) {
                                fhc.m15305a(fpg.m15832c());
                            }
                            fhc.m15306a(gwb.m1400H(), blo, a, fpg.m15882k());
                            blo.m5983a(a, fpg.m15881j(), fpg.m15880i());
                            blo.m5999a(fpg.m15882k(), fpg.m15879h(), a);
                            if (fpg.m15879h() != null) {
                                for (esr esr : fpg.m15879h()) {
                                    if (!(esr.f12187a == null || TextUtils.isEmpty(esr.f12189c))) {
                                        blo.m5969a(esr);
                                    }
                                }
                            }
                            blf.m5813b(blo, a);
                            if (obj2 != null) {
                                RealTimeChatService.m9113f(blo.m6056g(), valueOf, a);
                                blf.m5794a(fhc, blo, a);
                            }
                            if (valueOf == null && blo.m6087m(a, 3)) {
                                if (blj != null) {
                                    blj.f3701a = a;
                                }
                                return false;
                            }
                            if (fpg.m15883l() != null) {
                                blo.m5978a(a, fpg.m15883l().f12620b, false, "serverresponse");
                            }
                            blf.m5819c(fpg.m15878g(), a);
                            blo.m5959a(fpg.m15892u(), fpg.m15893v(), 1 + blo.m6114y(a), a);
                            blo.m6063h(a, fpg.m15896y());
                            blo.m5986a(a, fpg.m15877f());
                            blo.m6032c(a, fpg.m15870A());
                            if (z) {
                                if (fpg.m15891t() != null && fpg.m15891t().length > 0 && fpg.m15891t()[0] == 2) {
                                    RealTimeChatService.m9053a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), a, fpg.m15832c(), false, false);
                                }
                                if (fpg.m15890s() == 1) {
                                    fhc.m15308a(new evh(a, 1));
                                    blo.m5934Z(a);
                                }
                            }
                            if (blj != null) {
                                blj.f3701a = a;
                            }
                            blo.m5840a(blo, a);
                            return true;
                        }
                    }
                }
            }
            valueOf3 = null;
            a2 = blo.m5945a(a, str, fpg.m15886o(), valueOf3);
            blx = a2.f3859a;
            obj2 = null;
            if (f3692a) {
                if (blx != null) {
                }
                new StringBuilder(String.valueOf(valueOf3).length() + 70).append("getExistingMergedConversationId returned ").append(valueOf3).append(" conversationIdsMerged: ").append(a2.f3860b);
            }
            if (blx != null) {
                valueOf = blx.f3790a;
            } else {
                valueOf = null;
            }
            if (valueOf == null) {
                blo.m5971a(fpg);
                if (fpg.m15890s() == 1) {
                    fhc.m15305a(fpg.m15832c());
                }
            } else {
                if (a.equals(valueOf)) {
                    obj = null;
                } else {
                    obj = 1;
                }
                if (obj == null) {
                }
                blo.m5973a(valueOf, blx.f3792c, fpg);
                blo.m5915G(a);
                obj2 = obj;
            }
            fhc.m15306a(gwb.m1400H(), blo, a, fpg.m15882k());
            blo.m5983a(a, fpg.m15881j(), fpg.m15880i());
            blo.m5999a(fpg.m15882k(), fpg.m15879h(), a);
            if (fpg.m15879h() != null) {
                for (esr esr2 : fpg.m15879h()) {
                    blo.m5969a(esr2);
                }
            }
            blf.m5813b(blo, a);
            if (obj2 != null) {
                RealTimeChatService.m9113f(blo.m6056g(), valueOf, a);
                blf.m5794a(fhc, blo, a);
            }
            if (valueOf == null) {
            }
            if (fpg.m15883l() != null) {
                blo.m5978a(a, fpg.m15883l().f12620b, false, "serverresponse");
            }
            blf.m5819c(fpg.m15878g(), a);
            blo.m5959a(fpg.m15892u(), fpg.m15893v(), 1 + blo.m6114y(a), a);
            blo.m6063h(a, fpg.m15896y());
            blo.m5986a(a, fpg.m15877f());
            blo.m6032c(a, fpg.m15870A());
            if (z) {
                RealTimeChatService.m9053a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), a, fpg.m15832c(), false, false);
                if (fpg.m15890s() == 1) {
                    fhc.m15308a(new evh(a, 1));
                    blo.m5934Z(a);
                }
            }
            if (blj != null) {
                blj.f3701a = a;
            }
            blo.m5840a(blo, a);
            return true;
        }
        blo.m5909B(a);
        return true;
    }

    private static void m5819c(List<fbd> list, String str) {
        for (fbd fbd : list) {
            if (f3692a) {
                String valueOf = String.valueOf(fbd.f12619a.f11245b);
                new StringBuilder((String.valueOf(valueOf).length() + 82) + String.valueOf(str).length()).append("process userReadState  chatId: ").append(valueOf).append("  conversationId: ").append(str).append("  timestamp: ").append(fbd.f12620b);
            }
            fqj fqj = new fqj(str, fbd.f12619a, fbd.f12620b);
            ((bor) jyn.m25426a(gwb.m1400H(), bor.class)).m6322a(fqj);
            RealTimeChatService.m9058a(fqj);
        }
    }

    public static void m5779a(blo blo, fpr fpr, fhc fhc, boolean z) {
        Object obj;
        long c = fpr.m15832c();
        String a = fpr.m15827a();
        edo b = fpr.m15831b();
        if (f3692a) {
            int d = fpr.m15925d();
            String valueOf = String.valueOf(b);
            if (fpr.m15928g() == null) {
                obj = "(null)";
            } else {
                obj = Integer.valueOf(fpr.m15928g().size());
            }
            String valueOf2 = String.valueOf(obj);
            new StringBuilder(((String.valueOf(a).length() + 119) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processMembershipChange conversationId: ").append(a).append(" type: ").append(d).append(" sender: ").append(valueOf).append(" participant count: ").append(valueOf2).append(" timestamp: ").append(c);
        }
        if (fpr.m15928g().size() == 0) {
            String str = "Babel_ConversationsData";
            valueOf = "empty participants in membership change ";
            valueOf2 = String.valueOf(a);
            glk.m17982e(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
        }
        edo edo;
        String a2;
        switch (fpr.m15925d()) {
            case 1:
                Object obj2;
                if (RealTimeChatService.m9103d(blo.m6056g(), a) || b.m13608a(blo.m6056g().m5632b())) {
                    obj2 = null;
                } else {
                    int i = 1;
                }
                if (z) {
                    for (edo edo2 : fpr.m15928g()) {
                        blo.m5982a(a, edo2, true);
                    }
                }
                a2 = blo.m5953a(a, fpr.m15928g());
                blo.m6004a(a, fpr.m15832c(), fpr.m15843j(), 4, b, blo.m5942a(a, fpr.m15842i(), fwx.ON_SERVER, b, fwy.MEMBERSHIP_CHANGE_JOIN, c, fpr.m15843j(), 0, fpr.m15844k(), null, a2), fwx.ON_SERVER, null, a2);
                if (obj2 != null) {
                    fhc.m15305a(fpr.m15832c());
                    return;
                }
                return;
            case 2:
                fwx fwx;
                fwy fwy;
                a2 = null;
                if (fpr.m15928g().size() > 0) {
                    edo2 = (edo) fpr.m15928g().get(0);
                    if (edo2 != null) {
                        if (z && blo.m6056g().m5632b().equals(edo2)) {
                            if (a != null) {
                                blo.m6076k(a);
                                obj = 1;
                            } else {
                                glk.m17981d("Babel_ConversationsData", "attempt to process presence for a nonexistant conversation id [null]", new Object[0]);
                                obj = null;
                            }
                            if (obj != null) {
                                str = String.valueOf(c);
                                fwx = fwx.ON_SERVER;
                                if (fpr.m15926e() == 1) {
                                    fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                                } else {
                                    fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                                }
                                blo.m5942a(a, str, fwx, b, fwy, c, fpr.m15843j(), 0, fpr.m15844k(), null, a2);
                                return;
                            }
                            return;
                        }
                        if (z) {
                            blo.m5982a(a, edo2, false);
                        }
                        List arrayList = new ArrayList();
                        arrayList.add(edo2);
                        a2 = blo.m5953a(a, arrayList);
                        obj = null;
                        if (obj != null) {
                            str = String.valueOf(c);
                            fwx = fwx.ON_SERVER;
                            if (fpr.m15926e() == 1) {
                                fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                            } else {
                                fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                            }
                            blo.m5942a(a, str, fwx, b, fwy, c, fpr.m15843j(), 0, fpr.m15844k(), null, a2);
                            return;
                        }
                        return;
                    }
                }
                obj = null;
                if (obj != null) {
                    str = String.valueOf(c);
                    fwx = fwx.ON_SERVER;
                    if (fpr.m15926e() == 1) {
                        fwy = fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT;
                    } else {
                        fwy = fwy.MEMBERSHIP_CHANGE_LEAVE;
                    }
                    blo.m5942a(a, str, fwx, b, fwy, c, fpr.m15843j(), 0, fpr.m15844k(), null, a2);
                    return;
                }
                return;
            default:
                glk.m17981d("Babel_ConversationsData", "Ignoring unsupported membership change event", new Object[0]);
                return;
        }
    }

    public static String m5754a(blo blo, boolean z, String str, List<edk> list, List<bcg> list2, List<fbt> list3, boy boy, int i, int i2, boolean z2, fhc fhc, String str2) {
        blo.m5958a();
        try {
            String b = blf.m5807b(blo, z, str, list, list2, list3, boy, i, i2, z2, fhc, str2);
            blo.m6015b();
            fhc.m15313c();
            return b;
        } finally {
            blo.m6028c();
        }
    }

    public static String m5807b(blo blo, boolean z, String str, List<edk> list, List<bcg> list2, List<fbt> list3, boy boy, int i, int i2, boolean z2, fhc fhc, String str2) {
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
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            glk.m17970a("Babel_ConversationsData", "createConversationLocally:  num invitees " + list.size(), new Object[0]);
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        bko g = blo.m6056g();
        edo b = g.m5632b();
        int size = list.size() - 1;
        while (size >= 0) {
            int i9;
            edk edk = (edk) list.get(size);
            edo edo = ((edk) list.get(size)).f11213b;
            if (b.m13609a(edo.f11245b, edo.f11244a)) {
                i9 = i8;
                i3 = i7;
                i8 = i6;
                i7 = i5;
            } else {
                i6 |= TextUtils.isEmpty(edk.m13596f());
                i5 |= TextUtils.isEmpty(edo.f11244a);
                i3 = edk.m13599i() | i7;
                i9 = gwb.m2054b(gwb.m1400H(), edk) | i8;
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
        } else if (!g.m5644m() || (i == 1 && i7 == 0 && i8 == 0)) {
            i7 = g.m5628a(0);
        } else {
            i7 = 3;
        }
        if (boy != boy.NONE) {
            if (i == 2) {
                if (obj3 != null) {
                    a = blo.m5954a((List) list, i7);
                } else if (obj4 != null) {
                    a = blo.m6012b((List) list);
                } else {
                    a = null;
                }
                if (TextUtils.isEmpty(a)) {
                    i3 = 0;
                    j = 0;
                    str3 = a;
                } else {
                    bls e = blo.m6043e(a);
                    i3 = e.f3772r;
                    j = e.f3771q;
                    str3 = a;
                }
            } else if (list.size() == 1 && ((list2 == null || list2.size() == 0) && i == 1)) {
                edo edo2 = ((edk) list.get(0)).f11213b;
                if (edo2 == null || edo2.m13607a()) {
                    glk.m17982e("Babel_ConversationsData", "Server returned a conversation with empty participantId", new Object[0]);
                    i3 = 0;
                    j = 0;
                    str3 = null;
                } else {
                    if (b.m13609a(edo2.f11245b, edo2.f11244a)) {
                        glk.m17982e("Babel_ConversationsData", "Trying to start a one on one with self", new Object[0]);
                        i3 = 0;
                        j = 0;
                        str3 = null;
                    } else {
                        bmh a2 = blo.m5946a(edo2, false, i7);
                        if (a2 != null) {
                            str4 = a2.f3963a;
                            j = a2.f3965c;
                            i3 = a2.f3966d;
                            str3 = str4;
                        }
                    }
                }
            }
            if (str3 != null) {
                if (obj3 == null) {
                    str4 = blo.m5901j();
                } else {
                    str4 = blo.m5900i();
                }
                str5 = "Babel_ConversationsData";
                str6 = "Creating new conversation no match found. generated id: ";
                a = String.valueOf(str4);
                glk.m17970a(str5, a.length() == 0 ? str6.concat(a) : new String(str6), new Object[0]);
                if (gwb.m2237h(i7)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                j = 1000 * glj.m17956a();
                if (z) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                str5 = blo.m5952a(str, i, i7, j, str4, i4);
                blo.m5912D(str5);
                blf.m5789a(blo, str5, (List) list, (List) list2);
                for (edk edk2 : list) {
                    if (edk2.m13597g()) {
                        blo.m5874b(blo, str5);
                        break;
                    }
                }
                blo.m5840a(blo, str5);
                if (!(obj == null || fhc == null)) {
                    arrayList = new ArrayList();
                    for (edk edk22 : list) {
                        if (list3 != null) {
                            gwb.m1834a(edk22, (Collection) list3);
                        }
                        arrayList.add(edk22);
                    }
                    if (list2 != null) {
                        for (bcg bcg : list2) {
                            arrayList.add(gwb.m1985b(bcg.m4845b(), bcg.m4847d()));
                        }
                    }
                    eup = new eup(str4, i, i7, str, arrayList, str2);
                    if (boy != boy.LOCAL_AND_SERVER) {
                        fhc.m15308a(new euw(eup));
                    } else {
                        fhc.m15308a(eup);
                    }
                }
                String str7 = str5;
                obj2 = 1;
                a = str7;
            } else {
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    str6 = "Babel_ConversationsData";
                    String str8 = "Using existing conversation ";
                    a = String.valueOf(str3);
                    glk.m17970a(str6, a.length() == 0 ? str8.concat(a) : new String(str8), new Object[0]);
                }
                blo.m6077k(str3, -2147483647L);
                if (!z && r5 == 2) {
                    RealTimeChatService.m9053a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), str3, j, false, false);
                }
                if (obj3 != null && z2) {
                    blf.m5792a(blo, (List) list);
                }
                a = str3;
                obj2 = null;
            }
            if (obj2 != null) {
                blf.m5821d(blo, a);
            }
            return a;
        }
        i3 = 0;
        j = 0;
        str3 = null;
        if (str3 != null) {
            if (glk.m17973a("Babel_ConversationsData", 3)) {
                str6 = "Babel_ConversationsData";
                String str82 = "Using existing conversation ";
                a = String.valueOf(str3);
                if (a.length() == 0) {
                }
                glk.m17970a(str6, a.length() == 0 ? str82.concat(a) : new String(str82), new Object[0]);
            }
            blo.m6077k(str3, -2147483647L);
            RealTimeChatService.m9053a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), str3, j, false, false);
            blf.m5792a(blo, (List) list);
            a = str3;
            obj2 = null;
        } else {
            if (obj3 == null) {
                str4 = blo.m5900i();
            } else {
                str4 = blo.m5901j();
            }
            str5 = "Babel_ConversationsData";
            str6 = "Creating new conversation no match found. generated id: ";
            a = String.valueOf(str4);
            if (a.length() == 0) {
            }
            glk.m17970a(str5, a.length() == 0 ? str6.concat(a) : new String(str6), new Object[0]);
            if (gwb.m2237h(i7)) {
                obj = null;
            } else {
                obj = 1;
            }
            j = 1000 * glj.m17956a();
            if (z) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            str5 = blo.m5952a(str, i, i7, j, str4, i4);
            blo.m5912D(str5);
            blf.m5789a(blo, str5, (List) list, (List) list2);
            while (r6.hasNext()) {
                if (edk22.m13597g()) {
                    blo.m5874b(blo, str5);
                    break;
                }
            }
            blo.m5840a(blo, str5);
            arrayList = new ArrayList();
            for (edk edk222 : list) {
                if (list3 != null) {
                    gwb.m1834a(edk222, (Collection) list3);
                }
                arrayList.add(edk222);
            }
            if (list2 != null) {
                for (bcg bcg2 : list2) {
                    arrayList.add(gwb.m1985b(bcg2.m4845b(), bcg2.m4847d()));
                }
            }
            eup = new eup(str4, i, i7, str, arrayList, str2);
            if (boy != boy.LOCAL_AND_SERVER) {
                fhc.m15308a(eup);
            } else {
                fhc.m15308a(new euw(eup));
            }
            String str72 = str5;
            obj2 = 1;
            a = str72;
        }
        if (obj2 != null) {
            blf.m5821d(blo, a);
        }
        return a;
    }

    public static List<edk> m5755a(bko bko, String str) {
        return new blo(gwb.m1400H(), bko.m5638g()).m5956a(str, bko.m5632b());
    }

    public static void m5787a(blo blo, String str, List<edk> list) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String valueOf = String.valueOf(list);
            glk.m17970a("Babel_ConversationsData", new StringBuilder((String.valueOf(str).length() + 87) + String.valueOf(valueOf).length()).append("forking a new conversation for an existing conversation ").append(str).append(" with additional participants: ").append(valueOf).toString(), new Object[0]);
        }
        Collection H = blo.m5916H(str);
        H.addAll(list);
        RealTimeChatService.m9056a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), gwb.m2009b(H), str);
    }

    public static void m5782a(blo blo, String str, long j, fhc fhc, long j2, long j3) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            bme bme = new Object[0];
            glk.m17970a("Babel_ConversationsData", "resendSmsLocally messageRowId: " + j, (Object[]) bme);
        }
        blo.m5958a();
        long b = glj.m17963b();
        try {
            bme = blo.m6009b(j);
            blf.m5772a(blo, j, fhc);
            blo.m6015b();
            if (!(bme == null || bme.f3927a == null)) {
                long b2 = glj.m17963b();
                int g = blo.m6056g().m5638g();
                dvm a = ba.m4618c().m12789a(str);
                if (blo.m5871a(bme.f3927a)) {
                    a.m12794b(bme.f3927a);
                } else {
                    a.m12798c(bme.f3927a);
                }
                ba.m4548a(g, j2 / 1000, 10, a.m12786a((int) HttpStatusCodes.STATUS_CODE_FOUND));
                ba.m4548a(g, j3 / 1000, 10, a.m12786a(205));
                ba.m4548a(g, b, 10, a.m12786a(105));
                ba.m4548a(g, b2, 10, a.m12786a(106));
            }
            blf.m5821d(blo, str);
        } finally {
            blo.m6028c();
        }
    }

    public static void m5794a(fhc fhc, blo blo, String str) {
        Cursor cursor = null;
        try {
            cursor = blo.m5944a(str, fwx.QUEUED, new String[]{"_id"});
            if (f3692a) {
                new StringBuilder(String.valueOf(str).length() + 51).append("sendUnsentMessages ").append(str).append(" cursor ").append(cursor == null ? -1 : cursor.getCount()).append(" message rows");
            }
            blo.m5958a();
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        if (f3692a) {
                            new StringBuilder(String.valueOf(str).length() + 54).append("sendUnsentMessages ").append(str).append(" sending msgID ").append(cursor.getLong(0));
                        }
                        blf.m5772a(blo, cursor.getLong(0), fhc);
                    } while (cursor.moveToNext());
                }
            }
            fhc.m15308a(new eve(str, blo.m5928T(str)));
            blo.m6015b();
            blo.m6028c();
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static long m5753a(blo blo, String str, fhc fhc, long j, boolean z) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "updateConversationWatermark conversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            long j2 = new Object[0];
            glk.m17970a(str2, valueOf, (Object[]) j2);
        }
        blo.m5958a();
        try {
            blv N = blo.m5922N(str);
            if (N != null) {
                j2 = Math.max(N.f3779a, blo.m6089n(str));
                if (j != 0) {
                    if (j > j2) {
                        glk.m17982e("Babel_ConversationsData", "New watermark: " + j + "; max watermark: " + j2, new Object[0]);
                        iil.m21870a("New watermark greater than maximum possible watermark");
                    }
                    j2 = j;
                }
                if (j2 > N.f3780b) {
                    blo.m5978a(str, j2, true, "useraction");
                    bko g = blo.m6056g();
                    ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1831a(g.m5638g(), true);
                    blf.m5760a(gwb.m1400H(), g.m5638g());
                    if (fhc != null && !blo.m5871a(str)) {
                        if (z) {
                            fhc.m15308a(new evw(str, j2));
                        }
                        fhc.m15316e();
                        blo.m6015b();
                        blf.m5821d(blo, str);
                        return j2;
                    } else if (blo.m5883b(str)) {
                        long V = blo.m5930V(str);
                        if (V != -1) {
                            fyi.m16606a(V, j2 / 1000);
                        }
                    }
                }
            }
            j2 = -1;
            blo.m6015b();
            blf.m5821d(blo, str);
            return j2;
        } finally {
            blo.m6028c();
        }
    }

    public static void m5783a(blo blo, String str, fhc fhc) {
        blo.m5958a();
        try {
            fok euw;
            bls f = blo.m6050f(str);
            if (f == null) {
                String valueOf = String.valueOf(glk.m17974b(blo.m6056g().m5629a()));
                glk.m17981d("Babel_ConversationsData", new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(str).length()).append("Requested older events for an unknown conversation Account:").append(valueOf).append(" conversationId:").append(str).toString(), new Object[0]);
                euw = new euw(str, true, true, false, null, -1, null, 0, null);
            } else if (f.f3770p) {
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    glk.m17970a("Babel_ConversationsData", new StringBuilder(String.valueOf(str).length() + 78).append("Skip requesting old events for conversation ").append(str).append(" since it already has oldest event").toString(), new Object[0]);
                }
                blo.m6015b();
                blo.m6028c();
                return;
            } else {
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    String valueOf2 = String.valueOf(Arrays.toString(f.f3760f));
                    glk.m17970a("Babel_ConversationsData", new StringBuilder((String.valueOf(valueOf2).length() + 74) + String.valueOf(str).length()).append("requesting events before token ").append(valueOf2).append(" eventId ").append(f.f3761g).append(" conversation ").append(str).toString(), new Object[0]);
                }
                euw = new euw(str, false, true, false, f.f3760f, f.f3761g, null, 0, null);
            }
            fhc.m15308a(euw);
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }

    public static void m5775a(blo blo, fhc fhc, int i) {
        gjn gjn = null;
        if (gjk.f15365b) {
            gjn = new gjn().m17819a("request_more_conversations").m17823b("filterMode=" + i).m17817a(blo.m6056g());
        }
        blo.m5958a();
        try {
            long c = blo.m6024c(i);
            if (c != -2) {
                long a = bkq.m5659a(gwb.m1400H(), blo.m6056g().m5638g(), "last_successful_sync_time", 0);
                if (c == -1) {
                    c = blo.m5937a(i);
                }
                if (f3692a) {
                    new StringBuilder(52).append("requesting conversations before ").append(c);
                }
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    glk.m17970a("Babel_ConversationsData", "create SRC from scroll back, filter=" + i + ", oldestConversationTimestamp=" + c + ", suppressNotification=true", new Object[0]);
                }
                if (gjn != null) {
                    gjn.m17823b("continuationEndTimeStamp=" + c);
                }
                if (c <= 0 && a == 0 && i == 1) {
                    if (gjn != null) {
                        gjn.m17823b("empty");
                    }
                    if (glk.m17973a("Babel_ConversationsData", 3)) {
                        glk.m17970a("Babel_ConversationsData", "requestMoreConversations - db empty, warm sync executing doing nothing", new Object[0]);
                    }
                } else {
                    if (gjn != null) {
                        gjn.m17823b("calledSRC");
                    }
                    fhc.m15308a(new evt(c, i, true));
                }
            } else if (gjn != null) {
                gjn.m17823b("continuationEndTimeStamp=exhausted").m17823b("notifyExhausted").m17824b();
            }
            blo.m6015b();
            if (gjn != null) {
                gjn.m17824b();
            }
        } finally {
            blo.m6028c();
        }
    }

    public static void m5796a(fhc fhc, String str, long j) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "requesting conversation metadata for ";
            String valueOf = String.valueOf(str);
            glk.m17970a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        fhc.m15308a(new euw(str, true, false, false, null, 0, null, j, null));
    }

    public static void m5780a(blo blo, String str) {
        blo.aa(str);
        blf.m5820d(blo);
    }

    public static void m5770a(blo blo) {
        blo.m6115y();
        blf.m5820d(blo);
    }

    public static void m5785a(blo blo, String str, String str2, fwx fwx, int i) {
        blo.m5992a(str, str2, fwx, i);
    }

    public static void m5771a(blo blo, long j) {
        blo.m5958a();
        try {
            String str = (String) blo.m6025c(j).first;
            if (str != null) {
                blo.m6052f(j);
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
                blo.m6044e().m6194a("conversations", contentValues, "conversation_id=? AND snippet_message_row_id=?", new String[]{str, String.valueOf(j)});
                blo.m6015b();
            }
            blo.m6028c();
            if (str != null) {
                blf.m5821d(blo, str);
            } else {
                blf.m5820d(blo);
            }
        } catch (Throwable th) {
            blo.m6028c();
        }
    }

    public static void m5788a(blo blo, String str, List list, fhc fhc) {
        String str2;
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str3 = "Babel_ConversationsData";
            str2 = "inviteParticipantsLocally: conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            glk.m17970a(str3, valueOf, new Object[0]);
        }
        blo.m5958a();
        try {
            gkr J = blo.m5918J(str);
            boolean b = blo.m5883b(str);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (fbw fbw : list) {
                if (fbw.f12668c == null || b) {
                    edo b2 = fbw.m14936b(gwb.m1400H());
                    Object obj = null;
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        if (((edo) it.next()).m13608a(b2)) {
                            obj = 1;
                            break;
                        }
                    }
                    Object obj2 = b ? fbw.f12669d != null ? 1 : null : (fbw.f12666a == null || fbw.m14935a(gwb.m1400H())) ? null : 1;
                    if (obj == null && obj2 != null) {
                        arrayList.add(fbw);
                    }
                    if (obj2 == null) {
                        arrayList2.add(fbw);
                    }
                } else {
                    arrayList.add(fbw.m14932b(fbw.f12668c, fbw.f12670e));
                }
            }
            edo b3 = blo.m6056g().m5632b();
            String b4 = blo.m6011b(str, arrayList2);
            if (arrayList2.size() > 0) {
                blo.m5942a(str, blo.m5900i(), fwx.FAILED_TO_SEND, b3, fwy.MEMBERSHIP_CHANGE_JOIN, blo.m5921M(str), -1, 0, 10, null, b4);
            }
            if (arrayList.size() == 0) {
                blo.m6015b();
                return;
            }
            b4 = blo.m6011b(str, arrayList);
            str2 = blo.m5900i();
            long M = blo.m5921M(str);
            blo.m6004a(str, M, -1, 4, blo.m6056g().m5632b(), blo.m5942a(str, str2, fwx.QUEUED, b3, fwy.MEMBERSHIP_CHANGE_JOIN, M, -1, 0, 10, null, b4), fwx.QUEUED, null, b4);
            if (!blo.m5871a(str)) {
                fhc.m15308a(new eum(str2, str, arrayList, M));
            }
            blo.m6015b();
            blo.m6028c();
        } finally {
            blo.m6028c();
        }
    }

    public static void m5815b(blo blo, String str, fhc fhc) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "leaveConversationLocally: conversationId=";
            String valueOf = String.valueOf(str);
            glk.m17970a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        blo.m5958a();
        try {
            blo.m5995a(str, true);
            if (blo.m5871a(str)) {
                blo.m6082l(str, 1);
            } else {
                blo.m5911C(str);
                fhc.m15308a(new evf(blo.m5900i(), str, null));
            }
            blo.m6015b();
            blf.m5820d(blo);
        } finally {
            blo.m6028c();
        }
    }

    public static int m5752a(blo blo, gjj gjj) {
        int w;
        int i = 0;
        blo.m5958a();
        if (gjj == null) {
            try {
                w = blo.m6110w(null);
            } catch (Throwable th) {
                blo.m6028c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.m6110w((String) it.next());
            }
            w = i;
        }
        blo.m6015b();
        blo.m6028c();
        if (w > 0) {
            bko g = blo.m6056g();
            if (g != null) {
                blf.m5760a(gwb.m1400H(), g.m5638g());
            }
        }
        return w;
    }

    public static int m5803b(blo blo, gjj gjj) {
        int x;
        int i = 0;
        blo.m5958a();
        if (gjj == null) {
            try {
                x = blo.m6113x(null);
            } catch (Throwable th) {
                blo.m6028c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.m6113x((String) it.next());
            }
            x = i;
        }
        blo.m6015b();
        blo.m6028c();
        return x;
    }

    public static int m5816c(blo blo, gjj gjj) {
        int b;
        int i = 0;
        blo.m5958a();
        if (gjj == null) {
            try {
                b = blo.m6007b(null, true);
            } catch (Throwable th) {
                blo.m6028c();
            }
        } else {
            Iterator it = gjj.iterator();
            while (it.hasNext()) {
                i += blo.m6007b((String) it.next(), true);
            }
            b = i;
        }
        blo.m6015b();
        blo.m6028c();
        return b;
    }

    public static void m5781a(blo blo, String str, long j) {
        blo.m6077k(str, -1);
        if ((4 & j) != 0) {
            new fdb(str, 1).m14989a(blo);
        }
        if ((2 & j) != 0) {
            RealTimeChatService.m9037a(blo, str, null);
        }
        blf.m5820d(blo);
    }

    public static void m5814b(blo blo, String str, long j) {
        blo.m6077k(str, -2147483648L);
        if ((8 & j) != 0) {
            blf.m5790a(blo, str, true);
        }
        if ((16 & j) != 0) {
            blf.m5790a(blo, str, false);
        }
        if ((4 & j) != 0) {
            long n = blo.m6089n(str);
            if (f3692a) {
                new StringBuilder(String.valueOf(str).length() + 64).append("processPendingArchive ").append(str).append(" ").append(n).append(" ").append(n);
            }
            RealTimeChatService.m9053a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), blo.m6056g(), str, n, true, false);
        }
        if ((1 & j) != 0) {
            if (f3692a) {
                String str2 = "processPendingLeave ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            RealTimeChatService.m9117g(blo.m6056g(), str);
        }
        if ((2 & j) != 0) {
            long n2 = blo.m6089n(str);
            if (f3692a) {
                new StringBuilder(String.valueOf(str).length() + 63).append("processPendingDelete ").append(str).append(" ").append(n2).append(" ").append(n2);
            }
            RealTimeChatService.m9019a(blo.m6056g(), str, n2);
        }
    }

    private static void m5790a(blo blo, String str, boolean z) {
        if (f3692a) {
            new StringBuilder(String.valueOf(str).length() + 25).append("processPendingMute ").append(str).append(" ").append(z);
        }
        RealTimeChatService.m9072b(blo.m6056g(), str, z ? 10 : 30);
    }

    private static void m5772a(blo blo, long j, fhc fhc) {
        bme b = blo.m6009b(j);
        if (b == null || b.f3928b == null) {
            glk.m17981d("Babel_ConversationsData", "No such message " + j, new Object[0]);
            return;
        }
        if (f3692a) {
            String valueOf = String.valueOf(b.f3933g);
            String str = b.f3928b;
            new StringBuilder((String.valueOf(valueOf).length() + 78) + String.valueOf(str).length()).append("sending queued message type: ").append(valueOf).append(" conversationId: ").append(str).append(" timestamp: ").append(b.f3934h);
        }
        switch (blh.f3699a[b.f3933g.ordinal()]) {
            case 1:
                if (gwb.m2237h(b.f3950x)) {
                    blf.m5773a(blo, j, fhc, b);
                    return;
                } else {
                    ((cnt) jyn.m25426a(gwb.m1400H(), cnt.class)).mo1031b(blo.m6061h(), b.f3928b, j);
                    return;
                }
            case 2:
                blf.m5795a(fhc, b, true);
                return;
            case 3:
                blf.m5795a(fhc, b, false);
                return;
            case 4:
            case 5:
                fhc.m15308a(new eum(b.f3927a, b.f3928b, blo.m5917I(b.f3919F), b.f3934h));
                return;
            case 6:
                fhc.m15308a(new evg(b.f3927a, b.f3928b, b.f3918E, null));
                return;
            default:
                str = String.valueOf(b.f3933g);
                glk.m17982e("Babel", new StringBuilder(String.valueOf(str).length() + 30).append("unknown message type to send: ").append(str).toString(), new Object[0]);
                return;
        }
    }

    private static void m5795a(fhc fhc, bme bme, boolean z) {
        int i;
        String str = bme.f3927a;
        String str2 = bme.f3928b;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        fhc.m15308a(new coh(str, str2, i));
    }

    private static void m5773a(blo blo, long j, fhc fhc, bme bme) {
        List<String> g = blf.m5824g(blo, bme.f3928b);
        long d = blo.m6037d(bme.f3928b, 1000);
        String str;
        String str2;
        if (bme.f3952z == 1) {
            str = bme.f3941o;
            if ("hangouts/location".equals(str)) {
                str2 = "image/jpeg";
            } else {
                str2 = str;
            }
            fhc.m15308a(new fjs(bme.f3928b, bme.f3927a, d).m15485a((String[]) g.toArray(new String[g.size()])).m15484a(bme.f3916C).m15487b(bme.m6159a()).m15489c(bme.f3936j).m15491d(str2).m15482a(bme.f3914A).m15486b(bme.f3915B).m15488c(bme.f3917D).m15492e(bme.f3920G).m15490d(bme.f3921H).m15483a(j).m15481a());
        } else if (bme.f3952z == 0) {
            long a = fyi.m16583a(gwb.m1400H(), (List) g);
            str2 = blo.m5929U(bme.f3928b);
            for (String str3 : g) {
                fhc.m15308a(new fjx(bme.f3928b, bme.f3927a, d).m15517a(str3).m15519b(bme.m6159a()).m15516a(a).m15520c(str2).m15518b(j).m15515a());
            }
        } else {
            glk.m17982e("Babel_ConversationsData", "Resending unknown type of SMS message: " + bme.f3952z, new Object[0]);
            return;
        }
        blo.m5965a(j, fwx.SENDING, d);
    }

    private static void m5789a(blo blo, String str, List<edk> list, List<bcg> list2) {
        if (f3692a) {
            String str2 = "insertTemporaryConversationParticipants ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        for (edk a : list) {
            blo.m5981a(str, a, true);
        }
        if (list2 != null) {
            for (bcg a2 : list2) {
                blo.m5980a(str, a2);
            }
        } else {
            blo.m5915G(str);
        }
        blf.m5813b(blo, str);
    }

    private static void m5792a(blo blo, List<edk> list) {
        ContentValues contentValues = new ContentValues();
        String[] strArr = new String[1];
        for (edk edk : list) {
            String f = edk.m13596f();
            if (f != null) {
                contentValues.clear();
                edo edo = edk.f11213b;
                contentValues.put("phone_id", f);
                strArr[0] = edo.f11245b;
                blo.m6044e().m6194a("participants", contentValues, "chat_id=?", strArr);
            }
        }
    }

    public static void m5813b(blo blo, String str) {
        List<edk> H = blo.m5916H(str);
        List arrayList = new ArrayList(H.size());
        List arrayList2 = new ArrayList(H.size());
        String str2 = null;
        bjm a = ((bjn) jyn.m25426a(blo.m6049f(), bjn.class)).mo1757a(blo.m6061h());
        try {
            for (edk edk : H) {
                blo.m5967a(a, edk);
                CharSequence charSequence = edk.f11219h;
                if (TextUtils.isEmpty(charSequence)) {
                    if (!edk.f11213b.equals(blo.m6056g().m5632b())) {
                        arrayList2.add(edk.f11216e);
                    }
                } else if (edk.f11213b.equals(blo.m6056g().m5632b())) {
                    str2 = charSequence;
                } else {
                    arrayList.add(charSequence);
                }
            }
            String a2 = gwb.m1669a(arrayList, arrayList2);
            String b = blf.m5806b(blo, str, (List) H);
            if (glk.m17973a("Babel_ConversationsData", 3)) {
                String str3 = "Babel_ConversationsData";
                String str4 = "generated name ";
                String valueOf = String.valueOf(b);
                glk.m17970a(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
                str3 = "Babel_ConversationsData";
                str4 = "packed participant urls ";
                valueOf = String.valueOf(a2);
                glk.m17970a(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            }
            blo.m6021b(str, b, a2, str2);
        } finally {
            a.mo1753a();
        }
    }

    private static String m5806b(blo blo, String str, List<edk> list) {
        StringBuilder stringBuilder = new StringBuilder();
        edo b = blo.m6056g().m5632b();
        bls f = blo.m6050f(str);
        if (f != null && f.f3758d != null) {
            return f.f3758d;
        }
        Object obj;
        if (f == null || f.f3756b == 1 || (f.f3756b == 2 && gwb.m2237h(f.f3757c))) {
            obj = 1;
        } else {
            obj = null;
        }
        Object obj2 = null;
        for (edk edk : list) {
            Object obj3;
            if (edk.f11215d != null) {
                obj3 = edk.f11216e;
            } else if (edk.f11213b != null) {
                if (obj2 == null && edk.f11213b.equals(b) && list.size() > 1) {
                    obj2 = 1;
                } else {
                    if (f3696e == null) {
                        CharSequence f2 = glq.m18025f(gwb.m1400H());
                        f3696e = f2;
                        if (f2 == null) {
                            f3696e = "";
                        }
                    }
                    if (obj2 == null && TextUtils.equals(edk.m13596f(), f3696e)) {
                        obj2 = 1;
                    } else {
                        obj3 = gwb.m1648a(gwb.m1400H(), edk, obj == null);
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

    public static void m5811b(blo blo) {
        glk.m17970a("Babel_ConversationsData", "NOTIFY ALL PARTICIPANTS", new Object[0]);
        bkf.m5579a(blo.m6056g(), null);
    }

    public static void m5818c(blo blo, String str) {
        String str2 = "Babel_ConversationsData";
        String str3 = "NOTIFY PARTICIPANTS, conversation_id=";
        String valueOf = String.valueOf(str);
        glk.m17970a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        gwb.m1400H().getContentResolver().notifyChange(EsProvider.m8251a(EsProvider.f6005h, blo.m6056g().m5638g()), null);
        bkf.m5579a(blo.m6056g(), str);
    }

    public static void m5817c(blo blo) {
        glk.m17970a("Babel_ConversationsData", "NOTIFY ALL MESSAGES", new Object[0]);
        blf.m5821d(blo, null);
    }

    public static void m5756a() {
        synchronized (f3693b) {
            if (f3694c <= 0) {
                throw new IllegalStateException("sPendingChangeNotificationsCount is " + f3694c);
            }
            int i = f3694c - 1;
            f3694c = i;
            if (i == 0) {
                ContentResolver contentResolver = gwb.m1400H().getContentResolver();
                Iterator it = f3697f.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (blf.m5827i(uri)) {
                        blf.m5760a(gwb.m1400H(), Integer.parseInt(uri.getQueryParameter("account_id")));
                    } else {
                        contentResolver.notifyChange(uri, null);
                    }
                }
                f3697f.clear();
            }
        }
    }

    private static void m5825g(Uri uri) {
        synchronized (f3693b) {
            if (f3694c != 0) {
                f3697f.add(uri);
            } else if (blf.m5827i(uri)) {
                blf.m5760a(gwb.m1400H(), Integer.parseInt(uri.getQueryParameter("account_id")));
            } else {
                gwb.m1400H().getContentResolver().notifyChange(uri, null);
            }
        }
    }

    public static void m5821d(blo blo, String str) {
        String valueOf;
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "NOTIFY MESSAGES, conversation_id=";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17970a(str2, valueOf, new Object[0]);
        }
        gid gid = (gid) jyn.m25426a(blo.m6049f(), gid.class);
        bko g = blo.m6056g();
        blf.m5825g(EsProvider.m8251a(EsProvider.f6005h, g.m5638g()));
        Set set = null;
        if (str != null) {
            set = blo.ab(str);
        }
        String str4;
        if (r1 != null && r1.size() > 0) {
            for (String valueOf2 : r1) {
                if (glk.m17973a("Babel_ConversationsData", 3)) {
                    str4 = "Babel_ConversationsData";
                    String str5 = "NOTIFY MESSAGES message id = ";
                    str2 = String.valueOf(valueOf2);
                    glk.m17970a(str4, str2.length() != 0 ? str5.concat(str2) : new String(str5), new Object[0]);
                }
                blf.m5825g(EsProvider.m8253a(g, valueOf2));
            }
        } else if (str != null) {
            String str6 = "Babel_ConversationsData";
            str4 = "NOTIFY MESSAGES no messages yet for conversation id = ";
            str2 = String.valueOf(str);
            glk.m17981d(str6, str2.length() != 0 ? str4.concat(str2) : new String(str4), new Object[0]);
            blf.m5825g(EsProvider.m8253a(g, str));
            ayo bow = new bow(str, g.m5638g(), box.UNSPECIFIED);
            gid.mo2276a(bow, bow.m6328a());
        } else {
            glk.m17982e("Babel_ConversationsData", "NOTIFY MESSAGES no message/conversation yet!", new Object[0]);
        }
        blf.m5825g(EsProvider.m8266b(g, str));
        blf.m5825g(blf.m5804b(g.m5638g()));
    }

    public static void m5822e(blo blo, String str) {
        if (glk.m17973a("Babel_ConversationsData", 3)) {
            String str2 = "Babel_ConversationsData";
            String str3 = "NOTIFY EVENT SUGGESTIONS, conversation_id=";
            String valueOf = String.valueOf(str);
            glk.m17970a(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
        blf.m5825g(EsProvider.m8271c(blo.m6056g().m5638g(), str));
    }

    public static void m5820d(blo blo) {
        blf.m5757a(blo.m6056g().m5638g());
    }

    public static void m5757a(int i) {
        blf.m5825g(EsProvider.m8251a(EsProvider.f6005h, i));
        blf.m5825g(EsProvider.m8251a(EsProvider.f6006i, i));
        blf.m5825g(EsProvider.m8251a(EsProvider.f6007j, i));
        blf.m5825g(blf.m5804b(i));
    }

    public static void m5823f(blo blo, String str) {
        blf.m5761a(blo.m6056g());
        ayo bow = new bow(str, blo.m6061h(), box.UNSPECIFIED);
        ((gid) jyn.m25426a(blo.m6049f(), gid.class)).mo2276a(bow, bow.m6328a());
    }

    public static void m5761a(bko bko) {
        blf.m5825g(EsProvider.m8251a(EsProvider.f6006i, bko.m5638g()));
        blf.m5825g(EsProvider.m8251a(EsProvider.f6005h, bko.m5638g()));
        blf.m5825g(blf.m5804b(bko.m5638g()));
    }

    public static void m5768a(bko bko, String str, String str2) {
        if (str2 != null) {
            blo blo = new blo(gwb.m1400H(), bko.m5638g());
            blo.m5958a();
            try {
                blo.m6030c(str, str2);
                blo.m6015b();
            } finally {
                blo.m6028c();
            }
        } else {
            glk.m17982e("Babel_ConversationsData", "revertConversationName: empty name", new Object[0]);
        }
    }

    public static void m5767a(bko bko, String str, int i) {
        new blo(gwb.m1400H(), bko.m5638g()).m6059g(str, i);
    }

    public static void m5764a(bko bko, Intent intent, boolean z) {
        blf.m5765a(bko, (Uri) intent.getParcelableExtra("uri"), intent.getLongExtra("notification_row_id", -1), null, z, false);
    }

    private static void m5765a(bko bko, Uri uri, long j, Boolean bool, boolean z, boolean z2) {
        if (uri != null) {
            Object obj;
            String n;
            blo blo = new blo(gwb.m1400H(), bko.m5638g());
            if (j <= 0) {
                obj = null;
            } else if (z) {
                blo.m6084m(j);
                obj = null;
            } else {
                n = blo.m6091n(j);
                blo.m6052f(j);
                String str = n;
            }
            fxp e = fyi.m16633e(uri);
            if (e == null) {
                glk.m17982e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: failed to load mms", new Object[0]);
            } else if (e.f14287w.size() <= 0) {
                glk.m17982e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS message has no part", new Object[0]);
            } else {
                List a = fyi.m16604a(e.f14282r);
                if (a == null || a.size() <= 0) {
                    glk.m17982e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS message has no recipient", new Object[0]);
                    return;
                }
                edo b;
                String str2;
                if (z2) {
                    b = blo.m6056g().m5632b();
                    str2 = null;
                } else {
                    n = fyi.m16600a(a, e.f14277m);
                    if (TextUtils.isEmpty(n)) {
                        b = null;
                        str2 = n;
                    } else {
                        b = gwb.m2130d(gwb.m1400H(), n);
                        str2 = n;
                    }
                }
                if (b == null) {
                    glk.m17982e("Babel_ConversationsData", "EsConversationsData.processReceivedMms: MMS has no From: id=" + e.f14277m + " type=" + e.f14278n + " thread_id=" + e.f14282r, new Object[0]);
                    return;
                }
                edo edo;
                long j2 = e.f14281q;
                boolean a2 = blf.m5802a(b);
                if (a2) {
                    edo = b;
                } else {
                    edo = null;
                }
                n = fyi.m16597a(blo, edo, a);
                if (TextUtils.isEmpty(n)) {
                    glk.m17982e("Babel_ConversationsData", "EsConversationsData.processNewMms: empty conversation id", new Object[0]);
                    return;
                }
                bls e2 = blo.m6043e(n);
                boolean d = RealTimeChatService.m9103d(bko, n);
                if (bool == null) {
                    bool = Boolean.valueOf(d);
                }
                fyi.m16609a(uri, gwb.m2061b(bool));
                int k = e.m16497k();
                boolean i = e.m16495i();
                Object obj2 = (k > 1 || (k > 0 && !i)) ? 1 : null;
                int a3 = fle.m15603a(blo.m6049f(), bko.m5638g(), n);
                fea f = new fea().m15116a(n).m15113a(b).m15134e(j2).m15122b(blo.m5900i()).m15127c(e.m16491e()).m15123b(e.m16498l()).m15124b(false).m15115a(fwx.ON_SERVER).m15120b(3).m15135e(gwb.m1678a(uri.toString())).m15125c(e.f14283s).m15140g(e.m16494h()).m15138f(e.f14279o);
                int i2 = obj2 != null ? 9 : i ? 3 : 2;
                f.m15130d(i2).m15141g(str2).m15142h(fyi.m16601a(a, str2)).m15129c(true).m15133e(1).m15136f(a3).m15119a().m15617a(blo, new fhc());
                blo.m5958a();
                try {
                    blo.m6063h(n, j2);
                    blo.m6093n(n, e.f14282r);
                    if (!(a2 || d || e2.f3776v != 30)) {
                        ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1831a(bko.m5638g(), false);
                    }
                    if (gwb.m2061b(bool)) {
                        blo.m5978a(n, j2, false, "processnewsms");
                    } else if (a2) {
                        blo.m6110w(n);
                    }
                    blo.m6015b();
                    blf.m5821d(blo, n);
                    if (!(TextUtils.equals(n, obj) || j <= 0 || z)) {
                        RealTimeChatService.f6752i.post(new fhs(obj, bko, new blg(str2)));
                    }
                    blf.m5826h(uri);
                    if (str2 != null) {
                        bkq.m5664a(gwb.m1400H(), bko.m5638g(), "received_mms_count_since_last_upload");
                    }
                } finally {
                    blo.m6028c();
                }
            }
        }
    }

    public static void m5763a(bko bko, Intent intent) {
        SmsMessage[] messagesFromIntent = Intents.getMessagesFromIntent(intent);
        String stringExtra = intent.getStringExtra("format");
        if (messagesFromIntent == null || messagesFromIntent.length <= 0) {
            glk.m17982e("Babel_ConversationsData", "processReceivedSms: null or zero message", new Object[0]);
            return;
        }
        int length = messagesFromIntent.length;
        int i = 0;
        while (i < length) {
            try {
                messagesFromIntent[i].getDisplayMessageBody();
                i++;
            } catch (NullPointerException e) {
                glk.m17982e("Babel_ConversationsData", "processReceivedSms: NPE inside SmsMessage", new Object[0]);
                return;
            }
        }
        if (fyi.m16635g()) {
            long timestampMillis = messagesFromIntent[0].getTimestampMillis();
            Object[] objArr = (Object[]) intent.getSerializableExtra("pdus");
            String valueOf;
            ObjectOutputStream objectOutputStream;
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
                glk.m17980d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 9).append("dumpSms: ").append(valueOf).toString(), e2);
            } catch (Throwable th) {
                objectOutputStream.close();
            }
        }
        if (messagesFromIntent[0].getMessageClass() == MessageClass.CLASS_0) {
            SmsMessage smsMessage = messagesFromIntent[0];
            Context H = gwb.m1400H();
            H.startActivity(new Intent(H, ClassZeroActivity.class).putExtra("pdu", smsMessage.getPdu()).putExtra("format", stringExtra).putExtra("account_id", bko.m5638g()).setFlags(402653184));
            return;
        }
        blf.m5797a(messagesFromIntent, bko, intent.getIntExtra("errorCode", 0), null);
        bkq.m5664a(gwb.m1400H(), bko.m5638g(), "received_sms_count_since_last_upload");
    }

    public static void m5797a(SmsMessage[] smsMessageArr, bko bko, int i, Boolean bool) {
        Context H = gwb.m1400H();
        ContentValues a = fyi.m16585a(H, smsMessageArr, i);
        String asString = a.getAsString("address");
        String asString2 = a.getAsString("body");
        if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.storeSmsMessage: empty sender or body", new Object[0]);
            return;
        }
        edo edo;
        blo blo = new blo(gwb.m1400H(), bko.m5638g());
        edo d = gwb.m2130d(gwb.m1400H(), asString);
        boolean a2 = blf.m5802a(d);
        if (a2) {
            edo = d;
        } else {
            edo = null;
        }
        String a3 = fyi.m16596a(blo, edo, asString);
        if (TextUtils.isEmpty(a3)) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.storeSmsMessage: empty conversation id", new Object[0]);
            return;
        }
        String a4;
        bls e = blo.m6043e(a3);
        boolean d2 = RealTimeChatService.m9103d(bko, a3);
        if (bool == null) {
            bool = Boolean.valueOf(d2);
        }
        long a5 = gwb.m1523a(fyi.m16594a(smsMessageArr[0], blo.m6037d(a3, 1000) / 1000));
        a.put("date", Long.valueOf(a5));
        a.put("read", gwb.m2061b(bool) ? Integer.valueOf(1) : Integer.valueOf(0));
        if (gwb.m1572a(H.getContentResolver(), Inbox.CONTENT_URI, a) != null) {
            a4 = gwb.m1678a(gwb.m1572a(H.getContentResolver(), Inbox.CONTENT_URI, a).toString());
        } else {
            glk.m17982e("Babel_ConversationsData", "storeSmsMessage: failed to insert SMS to telephony", new Object[0]);
            a4 = null;
        }
        long j = 1000 * a5;
        Long asLong = a.getAsLong("date_sent");
        if (asLong == null) {
            a5 = 0;
        } else {
            a5 = gwb.m1523a(asLong) * 1000;
        }
        new fea().m15116a(a3).m15113a(d).m15134e(j).m15122b(blo.m5900i()).m15127c(asString2).m15124b(false).m15115a(fwx.ON_SERVER).m15120b(3).m15135e(a4).m15137f(a5).m15130d(2).m15141g(asString).m15129c(true).m15133e(0).m15136f(fle.m15603a(H, bko.m5638g(), a3)).m15119a().m15617a(blo, new fhc());
        blo.m5958a();
        try {
            blo.m6063h(a3, j);
            Integer asInteger = a.getAsInteger("reply_path_present");
            a4 = a.getAsString("service_center");
            if (asInteger == null || gwb.m1507a(asInteger) != 1) {
                blo.m6083l(a3, null);
            } else {
                blo.m6083l(a3, a4);
            }
            blo.m6093n(a3, gwb.m1523a(a.getAsLong("thread_id")));
            if (!(a2 || d2 || e.f3776v != 30)) {
                ((ect) jyn.m25426a(H, ect.class)).mo1831a(bko.m5638g(), false);
            }
            if (gwb.m2061b(bool)) {
                blo.m5978a(a3, j, false, "storesms");
            } else if (a2) {
                blo.m6110w(a3);
            }
            blo.m6015b();
            blf.m5821d(blo, a3);
        } finally {
            blo.m6028c();
        }
    }

    public static void m5784a(blo blo, String str, String str2, Uri uri, long j, long j2, boolean z, long j3, long j4) {
        try {
            blo.m5958a();
            Long h = blo.m6064h(str, str2);
            if (h == null) {
                String str3 = "Babel_ConversationsData";
                String str4 = "processSmsMmsSendResponse: received response for nonexistant  clientGeneratedId ";
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.m17982e(str3, valueOf, new Object[0]);
            } else {
                if (z) {
                    blf.m5765a(blo.m6056g(), uri, j3, Boolean.valueOf(true), false, true);
                }
                blo.m5976a(str, gwb.m1523a(h), j2, 0);
                blo.m5991a(str, str2, uri, j);
                blo.m6063h(str, j2);
                blo.m6093n(str, j4);
            }
            blo.m6015b();
            blf.m5821d(blo, str);
            blf.m5826h(uri);
        } finally {
            blo.m6028c();
        }
    }

    private static void m5826h(Uri uri) {
        if (uri != null && uri.getAuthority() != null) {
            String toLowerCase = uri.getAuthority().toLowerCase(Locale.US);
            int i = -1;
            if ("sms".equals(toLowerCase)) {
                i = 0;
            } else if ("mms".equals(toLowerCase)) {
                i = 1;
            }
            if (i >= 0) {
                fzb.m16679b(i, fyi.m16624c(uri));
            }
        }
    }

    public static void m5758a(int i, aif aif) {
        bko e = fde.m15018e(i);
        if (e == null) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.processMmsNotification: no account", new Object[0]);
            return;
        }
        blo blo = new blo(gwb.m1400H(), e.m5638g());
        String a = fyi.m16602a(aif.m2463d(), "UTF-8");
        byte[] g = aif.m2466g();
        String a2 = fyi.m16602a(g, "UTF-8");
        aic c = aif.mo224c();
        String c2 = c != null ? c.m2444c() : null;
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
        long f = aif.m2465f();
        long e2 = aif.m2464e();
        boolean a3 = blf.m5802a(gwb.m2130d(gwb.m1400H(), c2));
        if (!fyi.m16630d() || a3) {
            blf.m5786a(blo, a, a2, c2, a3, f, e2, 0, bc.gX);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content_location", a);
        contentValues.put("transaction_id", a2);
        contentValues.put("from_address", c2);
        contentValues.put("message_size", Long.valueOf(f));
        contentValues.put("expiry", Long.valueOf(e2));
        RealTimeChatService.m9004a(e.m5638g(), a, g, blo.m5938a(contentValues), true);
    }

    private static void m5786a(blo blo, String str, String str2, String str3, boolean z, long j, long j2, int i, int i2) {
        edo edo;
        String a;
        bko g = blo.m6056g();
        Context H = gwb.m1400H();
        Resources resources = H.getResources();
        if (TextUtils.isEmpty(str3)) {
            edo = gwb.m1364A().f11213b;
            a = fyi.m16598a(blo, z, Arrays.asList(new edk[]{r2}));
        } else {
            edo = gwb.m2130d(gwb.m1400H(), str3);
            a = fyi.m16596a(blo, z ? edo : null, str3);
        }
        if (TextUtils.isEmpty(a)) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.storeMmsNotificationMessage: failed to get conv.", new Object[0]);
            return;
        }
        long d = blo.m6037d(a, 1000);
        Object[] objArr = new Object[2];
        String valueOf = String.valueOf(String.valueOf(fyi.m16617b(j)));
        String valueOf2 = String.valueOf(resources.getString(bc.fH));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        objArr[0] = valueOf2;
        objArr[1] = DateUtils.formatDateTime(H, 1000 * j2, 131097);
        new fea().m15116a(a).m15113a(edo).m15134e(d).m15122b(blo.m5900i()).m15117a(gwb.m1700a(resources.getString(i2, objArr), 2)).m15124b(false).m15115a(i == 0 ? fwx.ON_SERVER : fwx.FAILED_TO_SEND).m15111a(i).m15120b(3).m15135e(gwb.m1678a(str, str2)).m15130d(2).m15129c(true).m15133e(2).m15119a().m15617a(blo, new fhc());
        blo.m5958a();
        try {
            blo.m6060g(a, d);
            if (z) {
                blo.m6110w(a);
            } else if (!RealTimeChatService.m9103d(blo.m6056g(), a)) {
                ((ect) jyn.m25426a(H, ect.class)).mo1831a(g.m5638g(), false);
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }

    public static void m5762a(bko bko, long j, boolean z, int i) {
        if (j < 0) {
            glk.m17982e("Babel_ConversationsData", "displayMmsDownloadFailure: invalid notification row id " + j, new Object[0]);
            return;
        }
        blo blo = new blo(gwb.m1400H(), bko.m5638g());
        if (z) {
            String[] strArr = bli.f3700a;
            String valueOf = String.valueOf("_id=");
            Cursor a = blo.m6044e().m6200a("mms_notification_inds", strArr, new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(j).toString(), null, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        blf.m5786a(blo, a.getString(0), a.getString(1), a.getString(2), false, a.getLong(3), a.getLong(4), i, bc.gX);
                        blo.m6084m(j);
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
        blo.m5955a(contentValues, new StringBuilder(String.valueOf(valueOf2).length() + 20).append(valueOf2).append(j).toString(), null);
        blf.m5812b(blo, j);
    }

    public static void m5812b(blo blo, long j) {
        bme b = blo.m6009b(j);
        if (b != null) {
            blf.m5821d(blo, b.f3928b);
        }
    }

    public static void m5809b(bko bko, Intent intent) {
        SmsMessage a = fyi.m16590a(intent);
        if (a == null) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.processSmsDeliveryReport: empty report message", new Object[0]);
            return;
        }
        long parseId = ContentUris.parseId(intent.getData());
        if (parseId < 0) {
            glk.m17982e("Babel_ConversationsData", "EsConversationsData.processSmsDeliveryReport: can't find message", new Object[0]);
            return;
        }
        try {
            int status = a.getStatus();
            long a2 = glj.m17956a();
            blo blo = new blo(gwb.m1400H(), bko.m5638g());
            blo.m5963a(parseId, status, 1000 * a2);
            blf.m5812b(blo, parseId);
            String n = gwb.m2307n(blo.m6058g(parseId));
            if (n != null) {
                fyi.m16610a(n, status, a2);
            }
        } catch (NullPointerException e) {
            glk.m17982e("Babel_ConversationsData", "processSmsDeliveryReport: NPE inside SmsMessage", new Object[0]);
        }
    }

    public static void m5808b() {
        int e = fyi.m16632e();
        glk.m17979c("Babel_ConversationsData", "Message purging: deleted " + e + " media messages in telephony", new Object[0]);
        if (e > 0) {
            bko k = fde.m15031k();
            if (k != null) {
                blo blo = new blo(gwb.m1400H(), k.m5638g());
                glk.m17979c("Babel_ConversationsData", "Message purging: deleted " + blo.m6112x() + " media messages in Hangouts", new Object[0]);
                blf.m5817c(blo);
            }
        }
    }

    public static void m5759a(long j) {
        long a = glj.m17956a() - j;
        int c = fyi.m16623c(a);
        glk.m17979c("Babel_ConversationsData", "Message purging: deleted " + c + " old sms/mms messages in telephony", new Object[0]);
        if (c > 0) {
            bko k = fde.m15031k();
            if (k != null) {
                blo blo = new blo(gwb.m1400H(), k.m5638g());
                glk.m17979c("Babel_ConversationsData", "Message purging: deleted " + blo.m6079l(a * 1000) + " old sms/mms messages in Hangouts", new Object[0]);
                blf.m5817c(blo);
            }
        }
    }

    public static void m5769a(bko bko, String str, String str2, String str3) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str2));
        if (ba.m4623c(str3) || "hangouts/gv_voicemail".equals(str3)) {
            RealTimeChatService.m9124m(bko, str2);
        } else if (ba.m4630d(str3)) {
            RealTimeChatService.m9108e(bko, str, str2);
        }
    }

    public static String m5805b(bko bko, String str, String str2, String str3) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str2));
        String X = new blo(gwb.m1400H(), bko.m5638g()).m5932X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        blf.m5769a(bko, str, str2, str3);
        return null;
    }

    public static List<String> m5824g(blo blo, String str) {
        List<edk> H = blo.m5916H(str);
        List<String> arrayList = new ArrayList();
        for (edk f : H) {
            Object f2 = f.m13596f();
            if (!TextUtils.isEmpty(f2)) {
                arrayList.add(f2.trim());
            }
        }
        return arrayList;
    }

    public static void m5766a(bko bko, fhc fhc, String str) {
        blo blo = new blo(gwb.m1400H(), bko.m5638g());
        blo.m6059g(str, 0);
        blf.m5794a(fhc, blo, str);
    }

    public static void m5810b(bko bko, String str) {
        String valueOf;
        ObjectInputStream objectInputStream;
        Throwable e;
        aid aid = null;
        if (TextUtils.isEmpty(str)) {
            glk.m17982e("Babel_ConversationsData", "receiveSmsFromDumpFile: empty dump file name", new Object[0]);
        } else if (str.startsWith("smsdump-")) {
            try {
                valueOf = String.valueOf(Environment.getExternalStorageDirectory());
                objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("/").append(str).toString())));
                Object[] objArr = (Object[]) objectInputStream.readObject();
                objectInputStream.close();
                if (objArr == null || objArr.length <= 0) {
                    glk.m17982e("Babel_ConversationsData", "receiveSmsFromDumpFile: empty data", new Object[0]);
                }
                SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                }
                blf.m5797a(smsMessageArr, bko, 0, null);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 24).append("receiveSmsFromDumpFile: ").append(valueOf).toString(), e);
            } catch (ClassNotFoundException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                glk.m17980d("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 24).append("receiveSmsFromDumpFile: ").append(valueOf).toString(), e);
            } catch (Throwable th) {
                objectInputStream.close();
            }
        } else if (str.startsWith("mmsdump-")) {
            try {
                valueOf = String.valueOf(Environment.getExternalStorageDirectory());
                byte[] a = gwb.m1950a(gwb.m1683a(new File(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("/").append(str).toString()), false));
                if (a != null) {
                    aid = new ain(a).m2518a();
                }
                if (aid == null || !(aid instanceof ait)) {
                    glk.m17982e("Babel_ConversationsData", "receiveMmsFromDumpFile: failed to parse PDU", new Object[0]);
                    return;
                }
                Uri a2 = fyi.m16587a(gwb.m1400H(), (ait) aid);
                if (a2 == null) {
                    glk.m17982e("Babel_ConversationsData", "receiveMmsFromDumpFile: failed to persist PDU", new Object[0]);
                } else {
                    blf.m5765a(bko, a2, -1, null, true, false);
                }
            } catch (Throwable e4) {
                valueOf = String.valueOf(e4);
                glk.m17980d("Babel_ConversationsData", new StringBuilder(String.valueOf(valueOf).length() + 24).append("receiveMmsFromDumpFile: ").append(valueOf).toString(), e4);
            }
        } else {
            valueOf = "Babel_ConversationsData";
            String str2 = "receiveSmsFromDumpFile: invalid dump file name ";
            String valueOf2 = String.valueOf(str);
            glk.m17982e(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
        }
    }

    public static boolean m5802a(edo edo) {
        if (edo == null) {
            return false;
        }
        return new blo(gwb.m1400H(), fde.m15031k().m5638g()).m6073j(null, edo.f11245b);
    }

    public static boolean m5798a(bko bko, fpg fpg) {
        if (bko == null || fpg == null) {
            return false;
        }
        edo b = bko.m5632b();
        for (edo equals : fpg.m15882k()) {
            if (b.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static void m5760a(Context context, int i) {
        Intent intent = new Intent("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED");
        if (i != -1) {
            intent.putExtra("account_id", i);
        }
        context.sendBroadcast(intent);
    }

    private static Uri m5804b(int i) {
        Builder buildUpon = f3695d.buildUpon();
        buildUpon.appendQueryParameter("account_id", i);
        return buildUpon.build();
    }

    private static boolean m5827i(Uri uri) {
        return uri != null && f3695d.getPath().equals(uri.getPath());
    }
}

package defpackage;

import android.content.Context;
import android.telecom.ConnectionRequest;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* renamed from: gcv */
public final class gcv {
    private final Context a;
    private final int b;
    private boolean c;
    private ArrayList<gfx> d;

    public gcv(Context context, int i) {
        this.a = context;
        this.b = i;
        this.d = new ArrayList();
    }

    private void a(gfx gfx) {
        this.d.add(gfx);
    }

    boolean a(ConnectionRequest connectionRequest, boolean z) {
        Object scheme;
        boolean z2;
        Object obj = null;
        if (!this.c) {
            c();
            this.c = true;
        }
        a();
        if (connectionRequest.getAddress() != null) {
            scheme = connectionRequest.getAddress().getScheme();
            obj = connectionRequest.getAddress().getSchemeSpecificPart();
        } else {
            scheme = null;
        }
        gfx gfx = new gfx();
        if (!TextUtils.isEmpty(scheme)) {
            gfx.a = scheme;
        }
        if (!TextUtils.isEmpty(obj)) {
            gfx.b = obj;
        }
        gfx.c = glj.b();
        gfx.d = z;
        ListIterator listIterator = this.d.listIterator(this.d.size());
        while (listIterator.hasPrevious()) {
            int i;
            gfx gfx2 = (gfx) listIterator.previous();
            Context context = this.a;
            if (gfx.d == gfx2.d) {
                glk.c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, calls are on same network", new Object[0]);
                i = 0;
                continue;
            } else if (gcv.a(gfx.a, gfx.b, gfx2.a, gfx2.b)) {
                boolean z3;
                long abs = Math.abs(gfx2.c - gfx.c);
                long a = gcv.a(context);
                glk.c("Babel_telephony", "TeleDedupeCallLog.areStartTimesLooselyEqual, delta: " + abs + " maxDelta: " + a, new Object[0]);
                if (abs < a) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    glk.c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, returning true", new Object[0]);
                    z3 = true;
                    continue;
                } else {
                    glk.c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, start times are different", new Object[0]);
                    i = 0;
                    continue;
                }
            } else {
                glk.c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, phone numbers are different", new Object[0]);
                i = 0;
                continue;
            }
            if (i != 0) {
                glk.d("Babel_telephony", "TeleDedupeCallLog.dedupeIncomingRing, found duplicate ring with start time: " + gfx2.c, new Object[0]);
                listIterator.remove();
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (!z2) {
            a(gfx);
        }
        b();
        return z2;
    }

    private void a() {
        long b = glj.b();
        long a = gcv.a(this.a);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            long j = b - ((gfx) it.next()).c;
            if (j < 0 || j >= a) {
                it.remove();
            }
        }
    }

    private void b() {
        if (this.d.isEmpty()) {
            ggc.a(this.a).b(this.b, null);
            return;
        }
        nzf gfw = new gfw();
        gfw.a = (gfx[]) this.d.toArray(new gfx[this.d.size()]);
        ggc.a(this.a).b(this.b, Base64.encodeToString(nzf.a(gfw), 0));
    }

    private void c() {
        String d = ggc.a(this.a).d(this.b);
        if (d != null) {
            byte[] decode = Base64.decode(d, 0);
            if (decode != null) {
                try {
                    this.d = new ArrayList(Arrays.asList(((gfw) nzf.a(new gfw(), decode)).a));
                } catch (Throwable e) {
                    glk.d("Babel_telephony", "TeleDedupeCallLog.readCallLogEntries, unable to parse entries", e);
                }
            }
        }
    }

    static boolean a(String str, String str2, String str3, String str4) {
        String valueOf = String.valueOf(gwb.G(str2));
        String valueOf2 = String.valueOf(gwb.G(str4));
        glk.c("Babel_telephony", new StringBuilder((((String.valueOf(str).length() + 51) + String.valueOf(valueOf).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append("TeleDedupeCallLog.arePhoneNumbersLooselyEqual, ").append(str).append(":").append(valueOf).append(", ").append(str3).append(":").append(valueOf2).toString(), new Object[0]);
        if (!Objects.equals(str, str3)) {
            glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, schemes don't match", new Object[0]);
            return false;
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str4)) {
            glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, both phone numbers are empty, returning true", new Object[0]);
            return true;
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, only one phone number is empty", new Object[0]);
            return false;
        } else {
            if ("tel".equals(str)) {
                if (!PhoneNumberUtils.compare(str2, str4)) {
                    glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, loose comparison of phone numbers failed", new Object[0]);
                    return false;
                }
            } else if (str2.equals(str4)) {
                glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, phone numbers are not equal", new Object[0]);
                return false;
            }
            glk.c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, returning true", new Object[0]);
            return true;
        }
    }

    static long a(Context context) {
        return gwb.a(context, "babel_incoming_wifi_call_duplicate_time_millis", 20000);
    }
}

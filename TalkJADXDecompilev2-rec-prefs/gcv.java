package p000;

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

public final class gcv {
    private final Context f14706a;
    private final int f14707b;
    private boolean f14708c;
    private ArrayList<gfx> f14709d = new ArrayList();

    public gcv(Context context, int i) {
        this.f14706a = context;
        this.f14707b = i;
    }

    private void m16985a(gfx gfx) {
        this.f14709d.add(gfx);
    }

    boolean m16989a(ConnectionRequest connectionRequest, boolean z) {
        Object scheme;
        boolean z2;
        Object obj = null;
        if (!this.f14708c) {
            m16988c();
            this.f14708c = true;
        }
        m16984a();
        if (connectionRequest.getAddress() != null) {
            scheme = connectionRequest.getAddress().getScheme();
            obj = connectionRequest.getAddress().getSchemeSpecificPart();
        } else {
            scheme = null;
        }
        gfx gfx = new gfx();
        if (!TextUtils.isEmpty(scheme)) {
            gfx.f15189a = scheme;
        }
        if (!TextUtils.isEmpty(obj)) {
            gfx.f15190b = obj;
        }
        gfx.f15191c = glj.m17963b();
        gfx.f15192d = z;
        ListIterator listIterator = this.f14709d.listIterator(this.f14709d.size());
        while (listIterator.hasPrevious()) {
            int i;
            gfx gfx2 = (gfx) listIterator.previous();
            Context context = this.f14706a;
            if (gfx.f15192d == gfx2.f15192d) {
                glk.m17979c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, calls are on same network", new Object[0]);
                i = 0;
                continue;
            } else if (gcv.m16986a(gfx.f15189a, gfx.f15190b, gfx2.f15189a, gfx2.f15190b)) {
                boolean z3;
                long abs = Math.abs(gfx2.f15191c - gfx.f15191c);
                long a = gcv.m16983a(context);
                glk.m17979c("Babel_telephony", "TeleDedupeCallLog.areStartTimesLooselyEqual, delta: " + abs + " maxDelta: " + a, new Object[0]);
                if (abs < a) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    glk.m17979c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, returning true", new Object[0]);
                    z3 = true;
                    continue;
                } else {
                    glk.m17979c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, start times are different", new Object[0]);
                    i = 0;
                    continue;
                }
            } else {
                glk.m17979c("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, phone numbers are different", new Object[0]);
                i = 0;
                continue;
            }
            if (i != 0) {
                glk.m17981d("Babel_telephony", "TeleDedupeCallLog.dedupeIncomingRing, found duplicate ring with start time: " + gfx2.f15191c, new Object[0]);
                listIterator.remove();
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (!z2) {
            m16985a(gfx);
        }
        m16987b();
        return z2;
    }

    private void m16984a() {
        long b = glj.m17963b();
        long a = gcv.m16983a(this.f14706a);
        Iterator it = this.f14709d.iterator();
        while (it.hasNext()) {
            long j = b - ((gfx) it.next()).f15191c;
            if (j < 0 || j >= a) {
                it.remove();
            }
        }
    }

    private void m16987b() {
        if (this.f14709d.isEmpty()) {
            ggc.m17608a(this.f14706a).m17620b(this.f14707b, null);
            return;
        }
        nzf gfw = new gfw();
        gfw.f15187a = (gfx[]) this.f14709d.toArray(new gfx[this.f14709d.size()]);
        ggc.m17608a(this.f14706a).m17620b(this.f14707b, Base64.encodeToString(nzf.m1029a(gfw), 0));
    }

    private void m16988c() {
        String d = ggc.m17608a(this.f14706a).m17627d(this.f14707b);
        if (d != null) {
            byte[] decode = Base64.decode(d, 0);
            if (decode != null) {
                try {
                    this.f14709d = new ArrayList(Arrays.asList(((gfw) nzf.m1027a(new gfw(), decode)).f15187a));
                } catch (Throwable e) {
                    glk.m17980d("Babel_telephony", "TeleDedupeCallLog.readCallLogEntries, unable to parse entries", e);
                }
            }
        }
    }

    static boolean m16986a(String str, String str2, String str3, String str4) {
        String valueOf = String.valueOf(gwb.m1397G(str2));
        String valueOf2 = String.valueOf(gwb.m1397G(str4));
        glk.m17979c("Babel_telephony", new StringBuilder((((String.valueOf(str).length() + 51) + String.valueOf(valueOf).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append("TeleDedupeCallLog.arePhoneNumbersLooselyEqual, ").append(str).append(":").append(valueOf).append(", ").append(str3).append(":").append(valueOf2).toString(), new Object[0]);
        if (!Objects.equals(str, str3)) {
            glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, schemes don't match", new Object[0]);
            return false;
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str4)) {
            glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, both phone numbers are empty, returning true", new Object[0]);
            return true;
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, only one phone number is empty", new Object[0]);
            return false;
        } else {
            if ("tel".equals(str)) {
                if (!PhoneNumberUtils.compare(str2, str4)) {
                    glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, loose comparison of phone numbers failed", new Object[0]);
                    return false;
                }
            } else if (str2.equals(str4)) {
                glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, phone numbers are not equal", new Object[0]);
                return false;
            }
            glk.m17979c("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, returning true", new Object[0]);
            return true;
        }
    }

    static long m16983a(Context context) {
        return gwb.m1519a(context, "babel_incoming_wifi_call_duplicate_time_millis", 20000);
    }
}

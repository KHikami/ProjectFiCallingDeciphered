package p000;

import android.content.Context;
import android.net.Uri;
import android.telecom.ConnectionRequest;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Iterator;
import java.util.Locale;

public final class gef {
    private final TeleConnectionService f14840a;
    private final ConnectionRequest f14841b;
    private final boolean f14842c;
    private gec f14843d;
    private String f14844e;
    private int f14845f;
    private boolean f14846g;

    public gef(TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gec gec, boolean z) {
        this.f14840a = teleConnectionService;
        this.f14841b = connectionRequest;
        this.f14843d = gec;
        this.f14842c = z;
    }

    void m17136a(int i) {
        this.f14845f = i;
    }

    int m17135a() {
        return this.f14845f;
    }

    void m17138a(String str) {
        this.f14844e = str;
    }

    gec m17140b() {
        return this.f14843d;
    }

    void m17137a(gec gec) {
        this.f14843d = gec;
    }

    public String m17141c() {
        boolean z;
        Uri uri;
        if (this.f14845f != 0) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        if (!m17149k() && this.f14845f == 2 && m17151m()) {
            uri = (Uri) this.f14841b.getExtras().getParcelable("android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS");
        } else {
            uri = null;
        }
        if (uri == null) {
            uri = this.f14841b.getAddress();
        }
        if (uri == null || !"tel".equals(uri.getScheme())) {
            return null;
        }
        return uri.getSchemeSpecificPart();
    }

    public String m17142d() {
        String c = m17141c();
        if (c != null) {
            return gwb.m2250i(gwb.m1400H(), c);
        }
        return null;
    }

    String m17143e() {
        String voiceMailNumber;
        String valueOf;
        int i;
        CharSequence substring;
        String valueOf2;
        int i2 = 1;
        String c = m17141c();
        if (this.f14845f == 2) {
            Uri address = this.f14841b.getAddress();
            if (address != null && "voicemail".equals(address.getScheme())) {
                voiceMailNumber = ((TelephonyManager) this.f14840a.getSystemService("phone")).getVoiceMailNumber();
                if (!TextUtils.isEmpty(voiceMailNumber)) {
                    c = "Babel_telephony";
                    String str = "TelePhoneNumber.maybeFixVoicemailUri, changing voicemail URI to number: ";
                    valueOf = String.valueOf(gwb.m1397G(voiceMailNumber));
                    glk.m17979c(c, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    valueOf = voiceMailNumber;
                    if (valueOf == null) {
                        return null;
                    }
                    if (this.f14844e != null) {
                        valueOf = this.f14844e;
                    }
                    if (this.f14845f == 2) {
                        valueOf = PhoneNumberUtils.extractNetworkPortion(valueOf);
                    }
                    if (!m17149k()) {
                        if (this.f14845f == 2 && valueOf.length() == 7) {
                            c = glq.m18029g(gwb.m1400H());
                            if (c != null && c.length() >= 10) {
                                if (c.charAt(0) != '+') {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                if (c.charAt(i) == '1') {
                                    i++;
                                }
                                if (i == 0) {
                                    voiceMailNumber = c.substring(i);
                                } else {
                                    voiceMailNumber = c;
                                }
                                if (gef.m17134c(voiceMailNumber)) {
                                    c = glq.m18037i(gwb.m1400H());
                                    if (!("US".equals(c) || "CA".equals(c) || "DO".equals(c) || "AG".equals(c) || "AI".equals(c) || "AS".equals(c) || "BB".equals(c) || "BM".equals(c) || "BS".equals(c) || "DM".equals(c) || "DM".equals(c) || "GD".equals(c) || "GU".equals(c) || "KN".equals(c) || "KY".equals(c) || "LC".equals(c) || "MP".equals(c) || "MS".equals(c) || "PR".equals(c) || "SX".equals(c) || "TC".equals(c) || "TT".equals(c) || "US".equals(c) || "VC".equals(c) || "VG".equals(c) || "VI".equals(c))) {
                                        i2 = 0;
                                    }
                                    if (i2 != 0) {
                                        substring = voiceMailNumber.substring(0, 3);
                                        if (!TextUtils.isEmpty(substring)) {
                                            valueOf2 = String.valueOf(substring);
                                            voiceMailNumber = String.valueOf(valueOf);
                                            voiceMailNumber = voiceMailNumber.length() == 0 ? valueOf2.concat(voiceMailNumber) : new String(valueOf2);
                                            if (gwb.m2250i(gwb.m1400H(), voiceMailNumber) != null) {
                                                valueOf2 = "Babel_telephony";
                                                c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                                                voiceMailNumber = String.valueOf(gwb.m1397G(voiceMailNumber));
                                                glk.m17979c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                                            } else {
                                                valueOf2 = "Babel_telephony";
                                                c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                                                valueOf = String.valueOf(gwb.m1397G(voiceMailNumber));
                                                glk.m17979c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                                                valueOf = voiceMailNumber;
                                            }
                                        }
                                    }
                                }
                            }
                            substring = null;
                            if (TextUtils.isEmpty(substring)) {
                                valueOf2 = String.valueOf(substring);
                                voiceMailNumber = String.valueOf(valueOf);
                                if (voiceMailNumber.length() == 0) {
                                }
                                if (gwb.m2250i(gwb.m1400H(), voiceMailNumber) != null) {
                                    valueOf2 = "Babel_telephony";
                                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                                    valueOf = String.valueOf(gwb.m1397G(voiceMailNumber));
                                    if (valueOf.length() == 0) {
                                    }
                                    glk.m17979c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                                    valueOf = voiceMailNumber;
                                } else {
                                    valueOf2 = "Babel_telephony";
                                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                                    voiceMailNumber = String.valueOf(gwb.m1397G(voiceMailNumber));
                                    if (voiceMailNumber.length() == 0) {
                                    }
                                    glk.m17979c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                                }
                            }
                        }
                        valueOf = m17133b(valueOf);
                    }
                    if (m17155q()) {
                        voiceMailNumber = glq.m18000a().m18048b(valueOf, this.f14843d.m17122d());
                        if (voiceMailNumber != null) {
                            valueOf = voiceMailNumber;
                        }
                    }
                    return valueOf;
                }
            }
        }
        valueOf = c;
        if (valueOf == null) {
            return null;
        }
        if (this.f14844e != null) {
            valueOf = this.f14844e;
        }
        if (this.f14845f == 2) {
            valueOf = PhoneNumberUtils.extractNetworkPortion(valueOf);
        }
        if (m17149k()) {
            c = glq.m18029g(gwb.m1400H());
            if (c.charAt(0) != '+') {
                i = 0;
            } else {
                i = 1;
            }
            if (c.charAt(i) == '1') {
                i++;
            }
            if (i == 0) {
                voiceMailNumber = c;
            } else {
                voiceMailNumber = c.substring(i);
            }
            if (gef.m17134c(voiceMailNumber)) {
                c = glq.m18037i(gwb.m1400H());
                i2 = 0;
                if (i2 != 0) {
                    substring = voiceMailNumber.substring(0, 3);
                    if (TextUtils.isEmpty(substring)) {
                        valueOf2 = String.valueOf(substring);
                        voiceMailNumber = String.valueOf(valueOf);
                        if (voiceMailNumber.length() == 0) {
                        }
                        if (gwb.m2250i(gwb.m1400H(), voiceMailNumber) != null) {
                            valueOf2 = "Babel_telephony";
                            c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                            voiceMailNumber = String.valueOf(gwb.m1397G(voiceMailNumber));
                            if (voiceMailNumber.length() == 0) {
                            }
                            glk.m17979c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                        } else {
                            valueOf2 = "Babel_telephony";
                            c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                            valueOf = String.valueOf(gwb.m1397G(voiceMailNumber));
                            if (valueOf.length() == 0) {
                            }
                            glk.m17979c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                            valueOf = voiceMailNumber;
                        }
                    }
                    valueOf = m17133b(valueOf);
                }
            }
            substring = null;
            if (TextUtils.isEmpty(substring)) {
                valueOf2 = String.valueOf(substring);
                voiceMailNumber = String.valueOf(valueOf);
                if (voiceMailNumber.length() == 0) {
                }
                if (gwb.m2250i(gwb.m1400H(), voiceMailNumber) != null) {
                    valueOf2 = "Babel_telephony";
                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                    valueOf = String.valueOf(gwb.m1397G(voiceMailNumber));
                    if (valueOf.length() == 0) {
                    }
                    glk.m17979c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                    valueOf = voiceMailNumber;
                } else {
                    valueOf2 = "Babel_telephony";
                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                    voiceMailNumber = String.valueOf(gwb.m1397G(voiceMailNumber));
                    if (voiceMailNumber.length() == 0) {
                    }
                    glk.m17979c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                }
            }
            valueOf = m17133b(valueOf);
        }
        if (m17155q()) {
            voiceMailNumber = glq.m18000a().m18048b(valueOf, this.f14843d.m17122d());
            if (voiceMailNumber != null) {
                valueOf = voiceMailNumber;
            }
        }
        return valueOf;
    }

    String m17144f() {
        String e = m17143e();
        if (e != null) {
            return gwb.m2250i(gwb.m1400H(), e);
        }
        return null;
    }

    String m17145g() {
        return PhoneNumberUtils.extractPostDialPortion(m17141c());
    }

    ConnectionRequest m17146h() {
        return this.f14841b;
    }

    ConnectionRequest m17147i() {
        String e = m17143e();
        if (e == null || e.equals(m17141c())) {
            return this.f14841b;
        }
        return new ConnectionRequest(this.f14841b.getAccountHandle(), Uri.fromParts("tel", e, null), this.f14841b.getExtras());
    }

    TeleConnectionService m17148j() {
        return this.f14840a;
    }

    boolean m17149k() {
        return this.f14842c;
    }

    boolean m17150l() {
        String e = m17143e();
        return (e == null || gwb.m2250i(gwb.m1400H(), e) == null) ? false : true;
    }

    boolean m17151m() {
        return gwb.m1911a(this.f14841b);
    }

    boolean m17152n() {
        Uri address = this.f14841b.getAddress();
        if (address == null || !"voicemail".equals(address.getScheme())) {
            return gwb.m2207f(((TelephonyManager) this.f14840a.getSystemService("phone")).getVoiceMailNumber(), m17143e());
        }
        return true;
    }

    boolean m17139a(Uri uri) {
        if (this.f14844e == null && uri == null) {
            return true;
        }
        if (TextUtils.isEmpty(this.f14844e) || uri == null || !"tel".equals(uri.getScheme())) {
            return false;
        }
        return gwb.m2207f(this.f14844e, uri.getSchemeSpecificPart());
    }

    private String m17133b(String str) {
        Object obj;
        String valueOf;
        String valueOf2;
        if (TextUtils.isEmpty(this.f14843d.m17119b())) {
            obj = null;
        } else {
            valueOf = String.valueOf("babel_telephony_remapped_phone_numbers");
            valueOf2 = String.valueOf(String.format(Locale.US, "_carrier_%s", new Object[]{r0}));
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            obj = gwb.m1998b(this.f14840a, valueOf2, null);
        }
        Object b = gwb.m1998b(this.f14840a, "babel_telephony_remapped_phone_numbers", gda.f14723d);
        if (TextUtils.isEmpty(obj)) {
            obj = b;
        } else if (!TextUtils.isEmpty(b)) {
            obj = new StringBuilder((String.valueOf(obj).length() + 1) + String.valueOf(b).length()).append(obj).append(',').append(b).toString();
        }
        if (TextUtils.isEmpty(obj)) {
            return str;
        }
        if (str.startsWith("*")) {
            valueOf = str.substring(1);
        } else {
            valueOf = str;
        }
        String d = this.f14843d.m17122d();
        SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(',');
        SimpleStringSplitter simpleStringSplitter2 = new SimpleStringSplitter('=');
        SimpleStringSplitter simpleStringSplitter3 = new SimpleStringSplitter('/');
        simpleStringSplitter.setString(obj);
        Iterator it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            simpleStringSplitter2.setString((String) it.next());
            if (valueOf.equals(simpleStringSplitter2.hasNext() ? simpleStringSplitter2.next() : null)) {
                if (simpleStringSplitter2.hasNext()) {
                    obj = simpleStringSplitter2.next();
                } else {
                    obj = null;
                }
                if (TextUtils.isEmpty(obj)) {
                    continue;
                } else {
                    String next;
                    simpleStringSplitter3.setString(obj);
                    if (simpleStringSplitter3.hasNext()) {
                        valueOf2 = simpleStringSplitter3.next();
                    } else {
                        valueOf2 = null;
                    }
                    if (simpleStringSplitter3.hasNext()) {
                        next = simpleStringSplitter3.next();
                    } else {
                        next = null;
                    }
                    if (gef.m17131a(d, next)) {
                        valueOf = String.valueOf(gwb.m1397G(str));
                        next = String.valueOf(gwb.m1397G(valueOf2));
                        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(next).length()).append("TelePhoneNumber.maybeRemapPhoneNumber, remapped: ").append(valueOf).append(" to: ").append(next).toString(), new Object[0]);
                        this.f14846g = true;
                        return valueOf2;
                    }
                }
            }
        }
        return str;
    }

    boolean m17153o() {
        return this.f14846g;
    }

    boolean m17154p() {
        return m17132a(true);
    }

    private boolean m17132a(boolean z) {
        if (z && !gwb.m1906a(this.f14840a, "babel_telephony_allow_proxy_number_routing", true)) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, disabled by gservices.", new Object[0]);
            return false;
        } else if (gwb.m1906a(this.f14840a, "babel_telephony_force_proxy_number_fetch", false)) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, forcing proxy number fetch.", new Object[0]);
            return true;
        } else if (this.f14845f != 1) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, routingType " + this.f14845f, new Object[0]);
            return false;
        } else if (this.f14842c) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, incoming, so no proxy", new Object[0]);
            return false;
        } else if (ggc.m17608a(this.f14840a).m17630f() == -1) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, no Tycho account.", new Object[0]);
            return false;
        } else if (glq.m18019d(gwb.m1400H(), m17141c())) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, emergency number", new Object[0]);
            return false;
        } else {
            String simCountryIso;
            String networkCountryIso;
            String valueOf;
            if (PhoneNumberUtils.formatNumberToE164(m17141c(), glq.m18039j(gwb.m1400H())) == null) {
                TelephonyManager telephonyManager = (TelephonyManager) this.f14840a.getSystemService("phone");
                simCountryIso = telephonyManager.getSimCountryIso();
                networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (simCountryIso != null) {
                    simCountryIso = simCountryIso.toUpperCase(Locale.US);
                }
                if (networkCountryIso != null) {
                    networkCountryIso = networkCountryIso.toUpperCase(Locale.US);
                }
                valueOf = String.valueOf(gwb.m1397G(m17141c()));
                simCountryIso = String.valueOf(glk.m17974b(simCountryIso));
                String valueOf2 = String.valueOf(glk.m17974b(networkCountryIso));
                glk.m17979c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 80) + String.valueOf(simCountryIso).length()) + String.valueOf(valueOf2).length()).append("TelePhoneNumber.shouldUseProxyNumber, number: ").append(valueOf).append(", sim country: ").append(simCountryIso).append(", network country: ").append(valueOf2).toString(), new Object[0]);
                if (PhoneNumberUtils.formatNumberToE164(m17141c(), networkCountryIso) == null) {
                    String str = "Babel_telephony";
                    simCountryIso = "TelePhoneNumber.shouldUseProxyNumber, can't convert to e164 format, ";
                    networkCountryIso = String.valueOf(gwb.m1397G(m17141c()));
                    glk.m17979c(str, networkCountryIso.length() != 0 ? simCountryIso.concat(networkCountryIso) : new String(simCountryIso), new Object[0]);
                    return false;
                }
            }
            if (this.f14843d.m17123e() != 3 || this.f14843d.m17121c() == 3) {
                simCountryIso = glq.m18000a().m18046a(m17142d());
                String str2 = "Babel_telephony";
                valueOf = "TelePhoneNumber.shouldUseProxyNumber, calling to country: ";
                networkCountryIso = String.valueOf(simCountryIso);
                if (networkCountryIso.length() != 0) {
                    networkCountryIso = valueOf.concat(networkCountryIso);
                } else {
                    networkCountryIso = new String(valueOf);
                }
                glk.m17979c(str2, networkCountryIso, new Object[0]);
                if (gwb.m1906a(this.f14840a, "babel_hutch_use_proxy_numbers_for_calls_to_us", true) && gef.m17130a(this.f14840a, this.f14843d.m17121c()) && Locale.US.getCountry().equals(simCountryIso)) {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, Hutch profile calling US", new Object[0]);
                    return true;
                } else if (this.f14843d.m17120b(this.f14840a)) {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, user is outside the US", new Object[0]);
                    return false;
                } else if (this.f14843d.m17117a() == 1) {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, on home voice network", new Object[0]);
                    return false;
                } else if (m17151m()) {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, GoogleVoice request", new Object[0]);
                    return false;
                } else if (this.f14843d.m17117a() == 3) {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're roaming.", new Object[0]);
                    return false;
                } else {
                    glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, true", new Object[0]);
                    return true;
                }
            }
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're international.", new Object[0]);
            return false;
        }
    }

    boolean m17155q() {
        if (this.f14842c) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, do not anonymize incoming call", new Object[0]);
            return false;
        } else if (!gwb.m1906a(this.f14840a, "babel_telephony_allow_fallback_to_anonymous_calling", true)) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices", new Object[0]);
            return false;
        } else if (this.f14845f != 1) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, data call", new Object[0]);
            return false;
        } else if (glq.m18019d(gwb.m1400H(), m17141c())) {
            glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, emergency number", new Object[0]);
            return false;
        } else {
            CharSequence b = this.f14843d.m17119b();
            if (!TextUtils.isEmpty(b)) {
                String valueOf = String.valueOf("babel_telephony_allow_fallback_to_anonymous_calling");
                String valueOf2 = String.valueOf(String.format(Locale.US, "_carrier_%s", new Object[]{b}));
                if (!gwb.m1906a(this.f14840a, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), true)) {
                    String str = "Babel_telephony";
                    valueOf = "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices for carrier: ";
                    valueOf2 = String.valueOf(b);
                    glk.m17979c(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
                    return false;
                }
            }
            if (!m17132a(false) && !gef.m17130a(this.f14840a, this.f14843d.m17121c())) {
                glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, doesn't need proxy number", new Object[0]);
                return false;
            } else if (this.f14844e != null) {
                glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, has proxy number", new Object[0]);
                return false;
            } else if (this.f14843d.m17121c() == 2) {
                glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, on light profile", new Object[0]);
                return false;
            } else {
                glk.m17979c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, returning true", new Object[0]);
                return true;
            }
        }
    }

    private static boolean m17131a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = str2.charAt(0) != '!';
        int i = z ? 0 : 1;
        while (i < str2.length()) {
            if (str2.charAt(i) == str.charAt(0) && str2.charAt(i + 1) == str.charAt(1)) {
                return z;
            }
            i += 2;
        }
        if (z) {
            return false;
        }
        return true;
    }

    private static boolean m17134c(String str) {
        if (str == null) {
            glk.m17981d("Babel_telephony", "TeleUtils.isNorthAmericanNumberFormat, got null dialStr", new Object[0]);
            return false;
        } else if (str.length() != 10 || !gef.m17129a(str.charAt(0)) || !gef.m17129a(str.charAt(3))) {
            return false;
        } else {
            for (int i = 1; i < 10; i++) {
                if (!PhoneNumberUtils.isISODigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean m17129a(char c) {
        return c >= '2' && c <= '9';
    }

    private static boolean m17130a(Context context, int i) {
        if (i == 4 || i == 5 || gwb.m1906a(context, "babel_hutch_experience_for_us", false)) {
            return true;
        }
        return false;
    }
}

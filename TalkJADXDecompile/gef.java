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

public final class gef { //is the phone remapper! tries to call the destination w/ variations on the given phone number
    private final TeleConnectionService a;
    private final ConnectionRequest b;
    private final boolean c;
    private gec d; //current Network Carrier
    private String e;   // proxy_number?
    private int f;  // Connection state? 
    private boolean g;

    // Connection state constants
    // https://developer.android.com/reference/android/telecom/Connection.html
    // 0 = STATE_INITIALIZING
    // 1 = STATE_NEW
    // 2 = STATE_RINGING
    // 3 = STATE_DIALING
    // 4 = STATE_ACTIVE
    // 5 = STATE_HOLDING
    // 6 = STATE_DISCONNECTED

    public gef(TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gec gec, boolean z) {
        this.a = teleConnectionService;
        this.b = connectionRequest;
        this.d = gec;
        this.c = z;
    }

    // Set the Connection state
    void a(int i) {
        this.f = i;
    }

    // Get the Connection state
    int a() {
        return this.f;
    }

    void a(String str) {
        this.e = str;
    } //sets e

    gec b() {
        return this.d;
    } //method to return current Network Carrier

    void a(gec gec) {
        this.d = gec;
    }

    public String c() {
        boolean z;
        Uri uri;
        if (this.f != 0) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (!k() && this.f == 2 && m()) {
            uri = (Uri) this.b.getExtras().getParcelable("android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS");
        } else {
            uri = null;
        }
        if (uri == null) {
            uri = this.b.getAddress();
        }
        if (uri == null || !"tel".equals(uri.getScheme())) {
            return null;
        }
        return uri.getSchemeSpecificPart();
    }

    public String d() {
        String c = c();
        if (c != null) {
            return gwb.i(gwb.H(), c);
        }
        return null;
    }

    String e() {
        String voiceMailNumber;
        String valueOf;
        int i;
        CharSequence substring;
        String valueOf2;
        int i2 = 1;
        String c = c();
        if (this.f == 2) {
            Uri address = this.b.getAddress();
            if (address != null && "voicemail".equals(address.getScheme())) {
                voiceMailNumber = ((TelephonyManager) this.a.getSystemService("phone")).getVoiceMailNumber();
                if (!TextUtils.isEmpty(voiceMailNumber)) {
                    c = "Babel_telephony";
                    String str = "TelePhoneNumber.maybeFixVoicemailUri, changing voicemail URI to number: ";
                    valueOf = String.valueOf(gwb.G(voiceMailNumber));
                    glk.c(c, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    valueOf = voiceMailNumber;
                    if (valueOf == null) {
                        return null;
                    }
                    if (this.e != null) {
                        valueOf = this.e;
                    }
                    if (this.f == 2) {
                        valueOf = PhoneNumberUtils.extractNetworkPortion(valueOf);
                    }
                    if (!k()) {
                        if (this.f == 2 && valueOf.length() == 7) {
                            c = glq.g(gwb.H());
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
                                if (c(voiceMailNumber)) {
                                    c = glq.i(gwb.H());
                                    if (!("US".equals(c) || "CA".equals(c) || "DO".equals(c) || "AG".equals(c) || "AI".equals(c) || "AS".equals(c) || "BB".equals(c) || "BM".equals(c) || "BS".equals(c) || "DM".equals(c) || "DM".equals(c) || "GD".equals(c) || "GU".equals(c) || "KN".equals(c) || "KY".equals(c) || "LC".equals(c) || "MP".equals(c) || "MS".equals(c) || "PR".equals(c) || "SX".equals(c) || "TC".equals(c) || "TT".equals(c) || "US".equals(c) || "VC".equals(c) || "VG".equals(c) || "VI".equals(c))) {
                                        i2 = 0;
                                    }
                                    if (i2 != 0) {
                                        substring = voiceMailNumber.substring(0, 3);
                                        if (!TextUtils.isEmpty(substring)) {
                                            valueOf2 = String.valueOf(substring);
                                            voiceMailNumber = String.valueOf(valueOf);
                                            voiceMailNumber = voiceMailNumber.length() == 0 ? valueOf2.concat(voiceMailNumber) : new String(valueOf2);
                                            if (gwb.i(gwb.H(), voiceMailNumber) != null) {
                                                valueOf2 = "Babel_telephony";
                                                c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                                                voiceMailNumber = String.valueOf(gwb.G(voiceMailNumber));
                                                glk.c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                                            } else {
                                                valueOf2 = "Babel_telephony";
                                                c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                                                valueOf = String.valueOf(gwb.G(voiceMailNumber));
                                                glk.c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
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
                                if (gwb.i(gwb.H(), voiceMailNumber) != null) {
                                    valueOf2 = "Babel_telephony";
                                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                                    valueOf = String.valueOf(gwb.G(voiceMailNumber));
                                    if (valueOf.length() == 0) {
                                    }
                                    glk.c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                                    valueOf = voiceMailNumber;
                                } else {
                                    valueOf2 = "Babel_telephony";
                                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                                    voiceMailNumber = String.valueOf(gwb.G(voiceMailNumber));
                                    if (voiceMailNumber.length() == 0) {
                                    }
                                    glk.c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                                }
                            }
                        }
                        valueOf = b(valueOf);
                    }
                    if (q()) {
                        voiceMailNumber = glq.a().b(valueOf, this.d.d());
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
        if (this.e != null) {
            valueOf = this.e;
        }
        if (this.f == 2) {
            valueOf = PhoneNumberUtils.extractNetworkPortion(valueOf);
        }
        if (k()) {
            c = glq.g(gwb.H());
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
            if (c(voiceMailNumber)) {
                c = glq.i(gwb.H());
                i2 = 0;
                if (i2 != 0) {
                    substring = voiceMailNumber.substring(0, 3);
                    if (TextUtils.isEmpty(substring)) {
                        valueOf2 = String.valueOf(substring);
                        voiceMailNumber = String.valueOf(valueOf);
                        if (voiceMailNumber.length() == 0) {
                        }
                        if (gwb.i(gwb.H(), voiceMailNumber) != null) {
                            valueOf2 = "Babel_telephony";
                            c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                            voiceMailNumber = String.valueOf(gwb.G(voiceMailNumber));
                            if (voiceMailNumber.length() == 0) {
                            }
                            glk.c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                        } else {
                            valueOf2 = "Babel_telephony";
                            c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                            valueOf = String.valueOf(gwb.G(voiceMailNumber));
                            if (valueOf.length() == 0) {
                            }
                            glk.c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                            valueOf = voiceMailNumber;
                        }
                    }
                    valueOf = b(valueOf);
                }
            }
            substring = null;
            if (TextUtils.isEmpty(substring)) {
                valueOf2 = String.valueOf(substring);
                voiceMailNumber = String.valueOf(valueOf);
                if (voiceMailNumber.length() == 0) {
                }
                if (gwb.i(gwb.H(), voiceMailNumber) != null) {
                    valueOf2 = "Babel_telephony";
                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ";
                    valueOf = String.valueOf(gwb.G(voiceMailNumber));
                    if (valueOf.length() == 0) {
                    }
                    glk.c(valueOf2, valueOf.length() == 0 ? c.concat(valueOf) : new String(c), new Object[0]);
                    valueOf = voiceMailNumber;
                } else {
                    valueOf2 = "Babel_telephony";
                    c = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ";
                    voiceMailNumber = String.valueOf(gwb.G(voiceMailNumber));
                    if (voiceMailNumber.length() == 0) {
                    }
                    glk.c(valueOf2, voiceMailNumber.length() == 0 ? c.concat(voiceMailNumber) : new String(c), new Object[0]);
                }
            }
            valueOf = b(valueOf);
        }
        if (q()) {
            voiceMailNumber = glq.a().b(valueOf, this.d.d());
            if (voiceMailNumber != null) {
                valueOf = voiceMailNumber;
            }
        }
        return valueOf;
    }

    String f() {
        String e = e();//voicemail number
        if (e != null) {
            return gwb.i(gwb.H(), e);//return number in Context's country
        }
        return null;
    }

    String g() {
        return PhoneNumberUtils.extractPostDialPortion(c());
    }

    ConnectionRequest h() {
        return this.b;
    } //returns a connection request

    ConnectionRequest i() {
        String e = e();
        if (e == null || e.equals(c())) {
            return this.b;
        }
        return new ConnectionRequest(this.b.getAccountHandle(), Uri.fromParts("tel", e, null), this.b.getExtras());
    }

    TeleConnectionService j() {
        return this.a;
    }

    boolean k() {
        return this.c;
    }

    boolean l() {
        String e = e();
        return (e == null || gwb.i(gwb.H(), e) == null) ? false : true;
    }

    //called by geu
    boolean m() {
        return gwb.a(this.b);//gwb.a(ConnectionRequest)
        //checks if the connection request is a google voice request
    }

    //called by geu
    boolean n() {
        Uri address = this.b.getAddress();//ConnectionRequest.getAddress
        //if no address or if the address scheme is not voicemail => evaluate if the phone number is self?
        if (address == null || !"voicemail".equals(address.getScheme())) {
            return gwb.f(((TelephonyManager) this.a.getSystemService("phone")).getVoiceMailNumber(), e());
            //gwb.f(String, String)
            //feeds the phone service's voice mail number (as a string) and target's voice mail number (as a string)
            //return I am calling myself (directing to own voicemail)
        }
        return true;
    }

    boolean a(Uri uri) {
        if (this.e == null && uri == null) {
            return true;
        }
        if (TextUtils.isEmpty(this.e) || uri == null || !"tel".equals(uri.getScheme())) {
            return false;
        }
        return gwb.f(this.e, uri.getSchemeSpecificPart());
    }

    private String b(String str) {
        Object obj;
        String valueOf;
        String valueOf2;
        if (TextUtils.isEmpty(this.d.b())) {
            obj = null;
        } else {
            valueOf = String.valueOf("babel_telephony_remapped_phone_numbers");
            valueOf2 = String.valueOf(String.format(Locale.US, "_carrier_%s", new Object[]{r0}));
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            obj = gwb.b(this.a, valueOf2, null);
        }
        Object b = gwb.b(this.a, "babel_telephony_remapped_phone_numbers", gda.d);
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
        String d = this.d.d();
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
                    if (a(d, next)) {
                        valueOf = String.valueOf(gwb.G(str));
                        next = String.valueOf(gwb.G(valueOf2));
                        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(next).length()).append("TelePhoneNumber.maybeRemapPhoneNumber, remapped: ").append(valueOf).append(" to: ").append(next).toString(), new Object[0]);
                        this.g = true;
                        return valueOf2;
                    }
                }
            }
        }
        return str;
    }

    boolean o() {
        return this.g;
    }

    boolean p() {
        return a(true);
    }

    private boolean a(boolean z) {
        if (z && !gwb.a(this.a, "babel_telephony_allow_proxy_number_routing", true)) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, disabled by gservices.", new Object[0]);
            return false;
        } else if (gwb.a(this.a, "babel_telephony_force_proxy_number_fetch", false)) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, forcing proxy number fetch.", new Object[0]);
            return true;
        } else if (this.f != 1) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, routingType " + this.f, new Object[0]);
            return false;
        } else if (this.c) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, incoming, so no proxy", new Object[0]);
            return false;
        } else if (ggc.a(this.a).f() == -1) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, no Tycho account.", new Object[0]);
            return false;
        } else if (glq.d(gwb.H(), c())) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, emergency number", new Object[0]);
            return false;
        } else {
            String simCountryIso;
            String networkCountryIso;
            String valueOf;
            if (PhoneNumberUtils.formatNumberToE164(c(), glq.j(gwb.H())) == null) {
                TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
                simCountryIso = telephonyManager.getSimCountryIso();
                networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (simCountryIso != null) {
                    simCountryIso = simCountryIso.toUpperCase(Locale.US);
                }
                if (networkCountryIso != null) {
                    networkCountryIso = networkCountryIso.toUpperCase(Locale.US);
                }
                valueOf = String.valueOf(gwb.G(c()));
                simCountryIso = String.valueOf(glk.b(simCountryIso));
                String valueOf2 = String.valueOf(glk.b(networkCountryIso));
                glk.c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 80) + String.valueOf(simCountryIso).length()) + String.valueOf(valueOf2).length()).append("TelePhoneNumber.shouldUseProxyNumber, number: ").append(valueOf).append(", sim country: ").append(simCountryIso).append(", network country: ").append(valueOf2).toString(), new Object[0]);
                if (PhoneNumberUtils.formatNumberToE164(c(), networkCountryIso) == null) {
                    String str = "Babel_telephony";
                    simCountryIso = "TelePhoneNumber.shouldUseProxyNumber, can't convert to e164 format, ";
                    networkCountryIso = String.valueOf(gwb.G(c()));
                    glk.c(str, networkCountryIso.length() != 0 ? simCountryIso.concat(networkCountryIso) : new String(simCountryIso), new Object[0]);
                    return false;
                }
            }
            if (this.d.e() != 3 || this.d.c() == 3) {
                simCountryIso = glq.a().a(d());
                String str2 = "Babel_telephony";
                valueOf = "TelePhoneNumber.shouldUseProxyNumber, calling to country: ";
                networkCountryIso = String.valueOf(simCountryIso);
                if (networkCountryIso.length() != 0) {
                    networkCountryIso = valueOf.concat(networkCountryIso);
                } else {
                    networkCountryIso = new String(valueOf);
                }
                glk.c(str2, networkCountryIso, new Object[0]);
                if (gwb.a(this.a, "babel_hutch_use_proxy_numbers_for_calls_to_us", true) && a(this.a, this.d.c()) && Locale.US.getCountry().equals(simCountryIso)) {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, Hutch profile calling US", new Object[0]);
                    return true;
                } else if (this.d.b(this.a)) {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, user is outside the US", new Object[0]);
                    return false;
                } else if (this.d.a() == 1) {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, on home voice network", new Object[0]);
                    return false;
                } else if (m()) {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, GoogleVoice request", new Object[0]);
                    return false;
                } else if (this.d.a() == 3) {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're roaming.", new Object[0]);
                    return false;
                } else {
                    glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, true", new Object[0]);
                    return true;
                }
            }
            glk.c("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're international.", new Object[0]);
            return false;
        }
    }

    boolean q() {
        if (this.c) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, do not anonymize incoming call", new Object[0]);
            return false;
        } else if (!gwb.a(this.a, "babel_telephony_allow_fallback_to_anonymous_calling", true)) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices", new Object[0]);
            return false;
        } else if (this.f != 1) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, data call", new Object[0]);
            return false;
        } else if (glq.d(gwb.H(), c())) {
            glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, emergency number", new Object[0]);
            return false;
        } else {
            CharSequence b = this.d.b();
            if (!TextUtils.isEmpty(b)) {
                String valueOf = String.valueOf("babel_telephony_allow_fallback_to_anonymous_calling");
                String valueOf2 = String.valueOf(String.format(Locale.US, "_carrier_%s", new Object[]{b}));
                if (!gwb.a(this.a, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), true)) {
                    String str = "Babel_telephony";
                    valueOf = "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices for carrier: ";
                    valueOf2 = String.valueOf(b);
                    glk.c(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
                    return false;
                }
            }
            if (!a(false) && !a(this.a, this.d.c())) {
                glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, doesn't need proxy number", new Object[0]);
                return false;
            } else if (this.e != null) {
                glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, has proxy number", new Object[0]);
                return false;
            } else if (this.d.c() == 2) {
                glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, on light profile", new Object[0]);
                return false;
            } else {
                glk.c("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, returning true", new Object[0]);
                return true;
            }
        }
    }

    private static boolean a(String str, String str2) {
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

    private static boolean c(String str) {
        if (str == null) {
            glk.d("Babel_telephony", "TeleUtils.isNorthAmericanNumberFormat, got null dialStr", new Object[0]);
            return false;
        } else if (str.length() != 10 || !a(str.charAt(0)) || !a(str.charAt(3))) {
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

    private static boolean a(char c) {
        return c >= '2' && c <= '9';
    }

    private static boolean a(Context context, int i) {
        if (i == 4 || i == 5 || gwb.a(context, "babel_hutch_experience_for_us", false)) {
            return true;
        }
        return false;
    }
}

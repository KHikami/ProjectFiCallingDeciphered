package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

public final class gcw {
    private final String f14710a;
    private final String f14711b;

    static gcw m16990a(Context context, String str, boolean z, gfv gfv) {
        String str2;
        if (gfv.f15184a) {
            String b = gwb.m1998b(context, "babel_wifi_experiment_prerequisites", gda.f14724e);
            if (TextUtils.isEmpty(b)) {
                glk.m17979c("Babel_telephony", "TeleExperiment.getWifiExperiment, no experiments defined.", new Object[0]);
                return null;
            }
            String a = gcw.m16991a(b, "wifi_ssid=");
            if (!TextUtils.isEmpty(a) && !a.equals(gwb.m1396G(context))) {
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(a).length() + 49).append("TeleExperiment.getWifiExperiment, not on '").append(a).append("' wifi.").toString(), new Object[0]);
                return null;
            } else if (b.contains("domestic") && (str == null || !Locale.US.getCountry().equals(glq.m18000a().m18046a(str)))) {
                a = "Babel_telephony";
                str2 = "TeleExperiment.getWifiExperiment, not a domestic number: ";
                b = String.valueOf(gwb.m1397G(str));
                glk.m17979c(a, b.length() != 0 ? str2.concat(b) : new String(str2), new Object[0]);
                return null;
            } else if (!b.contains("incoming") || z) {
                b = gcw.m16991a(b, "wifi_signal_percent_threshold=");
                if (!TextUtils.isEmpty(b)) {
                    try {
                        if (!gfv.m17574a(Integer.parseInt(b), 0)) {
                            str2 = String.valueOf(gfv);
                            glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(str2).length() + 68) + String.valueOf(b).length()).append("TeleExperiment.getWifiExperiment, (").append(str2).append(") is not above signal threshold: ").append(b).toString(), new Object[0]);
                            return null;
                        }
                    } catch (NumberFormatException e) {
                        a = "Babel_telephony";
                        str2 = "TeleExperiment.getWifiExperiment, invalid threshold value: ";
                        b = String.valueOf(b);
                        if (b.length() != 0) {
                            b = str2.concat(b);
                        } else {
                            b = new String(str2);
                        }
                        glk.m17981d(a, b, new Object[0]);
                        return null;
                    }
                }
                if (gwb.m1492a(context, "babel_wifi_experiment_percent_probability", 0) > ((int) (Math.random() * 100.0d))) {
                    gcw gcw = new gcw("nwc", gwb.m1998b(context, "babel_wifi_experiment_flags", gda.f14725f));
                    a = String.valueOf(gcw);
                    glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(a).length() + 34).append("TeleExperiment.getWifiExperiment, ").append(a).toString(), new Object[0]);
                    return gcw;
                }
                glk.m17979c("Babel_telephony", "TeleExperiment.getWifiExperiment, skipping wifi experiment", new Object[0]);
                return null;
            } else {
                glk.m17979c("Babel_telephony", "TeleExperiment.getWifiExperiment, not incoming call.", new Object[0]);
                return null;
            }
        }
        glk.m17979c("Babel_telephony", "TeleExperiment.getWifiExperiment, no wifi connection.", new Object[0]);
        return null;
    }

    private static String m16991a(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        indexOf += str2.length();
        int indexOf2 = str.indexOf(44, indexOf);
        return indexOf2 == -1 ? str.substring(indexOf) : str.substring(indexOf, indexOf2);
    }

    public gcw(String str, String str2) {
        this.f14710a = str;
        this.f14711b = str2;
    }

    String m16992a() {
        return this.f14710a;
    }

    String m16994b() {
        return this.f14711b;
    }

    public boolean m16993a(String str) {
        return this.f14710a != null && this.f14710a.equals(str);
    }

    public boolean m16995b(String str) {
        return this.f14711b != null && this.f14711b.contains(str);
    }

    public String toString() {
        String str = this.f14710a;
        String str2 = this.f14711b;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
    }
}

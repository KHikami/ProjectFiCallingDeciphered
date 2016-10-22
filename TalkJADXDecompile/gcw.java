import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

public final class gcw {
    private final String a;
    private final String b;

    static gcw a(Context context, String str, boolean z, gfv gfv) {
        if (gfv.a) {
            String b = gwb.b(context, "babel_wifi_experiment_prerequisites", gda.e);
            if (TextUtils.isEmpty(b)) {
                glk.c("Babel_telephony", "TeleExperiment.getWifiExperiment, no experiments defined.", new Object[0]);
                return null;
            }
            String a = a(b, "wifi_ssid=");
            if (!TextUtils.isEmpty(a) && !a.equals(gwb.G(context))) {
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(a).length() + 49).append("TeleExperiment.getWifiExperiment, not on '").append(a).append("' wifi.").toString(), new Object[0]);
                return null;
            } else if (b.contains("domestic") && (str == null || !Locale.US.getCountry().equals(glq.a().a(str)))) {
                a = "Babel_telephony";
                r3 = "TeleExperiment.getWifiExperiment, not a domestic number: ";
                b = String.valueOf(gwb.G(str));
                glk.c(a, b.length() != 0 ? r3.concat(b) : new String(r3), new Object[0]);
                return null;
            } else if (!b.contains("incoming") || z) {
                b = a(b, "wifi_signal_percent_threshold=");
                if (!TextUtils.isEmpty(b)) {
                    try {
                        if (!gfv.a(Integer.parseInt(b), 0)) {
                            r3 = String.valueOf(gfv);
                            glk.c("Babel_telephony", new StringBuilder((String.valueOf(r3).length() + 68) + String.valueOf(b).length()).append("TeleExperiment.getWifiExperiment, (").append(r3).append(") is not above signal threshold: ").append(b).toString(), new Object[0]);
                            return null;
                        }
                    } catch (NumberFormatException e) {
                        a = "Babel_telephony";
                        r3 = "TeleExperiment.getWifiExperiment, invalid threshold value: ";
                        b = String.valueOf(b);
                        if (b.length() != 0) {
                            b = r3.concat(b);
                        } else {
                            b = new String(r3);
                        }
                        glk.d(a, b, new Object[0]);
                        return null;
                    }
                }
                if (gwb.a(context, "babel_wifi_experiment_percent_probability", 0) > ((int) (Math.random() * 100.0d))) {
                    gcw gcw = new gcw("nwc", gwb.b(context, "babel_wifi_experiment_flags", gda.f));
                    a = String.valueOf(gcw);
                    glk.c("Babel_telephony", new StringBuilder(String.valueOf(a).length() + 34).append("TeleExperiment.getWifiExperiment, ").append(a).toString(), new Object[0]);
                    return gcw;
                }
                glk.c("Babel_telephony", "TeleExperiment.getWifiExperiment, skipping wifi experiment", new Object[0]);
                return null;
            } else {
                glk.c("Babel_telephony", "TeleExperiment.getWifiExperiment, not incoming call.", new Object[0]);
                return null;
            }
        }
        glk.c("Babel_telephony", "TeleExperiment.getWifiExperiment, no wifi connection.", new Object[0]);
        return null;
    }

    private static String a(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        indexOf += str2.length();
        int indexOf2 = str.indexOf(44, indexOf);
        return indexOf2 == -1 ? str.substring(indexOf) : str.substring(indexOf, indexOf2);
    }

    public gcw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    String a() {
        return this.a;
    }

    String b() {
        return this.b;
    }

    public boolean a(String str) {
        return this.a != null && this.a.equals(str);
    }

    public boolean b(String str) {
        return this.b != null && this.b.contains(str);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
    }
}

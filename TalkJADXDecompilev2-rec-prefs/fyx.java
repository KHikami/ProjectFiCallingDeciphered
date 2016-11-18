package p000;

import android.content.res.Resources;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fyx {
    private static final fyy f14404a = new fyy(1, 109);
    private static final Pattern f14405b = Pattern.compile("([1-9]+\\d*)(w|m|y)");

    public static boolean m16647a() {
        return ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2168p();
    }

    public static fyy m16649b() {
        CharSequence b = gwb.m1998b(gwb.m1400H(), "babel_sms_storage_purging_message_retaining_duration", "1m");
        Matcher matcher = f14405b.matcher(b);
        try {
            if (matcher.matches()) {
                return new fyy(Integer.parseInt(matcher.group(1)), matcher.group(2).charAt(0));
            }
        } catch (NumberFormatException e) {
        }
        String str = "Babel_SMS";
        String str2 = "SmsAutoDelete: invalid duration ";
        String valueOf = String.valueOf(b);
        glk.m17982e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return f14404a;
    }

    public static String m16645a(fyy fyy) {
        Resources resources = gwb.m1400H().getResources();
        switch (fyy.f14407b) {
            case 109:
                return resources.getQuantityString(gwb.id, fyy.f14406a, new Object[]{Integer.valueOf(fyy.f14406a)});
            case 119:
                return resources.getQuantityString(gwb.ip, fyy.f14406a, new Object[]{Integer.valueOf(fyy.f14406a)});
            case 121:
                return resources.getQuantityString(gwb.iq, fyy.f14406a, new Object[]{Integer.valueOf(fyy.f14406a)});
            default:
                throw new IllegalArgumentException("SmsAutoDelete: invalid duration unit " + fyy.f14407b);
        }
    }

    public static long m16648b(fyy fyy) {
        switch (fyy.f14407b) {
            case 109:
                return ((long) fyy.f14406a) * 2592000000L;
            case 119:
                return ((long) fyy.f14406a) * 604800000;
            case 121:
                return ((long) fyy.f14406a) * 31536000000L;
            default:
                return -1;
        }
    }

    public static void m16646a(int i, long j) {
        switch (i) {
            case 0:
                blf.m5808b();
                return;
            case 1:
                blf.m5759a(j);
                return;
            case 2:
                blf.m5759a(j);
                ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2169q();
                return;
            default:
                glk.m17982e("Babel_SMS", "SmsStorageStatusManager: invalid action " + i, new Object[0]);
                return;
        }
    }
}

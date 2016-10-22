import android.content.res.Resources;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fyx {
    private static final fyy a;
    private static final Pattern b;

    public static boolean a() {
        return ((fzw) jyn.a(gwb.H(), fzw.class)).p();
    }

    static {
        a = new fyy(1, 109);
        b = Pattern.compile("([1-9]+\\d*)(w|m|y)");
    }

    public static fyy b() {
        CharSequence b = gwb.b(gwb.H(), "babel_sms_storage_purging_message_retaining_duration", "1m");
        Matcher matcher = b.matcher(b);
        try {
            if (matcher.matches()) {
                return new fyy(Integer.parseInt(matcher.group(1)), matcher.group(2).charAt(0));
            }
        } catch (NumberFormatException e) {
        }
        String str = "Babel_SMS";
        String str2 = "SmsAutoDelete: invalid duration ";
        String valueOf = String.valueOf(b);
        glk.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return a;
    }

    public static String a(fyy fyy) {
        Resources resources = gwb.H().getResources();
        switch (fyy.b) {
            case 109:
                return resources.getQuantityString(gwb.id, fyy.a, new Object[]{Integer.valueOf(fyy.a)});
            case 119:
                return resources.getQuantityString(gwb.ip, fyy.a, new Object[]{Integer.valueOf(fyy.a)});
            case 121:
                return resources.getQuantityString(gwb.iq, fyy.a, new Object[]{Integer.valueOf(fyy.a)});
            default:
                throw new IllegalArgumentException("SmsAutoDelete: invalid duration unit " + fyy.b);
        }
    }

    public static long b(fyy fyy) {
        switch (fyy.b) {
            case 109:
                return ((long) fyy.a) * 2592000000L;
            case 119:
                return ((long) fyy.a) * 604800000;
            case 121:
                return ((long) fyy.a) * 31536000000L;
            default:
                return -1;
        }
    }

    public static void a(int i, long j) {
        switch (i) {
            case wi.w /*0*/:
                blf.b();
            case wi.j /*1*/:
                blf.a(j);
            case wi.l /*2*/:
                blf.a(j);
                ((fzw) jyn.a(gwb.H(), fzw.class)).q();
            default:
                glk.e("Babel_SMS", "SmsStorageStatusManager: invalid action " + i, new Object[0]);
        }
    }
}

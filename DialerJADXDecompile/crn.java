import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Flag;

final class crn extends crm {
    private /* synthetic */ String l;

    crn(String str, String str2, String str3, int i, String str4, crj crj, Long l, String str5) {
        this.l = str5;
        super(str, str2, str3, i, str4, crj, l);
    }

    private static Long b(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public final /* synthetic */ Object a(String str) {
        return b(str);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.l, 0));
    }

    public final /* synthetic */ Object a(Flag flag) {
        return Long.valueOf(flag.a());
    }
}

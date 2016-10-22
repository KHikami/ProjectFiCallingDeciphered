import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Flag;

final class cro extends crm {
    private /* synthetic */ String l;

    cro(String str, String str2, String str3, int i, String str4, crj crj, Integer num, String str5) {
        this.l = str5;
        super(str, str2, str3, i, str4, crj, num);
    }

    private static Integer b(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public final /* synthetic */ Object a(String str) {
        return b(str);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Integer.valueOf((int) sharedPreferences.getLong(this.l, 0));
    }

    public final /* synthetic */ Object a(Flag flag) {
        return Integer.valueOf((int) flag.a());
    }
}

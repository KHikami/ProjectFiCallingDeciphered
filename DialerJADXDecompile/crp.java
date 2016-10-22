import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Flag;

final class crp extends crm {
    private /* synthetic */ String l;

    crp(String str, String str2, String str3, int i, String str4, crj crj, Boolean bool, String str5) {
        this.l = str5;
        super(str, str2, str3, i, str4, crj, bool);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.l, false));
    }

    public final /* synthetic */ Object a(Flag flag) {
        return Boolean.valueOf(flag.b());
    }

    public final /* synthetic */ Object a(String str) {
        return ckq.b.matcher(str).matches() ? Boolean.valueOf(true) : ckq.c.matcher(str).matches() ? Boolean.valueOf(false) : null;
    }
}

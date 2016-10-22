package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Flag;

/* renamed from: crq */
final class crq extends crm {
    private /* synthetic */ String l;

    crq(String str, String str2, String str3, int i, String str4, crj crj, String str5, String str6) {
        this.l = str6;
        super(str, str2, str3, i, str4, crj, str5);
    }

    public final /* synthetic */ Object a(String str) {
        return str;
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.l, "");
    }

    public final /* synthetic */ Object a(Flag flag) {
        return flag.c();
    }
}

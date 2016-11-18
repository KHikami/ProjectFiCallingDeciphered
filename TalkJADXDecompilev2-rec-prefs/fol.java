package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;

public class fol extends jui {
    private lo<fom, String> f13575a = new lo();

    public fol(Context context) {
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("rpc", 0);
        fom[] values = fom.values();
        int length = values.length;
        while (i < length) {
            fom fom = values[i];
            this.f13575a.put(fom, sharedPreferences.getString(fom.f13582f, fom.f13583g.m25576a()));
            i++;
        }
    }

    public String mo2058a(String str) {
        fom a = fom.m15816a(str.toUpperCase(Locale.US));
        Object obj = (String) this.f13575a.get(a);
        String valueOf = String.valueOf(a);
        iil.m21875b(new StringBuilder(String.valueOf(valueOf).length() + 11).append("Unkown API ").append(valueOf).toString(), obj);
        return obj;
    }

    public String m15814a(fom fom) {
        Object obj = (String) this.f13575a.get(fom);
        String valueOf = String.valueOf(fom);
        iil.m21875b(new StringBuilder(String.valueOf(valueOf).length() + 11).append("Unkown API ").append(valueOf).toString(), obj);
        return obj;
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;

public class fol extends jui {
    private lo<fom, String> a = new lo();

    public fol(Context context) {
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("rpc", 0);
        fom[] values = fom.values();
        int length = values.length;
        while (i < length) {
            fom fom = values[i];
            this.a.put(fom, sharedPreferences.getString(fom.f, fom.g.a()));
            i++;
        }
    }

    public String a(String str) {
        fom a = fom.a(str.toUpperCase(Locale.US));
        Object obj = (String) this.a.get(a);
        String valueOf = String.valueOf(a);
        iil.b(new StringBuilder(String.valueOf(valueOf).length() + 11).append("Unkown API ").append(valueOf).toString(), obj);
        return obj;
    }

    public String a(fom fom) {
        Object obj = (String) this.a.get(fom);
        String valueOf = String.valueOf(fom);
        iil.b(new StringBuilder(String.valueOf(valueOf).length() + 11).append("Unkown API ").append(valueOf).toString(), obj);
        return obj;
    }
}

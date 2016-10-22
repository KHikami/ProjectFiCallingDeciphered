package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* renamed from: bjc */
public final class bjc extends crs {
    private final Context a;

    public bjc(brc brc, String str, Context context) {
        super(brc, str);
        this.a = context;
    }

    protected final void a(Configurations configurations) {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("dialer_phenotype_flags", 0);
        if (!configurations.e) {
            sharedPreferences.edit().clear().commit();
        }
        Configuration[] configurationArr = configurations.d;
        Editor edit = sharedPreferences.edit();
        for (Configuration configuration : configurationArr) {
            if (configuration != null) {
                String str;
                for (String str2 : configuration.d) {
                    edit.remove(str2);
                }
                for (Flag flag : configuration.c) {
                    switch (flag.h) {
                        case rq.b /*1*/:
                            edit.putLong(flag.b, flag.a());
                            break;
                        case rq.c /*2*/:
                            edit.putBoolean(flag.b, flag.b());
                            break;
                        case rl.e /*3*/:
                            str2 = flag.b;
                            if (flag.h == 3) {
                                edit.putFloat(str2, (float) flag.e);
                                break;
                            }
                            throw new IllegalArgumentException("Not a double type");
                        case rl.f /*4*/:
                            edit.putString(flag.b, flag.c());
                            break;
                        case rl.g /*5*/:
                            if (flag.h == 5) {
                                edit.putString(flag.b, Base64.encodeToString(flag.g, 3));
                                break;
                            }
                            throw new IllegalArgumentException("Not a bytes type");
                        default:
                            break;
                    }
                }
                continue;
            }
        }
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
        sharedPreferences.edit().putString("serverToken", configurations.c).commit();
    }
}

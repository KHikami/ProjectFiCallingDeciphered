package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.TimeUnit;

/* renamed from: crs */
public abstract class crs {
    private brc a;
    private String b;
    private final crg c;
    private long d;

    private crs(brc brc, crg crg, String str) {
        this.a = brc;
        this.c = crg;
        this.b = str;
        this.d = 2000;
    }

    public crs(brc brc, String str) {
        this(brc, cre.c, str);
    }

    public abstract void a(Configurations configurations);

    public final boolean a(String str, int i) {
        while (i > 0) {
            crh crh = (crh) this.c.a(this.a, this.b, str).a(this.d, TimeUnit.MILLISECONDS);
            if (crh.a().b()) {
                a(crh.b());
                if (((Status) this.c.a(this.a, crh.b().b).a(this.d, TimeUnit.MILLISECONDS)).b()) {
                    new StringBuilder("Experiment Configs successfully retrieved for ").append(this.b);
                    return true;
                }
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.b + " failed, retrying");
                i--;
            } else {
                Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + this.b + " failed");
                return false;
            }
        }
        Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for " + this.b);
        return false;
    }
}

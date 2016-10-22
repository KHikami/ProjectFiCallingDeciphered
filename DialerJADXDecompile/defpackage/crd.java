package defpackage;

import com.google.android.gms.phenotype.Flag;
import java.util.Comparator;

/* renamed from: crd */
public final class crd implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Flag flag = (Flag) obj;
        Flag flag2 = (Flag) obj2;
        return flag.i == flag2.i ? flag.b.compareTo(flag2.b) : flag.i - flag2.i;
    }
}

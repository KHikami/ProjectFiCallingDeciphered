import android.accounts.Account;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bue {
    public final Account a;
    public final Set b;
    final Set c;
    public final Map d;
    public final String e;
    final String f;
    public final coe g;
    public Integer h;

    public bue(Account account, Set set, Map map, int i, View view, String str, String str2, coe coe) {
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = coe;
        Set hashSet = new HashSet(this.b);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}

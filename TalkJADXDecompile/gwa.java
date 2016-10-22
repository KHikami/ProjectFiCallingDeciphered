import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class gwa {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<gtz<?>, gwb> d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final hcb i;
    private Integer j;

    public gwa(Account account, Set<Scope> set, Map<gtz<?>, gwb> map, int i, View view, String str, String str2, hcb hcb) {
        Map map2;
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.d = map2;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = hcb;
        Set hashSet = new HashSet(this.b);
        for (gwb gwb : this.d.values()) {
            hashSet.addAll(gwb.k);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static gwa a(Context context) {
        return new guj(context).a();
    }

    public Account a() {
        return this.a;
    }

    public void a(Integer num) {
        this.j = num;
    }

    public Account b() {
        return this.a != null ? this.a : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.b;
    }

    public Set<Scope> d() {
        return this.c;
    }

    public Map<gtz<?>, gwb> e() {
        return this.d;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public hcb h() {
        return this.i;
    }

    public Integer i() {
        return this.j;
    }
}

package p000;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class gwa {
    private final Account f16268a;
    private final Set<Scope> f16269b;
    private final Set<Scope> f16270c;
    private final Map<gtz<?>, gwb> f16271d;
    private final int f16272e;
    private final View f16273f;
    private final String f16274g;
    private final String f16275h;
    private final hcb f16276i;
    private Integer f16277j;

    public gwa(Account account, Set<Scope> set, Map<gtz<?>, gwb> map, int i, View view, String str, String str2, hcb hcb) {
        Map map2;
        this.f16268a = account;
        this.f16269b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.f16271d = map2;
        this.f16273f = view;
        this.f16272e = i;
        this.f16274g = str;
        this.f16275h = str2;
        this.f16276i = hcb;
        Set hashSet = new HashSet(this.f16269b);
        for (gwb gwb : this.f16271d.values()) {
            hashSet.addAll(gwb.f897k);
        }
        this.f16270c = Collections.unmodifiableSet(hashSet);
    }

    public static gwa m18753a(Context context) {
        return new guj(context).m18644a();
    }

    public Account m18754a() {
        return this.f16268a;
    }

    public void m18755a(Integer num) {
        this.f16277j = num;
    }

    public Account m18756b() {
        return this.f16268a != null ? this.f16268a : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> m18757c() {
        return this.f16269b;
    }

    public Set<Scope> m18758d() {
        return this.f16270c;
    }

    public Map<gtz<?>, gwb> m18759e() {
        return this.f16271d;
    }

    public String m18760f() {
        return this.f16274g;
    }

    public String m18761g() {
        return this.f16275h;
    }

    public hcb m18762h() {
        return this.f16276i;
    }

    public Integer m18763i() {
        return this.f16277j;
    }
}

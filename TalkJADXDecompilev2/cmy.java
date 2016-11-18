package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cmy extends jzn {
    ViewPager a;
    private biw aj;
    private iiq<Void, Void, Void> ak;
    SlidingTabLayout b;
    cnb c;
    jca d;
    fsi e;
    Map<String, bon> f = new HashMap();
    dex g;
    dey h;
    public List<eyg> i = new ArrayList();

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.d = (jca) this.binder.a(jca.class);
        this.aj = (biw) this.binder.a(biw.class);
        this.e = (fsi) this.binder.a(fsi.class);
        this.g = (dex) this.binder.a(dex.class);
        this.h = (dey) this.binder.a(dey.class);
    }

    public void a(int i) {
        String a = this.aj.a("babel_stickers_account_id", "108618507921641169817");
        blo blo = new blo(this.context, i);
        this.i = blo.a(true);
        if (!this.i.isEmpty()) {
            eyg eyg = new eyg();
            eyg.e = blo.B();
            if (!(eyg.e == null || eyg.e.isEmpty())) {
                eyg.b = "Recent";
                eyg.a = "Recent";
                eyg.c = (eyi) eyg.e.get(0);
                this.i.add(0, eyg);
            }
        }
        Context context = this.context;
        boolean isEmpty = this.i.isEmpty();
        bko e = fde.e(i);
        if (!((fzw) jyn.a(context, fzw.class)).a(i) && !fde.d(e)) {
            long e2 = bkq.e(context, e);
            long a2 = gwb.a(context, "babel_stickers_query_limit_ms", fls.n);
            if (isEmpty || a2 + e2 < System.currentTimeMillis()) {
                glk.c("Babel_StickersPagerFrag", "Sticker update initiated. last:" + e2 + " empty:" + isEmpty, new Object[0]);
                RealTimeChatService.l(e, a);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.nt, viewGroup, false);
        this.a = (ViewPager) inflate.findViewById(ba.jn);
        this.b = (SlidingTabLayout) inflate.findViewById(ba.jm);
        this.b.a(true);
        this.b.a(gwb.nq, ba.jk);
        this.b.a(this.a);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new cmz(this, inflate.getResources().getDimensionPixelSize(gwb.nk)));
        return inflate;
    }

    public void onPause() {
        super.onPause();
        if (this.a.getChildCount() > 0 && this.a.c() <= this.i.size()) {
            b(((eyg) this.i.get(this.a.c())).a);
        }
        a();
        if (this.c != null) {
            this.c.d();
            this.c = null;
        }
        this.a.a(null);
        if (this.i != null) {
            this.i.clear();
        }
    }

    public void onResume() {
        if (this.a != null && this.c == null) {
            int a = this.d.a();
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            a();
            this.ak = new cna(this, a, this);
            this.ak.b(new Void[0]);
        }
        super.onResume();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("album_id");
            if (stringExtra != null) {
                b(stringExtra);
            }
        }
        getParentFragment().onActivityResult(i, i2, intent);
    }

    public void b(String str) {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putString("selected_sticker_album_id", str).commit();
    }

    public String c() {
        Context activity = getActivity();
        if (activity == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(activity).getString("selected_sticker_album_id", null);
    }

    private void a() {
        if (!this.g.c()) {
            if (!this.f.isEmpty()) {
                for (bon b : this.f.values()) {
                    this.e.b((frj) b);
                }
                this.f.clear();
            }
            if (this.ak != null) {
                this.ak.cancel(true);
            }
        }
    }
}

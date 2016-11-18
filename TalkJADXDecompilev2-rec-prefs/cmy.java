package p000;

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
    ViewPager f5631a;
    private biw aj;
    private iiq<Void, Void, Void> ak;
    SlidingTabLayout f5632b;
    cnb f5633c;
    jca f5634d;
    fsi f5635e;
    Map<String, bon> f5636f = new HashMap();
    dex f5637g;
    dey f5638h;
    public List<eyg> f5639i = new ArrayList();

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5634d = (jca) this.binder.m25443a(jca.class);
        this.aj = (biw) this.binder.m25443a(biw.class);
        this.f5635e = (fsi) this.binder.m25443a(fsi.class);
        this.f5637g = (dex) this.binder.m25443a(dex.class);
        this.f5638h = (dey) this.binder.m25443a(dey.class);
    }

    public void m7915a(int i) {
        String a = this.aj.mo562a("babel_stickers_account_id", "108618507921641169817");
        blo blo = new blo(this.context, i);
        this.f5639i = blo.m5957a(true);
        if (!this.f5639i.isEmpty()) {
            eyg eyg = new eyg();
            eyg.f12519e = blo.m5908B();
            if (!(eyg.f12519e == null || eyg.f12519e.isEmpty())) {
                eyg.f12516b = "Recent";
                eyg.f12515a = "Recent";
                eyg.f12517c = (eyi) eyg.f12519e.get(0);
                this.f5639i.add(0, eyg);
            }
        }
        Context context = this.context;
        boolean isEmpty = this.f5639i.isEmpty();
        bko e = fde.m15018e(i);
        if (!((fzw) jyn.m25426a(context, fzw.class)).mo2146a(i) && !fde.m15015d(e)) {
            long e2 = bkq.m5693e(context, e);
            long a2 = gwb.m1519a(context, "babel_stickers_query_limit_ms", fls.f13437n);
            if (isEmpty || a2 + e2 < System.currentTimeMillis()) {
                glk.m17979c("Babel_StickersPagerFrag", "Sticker update initiated. last:" + e2 + " empty:" + isEmpty, new Object[0]);
                RealTimeChatService.m9123l(e, a);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.nt, viewGroup, false);
        this.f5631a = (ViewPager) inflate.findViewById(ba.jn);
        this.f5632b = (SlidingTabLayout) inflate.findViewById(ba.jm);
        this.f5632b.m8368a(true);
        this.f5632b.m8366a(gwb.nq, ba.jk);
        this.f5632b.m8367a(this.f5631a);
        this.f5632b.getViewTreeObserver().addOnGlobalLayoutListener(new cmz(this, inflate.getResources().getDimensionPixelSize(gwb.nk)));
        return inflate;
    }

    public void onPause() {
        super.onPause();
        if (this.f5631a.getChildCount() > 0 && this.f5631a.m3192c() <= this.f5639i.size()) {
            m7916b(((eyg) this.f5639i.get(this.f5631a.m3192c())).f12515a);
        }
        mo495a();
        if (this.f5633c != null) {
            this.f5633c.m7962d();
            this.f5633c = null;
        }
        this.f5631a.m3181a(null);
        if (this.f5639i != null) {
            this.f5639i.clear();
        }
    }

    public void onResume() {
        if (this.f5631a != null && this.f5633c == null) {
            int a = this.f5634d.mo2317a();
            this.f5631a.setVisibility(8);
            this.f5632b.setVisibility(8);
            mo495a();
            this.ak = new cna(this, a, this);
            this.ak.m4950b(new Void[0]);
        }
        super.onResume();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("album_id");
            if (stringExtra != null) {
                m7916b(stringExtra);
            }
        }
        getParentFragment().onActivityResult(i, i2, intent);
    }

    public void m7916b(String str) {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putString("selected_sticker_album_id", str).commit();
    }

    public String m7917c() {
        Context activity = getActivity();
        if (activity == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(activity).getString("selected_sticker_album_id", null);
    }

    private void mo495a() {
        if (!this.f5637g.mo1511c()) {
            if (!this.f5636f.isEmpty()) {
                for (bon b : this.f5636f.values()) {
                    this.f5635e.m12714b((frj) b);
                }
                this.f5636f.clear();
            }
            if (this.ak != null) {
                this.ak.cancel(true);
            }
        }
    }
}

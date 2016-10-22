package com.google.android.apps.hangouts.wearable;

import android.content.Context;
import bhl;
import bko;
import blo;
import cnt;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import fit;
import glk;
import grh;
import grj;
import grm;
import grq;
import gwb;
import hxu;
import hxv;
import hxw;
import hxz;
import hye;
import hym;
import iid;
import iih;
import java.util.Iterator;
import jyn;

public class WearableService extends hym {
    private iih e;
    private bhl f;
    private grm g;
    private fit h;
    private cnt i;

    public void onCreate() {
        super.onCreate();
        jyn b = jyn.b(getApplicationContext());
        this.g = ((grq) b.a(grq.class)).a(getApplicationContext());
        this.f = (bhl) b.a(bhl.class);
        this.e = (iih) b.a(iih.class);
        this.h = (fit) b.a(fit.class);
        this.i = (cnt) b.a(cnt.class);
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.e();
    }

    public void a(hxv hxv) {
        Iterator it = hxv.iterator();
        while (it.hasNext()) {
            hxw a = ((hxu) it.next()).a();
            if ("/hangouts/api_level/".equals(a.a().getPath())) {
                this.g.a(this.g.a(a));
            }
        }
    }

    public void a(hye hye) {
        String str;
        int i = -1;
        String a = hye.a();
        if (glk.a("Babel_wear", 2)) {
            str = "WearableService.onMessageReceived: ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        str = this.g.f();
        bko b;
        if ("/hangouts/rpc/send_message/".equals(a)) {
            hxz a2 = hxz.a(hye.b());
            b = grm.b(str);
            this.i.a(b.g(), a2.e("7"), a2.e("android.intent.extra.TEXT"), null, a2.b("17"), blo.a(b.g(), 5));
        } else if ("/hangouts/rpc/switch_account/".equals(a)) {
            this.g.a(hxz.a(hye.b()).e("1"));
            this.f.a(new grh());
        } else if ("/hangouts/rpc/update_watermark/".equals(a)) {
            r0 = hxz.a(hye.b());
            this.h.b(grm.b(str), r0.e("7"), r0.d("26"));
        } else if ("/hangouts/rpc/open_home/".equals(a)) {
            r0 = BabelGatewayActivity.a((Context) this, grm.b(str).g());
            r0.addFlags(268435456);
            startActivity(r0);
        } else if ("/hangouts/rpc/open_conversation/".equals(a)) {
            r0 = BabelGatewayActivity.a(this, grm.b(str).g(), hxz.a(hye.b()).e("7"), null);
            r0.addFlags(268435456);
            startActivity(r0);
        } else if ("/hangouts/rpc/resend_message/".equals(a)) {
            r0 = hxz.a(hye.b());
            this.i.b(grm.b(str).g(), r0.e("7"), gwb.a(Long.valueOf(r0.d("12"))));
        } else if ("/hangouts/rpc/delete_message/".equals(a)) {
            r0 = hxz.a(hye.b());
            this.i.a(grm.b(str).g(), r0.e("7"), gwb.a(Long.valueOf(r0.d("12"))));
        } else if ("/hangouts/rpc/request_more_messages/".equals(a)) {
            a = hye.c();
            hxz a3 = hxz.a(hye.b());
            this.f.a(new grj(a, a3.e("7"), a3.c("19")));
            b = grm.b(str);
            if (b != null) {
                i = b.g();
            }
            this.e.a(i).b().c(2238);
        } else if ("/hangouts/rpc/log_impression/".equals(a)) {
            hxz a4 = hxz.a(hye.b());
            int c = a4.c("13");
            bko b2 = grm.b(str);
            if (b2 != null) {
                i = b2.g();
            }
            iid a5 = this.e.a(i);
            switch (c) {
                case 2230:
                case 2231:
                    a5.b().c(c);
                case 2232:
                    a5.b().a(a4.e("20")).a(Integer.valueOf((int) a4.d("29"))).c(c);
                case 2233:
                    a5.b().a(a4.e("20")).c(c);
                default:
            }
        } else {
            this.f.a(new grh());
        }
    }
}

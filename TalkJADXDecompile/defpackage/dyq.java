package defpackage;

import android.content.Intent;

/* renamed from: dyq */
final class dyq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ hwn b;
    final /* synthetic */ dyo c;

    dyq(dyo dyo, int i, hwn hwn) {
        this.c = dyo;
        this.a = i;
        this.b = hwn;
    }

    public void run() {
        switch (this.a) {
            case wi.w /*0*/:
                this.c.a.c(this.b);
                this.c.a.c.a(this.b.a());
                break;
            case wi.j /*1*/:
                this.c.a.startActivityForResult(new jmn(this.c.a.context).a(new jmu().a(jmg.class)).a(), 1);
                break;
            case wi.l /*2*/:
                Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                intent.putExtra("authorities", new String[]{"gmail-ls", "com.google.android.gm.email.provider"});
                this.c.a.startActivity(intent);
                break;
        }
        this.c.a.e.c(0);
    }
}

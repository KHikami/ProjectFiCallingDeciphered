package p000;

import android.content.Intent;

final class dyq implements Runnable {
    final /* synthetic */ int f10836a;
    final /* synthetic */ hwn f10837b;
    final /* synthetic */ dyo f10838c;

    dyq(dyo dyo, int i, hwn hwn) {
        this.f10838c = dyo;
        this.f10836a = i;
        this.f10837b = hwn;
    }

    public void run() {
        switch (this.f10836a) {
            case 0:
                this.f10838c.f10833a.m8755c(this.f10837b);
                this.f10838c.f10833a.f6504c.mo1153a(this.f10837b.mo1778a());
                break;
            case 1:
                this.f10838c.f10833a.startActivityForResult(new jmn(this.f10838c.f10833a.context).m24710a(new jmu().m24734a(jmg.class)).m24709a(), 1);
                break;
            case 2:
                Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                intent.putExtra("authorities", new String[]{"gmail-ls", "com.google.android.gm.email.provider"});
                this.f10838c.f10833a.startActivity(intent);
                break;
        }
        this.f10838c.f10833a.f6506e.m9975c(0);
    }
}

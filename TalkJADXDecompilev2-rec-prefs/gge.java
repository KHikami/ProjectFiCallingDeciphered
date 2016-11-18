package p000;

import android.content.Context;

public class gge {
    public final Context f15223a;

    public void m17637a(String str) {
        iil.m21867a();
        if ("account_name_v2".equals(str) || "wifi_calling_enabled".equals(str) || "tycho_account_name".equals(str)) {
            gdt.m17077e(this.f15223a);
            gdt.m17078f(this.f15223a);
        }
    }

    public gge(Context context) {
        this.f15223a = context.getApplicationContext();
    }
}

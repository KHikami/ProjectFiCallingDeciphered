package defpackage;

import com.google.api.client.http.HttpStatusCodes;

final class bqj implements jgf {
    final /* synthetic */ bqf a;

    bqj(bqf bqf) {
        this.a = bqf;
    }

    public void a(String str, jgz jgz, jgw jgw) {
        if (str.equals("conversation_creation" + this.a.c)) {
            int i;
            glk.a("Babel_ConvCreator", "Conversation creation background task finished", new Object[0]);
            bpu bpu = (bpu) this.a.d.a(bpu.class);
            boolean z = jgz != null && jgz.a() == HttpStatusCodes.STATUS_CODE_OK;
            if (z) {
                i = 3070;
            } else {
                i = 3071;
            }
            ((iih) this.a.d.a(iih.class)).a(this.a.g.a()).b().c(i);
            if (z) {
                glk.a("Babel_ConvCreator", "Conversation created successfully", new Object[0]);
                bpu.a(jgz.d().getString("conversation_id"));
            } else {
                String str2 = "Babel_ConvCreator";
                String str3 = "Conversation creation failed: ";
                String valueOf = String.valueOf(jgz != null ? jgz.c() : "null");
                glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
                bpu.a();
            }
            this.a.a(z);
        }
    }
}

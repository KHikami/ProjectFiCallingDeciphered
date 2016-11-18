package p000;

import com.google.api.client.http.HttpStatusCodes;

final class bqj implements jgf {
    final /* synthetic */ bqf f4238a;

    bqj(bqf bqf) {
        this.f4238a = bqf;
    }

    public void mo662a(String str, jgz jgz, jgw jgw) {
        if (str.equals("conversation_creation" + this.f4238a.f4215c)) {
            int i;
            glk.m17970a("Babel_ConvCreator", "Conversation creation background task finished", new Object[0]);
            bpu bpu = (bpu) this.f4238a.f4216d.m25443a(bpu.class);
            boolean z = jgz != null && jgz.m24188a() == HttpStatusCodes.STATUS_CODE_OK;
            if (z) {
                i = 3070;
            } else {
                i = 3071;
            }
            ((iih) this.f4238a.f4216d.m25443a(iih.class)).mo1979a(this.f4238a.f4219g.mo2317a()).mo1693b().mo1714c(i);
            if (z) {
                glk.m17970a("Babel_ConvCreator", "Conversation created successfully", new Object[0]);
                bpu.mo904a(jgz.m24192d().getString("conversation_id"));
            } else {
                String str2 = "Babel_ConvCreator";
                String str3 = "Conversation creation failed: ";
                String valueOf = String.valueOf(jgz != null ? jgz.m24191c() : "null");
                glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
                bpu.mo902a();
            }
            this.f4238a.m6430a(z);
        }
    }
}

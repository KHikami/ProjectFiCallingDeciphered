package defpackage;

import com.google.android.apps.hangouts.views.AudioAttachmentView;

/* renamed from: gnb */
public class gnb {
    final /* synthetic */ bko a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AudioAttachmentView d;

    public void a() {
        if (this.a == null || this.b == null) {
            glk.d("Babel", "account or photoid are null in fetchAudioUrl", new Object[0]);
        }
        blf.a(this.a, null, this.b, this.c);
    }

    public gnb(AudioAttachmentView audioAttachmentView, bko bko, String str, String str2) {
        this.d = audioAttachmentView;
        this.a = bko;
        this.b = str;
        this.c = str2;
    }
}

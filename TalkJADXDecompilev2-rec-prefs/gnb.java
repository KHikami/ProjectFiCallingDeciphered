package p000;

import com.google.android.apps.hangouts.views.AudioAttachmentView;

public class gnb {
    final /* synthetic */ bko f15691a;
    final /* synthetic */ String f15692b;
    final /* synthetic */ String f15693c;
    final /* synthetic */ AudioAttachmentView f15694d;

    public void m18150a() {
        if (this.f15691a == null || this.f15692b == null) {
            glk.m17981d("Babel", "account or photoid are null in fetchAudioUrl", new Object[0]);
        }
        blf.m5769a(this.f15691a, null, this.f15692b, this.f15693c);
    }

    public gnb(AudioAttachmentView audioAttachmentView, bko bko, String str, String str2) {
        this.f15694d = audioAttachmentView;
        this.f15691a = bko;
        this.f15692b = str;
        this.f15693c = str2;
    }
}

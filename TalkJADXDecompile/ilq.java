import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.hangouts.video.internal.MediaSources;
import com.google.android.libraries.hangouts.video.internal.Stats;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

//calls gfm.a for wifi to cell transfer via ijt

public final class ilq extends Handler {
    private ilp a;

    static {
        iil.a(Integer.valueOf(10), Integer.valueOf(10));
    }

    public ilq(Looper looper) {
        super(looper);
    }

    public void a(ilp ilp) {
        this.a = ilp;
    }

    public void handleMessage(Message message) { 
        boolean z = true;
        if (this.a != null) {
            Bundle data = message.getData();
            String string;
            String valueOf;
            switch (message.what) {
                case wi.w /*0*/:
                    boolean z2;
                    if (message.arg1 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.a.d(z2);
                case wi.j /*1*/:
                    this.a.b(message.arg1, data.getString("str1"));
                case wi.l /*2*/:
                    int i = message.arg1;
                    data.getString("str1");
                    string = data.getString("str2");
                    if (itx.a(3)) {
                        valueOf = String.valueOf(ikd.e(i));
                        String str = "vclib";
                        String str2 = "[LibjingleEventHandler] ";
                        valueOf = String.valueOf(new StringBuilder((String.valueOf(string).length() + 62) + String.valueOf(valueOf).length()).append("handleMessage(MEDIA_STATE_CHANGED): for sessionId: ").append(string).append(" new state=").append(valueOf).toString());
                        if (valueOf.length() != 0) {
                            valueOf = str2.concat(valueOf);
                        } else {
                            valueOf = new String(str2);
                        }
                        itx.a(3, str, valueOf);
                    }
                    this.a.b(string, i);
                case wi.z /*3*/:
                    this.a.b((Stats) message.obj);
                    if (message.arg1 == 0) {
                        z = false;
                    }
                    if (z) {
                        this.a.a((Stats) message.obj);
                    }
                case wi.h /*4*/:
                    data.getString("str1");
                    this.a.a(data.getString("str2"), message.arg1, message.arg2, data.getString("str3"), data.getString("str4"), data.getString("str5"), (byte[]) message.obj);
                case wi.p /*5*/:
                    this.a.a(data.getString("str1"), (MediaSources) message.obj);
                case wi.s /*6*/:
                    this.a.a(data.getString("str1"), message.arg1);
                case wi.q /*7*/:
                    this.a.a(Long.parseLong(data.getString("str1")), data.getString("str2"), (byte[]) message.obj, message.arg1);
                case wi.m /*8*/:
                    data.getString("str1");
                    this.a.a(message.arg1, message.arg2, (byte[]) message.obj);
                case wi.n /*9*/:
                    this.a.e(data.getString("str1"));
                case wi.dr /*10*/:
                    this.a.b(message.arg1);
                case wi.dB /*11*/:
                    this.a.b((byte[]) message.obj);
                case wi.dM /*12*/:
                    this.a.c((byte[]) message.obj);
                case wi.dD /*13*/:
                    this.a.c(message.arg1); //calls gfm.a for wifi to cell handoff
                case wi.g /*14*/:
                    this.a.d(message.arg1);
                case wi.dJ /*15*/:
                    this.a.d((byte[]) message.obj);
                case wi.dI /*16*/:
                    this.a.e((byte[]) message.obj);
                case wi.dK /*17*/:
                    this.a.a(message.arg1, data.getString("str1"));
                case wi.dH /*18*/:
                    valueOf = data.getString("str1");
                    try {
                        this.a.a(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(valueOf.getBytes())).getLong(), message.arg1, message.arg2);
                    } catch (Exception e) {
                        String str3 = "vclib";
                        string = "MD5 not available for logging UMA event: ";
                        valueOf = String.valueOf(valueOf);
                        itx.a(str3, valueOf.length() != 0 ? string.concat(valueOf) : new String(string));
                    }
                case wi.dL /*19*/:
                    if (message.arg1 == 0) {
                        z = false;
                    }
                    this.a.e(z);
                case wi.k /*20*/:
                    this.a.c(message.arg1, data.getString("str1"));
                case wi.f /*21*/:
                    this.a.a((byte[]) message.obj, Long.parseLong(data.getString("str1")));
                case wi.e /*22*/:
                    this.a.f((byte[]) message.obj);
                case wi.do /*23*/:
                    this.a.a(data.getString("str1"), (byte[]) message.obj);
                case wi.dA /*24*/:
                    this.a.a((byte[]) message.obj, data.getString("str1"));
                default:
                    itx.a("vclib", "Unknown message type " + message.what);
            }
        }
    }

    static String a(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "CHATROOM_ENTERED";
            case wi.j /*1*/:
                return "ENDPOINT_ENTERED";
            case wi.l /*2*/:
                return "ENDPOINT_EXITED";
            case wi.z /*3*/:
                return "ENDPOINT_CHANGED";
            case wi.h /*4*/:
                return "ENDPOINT_AUDIO_MUTE_STATE_CHANGED";
            case wi.p /*5*/:
                return "ENDPOINT_VIDEO_MUTE_STATE_CHANGED";
            default:
                iil.a("Unknown type");
                return "Unknown type";
        }
    }
}

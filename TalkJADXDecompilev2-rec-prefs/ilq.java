package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.hangouts.video.internal.MediaSources;
import com.google.android.libraries.hangouts.video.internal.Stats;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class ilq extends Handler {
    private ilp f17999a;

    static {
        iil.m21869a(Integer.valueOf(10), Integer.valueOf(10));
    }

    public ilq(Looper looper) {
        super(looper);
    }

    public void m22253a(ilp ilp) {
        this.f17999a = ilp;
    }

    public void handleMessage(Message message) {
        String string;
        boolean z = true;
        if (this.f17999a != null) {
            Bundle data = message.getData();
            String valueOf;
            switch (message.what) {
                case 0:
                    boolean z2;
                    if (message.arg1 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f17999a.mo3251d(z2);
                    return;
                case 1:
                    this.f17999a.mo3243b(message.arg1, data.getString("str1"));
                    return;
                case 2:
                    int i = message.arg1;
                    data.getString("str1");
                    string = data.getString("str2");
                    if (itx.m23284a(3)) {
                        valueOf = String.valueOf(ikd.m22105e(i));
                        String str = "vclib";
                        String str2 = "[LibjingleEventHandler] ";
                        valueOf = String.valueOf(new StringBuilder((String.valueOf(string).length() + 62) + String.valueOf(valueOf).length()).append("handleMessage(MEDIA_STATE_CHANGED): for sessionId: ").append(string).append(" new state=").append(valueOf).toString());
                        if (valueOf.length() != 0) {
                            valueOf = str2.concat(valueOf);
                        } else {
                            valueOf = new String(str2);
                        }
                        itx.m23277a(3, str, valueOf);
                    }
                    this.f17999a.mo3245b(string, i);
                    return;
                case 3:
                    this.f17999a.mo3244b((Stats) message.obj);
                    if (message.arg1 == 0) {
                        z = false;
                    }
                    if (z) {
                        this.f17999a.mo3235a((Stats) message.obj);
                        return;
                    }
                    return;
                case 4:
                    data.getString("str1");
                    this.f17999a.mo3237a(data.getString("str2"), message.arg1, message.arg2, data.getString("str3"), data.getString("str4"), data.getString("str5"), (byte[]) message.obj);
                    return;
                case 5:
                    this.f17999a.mo3238a(data.getString("str1"), (MediaSources) message.obj);
                    return;
                case 6:
                    this.f17999a.mo3236a(data.getString("str1"), message.arg1);
                    return;
                case 7:
                    this.f17999a.mo3234a(Long.parseLong(data.getString("str1")), data.getString("str2"), (byte[]) message.obj, message.arg1);
                    return;
                case 8:
                    data.getString("str1");
                    this.f17999a.mo3231a(message.arg1, message.arg2, (byte[]) message.obj);
                    return;
                case 9:
                    this.f17999a.mo3253e(data.getString("str1"));
                    return;
                case 10:
                    this.f17999a.mo3242b(message.arg1);
                    return;
                case 11:
                    this.f17999a.mo3246b((byte[]) message.obj);
                    return;
                case 12:
                    this.f17999a.mo3249c((byte[]) message.obj);
                    return;
                case 13:
                    this.f17999a.mo3247c(message.arg1);
                    return;
                case 14:
                    this.f17999a.mo3250d(message.arg1);
                    return;
                case 15:
                    this.f17999a.mo3252d((byte[]) message.obj);
                    return;
                case 16:
                    this.f17999a.mo3255e((byte[]) message.obj);
                    return;
                case wi.dK /*17*/:
                    this.f17999a.mo3232a(message.arg1, data.getString("str1"));
                    return;
                case wi.dH /*18*/:
                    valueOf = data.getString("str1");
                    try {
                        this.f17999a.mo3233a(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(valueOf.getBytes())).getLong(), message.arg1, message.arg2);
                        return;
                    } catch (Exception e) {
                        String str3 = "vclib";
                        string = "MD5 not available for logging UMA event: ";
                        valueOf = String.valueOf(valueOf);
                        itx.m23280a(str3, valueOf.length() != 0 ? string.concat(valueOf) : new String(string));
                        return;
                    }
                case wi.dL /*19*/:
                    if (message.arg1 == 0) {
                        z = false;
                    }
                    this.f17999a.mo3254e(z);
                    return;
                case 20:
                    this.f17999a.mo3248c(message.arg1, data.getString("str1"));
                    return;
                case 21:
                    this.f17999a.mo3240a((byte[]) message.obj, Long.parseLong(data.getString("str1")));
                    return;
                case 22:
                    this.f17999a.mo3256f((byte[]) message.obj);
                    return;
                case wi.f29038do /*23*/:
                    this.f17999a.mo3239a(data.getString("str1"), (byte[]) message.obj);
                    return;
                case wi.dA /*24*/:
                    this.f17999a.mo3241a((byte[]) message.obj, data.getString("str1"));
                    return;
                default:
                    itx.m23280a("vclib", "Unknown message type " + message.what);
                    return;
            }
        }
    }

    static String m22252a(int i) {
        switch (i) {
            case 0:
                return "CHATROOM_ENTERED";
            case 1:
                return "ENDPOINT_ENTERED";
            case 2:
                return "ENDPOINT_EXITED";
            case 3:
                return "ENDPOINT_CHANGED";
            case 4:
                return "ENDPOINT_AUDIO_MUTE_STATE_CHANGED";
            case 5:
                return "ENDPOINT_VIDEO_MUTE_STATE_CHANGED";
            default:
                iil.m21870a("Unknown type");
                return "Unknown type";
        }
    }
}

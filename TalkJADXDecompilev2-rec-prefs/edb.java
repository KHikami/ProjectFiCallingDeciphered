package p000;

import android.content.Context;
import android.content.Intent;
import java.util.EnumSet;

final class edb implements ect {
    private static final boolean f11189a = false;
    private final Context f11190b;

    static {
        kae kae = glk.f15568o;
    }

    edb(Context context) {
        this.f11190b = context;
    }

    private void m13557a(int i, boolean z, EnumSet<edd> enumSet) {
        m13558a(i, z, enumSet, false, mdv.f27537a);
    }

    private void m13558a(int i, boolean z, EnumSet<edd> enumSet, boolean z2, mfa<Intent> mfa_android_content_Intent) {
        if (f11189a) {
            String valueOf = String.valueOf(enumSet);
            new StringBuilder(String.valueOf(valueOf).length() + 61).append("RealTimeChatNotificationsImpl.update silent: ").append(z).append(" coverage: ").append(valueOf);
        }
        boolean b = fdq.f12765G.m14370b(i);
        if (((fuz) jyn.m25426a(this.f11190b, fuz.class)).m16291a(i)) {
            m13559c(i);
            m13560d(i);
        } else {
            if (enumSet.contains(edd.MESSAGES)) {
                if (b) {
                    ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new eby(i, z, z2));
                } else {
                    new ecc().m13489a(this.f11190b, i, z, z2, mfa_android_content_Intent);
                }
            }
            if (enumSet.contains(edd.HANGOUTS)) {
                if (b) {
                    ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new ebe(i, z));
                } else {
                    new ebh().m13451a(this.f11190b, i, z, mfa_android_content_Intent);
                }
            }
        }
        if (!enumSet.contains(edd.ERRORS)) {
            return;
        }
        if (b) {
            ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new eaz(i));
        } else {
            this.f11190b.startService(new eaw().m13398a(this.f11190b, i));
        }
    }

    public void mo1831a(int i, boolean z) {
        m13557a(i, z, EnumSet.allOf(edd.class));
    }

    public void mo1827a(int i, fhe fhe) {
        mo1828a(i, fhe, false, mdv.f27537a);
    }

    public void mo1828a(int i, fhe fhe, boolean z, mfa<Intent> mfa_android_content_Intent) {
        switch (edc.f11191a[fhe.ordinal()]) {
            case 1:
                gwb.m1823a(fde.m15018e(i), 2362);
                break;
            case 2:
                break;
            case 3:
                m13558a(i, false, EnumSet.allOf(edd.class), z, mfa_android_content_Intent);
                return;
            default:
                return;
        }
        m13558a(i, true, EnumSet.allOf(edd.class), z, mfa_android_content_Intent);
    }

    public void mo1835b(int i, boolean z) {
        m13557a(i, true, EnumSet.of(edd.MESSAGES));
    }

    public void mo1833b(int i, fhe fhe, boolean z, mfa<Intent> mfa_android_content_Intent) {
        if (!((fuz) jyn.m25426a(this.f11190b, fuz.class)).m16291a(i)) {
            boolean z2;
            switch (edc.f11191a[fhe.ordinal()]) {
                case 1:
                case 2:
                    z2 = true;
                    break;
                case 3:
                    z2 = false;
                    break;
                default:
                    return;
            }
            if (fdq.f12765G.m14370b(i)) {
                ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new ebl(i, z2, z));
            } else {
                new ebo().m13469a(this.f11190b, i, z2, z, mfa_android_content_Intent);
            }
        }
    }

    public void mo1837c(int i, boolean z) {
        m13557a(i, true, EnumSet.of(edd.HANGOUTS));
    }

    public void mo1838d(int i, boolean z) {
        m13557a(i, true, EnumSet.of(edd.ERRORS));
    }

    public void mo1826a(int i) {
        mo1829a(i, null);
        mo1834b(i, null);
        mo1836c(i, null);
    }

    private void m13559c(int i) {
        ebz.m13334b(this.f11190b, i);
    }

    private void m13560d(int i) {
        ebf.m13445a(this.f11190b, i);
    }

    public void mo1832b(int i) {
        m13560d(i);
        m13559c(i);
        ebm.m13457a(this.f11190b, i);
        eat.m13386a(this.f11190b, i);
    }

    public void mo1829a(int i, String str) {
        if (fdq.f12765G.m14370b(i)) {
            ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new ebx(i, str));
        } else {
            this.f11190b.startService(new ecb().m13485a(this.f11190b, i, str));
        }
    }

    public void mo1830a(int i, String str, String str2) {
        if (fdq.f12765G.m14370b(i)) {
            ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new ebk(i, str, str2));
        } else {
            this.f11190b.startService(new ebn().m13465a(this.f11190b, i, str, str2));
        }
    }

    public void mo1834b(int i, String str) {
        if (fdq.f12765G.m14370b(i)) {
            ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new ebd(i, str));
        } else {
            this.f11190b.startService(new ebg().m13447a(this.f11190b, i, str));
        }
    }

    public void mo1836c(int i, String str) {
        if (fdq.f12765G.m14370b(i)) {
            ((bhl) jyn.m25426a(this.f11190b, bhl.class)).mo550a(new eay(i, str));
        } else {
            this.f11190b.startService(new eav().m13395a(this.f11190b, i, str));
        }
    }
}

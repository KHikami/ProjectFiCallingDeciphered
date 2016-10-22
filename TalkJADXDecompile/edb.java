import android.content.Context;
import android.content.Intent;
import java.util.EnumSet;

final class edb implements ect {
    private static final boolean a;
    private final Context b;

    static {
        kae kae = glk.o;
        a = false;
    }

    edb(Context context) {
        this.b = context;
    }

    private void a(int i, boolean z, EnumSet<edd> enumSet) {
        a(i, z, enumSet, false, mdv.a);
    }

    private void a(int i, boolean z, EnumSet<edd> enumSet, boolean z2, mfa<Intent> mfa_android_content_Intent) {
        if (a) {
            String valueOf = String.valueOf(enumSet);
            new StringBuilder(String.valueOf(valueOf).length() + 61).append("RealTimeChatNotificationsImpl.update silent: ").append(z).append(" coverage: ").append(valueOf);
        }
        boolean b = fdq.G.b(i);
        if (((fuz) jyn.a(this.b, fuz.class)).a(i)) {
            c(i);
            d(i);
        } else {
            if (enumSet.contains(edd.MESSAGES)) {
                if (b) {
                    ((bhl) jyn.a(this.b, bhl.class)).a(new eby(i, z, z2));
                } else {
                    new ecc().a(this.b, i, z, z2, mfa_android_content_Intent);
                }
            }
            if (enumSet.contains(edd.HANGOUTS)) {
                if (b) {
                    ((bhl) jyn.a(this.b, bhl.class)).a(new ebe(i, z));
                } else {
                    new ebh().a(this.b, i, z, mfa_android_content_Intent);
                }
            }
        }
        if (!enumSet.contains(edd.ERRORS)) {
            return;
        }
        if (b) {
            ((bhl) jyn.a(this.b, bhl.class)).a(new eaz(i));
        } else {
            this.b.startService(new eaw().a(this.b, i));
        }
    }

    public void a(int i, boolean z) {
        a(i, z, EnumSet.allOf(edd.class));
    }

    public void a(int i, fhe fhe) {
        a(i, fhe, false, mdv.a);
    }

    public void a(int i, fhe fhe, boolean z, mfa<Intent> mfa_android_content_Intent) {
        switch (edc.a[fhe.ordinal()]) {
            case wi.j /*1*/:
                gwb.a(fde.e(i), 2362);
                break;
            case wi.l /*2*/:
                break;
            case wi.z /*3*/:
                a(i, false, EnumSet.allOf(edd.class), z, mfa_android_content_Intent);
                return;
            default:
                return;
        }
        a(i, true, EnumSet.allOf(edd.class), z, mfa_android_content_Intent);
    }

    public void b(int i, boolean z) {
        a(i, true, EnumSet.of(edd.MESSAGES));
    }

    public void b(int i, fhe fhe, boolean z, mfa<Intent> mfa_android_content_Intent) {
        if (!((fuz) jyn.a(this.b, fuz.class)).a(i)) {
            boolean z2;
            switch (edc.a[fhe.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    z2 = true;
                    break;
                case wi.z /*3*/:
                    z2 = false;
                    break;
                default:
                    return;
            }
            if (fdq.G.b(i)) {
                ((bhl) jyn.a(this.b, bhl.class)).a(new ebl(i, z2, z));
            } else {
                new ebo().a(this.b, i, z2, z, mfa_android_content_Intent);
            }
        }
    }

    public void c(int i, boolean z) {
        a(i, true, EnumSet.of(edd.HANGOUTS));
    }

    public void d(int i, boolean z) {
        a(i, true, EnumSet.of(edd.ERRORS));
    }

    public void a(int i) {
        a(i, null);
        b(i, null);
        c(i, null);
    }

    private void c(int i) {
        ebz.b(this.b, i);
    }

    private void d(int i) {
        ebf.a(this.b, i);
    }

    public void b(int i) {
        d(i);
        c(i);
        ebm.a(this.b, i);
        eat.a(this.b, i);
    }

    public void a(int i, String str) {
        if (fdq.G.b(i)) {
            ((bhl) jyn.a(this.b, bhl.class)).a(new ebx(i, str));
        } else {
            this.b.startService(new ecb().a(this.b, i, str));
        }
    }

    public void a(int i, String str, String str2) {
        if (fdq.G.b(i)) {
            ((bhl) jyn.a(this.b, bhl.class)).a(new ebk(i, str, str2));
        } else {
            this.b.startService(new ebn().a(this.b, i, str, str2));
        }
    }

    public void b(int i, String str) {
        if (fdq.G.b(i)) {
            ((bhl) jyn.a(this.b, bhl.class)).a(new ebd(i, str));
        } else {
            this.b.startService(new ebg().a(this.b, i, str));
        }
    }

    public void c(int i, String str) {
        if (fdq.G.b(i)) {
            ((bhl) jyn.a(this.b, bhl.class)).a(new eay(i, str));
        } else {
            this.b.startService(new eav().a(this.b, i, str));
        }
    }
}

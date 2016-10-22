package defpackage;

/* renamed from: dwi */
public final class dwi implements jmw<dwj> {
    static boolean a(jch jch) {
        return fde.p() || jch.c("allowed_for_domain");
    }

    static boolean b(jch jch) {
        return jch.c("chat_archive_enabled") || !jch.c("allowed_for_domain");
    }

    static boolean c(jch jch) {
        if (jch.a("account_age_group", 0) == 3 && jch.c("blocked_for_child")) {
            return true;
        }
        return false;
    }

    public static boolean d(jch jch) {
        if (!jch.a("gaia_id")) {
            return false;
        }
        if (dwi.a(jch) && dwi.b(jch) && !dwi.c(jch)) {
            return false;
        }
        return true;
    }

    public boolean e(jch jch) {
        if (jch.c("sms_only")) {
            return fde.i();
        }
        return jch.a("gaia_id") && !dwi.d(jch);
    }

    public /* synthetic */ dr a() {
        return new dwj();
    }
}

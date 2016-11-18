package p000;

public final class dwi implements jmw<dwj> {
    static boolean m12919a(jch jch) {
        return fde.m15038p() || jch.mo3448c("allowed_for_domain");
    }

    static boolean m12920b(jch jch) {
        return jch.mo3448c("chat_archive_enabled") || !jch.mo3448c("allowed_for_domain");
    }

    static boolean m12921c(jch jch) {
        if (jch.mo3433a("account_age_group", 0) == 3 && jch.mo3448c("blocked_for_child")) {
            return true;
        }
        return false;
    }

    public static boolean m12922d(jch jch) {
        if (!jch.mo3438a("gaia_id")) {
            return false;
        }
        if (dwi.m12919a(jch) && dwi.m12920b(jch) && !dwi.m12921c(jch)) {
            return false;
        }
        return true;
    }

    public boolean mo1735e(jch jch) {
        if (jch.mo3448c("sms_only")) {
            return fde.m15028i();
        }
        return jch.mo3438a("gaia_id") && !dwi.m12922d(jch);
    }

    public /* synthetic */ dr mo1734a() {
        return new dwj();
    }
}

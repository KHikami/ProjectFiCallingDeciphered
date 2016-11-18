package p000;

public final class ezt implements far {
    public evz mo1959a(byte[] bArr) {
        nzf nzf = (knk) nzf.m1027a(new knk(), bArr);
        if (!evz.m8119a(nzf.apiHeader)) {
            return new ezs(nzf);
        }
        String valueOf = String.valueOf(nzf);
        glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 62).append("SetChatAclSettingResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
        return new ewv(nzf, nzf.apiHeader);
    }
}

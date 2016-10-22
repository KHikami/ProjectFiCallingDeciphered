package defpackage;

/* renamed from: ezt */
public final class ezt implements far {
    public evz a(byte[] bArr) {
        nzf nzf = (knk) nzf.a(new knk(), bArr);
        if (!evz.a(nzf.apiHeader)) {
            return new ezs(nzf);
        }
        String valueOf = String.valueOf(nzf);
        glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 62).append("SetChatAclSettingResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
        return new ewv(nzf, nzf.apiHeader);
    }
}

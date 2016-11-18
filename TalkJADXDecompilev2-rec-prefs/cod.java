package p000;

final class cod extends evz {
    private static final boolean f5812g = false;
    private static final long serialVersionUID = 1;

    static {
        kae kae = glk.f15565l;
    }

    private cod(lsu lsu) {
        super(lsu, lsu.responseHeader, -1);
        if (f5812g) {
            String valueOf = String.valueOf(lsu);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("MarkEventObservedResponse from:").append(valueOf);
        }
    }

    static evz m8138a(lsu lsu) {
        if (!evz.m8120a(lsu.responseHeader)) {
            return new cod(lsu);
        }
        String valueOf = String.valueOf(lsu);
        glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 62).append("MarkEventObservedResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
        return new ewv((nzf) lsu, lsu.responseHeader);
    }
}

package p000;

final class dcf extends iiq<Void, Void, Void> {
    final /* synthetic */ dcd f9511a;

    dcf(dcd dcd) {
        this.f9511a = dcd;
    }

    protected /* bridge */ /* synthetic */ Object mo470a(Object[] objArr) {
        return m11444a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m11445b();
    }

    private Void m11444a() {
        int i = 0;
        String string = this.f9511a.f9507a.getSharedPreferences("recentEmoji", 0).getString("recentEmojiKey", null);
        this.f9511a.f9508b.clear();
        if (string != null) {
            String[] split = string.split(",");
            int length = split.length;
            while (i < length) {
                String str = split[i];
                if (!"16".equals(str)) {
                    this.f9511a.f9508b.add(Integer.valueOf(Integer.parseInt(str, dcd.f9505c)));
                }
                i++;
            }
        }
        return null;
    }

    private void m11445b() {
        if (this.f9511a.f9509e != null) {
            this.f9511a.f9509e.x_();
        }
    }
}

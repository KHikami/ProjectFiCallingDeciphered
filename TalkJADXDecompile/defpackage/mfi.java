package defpackage;

/* renamed from: mfi */
enum mfi implements mfe<Object> {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    <T> mfe<T> a() {
        return this;
    }
}

package p000;

enum mfi implements mfe<Object> {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    <T> mfe<T> m31988a() {
        return this;
    }
}

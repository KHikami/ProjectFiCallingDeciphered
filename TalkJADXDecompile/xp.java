class xp<T> {
    final T d;

    xp(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = t;
    }
}

package quizPackage.dailyQuiz.dailyQuiz20240214.number3;

public class TwoContainer<T, M> {
    private T key;
    private M value;

    public T getKey() {
        return key;
    }

    public void set(T key, M value) {
        this.key = key;
        this.value = value;
    }

    public M getValue() {
        return value;
    }
}


package com.yangxiaochen.puzzles;

public class PuzzleException extends Exception {
    public PuzzleException() {
    }

    public PuzzleException(String message) {
        super(message);
    }

    public PuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

    public PuzzleException(Throwable cause) {
        super(cause);
    }

    public PuzzleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

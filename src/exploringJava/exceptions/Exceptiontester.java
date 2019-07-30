package exploringJava.exceptions;

/**
 * How many Exceptions can we throw?
 * If an exception is thrown it is propagated through the caller methods. If it is
 * caught on the way, it can be dropped or re-thrown. If it is not caught, the program
 * stops and displays the track of the exception.
 * <p>
 * Usually, you can't throw more than one exception because the code stops at the fist
 * throw. BUT in finally blocks, you can throw further exceptions without catching the
 * first one.
 */
public class Exceptiontester {
    public static void main(String[] args) {

        try {
            try {
                throw new RuntimeException("1");
            } finally {
                throw new RuntimeException("2");
            }
        } finally {
            throw new RuntimeException("3");
        }
    }
}

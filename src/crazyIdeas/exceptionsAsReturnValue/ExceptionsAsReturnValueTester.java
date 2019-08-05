package crazyIdeas.exceptionsAsReturnValue;

import java.time.LocalDateTime;

public class ExceptionsAsReturnValueTester {
    public static void main(String[] args) {
        BoringClass boring = new BoringClass();
        boring.doSomethingBoring("hello");
        boring.doSomethingEvenMoreBoring();

        SneakyHobbit sneaky = new SneakyHobbit();
        try {
            sneaky.doSomethingBoring("Is this working?");
        } catch (RuntimeException e) { // This code doesn't know SneakyRuntimeExceptions, so we have to catch RuntimeExceptions
            // e.get
        }


    }
}

interface BoringInterface {
    default void doSomethingBoring(String str){
        System.out.println("This is boring it doesn't return anything. And it takes just " +
                "one string parameter but does not even repeat it");
    }

    default void doSomethingEvenMoreBoring(){
        System.out.println("This function is even more boring, it takes no arguments and gives no return");
    }
}

class BoringClass implements BoringInterface {
    BoringClass(){
        System.out.println("This is the creation of a boring class. It doesn't even try to break the rules but instead implements the interface dutifully by taking the default.");
    }
}


/**
 * This class implements the BoringInterface and is not allowed to define other methods than the two from
 * the interface.
 */
class SneakyHobbit implements BoringInterface {
    SneakyHobbit() {
        System.out.println("This is the creation of a SneakyHobbit. Let's see if we can sneak around this interface constraints");
    }

    @Override
    public void doSomethingBoring(String str) {
        class SneakyRuntimeException extends RuntimeException {
            String data = str;

            public String getData() { return data; }
        }
        throw new SneakyRuntimeException();
    }

    @Override
    public void doSomethingEvenMoreBoring() {
        LocalDateTime now = LocalDateTime.now();
    }
}

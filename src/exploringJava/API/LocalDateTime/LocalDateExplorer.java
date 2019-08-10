package exploringJava.API.LocalDateTime;

import java.time.LocalDate;

public class LocalDateExplorer {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now.getMonth().getValue();
    }
}


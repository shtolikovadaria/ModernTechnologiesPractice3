package part1.part1_2;

public class GradeChecker {

    public static String getGradeClassic(int score) {
        // TODO: реализуйте вариант через классический switch.
        // Подсказка: удобно сначала вычислить "десяток" score / 10.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int category;

        if (score >= 90 && score <= 100) {
            category = 1;
        } else if (score >= 80 && score <= 89) {
            category = 2;
        } else if (score >= 70 && score <= 79) {
            category = 3;
        } else if (score >= 60 && score <= 69) {
            category = 4;
        } else {
            category = 5;
        }
        switch (category) {
            case 1:
                return "Отлично (A)";
            case 2:
                return "Хорошо (B)";
            case 3:
                return "Удовлетворительно (C)";
            case 4:
                return "Слабо (D)";
            default:
                return "Неудовлетворительно (F)";

        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String getGradeArrow(int score) {
        // TODO: реализуйте вариант через switch -> (Java 14+).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int category;

        if (score >= 90 && score <= 100) {
            category = 1;
        } else if (score >= 80 && score <= 89) {
            category = 2;
        } else if (score >= 70 && score <= 79) {
            category = 3;
        } else if (score >= 60 && score <= 69) {
            category = 4;
        } else {
            category = 5;
        }
        return switch (category) {
            case 1 -> "Отлично (A)";
            case 2 -> "Хорошо (B)";
            case 3 -> "Удовлетворительно (C)";
            case 4 -> "Слабо (D)";
            default -> "Неудовлетворительно (F)";
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        int[] samples = {95, 85, 73, 62, 45, 100, 0};
        for (int score : samples) {
            System.out.printf("%d -> classic: %s | arrow: %s%n",
                score, getGradeClassic(score), getGradeArrow(score));
        }
        // Проверь себя: для одного score оба метода дают одинаковую оценку.
    }
}

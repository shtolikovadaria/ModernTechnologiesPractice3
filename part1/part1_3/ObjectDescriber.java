package part1.part1_3;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // TODO: используйте switch с pattern matching (Java 17+ preview).
        // Подсказка 1: обработайте null отдельным case.
        // Подсказка 2: для Integer укажите "положительное" или "не положительное".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (obj) {
            case null -> "null значение";

            case Integer i -> {
                if (i > 0) {
                    yield "Integer: положительное (" + i + ")";
                } else {
                    yield "Integer: не положительное (" + i + ")";
                }
            }

            case String s when s.isEmpty() -> "String: пустая строка";
            case String s -> "String: \"" + s + "\" (длина: " + s.length() + ")";

            case Double d -> "Double: " + d;

            case int[] arr -> {
                StringBuilder sb = new StringBuilder("int[]: [");
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    if (i < arr.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("] (длина: ").append(arr.length).append(")");
                yield sb.toString();
            }

            default -> "Другой объект: " + obj.getClass().getSimpleName() + " (" + obj + ")";
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> newsList = Arrays.asList(1, 2, 3);

        News news = new News();
        calculate(news, newsList);
    }

    static void calculate(News news, List<Integer> newsList) {
        OptionalDouble d = newsList.stream()
                .mapToInt(i -> i)
                .average();

        news.averageRate = (float) d.orElse(-1);
        System.out.println(news.averageRate);
    }

}

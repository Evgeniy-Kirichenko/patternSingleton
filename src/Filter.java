import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int a = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        //source.stream().filter(a -> (a < treshold)).collect(Collectors.toList());
        logger.log("Запускаем фильтрацию");
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > treshold) {
                logger.log("Элемент\"" + source.get(i) + "\" проходит");
                result.add(source.get(i));
                a++;
            } else logger.log("Элемент\"" + source.get(i) + "\" не проходит");
        }
        logger.log("прошло фильтр "+ a + " элемента из "+ source.size());
        return result;
    }
}

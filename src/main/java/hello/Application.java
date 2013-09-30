package searchtools;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

/**
 * Этот класс предназначен для сортировки списка файлов
 *
 * @author Стаценко Владимир
 * http://www.vova-prog.narod.ru
 */
public class FileSorter implements Comparator {
    
    Pattern p = null;
    Collator collator = null;
    
    /** Создает новые экземпляры FileSorter */
    public FileSorter() {
        .
        .
        .
    }

    /* Этот метод выполняет сравнение имен двух файлов.
     * Возвращает:
     *     1 если первый параметр (о1) больше второго (о2),
     *    -1 если первый параметр (о1) меньше второго (о2),
     *     0 если они равны.
     * Имя первого файла считается больше второго имени, если
     * первый файл находится ближе к корню дерева папок.
     * Если файлы находятся в одной папке, то больше то имя,
     * которое идет первым по алфавиту.
     */
    public int compare(Object o1, Object o2) {
        .
        .
        .
    }
    
    public List sort(List fileList) {
        ArrayList res = new ArrayList(fileList.size());
        res.addAll(fileList);
        Collections.sort(res, this);
        return res;
    }
}